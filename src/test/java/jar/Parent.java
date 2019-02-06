package jar;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;

public class Parent extends Assert {
	private GeometricObjects geomObject = new GeometricObjects();
			
	/**Округляет число double до тысячных долей
	 * @return округлённое значение формата double
	 */
	public double getRound(double variable) {	
		variable = variable*1000;
		int i = (int) Math.round(variable);
		variable = (double)i / 1000;
		return variable;
	}

	public GeometricObjects getGeomObject() {
		return geomObject;
	}

	public void setGeomObject(GeometricObjects geomObject) {
		this.geomObject = geomObject;
	}
	


	
	
	
}
