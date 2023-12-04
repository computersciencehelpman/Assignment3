import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Assignment3 {

	public static void main(String[] args) {
		
		BufferedReader fileReader = null;
		UserPOJO user = new UserPOJO();
		UserPOJO[] users = new UserPOJO[4];
			
		try {
			fileReader = new BufferedReader(new FileReader("src/data.txt"));
			String line = "";
			
		
			
			int i =0;
			while((line = fileReader.readLine()) != null) { //1. Read Data from a file “data.txt” 
				String [] stringArray = line.split(","); // line by line and split each line into different pieces.
				

				
				String userNames = stringArray[0]; //Assign each item in the array into variables 
				String password = stringArray[1];  //like username, password, name
				String names = stringArray[2];
				
				
				
				user.setUsername(userNames);
				user.setPassword(password);
				user.setName(names);
				
				users[i]= user;
				i++;

				
			//	System.out.println(names);
			//	String data = myReader.nextLine();
			//	System.out.println(data);
			} // System.out.println(Arrays.toString(users));
		} catch (IOException e) {
			
			e.printStackTrace();
		}//myReader.close();
		
		
		String inputUserName;
		String inputPassword;
		String inputName;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		inputUserName = scan.next();
		
		 System.out.println("Enter password: ");
		 inputPassword = scan.next();
		
		int chances = 4; //Java is 0 base indexed
		 
		
			for(int i = 0; i < users.length; i++) {
			
			if(user.getUsername().contentEquals(inputUserName)) {
				System.out.println("Welcome " + user.getName());
				break;
				
			}
			else if (user.getPassword().contentEquals(inputPassword)) {
				System.out.println("Welcome " + user.getName());
				break;
			}
			else {
				System.out.println("Invalid login, please try again.");
				chances--;
			}
			
			if(chances >= 0) {
				System.out.println("Enter username: ");
				inputUserName = scan.next();
				
				 System.out.println("Enter password: ");
				 inputPassword = scan.next();
				
			}
			
			
			if (chances <= 0) {
				System.out.println("Too many failed login attempts, you are now locked out.");
				break;
			}
			
		
			
		}
		 
			
		
		
	
	}
	
	

}

	


