package dec15;

public class Class1 {
	
	//main method
	public static void main(String[] args) {
		Class1.message("Mom");
		Class1.openApp("Whatsapp");
		//create obj for non static method
		Class1 obj = new Class1();
		obj.dial(1);
		obj.ringtone(2);
	}
	
	//dial a number
	public void dial(int num) {
		int dial=123456789;
		System.out.println(dial);
	}

	//to print message
	public static String message(String whom) {
		String msg="";
		switch(whom) {
		case "Dad" : msg="Message from "+whom;break;
		case "Mom" : msg="Message from "+whom;break;
		case "Brother" : msg="Message from "+whom;break;
		case "Sister" : msg="Message from "+whom;break;
		}
		System.out.println(msg);
		return msg;
	}
	
	//ringtone
	public void ringtone(int network) {
		if(network==1) {
			System.out.println("ringtone1");
		}if(network==2) {
			System.out.println("ringtone 2");
		}
	}
	
	//openApplicatio
	public static String openApp(String name) {
		String app ="";
		switch(name) {
		case "Whatsapp" : app="Open "+name;break;
		case "Gallery" : app="Open "+name;break;
		case "Youtube" : app="Open "+name;break;
		}
		System.out.println(app);
		return app;
		
	}
}

