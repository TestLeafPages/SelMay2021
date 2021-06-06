package week5.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestcases {
	
	@Test
	public void login() {
		System.out.println("login");
		throw new NoSuchElementException();
	}
	
	@Test
	public void createLead() {
		System.out.println("create lead");
		
	}
	
	/*
	 * @Test(dependsOnMethods = "createLead") public void editLead() {
	 * System.out.println("edit lead");
	 * 
	 * }
	 * 
	 * @Test(priority = 3, enabled = false) public void deleteLead() {
	 * System.out.println("delete lead");
	 * 
	 * }
	 */
}
