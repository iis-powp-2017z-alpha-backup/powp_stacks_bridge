package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {
    //Poprawa formatu całości 3.1
    //Pracuje z Intelij Idea
    //Stowrzenie komentarza 3.2
    //Ctrl + . / Ctrl + , odpowiednik z intelij ide F2 / Shift + F2	- nastepny wyrozniony blad przez kompilator 3.3
    //Punkt 3.8 dokonałem zminy hermetyzacji, gdzie mogłem to zmieniłem, dorobiłem settery w klasie node
    //3.9 usunąlem niepotrzebne settery w klasie node

    /**
     * Radoslaw Subczynski 3.3.2
     */

    public static void main(String[] args) {
        initApp();
    }

    private static void initApp() {
        DefaultStacksFactory factory = new DefaultStacksFactory();

        Stack[] Stacks = {factory.GetStandardStack(), factory.GetFalseStack(),
                factory.GetFIFOStack(), factory.GetHanoiStack()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                Stacks[j].push(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            Stacks[3].push(rn.nextInt(20));

        for (int i = 0; i < Stacks.length; i++) {
            while (!Stacks[i].isEmpty())
                System.out.print(Stacks[i].pop() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((StackHanoi) Stacks[3]).reportRejected());
    }

}