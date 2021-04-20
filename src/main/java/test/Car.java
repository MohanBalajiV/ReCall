package test;

import java.util.Scanner;

public class Car {
	Scanner sc= new Scanner(System.in);

public void topSpeed(){
System.out.print("Top speed is");
sc.nextLine();
System.out.println("100");

}

public void topSpeed(int topSpeed){
	
System.out.println("Top speed of the vehicle is");

System.out.println(+topSpeed+"kmph");

}


public void topSpeed(String vehicleName,int topSpeed){
System.out.println("Top speed of the vehicle "+vehicleName);
System.out.println("is"+topSpeed+"kmph");

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car a= new Car();
		a.topSpeed();
		a.topSpeed(200);
		a.topSpeed("BMW", 220);
		a.topSpeed(300);
	}

}
