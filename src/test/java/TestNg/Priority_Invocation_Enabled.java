package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Priority_Invocation_Enabled {

	@Test(priority=-7, invocationCount=-1)
	public void demo1(){
		System.out.println("Hi, demo1");
	}
	
	@Test(priority=-5, invocationCount=2, enabled=false)
	public void demo2() {
		System.out.println("hi, demo2");
	}
	
	@Test(priority=3)
	public void demo3() {
		System.out.println("hi, demo 3");
	}
}
