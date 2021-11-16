package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		int num1, num2, q, r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			//num1이 num2보다 클때
			q = num1 / num2;
			r = num1 % num2;
		}else if(num1<num2) {
			//num1이 num2보다 작을때
			q = num2 / num1;
			r = num2 % num1;
		}else {
			//num1과 num2가 같을 때
			q = num1 / num2;
			r = num1 % num2;
		}
		
		System.out.println("몫: " + q);
		System.out.println("나머지: " + r);
		
		sc.close();
	}
}