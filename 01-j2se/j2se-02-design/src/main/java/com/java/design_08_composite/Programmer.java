package com.java.design_08_composite;

/*
 * Leaf
      ������б�ʾҶ�ڵ����Ҷ�ڵ�û���ӽڵ㡣
      ������ж���ڵ�������Ϊ��

 */
public class Programmer extends Employer {

	public Programmer(String name) {
		setName(name);
		employers = null;
	}
	
	@Override
	public void add(Employer employer) {

	}

	@Override
	public void delete(Employer employer) {
	
	}

}