package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����2���� �Է����ּ���");
		
		System.out.print("����1: ");
		num1 = sc.nextInt();
		
		System.out.print("����2: ");
		num2 = sc.nextInt();
		
		if(num1<num2) {
			//����1�� ����2���� ������
			System.out.println("ū��: " + num2 + "\t\t������: " + num1 + "�Դϴ�.");
		} else if(num1>num2) { 
			//����1�� ����2���� Ŭ��
			System.out.println("ū��: " + num1 + "\t\t������: " + num2 + "�Դϴ�.");
		} else {
			//����1�� ����2�� ������
			System.out.println("ū��: " + num2 + "\t\t������: " + num1 + "�Դϴ�.");
		}
		
		sc.close();

	}

}
