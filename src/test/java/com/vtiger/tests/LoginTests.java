package com.vtiger.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class LoginTests {
@BeforeClass
public void Login() {
	System.out.println("Login");
}
@Test
public void Launch() {
	System.out.println("Launch");
}
}
