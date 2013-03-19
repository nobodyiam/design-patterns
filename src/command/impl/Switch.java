package command.impl;

import utility.MyUtility;
import command.interfaces.Command;

public class Switch {
	private Command flipUpCommand;
	private Command flipDownCommand;
	
	public Switch(Command flipUpCommand, Command flipDownCommand){
		this.flipUpCommand = flipUpCommand;
		this.flipDownCommand = flipDownCommand;
	}
	
	public void flipUp(){
		MyUtility.myPrint("Switch is up");
		this.flipUpCommand.execute();
	}
	
	public void flipDown(){
		MyUtility.myPrint("Switch is down");
		this.flipDownCommand.execute();
	}
}
