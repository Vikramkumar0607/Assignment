import java.util.Iterator;

public class trianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 5;
		for (int i=0; i<=rows;i++) {
			for(int j =i; j<rows;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}



	}

}

