package assets;
import java.util.Scanner;
public class Login {
	
	Login(){
		
	}
	
	public static String getName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello guest, it will maze your head...");
		System.out.print("Enter your name: ");
		String name = scan.next();
		System.out.println("Welcome " + name + "\n");
		System.out.print("Do you wanna start? y/n");
		Character cont =new Character(scan.next().charAt(0));
		if(cont.equals(new Character('y'))){
			GenLevel.mainChar.setName(name);
			return name;
		}else{
			return null;
		}
	}
}
