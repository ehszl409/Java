package ch03;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated meSthod stub
		String s = "*";
		String e = " ";

		System.out.println("1.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(s);
			}
			System.out.println();
		}

		System.out.println("2.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}

		System.out.println("3.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}

//		System.out.println("  *");
//		System.out.println(" ***");
//		System.out.println("*****");
//		System.out.println(" ***");
//		System.out.println("  *");
//		

//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(e);
//			}
//			System.out.print(s);
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 1; i++) {
//			System.out.print(e);
//			for (int j = 0; j < 3; j++) {
//				System.out.print(s);
//			}
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(e);
//			}
//			System.out.print(s);
//		}
//		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			if(i==1 || i==3) {
				for (int k = 0; k < 1; k++) {
					System.out.print(e);
					for (int j = 0; j < 3; j++) {
						System.out.print(s);
					}
				}
				System.out.println();
			} else if (i==2) {
				for (int r = 0; r < 5; r++) {
					System.out.print(s);
				}
				System.out.println();
				
			}
			else {
				for (int t = 0; t < 1; t++) {
					for (int j = 0; j < 2; j++) {
						System.out.print(e);
					}
					System.out.print(s);
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
//		
//		for (int i = 0; i < 1; i++) {
//			System.out.print(e);
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.print(s);
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print(s);
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 1; i++) {
//			System.out.print(e);
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.print(s);
//		}
//		System.out.println();
	}

}
