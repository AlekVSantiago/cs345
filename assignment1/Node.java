


public class Node{
	private Boolean checked;
	private Node up;
	private Node down;
	private Node left;
	private Node right;
	Node(){
		this.up = null;
		this.down = null;
		this.left = null;
		this.right = null;
		this.checked = false;
	}
	//Up Getter Setter
	public Node nextUp(){
		return this.up;
	}
	public void setUp(Node up){
		this.up = up;
	}
	//Down Getter Setter
	public Node nextDown(){
		return this.down;
	}
	public void setDown(Node down){
		this.down = down;
	}
	//Left Getter Setter
	public Node nextLeft(){
		return this.left;
	}
	public void setLeft(Node left){
		this.left = left;
	}
	//Right Getter Setter
	public Node nextRight(){
		return this.right;
	}
	public void setRight(Node right){
		this.right = right;
	}
}
