package ex01;

import java.util.Scanner;

public class MoneyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt();
		int CM[] = {50000, 10000, 1000, 500, 10, 1};
		

		
		int count = 0;
		if (money >= CM[0]) {
			count = money / CM[0];
			money = money % CM[0];
			System.out.println(CM[0]+"원권 지폐 : " + count + "매");
		} 
		if (money >= CM[1]) {
			count = money / CM[1];
			money = money % CM[1];
			System.out.println(CM[1]+"원권 지폐 : " + count + "매");
		} 
		if (money >= CM[2]) {
			count = money / CM[2];
			money = money % CM[2];
			System.out.println(CM[2]+"원권 지폐 : " + count + "매");
		} 
		if (money >= CM[3]) {
			count = money / CM[3];
			money = money % CM[3];
			System.out.println(CM[3]+"백원 개수 : " + count + "개");
		} 
		if (money >= CM[4]) {
			count = money / CM[4];
			money = money % CM[4];
			System.out.println(CM[4]+"원 개수 : " + count + "개");
		} 
		if (money >= CM[5]) {
			count = money / CM[5];
			money = money % CM[5];
			System.out.println(CM[5]+"원 개수 : " + count + "개");
		}

	}

}
