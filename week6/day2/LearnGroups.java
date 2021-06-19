package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups = {"smoke"})
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();
	}

	@Test(groups="functional", dependsOnGroups = "smoke")
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void deleteLead() {
		System.out.println("delete Lead");
	}
	
	@Test(groups = {"regression","functional"}, dependsOnGroups = "smoke")
	public void mergeLead() {
		System.out.println("merge Lead");
	}
	
	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void duplicateLead() {
		System.out.println("duplicate Lead");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
