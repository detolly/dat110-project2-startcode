package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

    private String m_topic;

    public DeleteTopicMsg(String user, String topic)
    {
        super(MessageType.DELETETOPIC, user);
        m_topic = topic;
    }

    public String topic() {
        return m_topic;
    }

    public void set_topic(String topic) {
        m_topic = topic;
    }



}
