package edu.kis.vh.stacks;

public interface StackVector {

	int EMPTYSTACK=0;
	
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}
//przeniesienie stalej z klas StackArray i StackList 
//znaczaco ulatwilo zmiane wartosci zwracanej z -1 na 0, w przypadku pustego stosu;
//zmiana tylko raz w interfejsie, nie trzeba bylo zmieniac tej wartosci w kazdej klasach osobno