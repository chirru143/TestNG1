package Learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNG {

//	public static void main(String[] args) {
//		System.out.println("this is my first TestNG Program");
//	}
	
//	
//	@BeforeSuite
//	public void Test1() {
//		System.out.println("before suite ");
//	}
//	
//	@BeforeClass
//	public void Test3() {
//		System.out.println("before Class");
//	}
//	@BeforeTest
//	public void Test2() {
//		System.out.println("before test");
//	}
//	@BeforeMethod
//	public void Test4() {
//		System.out.println("before Method");
//	}
	@Test(priority=0,enabled=true)
	public  void test() {
		System.out.println("this is my first TestNG Program");
	}
	@Test(priority=-4,enabled=true)
	

	public void Test11()
	{
		System.out.println("this is my second test");
	}}
//	
//	@AfterClass
//	public void Test6() {
//		System.out.println("After Class");
//	}
//	@AfterTest
//	public void Test7() {
//		System.out.println("After test");
//	}
//	@AfterMethod
//	public void Test8() {
//		System.out.println("After Method");
//	}
//}
