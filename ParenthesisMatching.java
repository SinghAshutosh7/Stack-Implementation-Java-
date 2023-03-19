package com.gradescope.assignment1;

import com.gradescope.assignment1.AbstractParenthesisMatching;
import com.gradescope.assignment1.DemoStack;

public class ParenthesisMatching extends AbstractParenthesisMatching {
    public Boolean match_parenthesis(String s){
        /*
         * To be filled in by the student
         * Input: String made up of characters ‘(’, ‘{’, ‘[’, ‘)’, ‘}’, and ‘]’ 
         * Return: Whether input string is a matching parenthesis
         */
        DemoStack s1=new DemoStack();
        int l = s.length();
        for (int i=0;i<l;i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['  ){
                s1.push(s.charAt(i));
            }
            else if (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']' ){
                if (s1.is_empty()){
                    return false;
                }
                Character temp =s1.pop();
                if ( !(temp=='[' && s.charAt(i)==']')  && !(temp=='(' && s.charAt(i)==')')   && !(temp=='{' && s.charAt(i)=='}') 
                 )  {
                    return false;
                }         
            }
        }
        return s1.is_empty();
    }
}
