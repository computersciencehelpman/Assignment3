import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Assignment3 {

	@SuppressWarnings("unlikely-arg-type")
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
				
				user = new UserPOJO();
				
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
	
		int chances = 5; //Java is 0 base indexed
		 
		while(chances > 0) {
			
			System.out.println("Enter username: ");
			inputUserName = scan.next();
			
			 System.out.println("Enter password: ");
			 inputPassword = scan.next();
			
			for(UserPOJO userData : users) {
				
				
				if (inputUserName.equalsIgnoreCase(userData.getUsername()) && inputPassword.equals(userData.getPassword())) {
					System.out.println("Welcome " + userData.getName());
					System.exit(0);
					
				}
				
			
		}
			chances--;
			if(chances != 0) {
					
					System.out.println("Invalid login, please try again.");
					
					
					
				}
			
			
		
			
		}
		 
			System.out.println("Too many failed login attempts, you are now locked out.");
					
		
	
	}
	
	

}

	


