package jar;

public class Circles {
	
	private double radius;
	
   public Circles(double radius) throws Exception {
	   if (radius > 0) {
		   this.radius = radius;
	   }
	   else throw new Exception("Circle with radius < 0 does not exist!");
		  
   }


}
