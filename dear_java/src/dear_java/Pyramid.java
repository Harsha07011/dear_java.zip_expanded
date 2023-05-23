package dear_java;

public class Pyramid {
	public static void main(String[] args) {
		//outer loop for row
		for (int i=0; i <=4; i++) {
			//inner loop for column
			for(int j=0; j <=i; j++) {
				//print star
				System.out.print("* ");
			}
			//new line
			System.out.println();
		}
	}

}
