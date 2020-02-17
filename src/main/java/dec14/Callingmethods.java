package dec14;

public class Callingmethods {

	static ComponentsofJava call1 = new ComponentsofJava();
	
	public  static String openPhotos() {
		String name="one";
		for(int openPhotos=1;openPhotos<=10;openPhotos++) {
			System.out.println("photos"+openPhotos);
		}
	return name;
	}
	
	public void openFolder(int num) {
		int number=5;
		for(int i=0;i<10;i++) {
			if(i<=6) {
				System.out.println("num"+i);
			}else {
				System.out.println("num8");
			}
		}
		
	}
	
	public static void main(String[] args) {
		openPhotos();
		Callingmethods call= new Callingmethods();
		call.openFolder(4);
		call1.ringtone(1);
		call1.selectApp("Gallery");
	
	}
	
}
