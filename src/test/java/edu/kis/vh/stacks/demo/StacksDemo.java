package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

class StacksDemo {

    public static void main(String[] args) {
        DefaultStacksFactory defaultFactory = new DefaultStacksFactory();
        ListStacksFactory listStacksfactory = new ListStacksFactory();
        ArrayStacksFactory arrayStacksfactory = new ArrayStacksFactory();

        testStack(defaultFactory);
        testStack(listStacksfactory);
        testStack(arrayStacksfactory);
    }

    private static void testStack(ListStacksFactory listStacksfactory) {
        // TODO Auto-generated method stub

    }

    private static void testStack(DefaultStacksFactory defaultFactory) {
        // TODO Auto-generated method stub

    }

    private static void testStack(ArrayStacksFactory arrayStacksfactory) {
        Stack[] stacks = {arrayStacksfactory.getStandardStack(), arrayStacksfactory.getFalseStack(),
                arrayStacksfactory.getFIFOStack(), arrayStacksfactory.getHanoiStack()};

        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                stacks[j].push(i);
            }
        }

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++) {
            stacks[3].push(rn.nextInt(20));
        }

        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop() + "  ");
            }
            System.out.println();
        }

        System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
    }

}
// wiersze od 19 do 27 byly zle sformatowane
// klawisze alt i strzelki przelaczaja pomiedzy otwartymi plikami
