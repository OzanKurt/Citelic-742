package com.citelic.game.entity.npc.impl.glacor;import com.citelic.game.SecondBar;import com.citelic.game.engine.Engine;import com.citelic.game.engine.task.EngineTask;import com.citelic.game.engine.task.EngineTaskManager;import com.citelic.game.entity.Entity;import com.citelic.game.entity.Graphics;import com.citelic.game.entity.Hit;import com.citelic.game.entity.Hit.HitLook;import com.citelic.game.entity.npc.NPC;import com.citelic.game.entity.npc.impl.familiar.Familiar;import com.citelic.game.entity.npc.impl.glacor.effect.UnstableEffect;import com.citelic.game.entity.player.Player;import com.citelic.game.map.tile.Tile;import com.citelic.utility.Utilities;/** *  * @author Tyler *  */public class UnstableGlacyte extends NPC {	/**	 * 	 * Serial UID	 */	private static final long serialVersionUID = 5322103406609998421L;	private Entity target;	private long spawnTime;	private Glacor glacor;	private int attackDelay;	private boolean exploding;	private Effect effect;	private boolean isHealing;	private long healTime;	private final int EXPLODE_GFX = 956;	public UnstableGlacyte(Glacor glacor, Tile tile, Entity target) {		super(14302, tile, -1, true, true);		this.getCombat().setTarget(target);		this.setForceMultiArea(true);		this.setForceMultiAttacked(true);		this.glacor = glacor;		this.target = target;		this.spawnTime = Utilities.currentTimeMillis();		this.effect = new UnstableEffect();	}	public boolean attackable(Entity target) {		return this.getCombat().getTarget() != null && target != null				&& getCombat().getTarget().getIndex() == target.getIndex();	}	private void explode() {		applyHit(new Hit(null, (int) (this.getHitpoints() * 0.90),				HitLook.REGULAR_DAMAGE));		exploding = false;		setNextGraphics(new Graphics(EXPLODE_GFX));		if (target == null)			return;		for (Entity entity : getPossibleTargets()) {			if (entity == null || this.isDead())				continue;			if (entity.withinDistance(this, 2)) {				entity.applyHit(new Hit(null,						(int) (target.getHitpoints() * 0.33),						HitLook.REGULAR_DAMAGE));			}		}	}	/**	 * 	 * @return the attackDelay	 */	public int getAttackDelay() {		return attackDelay;	}	/**	 * 	 * @return the effect	 */	public Effect getEffect() {		return effect;	}	public long getHealTime() {		return healTime;	}	public long getSpawnTime() {		return spawnTime;	}	public Player getTarget() {		return (Player) target;	}	public boolean isExploding() {		return exploding;	}	/**	 * 	 * @return the isHealing	 */	public boolean isHealing() {		return isHealing;	}	@Override	public void processNPC() {		super.processNPC();		target = this.getCombat().getTarget();		if (getHitpoints() <= 0 || isDead()) {			Engine.sendProjectile(this, glacor, 634, 34, 16, 30, 35, 16, 15);		}		if (spawnTime + 300000 < Utilities.currentTimeMillis()				&& !this.getCombat().underCombat()) {			finish();		}		if ((this.getHitpoints() <= 500) && !isDead() && (getHitpoints() != 0)) {			this.heal(10);		}		if (this.getHitpoints() >= 500 && !exploding) {			exploding = true;			setSecondBar(new SecondBar(750));			EngineTaskManager.schedule(new EngineTask() {				@Override				public void run() {					explode();					stop();				}			}, 25, 0);		}		if (target != null) {			if (target instanceof Familiar) {				Familiar npc = (Familiar) target;				target = npc.getOwner();			}			if (target instanceof Player) {				if (target.isDead())					this.finish();			}		}	}	@Override	public void sendDeath(Entity target) {		if (glacor != null) {			if (glacor.getGlacytes().size() == 1) {				glacor.setEffect(GlacorEffect.UNSTABLE);			}			glacor.getGlacytes().remove(this);		}		super.sendDeath(target);	}	/**	 * 	 * @param attackDelay	 * 	 *            the attackDelay to set	 */	public void setAttackDelay(int attackDelay) {		this.attackDelay = attackDelay;	}	/**	 * 	 * @param effect	 * 	 *            the effect to set	 */	public void setEffect(Effect effect) {		this.effect = effect;	}	/**	 * 	 * @param isHealing	 * 	 *            the isHealing to set	 */	public void setHealing(boolean isHealing) {		this.isHealing = isHealing;	}	public void setHealTime(long healTime) {		this.healTime = healTime;	}	public void setSpawnTime(long spawnTime) {		this.spawnTime = spawnTime;	}	public void setTarget(Player target) {		this.target = target;	}}