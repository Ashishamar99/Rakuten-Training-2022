package com.packagedemo.demo1;

class A extends B{
	public void m1() {
		System.out.println("A");
	}
}
class B{
	public void m1() {
		System.out.println("B");
	}
}
public class demo {
	public static void main(String[] args) {
		B a = new A();
		a.m1();
	}
}
