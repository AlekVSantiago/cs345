/*
 * There is a 100 X 100 Grid that the character must search through in order to find a hidden man or whatever
 *
 * Mr Logic has 16 hours before he has to sleep and reset his energy
 * 	Traveling = 1 hour
 * 	Searching = 2 hours
 *
 *
 *
 * */



public class Main{
	public static void main(String[] args){
		System.out.println("Hello world");
	}
}

public Node buildList(int ROW, int COl){
	Node[][] nodeArr = new Node[ROW][COL];
	Node head = new Node();
	for(int i = 0; i < ROW; i++){
		for(int j = 0; j < COL; j++){
			Node newNode = new Node();
			nodeArr[i][j] = newNode();
			if(i != 0){
				newNode.setUp(nodeArr[i-1][j]);
				nodeArr[i-1][j].setDown(newnode);
						
			}
			if(j != 0){
				newNode.setLeft(nodeArr[i][j-1]);
				nodeArr[i][j-1].setRight(newNode);
			}

		}
	}

}
