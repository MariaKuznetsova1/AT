package jar.circle;

import org.testng.annotations.Factory;

public class TestFactoryForCircle {
	
  @Factory
  public Object[] CreateTestIntances() {
	  Object[] result = new Object[5];
	  result[0] = new TestsForCircle(-3.55);
	  result[1] = new TestsForCircle(-3);
	  result[2] = new TestsForCircle(0);
	  result[3] = new TestsForCircle(3);
	  result[4] = new TestsForCircle(3.55);
	return result;
  }
}
