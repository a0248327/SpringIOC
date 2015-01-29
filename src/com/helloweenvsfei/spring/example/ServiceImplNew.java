package com.helloweenvsfei.spring.example;

public class ServiceImplNew implements IService {
	
	private IDao daoNew;
	
	public void service(String name) {
		System.out.println(daoNew.sayHello(name));
	}
	
	public IDao getDaoNew () {
		return this.daoNew;
	}
	
	public void setDaoNew (IDao daoNew) {
		this.daoNew = daoNew;
	}

}
