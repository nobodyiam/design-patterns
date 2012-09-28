package flyweight.impl;

import utility.MyUtility;
import flyweight.interfaces.Monster;

public class EasyMonster implements Monster {
	private int level;
	
	public EasyMonster(){
		this.level = Monster.EASY;
	}
	
	public void display(int position) {
		MyUtility.myPrint("I'm an easy monster and I'm now in position " + position);
	}

	public int getLevel() {
		return this.level;
	}

}
