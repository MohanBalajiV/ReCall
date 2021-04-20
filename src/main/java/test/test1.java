package test;

import java.io.File;
import java.io.IOException;

public abstract class test1 extends Inher {
	
	public abstract void method1();
	
	public static void method2(String name) {
		String name1="test";
		System.out.println(name1);
	}
	
	
	public void m2() throws IOException{
		try{
		File f= new File("./files/File.exe");
		}catch(Exception e){
		System.out.println("Exception handled");
		}
		}
	
	

}
