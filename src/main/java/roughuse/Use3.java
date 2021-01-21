package roughuse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Kumari Neha";
		String a1=a.substring(a.length()-4);
		System.out.println(a1);
		

String data="Fresh Fish";
char[] ch = data.toCharArray();

for(int i=0;i<ch.length;i++){
for(int j=i+1;j<ch.length;j++){
if(ch[i]==ch[j]){
System.out.println(ch[j]);
}
}
}


List<String> value= new ArrayList<String>();
value.add("Himayain");
value.add("Helen");
value.add("sona");
value.add("ajay");
value.add("kannan");

for(String eachone:value) {
	if(eachone.startsWith("H")) {
	System.out.println(eachone);
	}
	if(eachone.length()>4) {
	System.out.println(eachone);
	
}

}



String aa="Hi//new//My NoteBook";

//to get the value after last //
String[] v= aa.split("//");
aa= v[v.length-1];
System.out.println(aa);


	int arr[]= {1,1,2,3,5,2,4,7};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]!=arr[j]) {
				
				System.out.println(arr[j]);
				Arrays.sort(arr);
				break;
			}
		}
	}
	
	
	//to find distance
	String text="Ajay is here";
	int one = text.indexOf("j");
	int two = text.indexOf("r");
	int sum=two-one;
	System.out.println(sum);
	
	
	
	
	}


}



//System.out.println(value);

//HashSet<String> s= new HashSet<String>(value);
//System.out.println(s);
	
//Scanner sc= new Scanner(aa);
//sc.useDelimiter("//");
//while(sc.hasNext()){
//	String next = sc.next();
//	
//	System.out.println(next);
//	
//	}
//sc.close();
//


//String substring = aa.substring(aa.lastIndexOf('/')+1);
//System.out.println(substring);
//for(String each:v) {
//		System.out.println(each);
//	
//}



	
	
		


