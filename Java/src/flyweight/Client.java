package flyweight;

import flyweight.impl.MonsterFactory;
import flyweight.interfaces.Monster;
import flyweight.interfaces.MonsterFlyweightFactory;

public class Client {
	private MonsterFlyweightFactory factory;
	
	public Client(){
		factory = MonsterFactory.getInstance();
	}
	
	public void test(){
		for(int i = 0; i < 10; i++){
			this.testFlyweight(i);
		}
	}
	
	public void testFlyweight(int position){
		Monster monster = factory.getMonsterFlyweight(Monster.EASY);
		monster.display(position);
		monster = factory.getMonsterFlyweight(Monster.MEDIUM);
		monster.display(position);
		monster = factory.getMonsterFlyweight(Monster.HARD);
		monster.display(position);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}
}
