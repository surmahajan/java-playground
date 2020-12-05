package exercise3;

import java.util.List;
import java.util.ArrayList;

public class DFSExample {
	public static void main(String str[]) {
		Node n1 = new Node("A");
		Node n2 = new Node("B");
		Node n3 = new Node("C");
		Node n4 = new Node("D");
		Node n5 = new Node("E");
		Node n6 = new Node("F");

		n1.addNeighbors(n2); // A -->B
		n1.addNeighbors(n3); // A -->C
		n2.addNeighbors(n4); // B -->D
		n3.addNeighbors(n5); // C -->E
		n3.addNeighbors(n6); // C -->F

		DFSExample obj = new DFSExample();
		obj.dfs(n3);
	}

	public void dfs(Node n) {
		System.out.println(n.getNodeValue());
		List<Node> neighbors = n.getNeighbors();
		n.isVisited = true;

		for (int i = 0; i < neighbors.size(); i++) {
			Node node = neighbors.get(i);
			if (node != null && !node.isVisited) {
				dfs(node);
			}
		}
	}
}

class Node {
	private List<Node> neighbors;
	private String nodeValue;
	boolean isVisited;

	Node(String nodeValue) {
		this.setNodeValue(nodeValue);
		neighbors = new ArrayList<Node>();
	}

	public void addNeighbors(Node neighborNode) {
		this.neighbors.add(neighborNode);
	}

	public List<Node> getNeighbors() {
		return neighbors;
	}

	public String getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(String nodeValue) {
		this.nodeValue = nodeValue;
	}

}
