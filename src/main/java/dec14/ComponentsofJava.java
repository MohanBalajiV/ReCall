package dec14;

public class ComponentsofJava {
	
		
	//dial 123
	public void dial(int dial) {
		dial=123;
		System.out.println(dial);
		}
	
	//to return message
	public String message() {
		String msg = "Message received";
		return msg;
		}
		
	//to set ringtone
	public static void ringtone(int network) {
		if(network==1) {
			System.out.println("ringtone 1");
		}if(network==2) {
			System.out.println("ringtone 2");
		}
	}

	//select app
	public static String selectApp(String name) {
		String app="";
		switch(name){
		case "whatsapp" : app ="Open Whatsapp";break;
		case "Gallery" : app= "Open Gallery";break;
		case "Youtube" : app= "Open Youtube";break;
		}
		System.out.println(app);
		return app;
		
		
	}
	
	public static void main(String[] args) {
		ComponentsofJava get = new ComponentsofJava();
		get.dial(0);
		get.message();
		get.ringtone(2);
		get.selectApp("Youtube");
		
	}
}
