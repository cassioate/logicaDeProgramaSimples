package prova;

import java.util.*;

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

//    public int solution(int A, int B) {
//        Integer aDiv;
//        Integer bDiv;
//        if (A%2 != 0){
//            if (A%3 != 0) {
//
//            }
//        } else {
//
//        }
//        System.out.println(A+B % 4 != 0);
//        return 1;
//    };

//    public int solution(int[] A, int[] B) {
//        List<Integer> result = new ArrayList<>();
//
//        int temp1 = 0;
//        int temp2 = 0;
//        for (int i = 0; i < A.length; i++) {
//            temp1 = temp1 + A[i];
//            for (int k = i; k < A.length; k++) {
//                temp2 = temp2 + A[k];
//
//            }
//        }
//    }

    public Integer solution(String S) {
        List<String> arr = Arrays.asList(S.split(""));
        List<String> result = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < arr.size(); i++) {
            if (temp.contains(arr.get(i))) {
                result.add(temp);
                temp = "";
            }
            temp = temp + arr.get(i);
            if (i == arr.size()-1) {
                result.add(temp);
            }
        }
        return result.size();
    };

    public static void main(String[] args) {
        String text = "";
        Prova util = new Prova();
        System.out.println(util.solution("world"));
        System.out.println(util.solution("dddd"));
        System.out.println(util.solution("cycle"));
        System.out.println(util.solution("abba"));
    }
}
