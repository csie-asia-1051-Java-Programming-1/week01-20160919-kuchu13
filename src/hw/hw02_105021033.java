package hw;

import java.util.Random;

import java.util.Scanner;

public class hw02_105021033 {

	public static void main(String[] args) {
		 
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int a=scn.nextInt();
		Random rnd = new Random();
		
		int b = rnd.nextInt(a)+1;
		int c = rnd.nextInt(a)+1;
		int d = rnd.nextInt(a)+1;
		int e = rnd.nextInt(a)+1;
		int f = rnd.nextInt(a)+1;
		int g = rnd.nextInt(a)+1;

		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);	
	}

}
