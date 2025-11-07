// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		if (mode.equals("v")) {
			for (int seed = 1; seed <= n; seed++) {
				int count = 0;
				int current = seed;
				do {
                    System.out.print(current + " ");
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = current * 3 + 1;
                    }
                    count++;
                } while (current != 1);

                System.out.println("1 (" + (count + 1) + ")");
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		} else if (mode.equals("c")) {
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
