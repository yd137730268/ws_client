package org.dy.ws.client;

import helloworldws.impl.service.ws.dy.org.HelloWorldWS;

import java.util.List;

import org.dy.ws.service.HelloWorld;
import org.dy.ws.service.User;
import org.dy.ws.service.World;

public class ClientMain {
	public static void main(String[] args) {
		HelloWorldWS factory = new HelloWorldWS();
		HelloWorld helloWorld = factory.getHelloWorldWSPort();
		System.out.println(helloWorld.sayHi("Dong"));
		
		System.out.println("*******************************************");

		User user = new User();
		user.setId(1);
		user.setName("Dong");
		List<World> list = helloWorld.getWorldsByUser(user);
		for (World world : list) {
			System.out.println("world feel : "+world.getFeel());
		}
	}
}
