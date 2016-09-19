package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex01_105021033 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入華氏溫度");
		float a = scn.nextFloat();
		// scn.close();
		System.out.println((a - 32) * 5 / 9);

	}

}
