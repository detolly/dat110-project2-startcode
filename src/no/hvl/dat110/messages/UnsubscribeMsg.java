package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

    private String m_topic;

    public UnsubscribeMsg(String user, String topic)
    {
        super(MessageType.UNSUBSCRIBE, user);
        m_topic = topic;
    }

    public String topic() { return m_topic; }

}
