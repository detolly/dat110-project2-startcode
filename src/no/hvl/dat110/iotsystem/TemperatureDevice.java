package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) throws InterruptedException {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to

		// - connect to the broker
		// - publish the temperature(s)
		// - disconnect from the broker

		Client c = new Client("temperature", Common.BROKERHOST, Common.BROKERPORT);
		c.connect();

		while(true)
		{
			c.publish("temperature", String.format("The temperature is %d degrees.", sn.read()));
			Thread.sleep(1000);
		}

		// TODO - end

		//System.out.println("Temperature device stopping ... ");

	}
}
