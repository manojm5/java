package com.capgemini.Lambda;

interface Bbc
{
	public int add(int a,int b);
}
interface Abc {
	public String Testme(String uname);
	
}

public class LambdaTest1 {

	public static void main(String[] args) {
		Abc c = (uname) -> {
			return "tested";
		};

		System.out.println(c.Testme("Hi"));
				Bbc ob=(int a,int b)->(a+b);
				System.out.println(ob.add(22, 33));
	}

}
