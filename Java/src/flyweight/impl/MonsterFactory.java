package flyweight.impl;

import java.util.HashMap;
import java.util.Map;

import utility.MyUtility;

import flyweight.interfaces.Monster;
import flyweight.interfaces.MonsterFlyweightFactory;

public final class MonsterFactory implements MonsterFlyweightFactory {
	private Map<Integer,Monster> monsters;
	private static MonsterFactory instance = new MonsterFactory();
	
	private MonsterFactory(){
		monsters = new HashMap<Integer,Monster>(); //HashMap is not synchronized, while HashTable is.
	}
	
	public static MonsterFactory getInstance(){
		return instance;
	}
	
	public Monster getMonsterFlyweight(int level) {
		Integer key = new Integer(level);
		Monster monster = monsters.get(key);
		//Monster monster = monsters.get(level); //it seems this statement would also work.
		if(monster == null){
			switch(level){
				case Monster.EASY:
					monster = new EasyMonster();
					break;
				case Monster.MEDIUM:
					monster = new MediumMonster();
					break;
				case Monster.HARD:
					monster = new HardMonster();
					break;
				default:
					break;
			}
			if(monster != null){
				monsters.put(key, monster);
				//monsters.put(level, monster); //it seems this statement would also work.
				MyUtility.myPrint("Putting monster of key " + level + " into cache.");
			}
		}
		return monster;
	}

}
