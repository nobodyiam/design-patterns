package mediator;

import mediator.impl.ChatRoomImpl;
import mediator.impl.ParticipantImpl;
import mediator.interfaces.ChatRoom;
import mediator.interfaces.Participant;

public class Client {
	
	public void test(){
		ChatRoom chatRoom = new ChatRoomImpl();
		
		Participant p1 = new ParticipantImpl("p1");
		Participant p2 = new ParticipantImpl("p2");
		Participant p3 = new ParticipantImpl("p3");
		Participant p4 = new ParticipantImpl("p4");
		Participant p5 = new ParticipantImpl("p5");
		
		chatRoom.register(p1);
		chatRoom.register(p2);
		chatRoom.register(p3);
		chatRoom.register(p4);
		chatRoom.register(p5);
		
		p1.send("p2", "Hey, p2!");
		p2.send("p3", "Hey, p3!");
		p3.send("p4", "Hey, p4!");
		p4.send("p5", "Hey, p5!");
		p5.send("p1", "Hey, p1!");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}
}
