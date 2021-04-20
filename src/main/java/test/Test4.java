package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws IOException {
		

		List<String> name = new ArrayList<String>(Arrays.asList("Arvind", "Mohan", "Raju", "aryan", "Adam"));
		for(String value:name) {
			if(value.startsWith("A")) {
				System.out.println(value);
			}else if(value.startsWith("a")) {
				System.out.println(value);
			}
		}
		
//		System.setProperty("webdriver.chrome.driver","");
//		WebDriver driver= new ChromeDriver();
//		
//		driver.findElement(By.className(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.tagName(""));
//		driver.findElement(By.linkText(""));
//		driver.findElement(By.cssSelector("")).getAttribute("");
//		
		String s="Mohan Balaji";
		char[] ch=s.toCharArray();
		//to find the duplicate characters of a string
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}
		
		//to reverse a string
		StringBuilder build= new StringBuilder();
		build.append(ch);
		StringBuilder reverse = build.reverse();
		System.out.println(reverse);
		
		//to replace first and lastchar using temp variables
		int length=ch.length;
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[length-1]=temp;
		
		System.out.println(ch);
		
		
		//to replace all uppercase to lowercase and lowercase to uppercase
		
		
		
		
	}
}