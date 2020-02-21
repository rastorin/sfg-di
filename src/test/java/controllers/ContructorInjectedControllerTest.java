package controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import services.ConstructorGreetingService;

class ContructorInjectedControllerTest {

	ContructorInjectedController controller;
	
	@BeforeEach
	void setUp()  {
		controller = new ContructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
