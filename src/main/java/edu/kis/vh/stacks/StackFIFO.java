package edu.kis.vh.stacks;


import edu.kis.vh.stacks.implementations.StackList;
/* zad 14
 	Wybralem StackList, poniewaz pozwala na uzycie stosu bez ograniczenia wielkosci,
 	a ilosc pamieci jaka zajmuje jest zalezna od wielkosci samego stosu a nie narzucona
 	oddgornie
 */
/* zad 17
 	Zasade izolacji abstrakcji od implementacji lamie pole temp w tej klasie .Jest to obiekt klasy StackList
 	wymuszajacy uzycie tej implementacji . W celu naprawienia tego bledu nalezy zastapic pole temp  obiektem klasy 
 	StackInterface.
 */

public class StackFIFO extends stack {

	public StackList temp;
	
		public StackFIFO() {
			super();
			temp = new StackList();
		}
		
	// poprawka punktu 12
			public StackFIFO(StackInterface stackInterface){
				super(stackInterface);
				temp = new StackList();
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
