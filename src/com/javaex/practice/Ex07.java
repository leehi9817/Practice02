package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		int num1, num2, q, r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		num1 = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			//num1�� num2���� Ŭ��
			q = num1 / num2;
			r = num1 % num2;
		}else if(num1<num2) {
			//num1�� num2���� ������
			q = num2 / num1;
			r = num2 % num1;
		}else {
			//num1�� num2�� ���� ��
			q = num1 / num2;
			r = num1 % num2;
		}
		
		System.out.println("��: " + q);
		System.out.println("������: " + r);
		
		sc.close();
	}
}