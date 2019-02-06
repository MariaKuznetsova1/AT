package jar.circle;

import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;
import jar.Parent;

public class TestsForCircle extends Parent {
	private double radiusForFactory;

	public TestsForCircle(double radiusForFactory) {
		this.radiusForFactory = radiusForFactory;
	}

	@Test(priority = 0, description = "Тестируется возможность создания экземпляра класа Circle")
	public void testGetCircle() {
		Object circle = getGeomObject().getCircle(radiusForFactory);
		assertEquals(circle.getClass(), Circle.class);
	}

	@Test(priority = 1, description = "Тестируется метод подсчёта длины окружности")
	public void testGetCircumference() {
		double myCircumference = getRound(2 * Math.PI * radiusForFactory);// Длины окружности вычисляется по формуле =
																			// 2*PI*radius
		double testCircumference = getGeomObject().getCircle(myCircumference).getCircumference();
		assertEquals(testCircumference, myCircumference);
	}

	@Test(priority = 2, description = "Тестируется метод подсчета площади круга")
	public void testGetSquare() {
		double mySquare = getRound(Math.PI * (Math.pow(radiusForFactory, 2)));// Площадь круга вычисляется по формуле =
																				// PI*radius*radius
		double testSquare = getGeomObject().getCircle(radiusForFactory).getSquare();
		assertEquals(testSquare, mySquare);
	}
}

