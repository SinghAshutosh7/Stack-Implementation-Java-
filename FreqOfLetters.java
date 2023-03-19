package com.gradescope.assignment1;

import com.gradescope.assignment1.AbstractFreqOfLetters;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FreqOfLetters extends AbstractFreqOfLetters {
//public class FreqOfLetters  {

    public Integer[] count_letters(String fname) throws FileNotFoundException, IOException {
        Integer[] result = new Integer[26];
        FileReader fr=new FileReader(fname);    
        int i;    
        for(int j=0;j<26;j++){
            result[j]=0;
        }
        while((i=fr.read())!=-1)  {  
            if('a'<=i && i<='z'){
                int x=i-'a';
                result[x]++;}
        }   
        fr.close();   
        return result;
    }
}
