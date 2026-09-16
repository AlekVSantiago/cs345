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
			if(!myList.validTeleport(myList.getOrCreate())){
				myList.sleep();
			}
			stringInput = scanner.nextLine();
			myList.Teleport(List.stringtoNode(stringInput));
			if(myList.validTravel(myList.getNodeNorth())){
				myList.travelNorth();
				myList.performCheck(); //TODO Refactor this to work without the parameter because I did not have a currNode thing as a field in the list model before
				myList.travelSouth();
			}
			if(myList.validTravel(myList.getNodeEast()){
				myList.travelEast();
				myList.performCheck();
				myList.travelWest();
			}
			if(myList.validTravel(myList.getNodeSouth){
				myList.travelSouth();
				myList.performCheck();
				myList.travelNorth();
				
			}
			if(myList.validTravel(myList.getNodeWest()){
				myList.travelWest();
				myList.performCheck();
				myList.travelEast();
			}
			

		}
		myList.toString()


	}
}
