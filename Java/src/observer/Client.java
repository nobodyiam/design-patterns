package observer;

import observer.impl.NewsPublisher;
import observer.impl.NewsSubscriber;
import observer.interfaces.Publisher;
import observer.interfaces.Subscriber;

public class Client {
	
	public void test(){
		Publisher p = new NewsPublisher();
		
		Subscriber s = new NewsSubscriber();
		p.addSubscriber(s);
		s  = new NewsSubscriber();
		p.addSubscriber(s);
		
		p.setContent("news 1");
		p.setContent("news 1");
		p.setContent("news 2");
		p.setContent("news 3");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
