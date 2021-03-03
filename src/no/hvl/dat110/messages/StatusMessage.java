package no.hvl.dat110.messages;

public class StatusMessage extends Message {

    private String m_message;
    private String m_topic;

    public StatusMessage(String user, String topic, String message)
    {
        super(MessageType.STATUS, user);
        m_message = message;
        m_topic = topic;
    }

    public String message() {
        return m_message;
    }

    public String topic() {
        return m_topic;
    }

}
