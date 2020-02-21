package controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import services.ConstructorGreetingService;

class SetterInjectedControllerTest {
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}
	
	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
