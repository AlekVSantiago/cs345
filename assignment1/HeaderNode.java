

public class HeaderNode{
	int value;
	private HeaderNode nextHead;
	private GridNode firstGrid;

	HeaderNode(int value){
		this.value = value;
		this.nextHead = null;
		this.firstGrid = null;
	}
	public int getValue(){
		return this.value;
	}
	public HeaderNode getNextHead(){
		return this.nextHead;
	}
	public GridNode getFirstGrid(){
		return this.firstGrid;
	}
	public void setValue(int value){
		this.value = value;
	}
	public void setNextHead(HeaderNode nextHead){
		this.nextHead = nextHead;
	}
	public void setFirstGrid(GridNode firstGrid){
		this.firstGrid = firstGrid;
	}
}
