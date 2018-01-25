package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.InterStackFace;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

//Zle wciaecia. Poprawiono
/**
 * @author Aliaksei
 *
 */
public interface StacksFactory {

	public InterStackFace getStandardStack();

	public InterStackFace getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
