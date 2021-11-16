package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			//num1이 num2보다 클때
			if((num1%num2)==0) {
				//num2가 num1의 약수일때
				System.out.println(num2 + " 는(은) " + num1 + " 의 약수입니다.");
			} else {
				//num2가 num1의 약수가 아닐때
				System.out.println(num2 + " 는(은) " + num1 + " 의 약수가 아닙니다.");
			}
		} else {
			//num2가 num1보다 같거나 클때
			if((num2%num1)==0) {
				//num1이 num2의 약수일때
				System.out.println(num1 + " 는(은) " + num2 + " 의 약수입니다.");
			} else {
				//num1이 num2의 약수가 아닐때
				System.out.println(num1 + " 는(은) " + num2 + " 의 약수가 아닙니다.");
			}
		}
		
		sc.close();

	}

}
