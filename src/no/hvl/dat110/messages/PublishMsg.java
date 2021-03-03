package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

	private String m_message;
	private String m_topic;

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		m_topic = topic;
		m_message = message;
	}

	public String topic() { return m_topic; }

	public String message() {
		return m_message;
	}
}
