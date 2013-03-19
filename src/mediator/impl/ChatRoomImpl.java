package mediator.impl;

import java.util.HashMap;
import java.util.Map;

import mediator.interfaces.ChatRoom;
import mediator.interfaces.Participant;

public class ChatRoomImpl implements ChatRoom {
	private Map<String, Participant> participants;
	
	public ChatRoomImpl(){
		this.participants = new HashMap<String, Participant>();
	}
	
	public void register(Participant participant) {
		if(this.participants.containsKey(participant.getName())){
			return;
		}
		this.participants.put(participant.getName(), participant);
		participant.setChatRoom(this);
	}

	public void send(String from, String to, String message) {
		Participant participant = this.participants.get(to);
		if(participant != null){
			participant.receive(from, message);
		}
	}

}
