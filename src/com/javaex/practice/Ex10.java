package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���(����)�� �Է����ּ���");
		System.out.print("���: ");
		
		num = sc.nextInt();
				
		switch(num%3) {
			case 0: 
				System.out.println("A���Դϴ�.");
				break;
			case 1: System.out.println("B���Դϴ�.");
				break;
			case 2: System.out.println("C���Դϴ�.");
				break;
			default: 
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
		}
		
		sc.close();

	}

}
