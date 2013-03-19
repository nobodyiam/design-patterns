package command.impl;

import command.interfaces.Command;
import command.interfaces.Light;

public class TurnOnCommand implements Command {
	private Light light;
	
	public TurnOnCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		this.light.turnOn();		
	}
	
	public void setLight(Light light){
		this.light = light;
	}

}
