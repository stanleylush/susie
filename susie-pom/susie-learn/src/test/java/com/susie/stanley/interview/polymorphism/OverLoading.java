package com.susie.stanley.interview.polymorphism;

public class OverLoading {

	public static void main(String[] args) {
		int i = 1;
		Integer j = new Integer(1);
		System.out.println(i==j);
		System.out.println(j.equals(i));
	}

}
