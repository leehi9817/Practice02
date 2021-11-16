package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		double height, weight, aver;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		height = sc.nextDouble();
		
		System.out.print("몸무게: ");
		weight = sc.nextDouble();
		
		aver = (height - 100) * 0.9;
		
		if(weight<aver) { 
			//표준체중보다 몸무게가 적으면
			System.out.print("저체중");
		}else if(weight==aver) { 
			//표준체중과 몸무게가 같으면
			System.out.print("표준");
		}else {
			//표준체중보다 몸무게가 크면
			System.out.print("과체중");
		}
		
		System.out.println(" 입니다.");
		System.out.println("표준체중: " + aver);
		
		sc.close();

	}

}
