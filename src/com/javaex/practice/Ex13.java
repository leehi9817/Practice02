package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���");
		System.out.print("����: ");
		
		x = sc.nextDouble();
		
		if(x<=0) {
			//x�� 0���� �۰ų� ������
			y = (x * x * x) - (9 * x) + 2;
		} else {
			//x�� 0���� ũ��
			y = (7 * x) + 2;
		}
		
		System.out.println("������� " + y + " �Դϴ�.");
		
		sc.close();

	}

}
