package battleBots;

import java.util.ArrayList;

public class Horde {
	public ArrayList<Minion> horde1 = new ArrayList<Minion>();
	public ArrayList<Minion> horde2 = new ArrayList<Minion>();

	public int calcDamageHorde1() {
		int damage = 0;
		for(Minion minion:horde1) {
			damage += minion.attack;
			
		}
		
		
		
		return damage;
	}
	public int calcDamageHorde2() {
		int damage = 0;
		for(Minion minion:horde2) {
			damage += minion.attack;
		}
		
		
		
		return damage;
	}
	public void applyDamageToHorde1(int damage) {
		for(Minion minion: horde2) {
			if(damage>=minion.health ) {
				damage -= minion.health;
				minion.health=0;
			}else {minion.health-=damage;damage=0;}}
	}
	public void applyDamageToHorde2(int damage) {
		for(Minion minion: horde1) {
			if(damage>=minion.health ) {
				damage -= minion.health;
				minion.health=0;
			}else {minion.health-=damage;damage=0;}
			
		}
	}
}

