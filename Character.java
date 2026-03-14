/*

 * CSC205AA
 * Sept 23, 21
 * Battle Royale
 * Creates a Battle Royale for 4 characters and fight until one is standing
 */






package Polymorphism;

import java.util.Random;





public abstract class Character {

	
	//variables that are accesable to child classes
	protected String name;
	protected int health;
	protected int strength;
	protected boolean alive;
	protected int str;
	private boolean dead;
	
	
	
	
	protected Random rand = new Random();
	
	
	//generates random strength
	protected void str() {
		strength= rand.nextInt(65)+30;
	}

	//sets name
	public Character(String name, int health) {
		super();
		this.name = name;
		this.health = health;
	}

	public void hit(Character opponent) {
		
		
		opponent.determinehealth(strength);
		System.out.println(opponent.getName() + " has taken a hit of: " + strength + " health is now: " + opponent.getHealth());
	}
	

	public void determinehealth(int damage) {
		if(this.getHealth() - damage <=0) {
			this.setHealth(0);
			this.setDead(true);
		}
		else {
			this.setHealth(this.health - damage);
		}
	}
	//gets name and returns
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//gets health and returns
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
	//gets strength and returns

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
	//abstracts methods
		public abstract int attack();
		
		public abstract void hit(int points);
		
		public abstract boolean isAlive();
		

	
	

	


	
	
	public String toString() {
		return "\n" + "Name: " + name + "\nStrength: " + strength + "\nHealth: " + health;
	}


}


