package com.dotka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmailValidation {

    public static String validateEmail(String email){

        if(email.contains("@")){
            int indexOfChar = email.indexOf("@");
            int emailLength = email.length();
            int indexOfLastLetter = emailLength-1;
            int indexOfDot = 0;
            if(indexOfChar != 0 && indexOfChar != indexOfLastLetter){
                String ending = email.substring(indexOfChar+1,indexOfLastLetter);
                int dotCounter = 0;
                char[] endingChars = ending.toCharArray();
                for (int i = 0; i< endingChars.length; i++){
                    Character x = endingChars[i];
                   if(x.equals('.')) {
                       dotCounter += 1;
                       indexOfDot = i;
                       }
                   }
                   if(dotCounter == 1 && indexOfDot!= indexOfLastLetter && indexOfDot!=0){
                       return "Email prawidlowy";
                }
            }
        } return "Email nieprawidlowy";
    }
}
