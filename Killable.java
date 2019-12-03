public abstract class Killable implements Targetable, KillableEvent{
	private int health = 10;
	private int maxHealth = 10;
	private double dmgMod = 1.0;

	public Killable() {

	}

	public Killable(int maxHealth) {
		this.maxHealth = maxHealth;
		this.health = maxHealth;
	}

	public Killable(int maxHealth, double dmgMod) {
		this.maxHealth = maxHealth;
		this.health = maxHealth;
		this.dmgMod = dmgMod;
	}

	public boolean takeDamage(int dmg) {
		this.health -= dmg * dmgMod;
		if (health <= 0) {
			health = 0;
			onDeath();
		}
		onDmg();
		return health == 0;
	}
	public void takeHeal(int heal) {
		onHeal();
		health += heal;
		if(health > maxHealth) {
			health = maxHealth;
		}
	}
}
