package roughuse;

import java.util.Arrays;

public class FIS {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//print first word of the string
		String text="Welcome to chennai";
		String[] a=text.split(" ");
		System.out.println(a[0]);
		
		//print each word the string
		for(String each:a) {
		System.out.println(each);
		
		}
		
		//count vowels in the string
		String text2="GreeksForGeeks";
		int vowels=0;
		char[] ch=text2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(c == 'a' || c=='e'|| c=='i'|| c=='o'|| c=='u' ) {
				vowels++;
			}
		}
		System.out.println("Totol no of vowels are :  "+vowels);
		
		
		//print the vowels of the string 
		String text4="GreeksForGeeks12345";
		int vowels1=0;
		char[] ch1=text4.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			char c1=ch1[i];
			if(isVowel(c1)) {
				System.out.println(c1);
			}
			//print integer in the string
			else if(Character.isDigit(c1)){
				System.out.println(c1);

			}
		}
	
		
		String text3="Hexaware";
		int val=0;
		char[] ch2=text3.toCharArray();
		for(int i=0;i<ch2.length;i++) {
			for(int j=0;j<ch2.length;j++) {
				if(ch2[i]==ch2[j]){
					++val;
					System.out.println("The character "+ch2[j]+" occured : "+val);
					break;
				}else {
					System.out.println("The character "+ch2[j]+" occured : "+val);
				}
			}
		}
	}
	
	
	public static boolean isVowel(char cha) {
		if(cha == 'a' || cha=='e'|| cha=='i'|| cha=='o'|| cha=='u') {
		return true;
	}else {
		return false;
	}
	}

	
//	int z[]={7,8,1,2,2,3,6,4,5,6,7};
////	Arrays.sort(z);
//	System.out.println(z.toString());
//	
//	
//	for(int i=1;i<z.length;i++) {
//		for(int j=i+i;j<z.length;j++) {
//			
//			if(z[i]==z[j]) {
//				System.out.println(z[j]);
//			}
//		}
		
}		
		
