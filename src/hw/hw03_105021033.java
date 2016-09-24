package hw;

import java.util.Scanner;

public class hw03_105021033 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入六個數字");
		
		float a =scn.nextFloat();
		float b =scn.nextFloat();
		float c =scn.nextFloat();
		float d =scn.nextFloat();
		float e =scn.nextFloat();
		float f =scn.nextFloat();
		
		int g = Math.round(a);
		int h = Math.round(b);
		int i = Math.round(c);
		int j = Math.round(d);
		int k = Math.round(e);
		int l = Math.round(f);

		System.out.println(Math.min(Math.min(Math.min(Math.min(Math.min(g,h),i),j),k),l));		
	}
}
