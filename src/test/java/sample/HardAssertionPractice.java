package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {

@Test
public void StrictLevelComparison()
{
	String expectedName="Raja";
	String actualName="Raja";
	//method 1
	Assert.assertEquals(actualName, expectedName);
	//method 2
	Assert.assertTrue(actualName.equals(expectedName));
	//method 3
	Assert.assertEquals(actualName.equals(expectedName), true);
	System.out.println("Hard Assertion strict level completed");
}

@Test
public void ContainsLevelComparison()
{
	String a1="don";
	String a2= "London";
	String a3="Don";
	
	Assert.assertTrue(a2.contains(a1));
	System.out.println("Hard Assertion contains level completed");
	
	Assert.assertTrue(a3.contains(a2));
	System.out.println("Hard Assertion contains level completed");
}
}
