package roughuse;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.util.TempFile;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Use2 {

	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/main");   
//		driver.manage().window().maximize();
//		driver.findElementById("username").sendKeys("Demosalesmanager");
//		driver.findElementById("password").sendKeys("crmsfa");
//		driver.findElementByClassName("decorativeSubmit").click();
//		driver.findElementByLinkText("CRM/SFA").click();
//		driver.findElementByLinkText("Create Lead").click();
//		driver.findElementById("createLeadForm_companyName").sendKeys("test");
//		driver.findElementById("createLeadForm_firstName").sendKeys("user");
//		driver.findElementById("createLeadForm_lastName").sendKeys("one");
//		WebElement dp = driver.findElementById("createLeadForm_dataSourceId");
//		Select sel = new Select(dp);
//		List <WebElement> text= sel.getOptions();
//		int count = text.size();
//		sel.size();
//		sel.selectByIndex(count-2);
		
//		XSSFWorkbook wbook = new XSSFWorkbook("E:\\Excel for selenium\\Book2.xlsx");
//		XSSFSheet sheet = wbook.getSheetAt(0);
//		int rowcount = sheet.getLastRowNum();
//		System.out.println(rowcount);
//		int cellcount = sheet.getRow(0).getLastCellNum();
//		System.out.println(cellcount);
//		XSSFRow row = sheet.getRow(1);
//		XSSFCell cell = row.getCell(2);
//		String data = cell.getStringCellValue();
//		System.out.println(data);

//		Dimension size = dp.getSize();
		
		//to get count
		String a1="Today is Friday";
		String a2="Weekend";
		int num=a1.length();
		System.out.println(num);
		
		
		//to get no of lettes
		char[] ch =a1.toCharArray();
		System.out.println(ch);
		for(char c :ch) {
			System.out.println(c);
			}
		
		//to get value of index
		char at = a1.charAt(3);
		System.out.println(at);
		
		//to get index of char
		int num1 = a1.indexOf("d");
		System.out.println(num1);
		
		//to search from right to left
		int num2 = a1.lastIndexOf("d");
		System.out.println(num2);

		//to connect two string
		String text = a1.concat(a2);
		System.out.println(text);
		
		//to get partial letters
		String substring = a1.substring(2,8);
		System.out.println(substring);
		
		
		//to remove whitespaces in beginning and end
		String trim = a1.trim();
		System.out.println(trim);
		
		//to replace
		String replace = a1.replace("F", "a");
		System.out.println(replace);
		
		
		//to split
		String[] split = a1.split(" ");
		int length = split.length;
		for(String each: split)
		System.out.println(each);
		
		List<String> all =new ArrayList<String>();
		for(int i=0; i<all.size();i++) {
			
		}
		
		
		//reverse a string
		StringBuilder input=  new StringBuilder();
		input.append(a1);
		StringBuilder reverse = input.reverse();
		System.out.println(reverse);
		
		
		//replace particular char in a string
		StringBuilder input1=  new StringBuilder();
		input1.append(a1);
		StringBuilder rep = input1.replace(2,5,"a");
		System.out.println(rep);
		
		
		
		
	}
	public static void main(String[] args) throws IOException{
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		
//		driver.findElement(By.id(""));
//		driver.findElement(By.className(""));
//		driver.findElement(By.tagName(""));
//		driver.findElement(By.partialLinkText(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
		
		
		// TODO Auto-generated method stub
		String [][] data = null;
		
		
		FileInputStream fis= new FileInputStream("./data/book1.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=wbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int cellcount= sheet.getRow(0).getLastCellNum();
		 data = new String [rowcount][cellcount];
		for(int i=1;i<rowcount;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell= row.getCell(j);
//				data=cell.getStringCellValue();
				data[i-1][j]=cell.getStringCellValue();
				System.out.println(Arrays.toString(data));
			}}   

		String text1 ="I Love India";
		String text2 ="More";
		
		//String to Char array
		char[] ch = text1.toCharArray();
		System.out.println(text1);
		
		//length of String
		int length = ch.length;
		System.out.println(length);
				
		//print single character
		for(char all:ch) {
			System.out.println(all);
		}
				
		//char to string
		char ch1 = 'I';
		String string = Character.toString(ch1);
		System.out.println(string);
		
		//to find the index of a character
		int num=text1.indexOf("e");
		System.out.println(num);
		
		//to find character of the index
		char a=text1.charAt(4);
		System.out.println(a);

		//to find the index of character from end
		int num1=text1.lastIndexOf("n");
		System.out.println(num1);
		
		//to concat to text
		String value=text1.concat(" "+text2);
		System.out.println(value);
		
		//to convert integer to string
		int digit=10;
		System.out.println("The value is "+digit);
		
		//to remove whitespaces in front and last of a string
		String asdf= " mohan  ";
		String b=asdf.trim();
		System.out.println(b);
				
		//to print selected text
		String c=text1.substring(3);
		System.out.println(c);
		
		//to print selected text
		String d=text1.substring(3, 9);
		System.out.println(d);
		
		//to split the character with spaces
		String[] q=text1.split(" ");
		int len = q.length;
		System.out.println(len);
		for(String each:q) {
			System.out.println(each);
		}
		
		
		//to split the character with commas
		String test="Mohan,Balaji,Chennai";
		String[] s=test.split(",");
		int len1 = q.length;
		System.out.println(len1);
		for(String each:s) {
			System.out.println(each);
		}
		
		//to reverse a string
		StringBuilder z= new StringBuilder();
		StringBuilder append = z.append(text1);
		StringBuilder reverse = append.reverse();
		System.out.println(reverse);
		
		
		//to replace a character in a string
		String replace = text1.replace("e", "p");
		System.out.println(replace);
		
		//to change all characters to lowercase
		String low=text1.toLowerCase();
		System.out.println(low);
		
		//to change all characters to uppercase
		String up=text1.toUpperCase();
		System.out.println(up);
		
		//to swap first and last letter in a string
		//convert string to charArray
		//char[] ch = text1.toCharArray();
		char temp = ch[0];		
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		
		System.out.println(ch);
		
		//swap using stringbuilder
		String test1="Mohan Balaji";
		char[] cc= test1.toCharArray();
		StringBuilder x= new StringBuilder();
		StringBuilder append2 = x.append(test1);
		char first = x.charAt(0);
		x.setCharAt(0, cc[cc.length-1]);
		x.setCharAt(cc.length-1, first);
		String string2 = x.toString();
		System.out.println(string2);
		
		
		//to find duplicate char
//		for(int i=0;i<cc.length;i++) {
//			for(int j=i+1;j<cc.length;j++) {
//				if(cc[i]==cc[j]) {
//					System.out.println(cc[j]);
//				break;
//				}
//			}
		}
		
		
		
	}


