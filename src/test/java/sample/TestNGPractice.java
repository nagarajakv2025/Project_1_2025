package sample;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {

@Test(priority=1, invocationCount=3)
public void createUser()
{
	System.out.println("user created");
}

@Test(priority=2, dependsOnMethods= {"createUser"})
public void modifyUser()
{
	System.out.println("user modified");
}

@Test(priority='A')
public void deleteUser()
{
	System.out.println("user deleted");
}

}
