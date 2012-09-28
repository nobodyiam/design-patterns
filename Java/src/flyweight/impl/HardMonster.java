package flyweight.impl;

import utility.MyUtility;
import flyweight.interfaces.Monster;

public class HardMonster implements Monster {
	private int level;
	
	public HardMonster(){
		this.level = Monster.HARD;
	}
	
	public void display(int position) {
		MyUtility.myPrint("I'm a hard monster and I'm now in position " + position);
	}

	public int getLevel() {		
		return this.level;
	}

}
