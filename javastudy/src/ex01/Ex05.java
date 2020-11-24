package ex01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String str[] = { "가위", "바위", "보" };
		Scanner scan = new Scanner(System.in);
		String user = scan.nextLine();
		
		//int n = (int) (Math.random() * 3);
		if (str[0].equals(user))
			System.out.println("비겼습니다.");
		else {
			if (str[0].equals("가위") && user.equals("바위")) {
				System.out.println("user win");
			}
		}

	}

}
