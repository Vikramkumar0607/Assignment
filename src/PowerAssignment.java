
public class PowerAssignment {

	public static double power(double x, int n) {
		double numbertwo = 1;
		if (n > 0) {
			int k = 1;
			while (k <= n) {
				numbertwo = numbertwo * x;
				k++;
			}
		} else {
			int k = -1;
			while (k >= n) {
				numbertwo = numbertwo / x;
				k--;
			}
		}
		return numbertwo;
	}

	public static void main(String[] args) {
		System.out.println("Example 1 : " + power(2.00000, 10));
		System.out.println("Example 2 : " + power(2.10000, 3));
		System.out.println("Example 3 : " + power(2.00000, -2));
	}

}
