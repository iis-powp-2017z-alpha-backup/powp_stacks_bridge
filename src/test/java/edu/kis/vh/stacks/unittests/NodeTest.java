package edu.kis.vh.stacks.unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.implementations.Node;

public class NodeTest {

	Node node;

	@Before
	public void setUp() throws Exception {
		node = new Node(5);
	}

	@Test
	public void getValueShouldBeFive() {
		assertEquals(5, node.getValue());
	}
}
