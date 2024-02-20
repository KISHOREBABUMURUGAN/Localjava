package com.pack;

import org.testng.annotations.Test;

public class Dependent {
	@Test(dependsOnMethods= {"openbrowser"})
 public void login() {
	 System.out.println("This is second");
 }
	//@Test(dependsOnMethods = {"logout"})
 public void openbrowser() {
	 System.out.println("This is first");
 }
 @Test(dependsOnMethods= {"login"})
 public void logout() {
	 System.out.println("This is third");
 }
}
