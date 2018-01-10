package edu.kis.vh.stacks.list;

/**
 * @author Aliaksei
 *
 */
public class Node {

	private static int value;
	public Node prev, next;

	public Node(int i) {
		setValue(i);
	}

	public static int getValue() {
		return value;
	}

	public static void setValue(int value) {
		Node.value = value;
	}

}
