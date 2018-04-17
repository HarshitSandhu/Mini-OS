import java.util.Scanner;
 
/**
 *
 */
public class Working {
 
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User[] users = new User[] {new User("user","user"),new Admin("admin","admin")};
 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username = in.nextLine();
		System.out.println("Enter Password:");
		String password = in.nextLine();
 
		for(User user:users) {
			if(user.authenticate(username, password)) {
				System.out.println("Privilege #1: "+user.hasPermission1());
				System.out.println("Privilege #2: "+user.hasPermission2());
				System.out.println("Privilege #3: "+user.hasPermission3());
				break;
			}
		}
		in.close();
	}
}
