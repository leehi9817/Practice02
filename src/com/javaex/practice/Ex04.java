package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���");
		System.out.print("����: ");
		age = sc.nextInt();
		
		//19���̻� 65�� �̸��̸�
		if((age>=19) && (age<65)) {
			System.out.print("1���׷�");
		}else { //�� �̿ܿ���
			System.out.print("2���׷�");
		}
		System.out.println(" �Դϴ�.");
		
		sc.close();

	}

}
