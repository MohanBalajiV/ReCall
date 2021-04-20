package april4;

public class Test1 {
	
	
	public static int numb=3;
	public static void main(String[] args) {
		
		String text="I Love India";
		String text1="I Love Chennai";
		
		
		
		char[] ch=text.toCharArray();
		System.out.println(ch);
		
		for(char each:ch) {
			System.out.println(each);
		}
		
		char CharAt=text.charAt(3);
		System.out.println(CharAt);
		
		int num=text.indexOf("v");
		System.out.println(num);
		
		int num1=text.lastIndexOf("n");
		System.out.println(num1);
		
		String value=text.substring(5);
		System.out.println(value);
		
		String value1=text.substring(3,8);
		System.out.println(value1);
		
		String replace=text.replaceAll("o","m");
		System.out.println(replace);
		
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		System.out.println(ch);
//		
//		StringBuilder a= new StringBuilder();
//		StringBuilder b=a.append(text);
//		StringBuilder reverse=b.reverse();
//		System.out.println(reverse);
//		
//		char first=text.charAt(0);
//		b.setCharAt(0, ch[ch.length-1]);
//		b.setCharAt(ch.length-1,first);
//		String change=b.toString();
//		System.out.println(change);
//		
		int prev=0;
		int next=1;
		int max=10;
		for(int i=0;i<max;i++) {
			System.out.println(prev+"");
			int sum=prev+next;
			prev=next;
			next=sum;
		
		}
		
		
		char[] all=text1.toCharArray();
		for(int i=0;i<all.length;i++) {
			for(int j=i+1;j<all.length;j++) {
				if(all[i]==all[j]) {
					System.out.println(all[j]);
				}
			}
		}
		
		
		
		
				
		
		
		
		
	}
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//string to char
//		char[] ch=text.toCharArray();
//		int num=ch.length;
//		System.out.println(num);
//		
//		//syso each char
//		for(char each:ch) {
//			System.out.println(each);
//		}
//		
//		//char to string
//		char ch1='a';
//		String string = Character.toString(ch1);
//		System.out.println(string);
//		
//		//find index of char
//		int num1=text.indexOf("o");
//		System.out.println(num1);
//		
//		//find char of index
//		char charAt = text.charAt(7);
//		System.out.println(charAt);
//	
//		//replace two char in a string
//		String replaceAll = text.replaceAll("i", "e");
//		System.out.println(replaceAll);
//		
//		//reverse a string
//		StringBuilder build= new StringBuilder();
//		StringBuilder append = build.append(text);
//		StringBuilder reverse = append.reverse();
//		System.out.println(reverse);
//		
//		
//		//swap two char in a string
//		char temp=ch[0];
//		ch[0]=ch[ch.length-1];
//		ch[ch.length-1]=temp;
//		System.out.println(ch);
//		
//		//swap using setchar
//		char[] charArray = text1.toCharArray();
//		StringBuilder b= new StringBuilder();
//		StringBuilder x= b.append(text1);
//		char first = x.charAt(0);
//		x.setCharAt(0, charArray[charArray.length-1]);
//		x.setCharAt(charArray.length-1,first);
//		String string2 = x.toString();
//		System.out.println(string2);
//		
//		//print from particular index
//		String substring = text1.substring(4);
//		System.out.println(substring);
//		
//		//print particular index chars alone
//		String substring2 = text1.substring(3, 8);
//		System.out.println(substring2);
//		
//		//split by spaces
//		String[] s=text1.split(" ");
//		for(String each1:s) {
//			System.out.println(each1);
//		}
//		
//		
//		//fibonancci series
//		int prev=0;
//		int max=10;
//		int next=1;
//		for(int i=0;i<max;i++) {
//			System.out.println(prev+"");
//			int sum=prev+next;
//			prev=next;
//			next=sum;
//		}
//		
//		//to find duplicates
//		String text3="Fresh Fish";
//		char[] charArray2 = text3.toCharArray();
//		
//		for(int i=0;i<charArray2.length;i++) {
//		for(int j=i+1;j<charArray2.length;j++) {
//				if(charArray2[i]==charArray2[j]) {
//					System.out.println(charArray2[j]);
//				}
//			}
//		}
//		
//	Test1.a();
//		
//	}
//	
//	public static void a() {
//		Test1 a= new Test1();
//		int num22 = a.num2;
//		System.out.println(num22);
//		
//	}
//	
//	public int num2=3;
	

