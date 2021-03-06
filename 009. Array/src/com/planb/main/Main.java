package com.planb.main;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * 배열은 참조 타입
		 * 
		 * 참조 타입의 종류
		 * 1. 클래스
		 * 2. 인터페이스
		 * 3. 열거형(Enum)
		 * 4. 배열
		 */
		
		int[] array;
		// 선언 1
		int array2[];
		// 선언 2
		
		array = new int[10];
		// 기본값으로 인스턴스화
		
		int[] array3 = new int[]{1, 2, 3};
		// 리터럴 초기화 1
		
		int[] array4 = {1, 2, 3};
		// 리터럴 초기화 2
		
		array4[0] = 3;
		array4[1] = 5;
		Arrays.sort(array4);
		// Arrays 클래스를 이용한 정렬
		
		for(int i = 0; i < array4.length; i++) { // length 필드는 final
			System.out.println(array4[i]);
		}
	}
}
