package com.java.design_05_prototype;

public class Test {
	public static void main(String[] args) {
		Prototype pro = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype)pro.clone();
        System.out.println(pro.getName());
        System.out.println(pro2.getName());
	}
}
