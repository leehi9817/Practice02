package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		double salary, tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���");
		System.out.print("�ݾ�: ");
		
		salary = sc.nextDouble();
		
		if((salary>=0) &&(salary<=1000)) {
			//0���̻� 1000��������
			tax = 0.09 * salary;
			System.out.println("�ҵ漼�� " + tax + " �Դϴ�.");
		} else if((salary>1000) && (salary<=4000)) {
			//1000���� �ʰ� 4000���� ����
			tax = (1000 * 0.09) + 0.18 * (salary - 1000);
			System.out.println("�ҵ漼�� " + tax + " �Դϴ�.");
		} else if ((salary>4000) && (salary<8000)) {
			//4000���� �ʰ� 8000���� �̸�
			tax = (1000 * 0.09) + (3000 * 0.18) + (0.27 * (salary - 4000));
			System.out.println("�ҵ漼�� " + tax + " �Դϴ�.");
		} else if ((salary>=8000)){
			//8000���� �̻�
			tax = (1000 * 0.09) + (3000 * 0.18) + ((4000 * 0.27) + 0.36 * (salary - 8000));
			System.out.println("�ҵ漼�� " + tax + " �Դϴ�.");
		} else {
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
		sc.close();

	}

}
