package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		double height, weight, aver;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �����Ը� �Է����ּ���.");
		System.out.print("Ű: ");
		height = sc.nextDouble();
		
		System.out.print("������: ");
		weight = sc.nextDouble();
		
		aver = (height - 100) * 0.9;
		
		if(weight<aver) { 
			//ǥ��ü�ߺ��� �����԰� ������
			System.out.print("��ü��");
		}else if(weight==aver) { 
			//ǥ��ü�߰� �����԰� ������
			System.out.print("ǥ��");
		}else {
			//ǥ��ü�ߺ��� �����԰� ũ��
			System.out.print("��ü��");
		}
		
		System.out.println(" �Դϴ�.");
		System.out.println("ǥ��ü��: " + aver);
		
		sc.close();

	}

}
