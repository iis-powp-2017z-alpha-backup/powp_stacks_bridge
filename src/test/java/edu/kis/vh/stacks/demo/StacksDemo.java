package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
//import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {
    //Poprawa formatu całości 3.1
    //Pracuje z Intelij Idea
    //Stowrzenie komentarza 3.2
    //Ctrl + . / Ctrl + , odpowiednik z intelij ide F2 / Shift + F2	- nastepny wyrozniony blad przez kompilator 3.3
    //Punkt 3.8 dokonałem zminy hermetyzacji, gdzie mogłem to zmieniłem, dorobiłem settery w klasie node
    //3.9 usunąlem niepotrzebne settery w klasie node

    public static void main(String[] args) {
        initApp();
    }

    private final static int WEIGHT_COLUMN = 3;
    private final static int ELEMENT_OF_COLUMN = 15;

    private static void initApp() {
        DefaultStacksFactory factory = new DefaultStacksFactory();
        Stack[] Stacks = {factory.GetStandardStack(), factory.GetFalseStack(),
                factory.GetFIFOStack(),factory.GetHanoiStack()};

        for (int i = 1; i < ELEMENT_OF_COLUMN; i++) {

            for (int j = 0; j < WEIGHT_COLUMN; j++)
                Stacks[j].push(i);
        }

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < ELEMENT_OF_COLUMN; i++)
            Stacks[WEIGHT_COLUMN].push(rn.nextInt(20));

        for (edu.kis.vh.stacks.Stack Stack : Stacks) {
            while (!Stack.isEmpty())
                System.out.print(Stack.pop() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((StackHanoi) Stacks[WEIGHT_COLUMN]).reportRejected());
    }

}