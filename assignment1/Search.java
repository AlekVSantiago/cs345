import java.util.Scanner;
import java.io.File;


public class Search{
	public static void main(String[] args){
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		boolean rmo;

		MasterNode master = new MasterNode();

		if(scanner.nextLine().equals("ROW")){
			rmo = true;

		}else{
			rmo = false;
		}

		

		while(scanner.hasNextLine()){
		}


	}
}
