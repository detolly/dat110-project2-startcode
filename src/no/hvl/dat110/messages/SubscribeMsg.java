package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

    private String m_topic;

    public SubscribeMsg(String user, String topic)
    {
        super(MessageType.SUBSCRIBE, user);
    }

    public String topic() {
        return m_topic;
    }

}
