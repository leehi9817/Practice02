package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ� 1����(�ҹ���)�� �Է��ϼ���");
		System.out.print("���ĺ�: ");
		
		str = sc.nextLine();
		
		switch(str) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("�����Դϴ�.");
				break;
			default: 
				System.out.println("�����Դϴ�.");
				break;
		}
		
		sc.close();

	}

}
