package jar.quadrate;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;
import jar.Parent;

public class TestsForQuadrate extends Parent {

	@Parameters("sideOfASquare")
	@Test(description = "Тестируется возможность создания объекта класса Quadrate", groups = "testGetQuadrate")
	public void testGetQuadrate(double sideOfASquareFromXML) {
		Object quadrate = getGeomObject().getQuadrate(sideOfASquareFromXML);
		assertEquals(quadrate.getClass(), Quadrate.class);
	}

	@Parameters("sideOfASquare")
	@Test(groups = "testGetPerimeter", dependsOnGroups = "testGetQuadrate", description="Тестируется правильность вычисления переметра")
	public void testGetPerimeter(double sideOfASquareFromXML) {
		double myPerimeter = 4 * sideOfASquareFromXML;
		double testPerimeter = getGeomObject().getQuadrate(sideOfASquareFromXML).getPerimeter();
		assertEquals(testPerimeter, myPerimeter);
	}

	@Parameters("sideOfASquare")
	@Test(dependsOnMethods = "testGetQuadrate", description="Тестируется правильность вычисления площади")
	public void testGetSquare(double sideOfASquareFromXML) {
		double mySquare = Math.pow(sideOfASquareFromXML, 2);
		double testSquare = getGeomObject().getQuadrate(sideOfASquareFromXML).getSquare();
		assertEquals(testSquare, mySquare);
	}
}