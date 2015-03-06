package com.citelic.game.entity.npc.impl.glacor.effect;import com.citelic.game.engine.task.EngineTask;import com.citelic.game.engine.task.EngineTaskManager;import com.citelic.game.entity.Entity;import com.citelic.game.entity.Hit;import com.citelic.game.entity.Hit.HitLook;import com.citelic.game.entity.npc.NPC;import com.citelic.game.entity.npc.impl.glacor.Effect;public class UnstableEffect implements Effect {	private boolean exploded = false;	private boolean exploding = false;	private int tick = 0;	public int getTick() {		return tick;	}	@Override	public void processEffect(final NPC npc, final Entity target) {		final int blastRadius = npc.getId() == 14301 ? 5 : 3;		if (target == null || npc == null)			return;		if (npc.withinDistance(target, blastRadius) && !exploding				&& npc.getHitpoints() >= 551) {			exploding = true;			exploded = false;		}		if (exploded && npc.getHitpoints() < 551)			npc.setHitpoints(npc.getHitpoints() + 10);		if (exploding && !exploded) {			exploding = false;			exploded = true;			EngineTaskManager.schedule(new EngineTask() {				@Override				public void run() {					for (Entity entity : npc.getPossibleTargets()) {						if (entity.withinDistance(npc, blastRadius)) {							entity.applyHit(new Hit(npc, (int) (target									.getHitpoints() * 0.33),									HitLook.REGULAR_DAMAGE));						}						npc.applyHit(new Hit(npc,								(int) (npc.getHitpoints() * 0.90),								HitLook.REGULAR_DAMAGE));						stop();					}				}			}, 38, 0);		}	}	public void setTick(int tick) {		this.tick = tick;	}}