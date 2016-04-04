//Importing what i need

package assets;
import java.util.Scanner;
//My Login class displays the welcome message
public class Login {
	//The coinstructor
	Login(){



	}
	//It displays the form of the login screen
	public static String getName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("*************************************************\n"
				+ "Hello guest, it will maze your head...");
		System.out.print("Enter your name: ");
		String name = scan.next();
		System.out.println("Welcome " + name);
		System.out.print("Do you wanna start? (y/n): ");
		Character cont =new Character(scan.next().charAt(0));
		//If the user types y it keeps going, it ends if something else.
		if(cont.equals(new Character('y'))){
			GenLevel.mainChar.setName(name);
			return name;
		}else{
			return null;
		}
	}
}
