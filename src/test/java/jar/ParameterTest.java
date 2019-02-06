package jar;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;

public class ParameterTest {
	@Test

	public void testCase1() {		
		GeometricObjects geomObject = new GeometricObjects();
		Object circle = geomObject.getCircle(2);
		assert(Circle.class == circle.getClass());
	}

	@Test

	public void testCase2() {

		System.out.println("This is the Test Case 2");

	}

	@BeforeMethod

	public void beforeMethod() {

		System.out.println("This will execute before every Method");

	}

	@AfterMethod

	public void afterMethod() {

		System.out.println("This will execute after every Method");

	}

	@BeforeClass

	public void beforeClass() {

		System.out.println("This will execute before Class");

	}

	@AfterClass

	public void afterClass() {

		System.out.println("This will execute after the Class");

	}

	@BeforeTest

	public void beforeTest() {

		System.out.println("This will execute before the Test");

	}

	@AfterTest

	public void afterTest() {

		System.out.println("This will execute after the Test");

	}

	@BeforeSuite

	public void beforeSuite() {

		System.out.println("This will execute before the Test Suite");

	}

	@AfterSuite

	public void afterSuite() {

		System.out.println("This will execute after Test Suite");

	}

}
