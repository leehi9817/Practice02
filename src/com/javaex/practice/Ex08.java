package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է����ּ���");
		
		System.out.print("����1: ");
		num1 = sc.nextInt();
		
		System.out.print("����2: ");
		num2 = sc.nextInt();
		
		System.out.print("����3: ");
		num3 = sc.nextInt();
		
		if((num1<num2) && (num1<num3)) {
			//num1�� ���� ���� ��
			System.out.println("���� �������� " + num1 + " �Դϴ�.");
		} else if((num2<num1) && (num2<num3)) {
			//num3�� ���� ���� ��
			System.out.println("���� �������� " + num2 + " �Դϴ�.");
		}else {
			//num3�� ���� ���� ��
			System.out.println("���� ���� ���� " + num3 + " �Դϴ�.");
		}
		
		sc.close();
	}

}
