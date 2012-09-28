package observer.impl;

import observer.interfaces.Publisher;
import observer.interfaces.Subscriber;
import utility.MyUtility;

public class NewsSubscriber implements Subscriber {

	public void update(Publisher p) {
		MyUtility.myPrint("News updated: " + p.getContent());
	}

}
