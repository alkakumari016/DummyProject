package com.cts.springday1;

public class B {
	A a;
	
	
	public A getA() {
		return a;
	}


	public void setA(A a) {
		this.a = a;
	}


	public String useMesage(String inputMessage){
		return a.sendMessage(inputMessage);
	}

}
