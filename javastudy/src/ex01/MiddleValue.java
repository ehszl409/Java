package ex01;

import java.util.Scanner;

public class MiddleValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Value = new int[3];

		for (int i = 0; i < 3; i++) {
			Value[i] = sc.nextInt();
			System.out.println(Value[i]);
		}

		int MiddleValue = 0;

		if (Value[0] > Value[1] && Value[0] > Value[2]) {
			if (Value[1] > Value[2]) {
				MiddleValue = Value[1];
				System.out.println("중간값은 : " + MiddleValue);
			} else {
				MiddleValue = Value[2];
				System.out.println("중간값과 최솟값이 같다  : " + MiddleValue);
			}
		}

		if (Value[1] > Value[0] && Value[1] > Value[2]) {
			if (Value[2] > Value[0]) {
				MiddleValue = Value[2];
				System.out.println("중간값은 : " + MiddleValue);
			} else {
				MiddleValue = Value[0];
				System.out.println("중간값과 최솟값이 같다 : " + MiddleValue);
			}
		}

		if (Value[2] > Value[1] && Value[2] > Value[0]) {
			if (Value[0] > Value[1]) {
				MiddleValue = Value[0];
				System.out.println("중간값은 : " + MiddleValue);
			} else {
				MiddleValue = Value[1];
				System.out.println("중간값과 최솟값이 같다 : " + MiddleValue);
			}
		}

	}

}
