package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		num1 = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			//num1�� num2���� Ŭ��
			if((num1%num2)==0) {
				//num2�� num1�� ����϶�
				System.out.println(num2 + " ��(��) " + num1 + " �� ����Դϴ�.");
			} else {
				//num2�� num1�� ����� �ƴҶ�
				System.out.println(num2 + " ��(��) " + num1 + " �� ����� �ƴմϴ�.");
			}
		} else {
			//num2�� num1���� ���ų� Ŭ��
			if((num2%num1)==0) {
				//num1�� num2�� ����϶�
				System.out.println(num1 + " ��(��) " + num2 + " �� ����Դϴ�.");
			} else {
				//num1�� num2�� ����� �ƴҶ�
				System.out.println(num1 + " ��(��) " + num2 + " �� ����� �ƴմϴ�.");
			}
		}
		
		sc.close();

	}

}
