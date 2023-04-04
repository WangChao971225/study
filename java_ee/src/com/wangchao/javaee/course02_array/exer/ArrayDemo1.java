package com.wangchao.javaee.course02_array.exer;

import java.util.Scanner;

/*
 * 2. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
		成绩>=最高分-10    等级为’A’   
		成绩>=最高分-20    等级为’B’
		成绩>=最高分-30    等级为’C’   
		其余              等级为’D’
		
		提示：先读入学生人数，根据人数创建int数组，存放学生成绩。

 * 
 */
public class ArrayDemo1 {
	public static void main(String[] args) {
		//1.获取学生数量
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数:");
		int number = scan.nextInt();

		//2.创建数组，保存学生成绩，动态初始化
		int[] scores = new int[number];

		//3.给学生成绩赋值,并获取最高分。
		int maxScore = 0;
		System.out.println("请输入" + number + "个学生成绩:");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scan.nextInt();
			//4.获取成绩数组中的最高分
			if (scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}

		//5.根据每个学生的成绩与最高分的差值，得到每个学生的等级，并输出等级成绩
		char level;
		for (int i = 0; i < scores.length; i++) {
			if (maxScore - scores[i] <= 10) {
				level = 'A';
			} else if (maxScore - scores[i] <= 20) {
				level = 'B';
			} else if (maxScore - scores[i] <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}

			System.out.println("student " + i + " score is "
					+ scores[i] + ",grade is " + level);

		}
		
	}
}
