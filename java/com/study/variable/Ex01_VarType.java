package com.study.variable;


/*
 * [자바 변수 연습 문제]
 * 1. 문제: 정수형 변수 'age'에 25를 담고, 실수형 변수 'height'에 175.5를 담은 뒤 출력하세요.
 * 2. 문제: 문자열 변수 'name'에 본인 이름을 담고, "제 이름은 OOO입니다"라고 출력하세요.
 * 3. 문제: 논리형 변수 'isStudent'에 true를 담고, "학생입니까? " 뒤에 변수값을 출력하세요.
 */


public class Ex01_VarType {
	public static void main(String[] args) {
		
		// 1번 문제: 정수(int)와 실수(double)
		int age = 25;
		double height = 175.5;
		System.out.println("나이: "+ age);
		System.out.println("키: "+ height);
	
		// 2번 문제: 문자열(String)
        String name = "앵이";
        System.out.println("제 이름은 "+ name + " 입니다. ");
        
        // 3번 문제: 논리형(boolean)
        boolean isStudent = true;
        System.out.println("학생 입니까? "+ isStudent);
	}

}
