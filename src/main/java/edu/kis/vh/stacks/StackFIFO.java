package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

/*
 * obiekt temp może być i oniektem klasy StackArray i klasy StackList, postanowiłem jednak wybrać obiekt StackList
 * ponieważ w jednym z wcześniejszych punktów trzeba było tak zmienić implementację klasy StackFifo, aby
 * zaczęła korzystać z implementacji stosu z listą
 */

/*
 * Odpowiedź do zadania 17 :
 * klasa StackFIFO łamie zasadę izolacji, prywatne plole temp wczesniej było obiektem klasy stack - klasy po której
 * klasa StackFIFO dziedziczyła.
 * Realizując postawione mi zadania doszedłem do wniosku, iż najlepszym wyjściem będzie zmienienie 
 * typu obiektu temp z stack na StackIf(StackList)
 * Można by również usunąć obiekt temp, utworzyc nowy tymczasowy kontener w metodzie pop i zastąpić 
 * wywołnia odpowiednich metod  
 */

public class StackFIFO extends Stack {

	private StackIf temp = new StackList();

	public StackFIFO() {
		super(new StackArray());
	}

	public StackFIFO(StackIf mLocalStack) {
		super(mLocalStack);
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());
		return ret;
	}

}
