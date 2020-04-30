
public class CylinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cylinder cylinder1 = new Cylinder();
		Cylinder cylinder2 = new Cylinder(4, 5);
		
		cylinder1.setRadius(3);
		cylinder1.setHeight(6);
		
		
		System.out.println(cylinder1.toString());
		System.out.println(cylinder2.toString());
		
	}

}
