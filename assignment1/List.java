


public class List{
	private HeaderNode masterHead;

	List(){
		this.masterHead = null;
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
			while(lastNode.getNextHead != null){
				lastNode = lastNode.getNextHead();
			}
			lastNode.setNextHead(newNode);
		}
	}

}
