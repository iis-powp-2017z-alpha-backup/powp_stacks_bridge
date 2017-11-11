package edu.kis.vh.stacks.list;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

	@Test
	public void testNode() {
		int testValue12 = 12;
		Node nodeObj = new Node(testValue12);
		Assert.assertEquals(testValue12, nodeObj.value);
	}

}
