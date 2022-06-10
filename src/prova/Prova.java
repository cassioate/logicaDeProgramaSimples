package prova;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prova {

    public boolean conferidor (String text) {
        char primeiraLetra = text.charAt(0);
        if (primeiraLetra == Character.toUpperCase(primeiraLetra)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean asAnyWord (String word) {
        if (word.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public String[] wordWithNoFirstLetterFunc (String[] wordSplited) {
        String[] newWord = new String[wordSplited.length-1];
        for (int j = 1; j < wordSplited.length; j++) {
            newWord[j-1] = wordSplited[j];
        }
        return newWord;
    }

    public StringBuilder main (String text) {

        List<String> punctuation = Arrays.asList(".", ",");

        String[] textSplited = text.split(" ");
        String[] finalResult = new String[textSplited.length];
        String endOfTheWord = "ay";
        String firsLetter = "";
        StringBuilder sb = new StringBuilder("");

        if (!asAnyWord(text)) {
            return sb.append(text);
        }

        for (int i = 0; i < textSplited.length; i++) {

            boolean conferido = false;

            if (conferidor(textSplited[i])) {
                conferido = true;
            }

            String[] wordSplited = textSplited[i].split("");
            String[] wordWithOutFirstLetter = wordWithNoFirstLetterFunc(wordSplited);
            firsLetter = wordSplited[0];

            for (String p: punctuation) {
                if ( wordSplited[wordSplited.length-1].equals(p)){
                    endOfTheWord = endOfTheWord+p;
                };
            };

            finalResult = new String[wordSplited.length+1];

            for (int k = 0; k < wordWithOutFirstLetter.length; k++){
                finalResult[k] = wordWithOutFirstLetter[k];

            }
        }

        for (int h = 0; h < finalResult.length; h++){
            sb.append(finalResult[h]);
        }

        return sb;
    }


    public static void main(String[] args) {
        String text = "";
        Prova util = new Prova();
        Scanner myObj = new Scanner(System.in);
        text = myObj.nextLine();

        System.out.println(util.main(text));

    }
}
