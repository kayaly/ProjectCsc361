
import csc361.State;
import java.io.IOException;

// KING SAUD UNIVERSITY
// CCIS
// CSC 361

// NAME: abduallh soud alkathiry
// ID: 435100003


public class Agent {

	public static void main(String[] args) throws IOException {

       
		int n_args = args.length;
		if (n_args!=4) {
			System.out.println("ERROR: ILLEGAL NUMBER OF ARGUMENTS.");
			System.out.println("Number of arguments must be 4");
			return;
		}
		String mapFile = args[0];
		String commandsFile = args[1];
		String finalMapFile = args[2];
		String logFile = args[3];
		
		     State S1 = new State();
        String name = "/Users/Abosaoud/NetBeansProjects/CSC361/simple.map.txt";
        S1.State(name);
 
        S1.display();
        S1.doCommandAndLog();
		

		
	}

	
}

