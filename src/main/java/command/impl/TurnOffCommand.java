package command.impl;

import command.interfaces.*;

public class TurnOffCommand implements Command {
	private Light light;
	
	public TurnOffCommand(Light light){
		this.light = light;
	}
	
	public void execute() {
		this.light.turnOff();
	}
	
	public void setLight(Light light){
		this.light = light;
	}

}
