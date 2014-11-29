package test;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.*;
import java.util.*;

public class Tester {
	String userNameTemp;
	String passwordTemp;
    BufferedWriter writer;
    File f = new File(userNameTemp.txt);
    this.writer = new BufferedWriter(new FileWriter(f));
	BufferedReader br = new BufferedReader(new FileReader(f));
    
	/**PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
	writer.println(passwordTemp);
	writer.println(userNameTemp);
	writer.close();
	**/

	
    Scanner scanner = new Scanner(System.in);

 
        
      System.out.println("Please enter user ");
      userNameTemp = scanner.nextLine();
        
        
        

    }



if(f.exists() && !f.isDirectory()) { /* do something */ 


		String line;
		while ((line = br.readLine()) != null) {
		   // process the line.
	    	System.out.println("Please enter password.");
	        String passwordTemp = scanner.nextLine();
			if (line == passwordTemp){
				/*DO SOMETHING*/
			}
			else {
				System.out.println("Password wrong.");
		    	System.out.println("Please enter password.");
			}
		}
		br.close();
	}		
else {
	boolean dirCreated = f.mkdirs();
	System.out.println("Please enter password.");
    String passwordTemp = scanner.nextLine();
    //writer.println(passwordTemp);
	//writer.println("The second line");
}

}
