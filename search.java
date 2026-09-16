import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class search{
	public static void main(String[] args)throws FileNotFoundException{
		//Initializing File
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);


		int x = 0;
		int y = 0;
		String stringInput = "";

		List myList = new List();

		String stringRmo = scanner.nextLine();
		if(stringRmo.equalsIgnoreCase("row"){
			myList.setRmo(true);
		}
		else if(stringRmo.equalsIgnoreCase("col"){
			myList.setRmo(false);
		}

		while(scanner.hasNextLine()){
			//TODO Create two methods named validTeleport() and validTravel() for a more readable version of this program
			if(!myList.validTeleport()){
				myList.sleep();//TODO Implement method
			}
			stringInput = scanner.nextLine();
			myList.Teleport(stringInput); //TODO Implement method 

		}


	}
}
