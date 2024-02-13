package edu.java.access02;

import java.util.Scanner;

import edu.java.acess01.Test01;

public class Accessmain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Test01 t1 = new Test01();
		
		// t1.n1 = 100; // private : 접근불가
		// t1.n2 = 200; // (package) : 다른 패키지에 있으므로 접근불가
		// t1.n3 = 300; // protected : 다른 패키지이고, 상속받지 않았으므로 접근불가
		t1.n4=400;
		
		
		
		
		
		
	}

}
