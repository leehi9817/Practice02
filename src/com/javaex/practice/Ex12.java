package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		String sign;
		double num1, num2, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��µǴ� ������ �Է��ϼ���");
		System.out.print("��ȣ: ");
		sign = sc.nextLine();
		
		System.out.print("����1: ");
		num1 = sc.nextDouble();
		
		System.out.print("����2: ");
		num2 = sc.nextDouble();
		
		switch(sign) {
			case "+":
				result = num1 + num2;
				System.out.println("�����: " + result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println("�����: " + result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println("�����: " + result);
				break;
			case "/":
				if(num2==0) {
					System.out.println("����� �� �����ϴ�.");
				}else {
					result = num1 / num2;
					System.out.println("�����: " + result);
				}
				break;
			default: 
				System.out.println("����� �� ���� ��ȣ�Դϴ�.");
				break;
		}
		
		sc.close();
		
	}

}
