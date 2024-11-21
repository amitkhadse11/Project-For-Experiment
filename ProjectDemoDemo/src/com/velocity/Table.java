package com.velocity;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	System.out.println("wlcome to the table printing");
	System.out.println("enter the number");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(a+" * "+i+" = "+i*a);
		
	}
}
}
