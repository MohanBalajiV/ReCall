package roughuse;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.map.HashedMap;

public class JavaPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="I Love India";
		
		//find length of the string
		int num=text.length();
		System.out.println("The length of the string is : "+num);
		
		//String to char
		char[] ch=text.toCharArray();
		int size=ch.length;
		System.out.println("The length of the char is : "+size);
		
		//print each char of the string
		for(char c:ch) {
			System.out.println(c);
		}
		
		//find char using index
		char charAt = text.charAt(5);
		System.out.println("The character at index is " +charAt);
		
		//find index of the char
		int indexOf = text.indexOf("o");
		System.out.println("The index of the char is "+indexOf);
		
		//find index of the char from last
		int lastIndexOf = text.lastIndexOf("n");
		System.out.println("The last index of the char is "+lastIndexOf);
	
		//to print partial char
		String substring = text.substring(3);
		System.out.println(substring);
		
		//print specified chars
		String sub= text.substring(4, 8);
		System.out.println(sub);
		
		//remove whitespaces in front and last
		String text1=" asdf ";
		String tr=text1.trim();
		System.out.println(tr);
		
		//replace particular character in string
		String replace = text.replace("I","U");
		System.out.println(replace);
		
		//replace first I alone
		String replaceFirst = text.replaceFirst("I", "U");
		System.out.println(replaceFirst);
		
		//replace all char
		String replaceAll = text.replaceAll(" ", "_");
		System.out.println(replaceAll);
		
		//convert all to lowercase
		String lowerCase = text.toLowerCase();
		System.out.println(lowerCase);
		
		//covert all to uppercase
		String upperCase = text.toUpperCase();
		System.out.println(upperCase);
		
		//split the string by spaces
		String[] split=text.split(" ");
		int num1=split.length;
		for(String each:split) {
			System.out.println(each);
		}
	
		//print the word starts with I
		for(String each:split) {
		if(each.startsWith("I")){
		System.out.println(each);
		}
		//print word ends with e
		else if(each.endsWith("e")){
			System.out.println(each);
			}
		}
		
		
		//reverse the string
		StringBuilder builder= new StringBuilder();
		StringBuilder append=builder.append(text);
		StringBuilder reverse=append.reverse();
		System.out.println(reverse);
		
		//swap first and last cha using temp variable
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		System.out.println(ch);
		
		//swap using stringbuilder
		String text2="I Love Chennai";
		char[] cc = text2.toCharArray();
		
		StringBuilder x= new StringBuilder();
		StringBuilder appd=x.append(text2);
		char first=x.charAt(0);
		x.setCharAt(0, cc[cc.length-1]);
		x.setCharAt(cc.length-1, first);
		String string = x.toString();
		System.out.println(string);
		
		//fibonancci series
		int prev=0;
		int next=1;
		int max=10;
		for(int i=0;i<=max;i++) {
			System.out.println("The fibonancci series are " +prev);
			prev=next;
			int sum=prev+next;
			next=sum;
		}
		
		
		//print the repeated char of the string 
		//here taken string i love chennai from above		
		for(int i=0;i<cc.length;i++) {
			for(int j=i+1;j<cc.length;j++) {
				if(cc[i]==cc[j]) {
					System.out.println("The repeated char of the string are :"+cc[j]);
				}
			}
		}
		
		System.out.println("dummy");
		//print repeated characters of two string
		String concat = text.concat(text2);
		System.out.println(concat);
		char[] c2=concat.toCharArray();
		//here first string length should be greater than second string length
		for(int i=0;i<text2.toCharArray().length;i++) {
			for(int j=0;j<text.toCharArray().length;j++) {
				if(cc[i]==ch[j]) {
					System.out.println("The repeated char of the string are :"+ch[j]);
					break;
				}
			}
		}
		
		
		//find the first non-repeating character in a string
		String text3="Hello";
		char[] ca = text3.toCharArray();
		for(char e:ca) {
			if(text3.indexOf(ca.length)==text3.lastIndexOf(ca.length)) {
				System.out.println(e);
				break;
			}
		}
	
		
		//print the vowels of the character
		for(int i=0;i<ca.length;i++) {
			char c1=ca[i];
			if(c1=='a'|| c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				System.out.println("The vowels are : "+c1);
			}
		}
		//count the vowels
		int v=0;
		for(int i=0;i<ca.length;i++) {
			char c1=ca[i];
			if(c1=='a'|| c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				++v;
			}
		}
		System.out.println("The no. of vowels are : "+v);
		
		
		
		//print the digits of the string
		String pin="Chennai600032";
		char[] charArray = pin.toCharArray();
		for(char q:charArray) {
			if(Character.isDigit(q)) {
				System.out.println(q);			
			}
			else if(Character.isLetter(q)) {
				System.out.println("dummy");
				System.out.println(q);	
			}//likewise we can check whether lowercase,uppercase,space
		}
		//count the digits
		int v1=0;
		for(char q:charArray) {
			if(Character.isDigit(q)) {
				++v1;
			}
		}
		System.out.println("The no. of digits are : "+v1);
			
		
		//find the occurance of each character
		String a="Hexaware";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<a.length()-1;i++) {
			if(hm.containsKey(a.charAt(i))) {
				int count=hm.get(a.charAt(i));
				hm.put(a.charAt(i), ++count);
			}else {
				hm.put(a.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
	}
	
}