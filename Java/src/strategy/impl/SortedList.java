package strategy.impl;

import java.util.ArrayList;
import java.util.List;

import strategy.interfaces.SortStrategy;

public class SortedList {
	private List<String> list;
	private SortStrategy sortStrategy;
	
	public SortedList(){
		this.list = new ArrayList<String>();
	}
	
	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	public void add(String name){
		this.list.add(name);
	}
	
	public void sort(){
		this.sortStrategy.sort(list);
	}
	
}
