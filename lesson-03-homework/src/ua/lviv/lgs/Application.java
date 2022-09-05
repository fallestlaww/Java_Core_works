package ua.lviv.lgs;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//  	#1
		Rectangle r1 = new Rectangle (200);
		Rectangle r2 = new Rectangle ();
		r2.setHeight(300);
		
		
		int perimeter = r1.getWidth() + r2.getHeight() + r1.getWidth() + r2.getHeight();
		System.out.println("Периметер прямокутника = "+perimeter + " сантиметрів");
		
		int area = r1.getWidth () * r2.getHeight();
		System.out.println("Площа прямокутника = "+area + " сантиметрів квадратних");
		
//		#2		
		Circle c1 = new Circle (50);
		Circle c2 = new Circle ();
		c2.setDiametr(100);
		
		double p = 3.14;
		int area2 = (int) (c2.getDiametr() * p) * c2.getDiametr();
		System.out.println("Площа круга = "+area2 + " сантиметрів квадратних");
		
		int weight = (int) (c1.getRadius() * p * 2);
		System.out.println("Довжина круга = "+weight + " сантиметрів");
	}

}


// for commit