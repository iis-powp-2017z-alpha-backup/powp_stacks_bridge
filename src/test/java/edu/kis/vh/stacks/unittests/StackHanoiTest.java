package edu.kis.vh.stacks.unittests;
import org.junit.Test;
import edu.kis.vh.stacks.StackHanoi;
import junit.framework.Assert;

public class StackHanoiTest {

	@Test
	public void pushTest() {
		
		StackHanoi hanoiTest = new StackHanoi();
		
		final int ELEMENT1 = 2;
		
		final int ELEMENT2 = 5;
		
		hanoiTest.push(ELEMENT1);
		Assert.assertEquals(hanoiTest.top(), ELEMENT1);
		
		hanoiTest.push(ELEMENT2);
		Assert.assertEquals(hanoiTest.top(), ELEMENT1);
		
	}

}