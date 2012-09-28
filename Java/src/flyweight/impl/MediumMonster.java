package flyweight.impl;

import utility.MyUtility;
import flyweight.interfaces.Monster;

public class MediumMonster implements Monster {
	private int level;
	
	public MediumMonster(){
		this.level = Monster.MEDIUM;
	}
	
	public void display(int position) {
		MyUtility.myPrint("I'm a meduim monster and I'm now in position " + position);
	}

	public int getLevel() {
		return this.level;
	}

}
