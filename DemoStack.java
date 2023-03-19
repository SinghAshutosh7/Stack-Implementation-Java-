package com.gradescope.assignment1;

import java.util.EmptyStackException;

import com.gradescope.assignment1.AbstractDemoStack;

public class DemoStack extends AbstractDemoStack {
    Character[] base;

    public DemoStack(){
        super();
        base = new Character[10];
    }

    int size=0;
    int N=10;

    public void push(Character i){
        /*
         * To be filled in by the student
         * Input: Character to be inserted onto top of stack
         */
        if (size==N){
            Character [] temp=base;
            N=2*N;
            base=new Character[N];
            for(int j=0;j<size;j++){
                base[j]=temp[j];
            }

        }
        base[size]=i;
        size++;
    }

    public Character pop() throws EmptyStackException{
        /*
         * To be filled in by the student
         * Return: Character present at the top of the stack
         */
        if(size==0){
            throw new EmptyStackException();
        }
        else{
            if (size==N/4){
                Character [] temp=base;
                N=N/2;
                base=new Character[N];
                for(int j=0;j<size;j++){
                    base[j]=temp[j];
                }
            }
            size--;
            Character pop_data=base[size];
            base[size]=null;
            return pop_data;
        }
    }
    
    public Boolean is_empty(){
        /*
         * To be filled in by the student
         * Return: Stack is empty or not
         */
        return size==0;
    }
    
    public Integer size(){
        /*
         * To be filled in by the student
         * Return: Number of elements which are present in stack
         */
        return size;
    }
    
    public Character top() throws EmptyStackException{
        /*
         * To be filled in by the student
         * Return: Character present at the top of the stack
         */
        if (size==0){
            throw new EmptyStackException();
        }
        else{
            return base[size-1];
        }
    }

    public Character[] return_base_array(){
       /*
        * To be filled in the by the student
        * Return: Return reference to the base array storing the elements of stack
        */
        return base;
    }
}
