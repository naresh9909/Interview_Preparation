package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Feature1 {
	
	@BeforeClass
	public void setup() {
		System.out.println("This is @BeforeClass: Feature1 class");
	}
	
	@AfterClass
	public void EndStep() {
		System.out.println("This is @AfterClass: Feature1 class");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void F1_Test1() {
		System.out.println("Test case F1_Test1");
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void F1_Test2() {
		System.out.println("Test case F1_Test2");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void F1_Test3() {
		System.out.println("Test case F1_Test3");
	}

}
