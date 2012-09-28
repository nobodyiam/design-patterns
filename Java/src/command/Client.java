package command;

import command.impl.RealLight1;
import command.impl.Switch;
import command.impl.TurnOffCommand;
import command.impl.TurnOnCommand;
import command.interfaces.Command;
import command.interfaces.Light;

public class Client {
	public void test(){
		Light light = new RealLight1();
		Command switchUp = new TurnOnCommand(light);
		Command switchDown = new TurnOffCommand(light);
		
		Switch switcher = new Switch(switchUp,switchDown);
		
		switcher.flipUp();
		switcher.flipDown();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
