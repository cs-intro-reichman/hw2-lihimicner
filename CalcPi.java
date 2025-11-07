// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt(args[0]);
		double pie = 0.0;
		for (int i = 0; i < numOfTerms; i++) {
			double decimalNumber = 1.0 / (2 * i + 1);
			if (i % 2 == 1) { 
            	decimalNumber = - decimalNumber;
            } 
			pie = pie + decimalNumber;
		}
		pie = pie * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + pie);
	}
}
