import java.util.Iterator;

public class ArraysLoops {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		for(int i=0; i <=array.length;i++) {
			for (int j= array.length-1; j>0 ;j-- ) {
				 System.out.print(" ");
				
			}
			for (int k=1; k<=i;k++) {
				 System.out.print(k + " ");
				
			}
			
            System.out.println();

		}
		
		for(int i= array.length-1;i>=1; i--) {
			for (int j =0; j<array.length-1;j++) {
				 System.out.print(" ");
				
			}
			for(int k=1; k<=i;k++) {
				 System.out.print(k + " ");
				
			}
			System.out.println();
		}

	}

}
