package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
		double y[] = { 3.4, 2.7, 4.3, 8.5, 5.6, 1.1, 4.6 };
		double theta[] = new double[2];
		int i;

		Squares_lib slib = new Squares_lib(x,y);
		
		for(i = 0; i < 1000; i++){
			theta = slib.getDx();
		}
	    System.out.println(i+" : theta[0] = "+theta[0]);
		System.out.println(i+" : theta[1] = "+theta[1]);
		System.out.println(i+" : Objective function = "+slib.getRx());
		
		
	}

}
// y =0.3036x+4.1321