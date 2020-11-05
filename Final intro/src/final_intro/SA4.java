package final_intro;

public class SA4 {
	// create your methods here
	
	// method#1
	public void distance(double x1, double y1, double x2, double y2) {
		double a = (y2-y1)*(y2-y1)+(x2-x1)*(x2-x1);
		double x = 0;
		while(x*x != a) {
			if(x*x > a) {
				break;
			}
			x+= 0.01;
			}
		double t = 100*x;
		double g = (int)(t);
		double f = g/100;
		System.out.println(f);
		System.out.println(" ");
	}
	
	// method#2
	public void quadratic(int a, int b, int c) {
		double delta = b*b-4*a*c;
		double k = 0;
			while (k*k != delta) {
				k++;
				if (k*k >= delta) {
					break;
				}

			}
		double x1 = (-b+k)/(2*a);
		double x2 = (-b-k)/(2*a);
			System.out.println("Root 1:");
			System.out.println(x1);
			System.out.println("Root 2:");
			System.out.println(x2);
			System.out.println(" ");
	}
	
	// method#3
	public void charAverage(char x, char y) {
		int a = (x+y)/2;
		System.out.println((char)(a));
	}
		public static void main(String[] args) {
			
			SA4 tester = new SA4();
			
			// prints out the distance between two points
			// output should be 6.83
			tester.distance(1, -2.5, 3.1, 4);
			
			// prints out a solution to y = ax^2 + b*x + c, where the 
			// three parameters are a, b, and c. Use the quadratic equation
			// output should be 2 or -2 (challenge: give both solutions)
			tester.quadratic(1, 0, -4);
			
			// prints out the 'average' of two characters
			// output should be 'W'
			tester.charAverage('m', 'A');
		}
}