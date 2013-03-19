package strategy.impl;

import java.util.List;

import strategy.interfaces.SortStrategy;
import utility.MyUtility;

public class ShellSort implements SortStrategy {

	public void sort(List<String> list) {
		MyUtility.myPrint("Sorting list using shell sort.");
	}

}
