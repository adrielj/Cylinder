
public class Cylinder {
	
	private double radius;
	private double height;
	
	public Cylinder () {
		
		radius = 0;
		height = 0;
		
	}
	
	public Cylinder (double rad, double ht) {
		
		radius = rad;
		height = ht;
		
	}
	
	public double getRadius () {
		
		return radius;
		
	}
	
	public double getHeight () {
		
		return height;
		
	}
	
	public void setHeight (double ht) {
		
		height = ht;
		
	}
	
	public void setRadius (double rad) {
		
		radius = rad;
		
	}
	
	public double getBaseDiameter () {
		
		double diameter = radius * 2;
		return diameter;
		
	}
	
	public double getBaseArea () {
		
		double baseArea = Math.PI * Math.pow(radius, 2);
		return baseArea;
		
	}
	
	public double getCircumference () {
		
		double circumference = 2 * radius * Math.PI;
		return circumference;
		
	}
	
	public double getSurfaceArea () {
		
		double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
		return surfaceArea;
	}
	
	public double getVolume ( ) {
		
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
		
	}
	
	public String toString () {
		
		String cylinderStats = " Radius: " +radius+ "\n Height: " + height + "\n Base Diameter: " + radius * 2 + "\n Base Area:" + Math.PI * Math.pow(radius, 2)+ "\n Base Circumference: " +2 * radius * Math.PI+ "\n Surface Area: " +(2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2))+ "\n Volume: " +Math.PI * Math.pow(radius, 2) * height;
		return cylinderStats;
		
		
	}
	
}


