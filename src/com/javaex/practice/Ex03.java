package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���");
		System.out.print("����: ");
		
		age = sc.nextInt();
		
		/*
		 * 15: 2���׷�
		 * 19: 2���׷�
		 * 20: 2���׷�
		 * 21: 1���׷�
		 * 100: 1���׷�
		 */
		
		if(age>20) {
			System.out.println("\"1���׷�\"");
		}else {
			System.out.println("\'2���׷�\'");
		}
		System.out.println("�Դϴ�.");
		
		sc.close();

	}

}
