package org.dy.ws.client;

import helloworldws.impl.service.ws.dy.org.HelloWorldWS;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.dy.ws.service.GetAllWorldsResponse.Return;
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
		XMLGregorianCalendar xmlCalendar = null;
		try {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(new Date());
			xmlCalendar = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(calendar);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		user.setBirth(xmlCalendar);
		List<World> list = helloWorld.getWorldsByUser(user);
		for (World world : list) {
			System.out.println("world feel : " + world.getFeel());
		}

		System.out.println("*******************************************");

		Return re = helloWorld.getAllWorlds();
		System.out.println(re.toString());
	}
}
