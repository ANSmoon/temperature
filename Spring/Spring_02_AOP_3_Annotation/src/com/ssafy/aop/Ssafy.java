package com.ssafy.aop;

import java.util.Random;


public class Ssafy implements Person {
	// filed는 과감히 생략한다.

	// Ssafy의 일상
	public int coding() {
		System.out.println("Coding 너무 하기 싫다."); // 핵심 관심 사항
		if (new Random().nextBoolean()) {
			throw new OuchException();
		}
		return (int) (Math.random() * 100) + 1;
	}

}
