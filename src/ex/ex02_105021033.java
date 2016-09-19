package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex02_105021033 {

public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入體重");
		float a = scn.nextFloat();
		System.out.println(a/0.45359);

	}

}
