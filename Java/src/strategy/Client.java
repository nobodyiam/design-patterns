package strategy;

import strategy.impl.*;
import strategy.impl.SortedList;

public class Client {
	
	public void test(){
		SortedList list = new SortedList();
		list.add("name 1");
		list.add("name 2");
		list.add("name 3");
		
		list.setSortStrategy(new BubbleSort());
		list.sort();
		
		list.setSortStrategy(new QuickSort());
		list.sort();
		
		list.setSortStrategy(new ShellSort());
		list.sort();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
