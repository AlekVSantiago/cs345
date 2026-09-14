


public class List{
	private HeaderNode head;

	List(){
		this.head = null;
		for(int i = 0; i < 10; i++){
			this.insert(i + 1);
		}
	}
	public void insert(int x){
		HeaderNode newNode = new HeaderNode(x);
		if(this.head == null){
			this.head = newNode;
		}else{
			HeaderNode lastNode = this.head;
			while(lastNode.getNextHead() != null){
				lastNode = lastNode.getNextHead();
			}
			lastNode.setNextHead(newNode);
		}
	}
	public GridNode getOrSet(int x, int y){
		if( x < 1 || x > 10){
			System.out.println("Cannot set That");
			return null;
		}else{
			HeaderNode currHead = this.head;

			while(currHead.getNextHead() != null){
				if(currHead.getValue() == x){
					GridNode currGrid = currHead.getFirstGrid();
					while(currGrid.getSouth() != null){
						if(currGrid.getSouth().getY() == y){
							return currGrid;
						}else if(currGrid.getSouth().getY() > y){
							GridNode newNode = new GridNode(x, y);
							newNode.setSouth(currGrid.getSouth());
							currGrid.setSouth(newNode);
							return newNode;
						}else{
							currGrid = currGrid.getSouth();
						}
					}

				GridNode newNode = new GridNode(x, y);
				currGrid.setSouth(newNode);
				return newNode;
				}else{
					return null;
				}
			}
		}
		return null;
	}
}

