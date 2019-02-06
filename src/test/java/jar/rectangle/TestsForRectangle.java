package jar.rectangle;

import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;
import jar.Parent;

import org.testng.annotations.DataProvider;

public class TestsForRectangle extends Parent {

	@Test(dataProvider = "dp", description = "Тестируется возможность создания объекта класса Rectangl")
	public void testGetRectangle(double firstSide, double secondSide) {
		Object rectangle = getGeomObject().getRectangle(firstSide, secondSide);
		assertEquals(rectangle.getClass(), Rectangle.class);
	}

	@Test(dataProvider = "dp", description = "Тестируется правильность вычисления переметра")
	public void testGetPerimeter(double firstSide, double secondSide) {
		double myPerimeter = (firstSide + secondSide * 2);// Формула вычисления периметра: (sideOne + sideTwo)																	// * 2
		double testPerimeter = getGeomObject().getRectangle(firstSide, secondSide).getPerimeter();
		assertEquals(testPerimeter, myPerimeter);
	}

	@Test(dataProvider = "dp", description = "Тестируется правильность вычисления площади")
	public void testGetSquare(double firstSide, double secondSide) {
		double mySquare = firstSide * secondSide;// Формула вычисления площади: sideOne*sideTwo
		double testSquare = getGeomObject().getRectangle(firstSide, secondSide).getSquare();
		assertEquals(testSquare, mySquare);
	}

	@Test(dataProvider = "dp", description = "Тестируется правильность определения является ли прямоугольник квадратом")
	public void testIsQuadrate(double firstSide, double secondSide) {
		boolean myIsQuadrate = firstSide == secondSide;
		boolean testIsQuadrate = getGeomObject().getRectangle(firstSide, secondSide).isQuadrate();
		assertEquals(testIsQuadrate, myIsQuadrate);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 0, 0 }, new Object[] { 1, 56.958686 }, new Object[] { 5.236, -5963.25 },
				new Object[] { -6554.25, 54.38 }, new Object[] { -6, -85 }, new Object[] { 0, -8 },
				new Object[] { -8454.4554, 0 }, new Object[] { 0.00000000000001, 26 }, new Object[] { 2, 2 },
				new Object[] { 56.32, 56.23 }, new Object[] { 0.0000000000005, 0.0000000000005 }, };
	}

}
