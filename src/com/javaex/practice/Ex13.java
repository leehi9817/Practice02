package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		
		x = sc.nextDouble();
		
		if(x<=0) {
			//x가 0보다 작거나 같으면
			y = (x * x * x) - (9 * x) + 2;
		} else {
			//x가 0보다 크면
			y = (7 * x) + 2;
		}
		
		System.out.println("계산결과는 " + y + " 입니다.");
		
		sc.close();

	}

}
