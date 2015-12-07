package observer.impl;

import java.util.ArrayList;

import observer.interfaces.Publisher;
import observer.interfaces.Subscriber;

public class NewsPublisher implements Publisher {
	private String news = "";
	
	private ArrayList<Subscriber> subscribers;
	
	public NewsPublisher(){
		this.subscribers = new ArrayList<Subscriber>();
	}
	
	public void addSubscriber(Subscriber s) {
		if(this.subscribers.contains(s)){
			return;
		}
		this.subscribers.add(s);
	}

	public void notifySubscriber() {
		for(Subscriber s : this.subscribers){
			s.update(this);
		}
	}

	public void removeSubscriber(Subscriber s) {
		this.subscribers.remove(s);
	}

	public void setContent(String news) {
		if(this.news.equals(news)){
			return;
		}
		this.news = news;
		this.notifySubscriber();
	}

	public String getContent() {
		return news;
	}

}
