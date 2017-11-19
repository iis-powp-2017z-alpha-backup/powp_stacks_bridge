package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

/*Punkt 14
Wybrałem implementacje StackList, gdyż w przeciwieństwie do StackArray pozwala na zbudowanie stosu bez ograniczneia
wielkości i jest optymalna, gdyż ilość pamieci jaka zajmuje stos jest zależna od jego aktualniej wielkości
 a nie zdefinowana z góry.
 */

public class StackFIFO extends stack {

    /*Punt 17
    Zasade izolacji abstrakcji od implementacji łamie pole temp w tej klasie. Jest to obiekt klasy StackList wymuszając
    użycie tej implementacji.
    Aby naprawić ten błąd pole temp powinno być obiektem klasy StackInterface.
    */
    public StackList temp;

    public StackFIFO() {
        super();
        temp = new StackList();
    }

    // poprawka punktu 12
    public StackFIFO(StackInterface stackInterface) {
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