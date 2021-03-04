package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.MessageType;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messages.StatusMessage;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) throws InterruptedException {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		
		// - connect to the broker
		// - create the temperature topic on the broker
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker

		Client c = new Client("display", Common.BROKERHOST, Common.BROKERPORT);
		c.connect();

		c.createTopic("temperature");
		c.subscribe("temperature");

		int i = 0;
		while(i < 10)
		{
			Message m = c.receive();;
			assert(m.getType() == MessageType.STATUS);
			StatusMessage message = (StatusMessage)m;
			System.out.println(message.message());
			i++;
			Thread.sleep(1000);
		}

		c.unsubscribe("temperature");

		c.disconnect();

		// TODO - END
		
		System.out.println("Display stopping ... ");
		
	}
}
