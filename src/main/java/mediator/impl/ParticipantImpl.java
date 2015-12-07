package mediator.impl;

import utility.MyUtility;
import mediator.interfaces.ChatRoom;
import mediator.interfaces.Participant;

public class ParticipantImpl implements Participant {
	private String name;
	private ChatRoom chatRoom;

	public ParticipantImpl(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void receive(String from, String message) {
		MyUtility.myPrint(this.name + " received a message from " + from + ": "
				+ message);
	}

	public void send(String to, String message) {
		if (this.chatRoom == null) {
			MyUtility.myPrint("I am not in any chat room, could not send any message!");
		} else {
			this.chatRoom.send(this.getName(), to, message);
		}
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}

}
