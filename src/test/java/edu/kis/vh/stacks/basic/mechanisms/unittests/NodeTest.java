package edu.kis.vh.stacks.basic.mechanisms.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.basic.mechanisms.Node;

public class NodeTest {

	final int TEST_VALUE = 4;
	int result = 0;

	@Test
	public void testNode() {
		Node nodeObj = new Node(TEST_VALUE);
		Assert.assertNotNull(nodeObj);
	}

	@Test
	public void testGetValue() {
		Node nodeObj = new Node(TEST_VALUE);
		result = nodeObj.getValue();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testSetValue() {
		Node nodeObj = new Node();
		nodeObj.setValue(TEST_VALUE);
		result = nodeObj.getValue();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testGetPrev() {
		Node nodeObj = new Node(TEST_VALUE);
		nodeObj.setPrev(new Node());
		Assert.assertNotNull(nodeObj.getPrev());
	}

	@Test
	public void testSetPrev() {
		Node nodeObj = new Node(TEST_VALUE);
		nodeObj.setPrev(new Node());
		Assert.assertNotNull(nodeObj.getPrev());
	}

	@Test
	public void testGetNext() {
		Node nodeObj = new Node(TEST_VALUE);
		nodeObj.setNext(new Node());
		Assert.assertNotNull(nodeObj.getNext());
	}

	@Test
	public void testSetNext() {
		Node nodeObj = new Node(TEST_VALUE);
		nodeObj.setNext(new Node());
		Assert.assertNotNull(nodeObj.getNext());
	}

}
