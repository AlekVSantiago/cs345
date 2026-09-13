public class Iterator {
	private Node link;

	Iterator(Node node){
		this.link = node;
	}

public Node next(){
	return this.link;
	}
}
