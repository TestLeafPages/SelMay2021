package week5.day2;

import org.testng.annotations.Test;

public class RegressionTests {
							//packageName.ClassName.methodName
	@Test(dependsOnMethods = {"week5.day2.LeafTapsTestcases.createLead","week5.day2.LeafTapsTestcases.login"})
	public void editLead() {
		System.out.println("edit lead");

	}

}
