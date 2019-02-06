package jar;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExpectedExeption extends Parent{

	@Parameters("value")
    @Test(expectedExceptions=Exception.class) 
    public void testForFailing(double side) {
		Object quadrate = getGeomObject().getQuadrate(side);
    }
	
}
