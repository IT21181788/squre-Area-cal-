package claculato;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		
		System.out.println("Enter hight:");
		double wi= user.nextDouble();
		
		System.out.println("Enter width:");
		double hi= user.nextDouble();
		
		cla b = new cla(wi,hi);

	}

}
