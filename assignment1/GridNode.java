


public class Gridnode(){
	//Coordinate Fields
	int x;
	int y;
	//Boolean for checking
	private boolean checked;
	//Pointer Fields
	private GridNode north;
	private GridNode south;
	private GridNode east;
	private GridNode west;

	GridNode(int x, int y){
		this.x = x;
		this.y = y;
		this.checked = false;
		this.north = null;
		this.south = null;
		this.east = null;
		this.west = null;
	}
	public void setNorth(GridNode north){
		this.north = north;
	}
	public void setSouth(GridNode south){
		this.south = south;
	}
	public void setEast(GridNode east){
		this.east = east;
	}
	public void setWest(GridNode west){
		this.west = west;
	}
	public boolean isChecked(){
		return this.checked;
	}
	public boolean performCheck(){
		this.checked = true;
	}
	public GridNode getNorth(){
		return this.north;
	}
	public GridNode getSouth(){
		return this.south;
	}
	public GridNode getEast(){
		return this.east;
	}
	public GridNode getWest(){
		return this.west;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	
	public boolean isEquals(GridNode compareNode){
		if((this.x == compareNode.x) && (this.y == compareNode.y)){
			return true;
		}else{
			return false;
		}
	}
	
}

