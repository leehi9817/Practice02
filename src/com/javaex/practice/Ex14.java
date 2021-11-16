package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		double salary, tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금액: ");
		
		salary = sc.nextDouble();
		
		if((salary>=0) &&(salary<=1000)) {
			//0원이상 1000만원이하
			tax = 0.09 * salary;
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if((salary>1000) && (salary<=4000)) {
			//1000만원 초과 4000만원 이하
			tax = (1000 * 0.09) + 0.18 * (salary - 1000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if ((salary>4000) && (salary<8000)) {
			//4000만원 초과 8000만원 미만
			tax = (1000 * 0.09) + (3000 * 0.18) + (0.27 * (salary - 4000));
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if ((salary>=8000)){
			//8000만원 이상
			tax = (1000 * 0.09) + (3000 * 0.18) + ((4000 * 0.27) + 0.36 * (salary - 8000));
			System.out.println("소득세는 " + tax + " 입니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();

	}

}
