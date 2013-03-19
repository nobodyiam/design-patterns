package singleton.impl;

import utility.MyUtility;

public class TestSingleton {
//	public static TestSingleton test = new TestSingleton();
	private static int count1;
	private static int count2 = 0;
	public static TestSingleton test = new TestSingleton();
	/* different position will cause different output*/
	
	private TestSingleton(){
		count1++;
		MyUtility.myPrint("count1 in constructor: " + count1);
		count2++;
		MyUtility.myPrint("count2 in constructor: " + count2);
	}
	
	public static TestSingleton getInstance(){
		return test;
	}
	
	public void printCount(){
		MyUtility.myPrint("count1 in printCount: " + count1);
		MyUtility.myPrint("count2 in printCount: " + count2);
	}
}
