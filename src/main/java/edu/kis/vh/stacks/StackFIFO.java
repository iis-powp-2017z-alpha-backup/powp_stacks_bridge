package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

/*
 * Komentarz do zadania 14 :
 * Postaniowiłem zaminieć poprzedni atrybut(teraz jego nazwa to mLocalStackList) na stos oparty na implementacji
 * listą - Zrobiłe tak, gdyż realizujac punkt 4 wydawało mi się to najlepszym wyborem.
 * 
 */
public class StackFIFO extends stack {

	private StackIf mLocalStackList;

	public StackFIFO() {
		super();
		mLocalStackList = new StackList();
	}

	public StackFIFO(StackIf mLocalStack) {
		super(mLocalStack);
		mLocalStackList = new StackList();
	}

	@Override
	public int pop() {
		while (!isEmpty())
			mLocalStackList.push(super.pop());

		int ret = mLocalStackList.pop();

		while (!mLocalStackList.isEmpty())
			push(mLocalStackList.pop());
		return ret;
	}

}
