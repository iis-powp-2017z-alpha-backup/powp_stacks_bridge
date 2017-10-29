package edu.kis.vh.stacks.unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.StackHanoi;

public class StackHanoiTest {
	StackHanoi stackHanoi;

	@Before
	public void setUp() throws Exception {
		stackHanoi = new StackHanoi();
	}
	
	@Test
	public void reportRejectedShouldReturnZero() {
		stackHanoi.push(1);
		assertEquals(0, stackHanoi.reportRejected());
	}

	@Test
	public void reportRejectedShouldReturnOne() {
		stackHanoi.push(1);
		stackHanoi.push(2);
		assertEquals(1, stackHanoi.reportRejected());
	}
	

}
