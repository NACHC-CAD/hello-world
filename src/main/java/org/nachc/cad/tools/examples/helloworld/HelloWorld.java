package org.nachc.cad.tools.examples.helloworld;

import lombok.Getter;

@Getter
public class HelloWorld {

	private String who = "World";

	private void sayHello() {
		System.out.println("Java Runtime: " + System.getProperty("java.version"));
		System.out.println("Hello " + this.getWho());
	}

	public static void main(String[] args) {
		new HelloWorld().sayHello();
	}

}
