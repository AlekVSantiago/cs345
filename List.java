import java.util.HashMap;


public class List{
	//Fields
	private GridNode currGrid;
	private boolean rmo;
	private int MAX_ROW;
	private int incCheck;
	private int incTraval;

	private HashMap<int, GridNode> gridMap;
	private int currHours;
	private int totalHours;


	//Default contructor under the parameters of the regular prompt
	List(){
		this.gridMap = new HashMap<int, GridNode>();
		this.currGrid = null;
		this.incCheck = 2;
		this.incTravel = 1;
		this.currHours = 0;
		this.totalHours = 0;

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


