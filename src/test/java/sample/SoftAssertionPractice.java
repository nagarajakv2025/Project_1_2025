package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {

@Test
public void strictLevelComparison()
{
	String a1="hello";
	String a2="hello";
	String a3="hell";
	
	SoftAssert s = new SoftAssert();
	s.assertEquals(a2, a1);
	s.assertEquals(a3, a2);
	System.out.println("Soft Assertion strict level completed");
	s.assertTrue(a2.equals(a1));
	System.out.println("After assert all");
	s.assertAll();
}
@Test
public void containsLevelCoparison()
{
	String expectedCity="Delhi";
	String actualCity="New Delhi";
	
	SoftAssert s = new SoftAssert();
	s.assertTrue(actualCity.contains(expectedCity));
	s.assertAll();
	System.out.println("soft assertion contains level completed");
	
}
}
