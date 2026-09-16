import java.util.HashMap;


public class List{
	//Fields
	private GridNode currGrid;
	private boolean rmo;
	private int MAX_ROWCOL;
	private int incCheck;
	private int incTraval;

	private HashMap<int, GridNode> gridMap;
	private int currHours;
	private int totalHours;


	//Default contructor under the parameters of the regular prompt
	List(){
		this.gridMap = new HashMap<int, GridNode>();
		this.currGrid = this.getOrCreate(50, 50);
		this.currGrid.setCheck(true);
		this.incCheck = 2;
		this.incTravel = 1;
		this.currHours = 0;
		this.totalHours = 0;
		this.MAX_ROWCOL = 100;

	}
	public boolean validTravel(GridNode node){
		return ((currHours < 16 - (this.incCheck + this.incTravel))) && (!this.exist(node) || !node.isChecked());

	}
	public boolean validTeleport(GridNode node){

		if(currHours < 16 - this.incCheck()){
			return false;
		}
		if(!this.exist(node){
			return true;
		}

		GridNode iNode = this.getOrCreate(node.getX(), node.getY());
		if(iNode.getNorth() == null || !iNode.getNorth().isChecked(){
				
			return true;
		}
				
		if(iNode.getEast() == null || !iNode.getEast().isChecked()){
			return true;
		}
		if(iNode.getSouth() == null || !iNode.getSouth().isChecked(){
			return true;
		}
		if(iNode.getWest() == null || !iNode.getWest().isChecked(){
				
			return true;
			
		}
	
		return false;
	}
	public GridNode getCurrGrid(){
		return this.currGrid();
	}
	public int getIncCheck(){
		return this.incCheck;
	}
	public int getincTravel(){
		return this.incTravel;
	}
	public boolean getRmo(){
		return this,rmo;
	}
	public HashMap<int, GridNode> getGridMap(){
		return this.gridMap;
	}
	public int getCurrHours(){
		return this.currHours;
	}
	public int getTotalHours(){
		return this.totalHours;
	}
	public void setRmo(boolean inResult){
		this,rmo = inResult;
	}
	public void setGridMap(HashMap<int, GridNode> grid) {
		this,gridMap = grid;

	}
	public void setcurrHours(int curr){
		this.currHours = curr;
	}
	public void setTotalHours(int total){
		this.totalHours = total;
	}

	public void performCheck(GridNode node){
		node.setCheck(true);
		this.currHours += this.incCheck;
	}
	public void travelNorth(){
		this.currGrid = currGrid.getNorth();
		this.currHours += this.incTravel;
	}
	public void travelEast(){
		this.currGrid = currGrid.getEast();
		this.currHours += this.incTravel;
	}
	public void travelSouth(){
		this.currGrid = currGrid.getSouth{};
		this.currHours += this.incTravel;
	}
	public void travelWest(){
		this.currGrid = currGrid.getWest();
		this.currHours += this.incTravel;
	}
	public void sleep(){
		this.totalHours += this.currHours;
		this.currHours = 0;
	}
	public static GridNode stringToNode(string input){
		inputArr = input.split(" ");
		int x = Integer.parseInt(inputArr[0]);
		int y = Integer.parseInt(inputArr[1]);

		return new GridNode(x, y);

	}

	public GridNode getOrCreate(int x, int y){
		

	}
	


	public GridNode getOrSet(int x, int y){
		//Initializing all of the tools of iteration
		GridNode newNode = new GridNode(x, y);
		HeaderNode currHead = this.head;
		GridNode currGrid;

		while(currHead.getNextHead() != null){
			if((currHead.getValue() == x) && (currHead.getFirstGrid() != null)) {
                currGrid = currHead.getFirstGrid();
                if(currGrid.getY() > y) {
                    newNode.setSouth(currGrid);
                    currHead.setFirstGrid(newNode);
                    return newNode;
                }else if(currGrid.getY() == y) {
                    return currGrid;
                }
                while (currGrid.getSouth() != null) {
                    if (currGrid.getY() == y) {
                        return currGrid;
                    } else if (currGrid.getY() > y) {
                        newNode.setSouth(currGrid);
                        if (currGrid.getNorth() == null) {
                            currHead.setFirstGrid(newNode);
                        } else {
                            currGrid.getNorth().setSouth(newNode);
                        }
                        currGrid.setNorth(newNode);
                    } else if (currGrid.getY() < y) {
                        currGrid = currGrid.getSouth();
                    } else {
                        System.out.println("Something is up with the logic... Please check in the List.java");
                    }

                }
                if(currGrid.getY() == y) {
                    return currGrid;
                }else {
                    currGrid.setSouth(newNode);
                    newNode.setNorth(currGrid);
                    return newNode;
                }
            }else if ((currHead.getValue() == x) && (currHead.getFirstGrid() == null)) {
                currHead.setFirstGrid(newNode);
                return newNode;

            }else {
                currHead = currHead.getNextHead();

            }
            }
        return newNode;
    }




// Prints the checked 
    public void output(){
	    HeaderNode currHead = this.head;
        GridNode currGrid;
	   while(currHead.getNextHead() != null){
		   if(currHead.getFirstGrid() != null){
			   currGrid = currHead.getFirstGrid();
			   while(currGrid.getSouth() != null){
				   if(currGrid.isChecked()){
					   System.out.println(currGrid.toString());
				   }
				   currGrid = currGrid.getSouth();

			   }
               if(currGrid.isChecked()) {
                   System.out.println(currGrid.toString());
               }
		   }
		   currHead = currHead.getNextHead();
	   }
	   System.out.println(this.getTotalHours());
    }
}


