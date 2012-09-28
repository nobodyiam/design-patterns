package command.impl;

import command.interfaces.Light;

import utility.MyUtility;

public class RealLight1 implements Light {
	public void turnOn(){
		MyUtility.myPrint("This light is on");
	}
	public void turnOff(){
		MyUtility.myPrint("This light is off");
	}
}
