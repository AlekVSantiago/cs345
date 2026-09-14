import java.util.Scanner;
import java.io.File;


public class Search{
	public static void main(String[] args)throw FileNotFoundException{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		int currHours = 0;
		boolean rmo;

		List myList = new List();
		

		if(scanner.nextLine().toLowerCase().equals("row")){
			rmo = true;

		}else{
			rmo = false;
		}
		while(scanner.hasNextLine()){
			int x;
			int y;

			String[] stringInputArr = scanner.nextLine().split(" ");
			if(rmo){

				x = Integer.valueOf(stringInputArr[0]);
				y = Integer.valueOf(stringInputArr[1]);
			}else{

				y = Integer.valueOf(stringInputArr[0]);
				x = Integer.valueOf(stringInputArr[1]);
			}



			GridNode RS = myList.getOrSet(x, y);

			GridNode currNode = RS;
			//Perform The Checking
			if(currHours < 13){
				currNode.setNorth(myList.getOrSet(x, y - 1));
				currNode.getNorth().setSouth(currNode);
				currNode = currNode.getNorth();
				currHours += 1;
				currNode.performCheck();
				System.out.println(x + " " +  y + "\n");
				System.out.println(x + y);
				currHours += 2;
				currNode = currNode.getSouth();
				currHours += 1;

			}
			if(currHours < 13){
				currNode.setEast(myList.getOrSet(x + 1, y));
				currNode.getEast().setWest(currNode);
				currNode = currNode.getEast();
				currHours += 1;
				currNode.performCheck();
				System.out.println(x + " " + y + "\n");
				currHours += 2;
				currNode = currNode.getWest();
				currHours += 1;

			}
			if(currHours < 13){
				currNode.setSouth(myList.getOrSet(x, y + 1));
				currNode.getSouth().setNorth(currNode);
				currNode = currNode.getSouth();
				currHours += 1;
				currNode.performCheck();
				System.out.println(x + " " + y + "\n");
				currHours += 2;
				currNode = currNode.getNorth();
				currHours += 1;

			}
			if(currHours < 13){
				currNode.setWest(myList.getOrSet(x - 1, y));
				currNode.getWest().setEast(currNode);
				currNode = currNode.getWest();
				currHours += 1;
				currNode.performCheck();
				System.out.println(x + " " + y + "\n");
				currHours += 2;
				currNode = currNode.getEast();
				currHours += 1;
			}
			if(currHours > 12){
				currHours = 0;
			}



			
		}


	}
}
