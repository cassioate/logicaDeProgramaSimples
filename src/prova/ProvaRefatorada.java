package ProvaRefatorada;

import java.lang.reflect.Array;
import java.util.*;

public class ProvaRefatorada {

    public boolean conferror (ArrayList<String> word) {
        ArrayList<String> wordToReturn = new ArrayList<String>(word);
        String letter = wordToReturn.get(0);
        if (letter == letter.toUpperCase()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean asAnyWord (String word) {
        if (word.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean consonantFunc (List<String> letters) {
        List<String> consoant = new ArrayList<>(Arrays.asList("b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","z"));
        boolean result = false;
        List<String> tempWord = new ArrayList<>();
        for (String l: letters) {
            tempWord.add(l.toLowerCase());
        }
        for (String c: consoant) {
            if (tempWord.contains(c)) {
                result = true;
            }
        }
        return result;
    }

    public ArrayList<String> switchLettersInTheWord (ArrayList<String> wordSplited) {
        ArrayList<String> switchFirsLetterToTheEnd = new ArrayList<>(wordSplited);
        String endOfTheWord = "ay";

        if (!wordSplited.get(0).matches("[0-9]*")){
            if (conferror(switchFirsLetterToTheEnd)){
                if (switchFirsLetterToTheEnd.size() > 1) {
                    String secondLetter = switchFirsLetterToTheEnd.get(1).toUpperCase();
                    switchFirsLetterToTheEnd.set(1, secondLetter);
                }
            }

            if (!consonantFunc(wordSplited)){
                if (switchFirsLetterToTheEnd.size() > 1){
                    switchFirsLetterToTheEnd.remove(0);
                }
                endOfTheWord = "yay";
            } else {
                endOfTheWord = "ay";
                switchFirsLetterToTheEnd.add(switchFirsLetterToTheEnd.get(0).toLowerCase());
                switchFirsLetterToTheEnd.remove(0);
            }

            switchFirsLetterToTheEnd.add(endOfTheWord);
            if (switchFirsLetterToTheEnd.contains(".")) {
                switchFirsLetterToTheEnd.remove(".");
                switchFirsLetterToTheEnd.add(".");
            }
            if (switchFirsLetterToTheEnd.contains(",")) {
                switchFirsLetterToTheEnd.remove(",");
                switchFirsLetterToTheEnd.add(",");
            }
        }
        return switchFirsLetterToTheEnd;
    }

    public ArrayList<String> makeFinalResult (ArrayList<String> textSplited,
                                   ArrayList<String> listOfWordWithOutFirstLetter,
                                   ArrayList<String> finalResult) {

        for (int i = 0; i < textSplited.size(); i++) {
            StringBuilder sbWord = new StringBuilder("");

            ArrayList<String> wordSplited = new ArrayList<>(Arrays.asList(textSplited.get(i).split("")));
            listOfWordWithOutFirstLetter = switchLettersInTheWord(wordSplited);
            for (String s : listOfWordWithOutFirstLetter) {
                sbWord.append(s);
            }
            finalResult.add(sbWord.toString());
        }
        return finalResult;
    }

    public StringBuilder makeAStringBuilder (ArrayList<String> finalResult) {
        StringBuilder sb = new StringBuilder("");

        for (int h = 0; h < finalResult.size(); h++){
            sb.append(finalResult.get(h));
            if (h < finalResult.size()-1) {
                sb.append(" ");
            }
        }
        return sb;
    }

    public StringBuilder main (String text) {
        ArrayList<String> textSplited = new ArrayList<>(Arrays.asList(text.split(" ")));
        ArrayList<String> finalResult = new ArrayList<>();
        ArrayList<String> listOfWordWithOutFirstLetter = new ArrayList<>();

        if (!asAnyWord(text)) {
            return new StringBuilder(text);
        }

        finalResult = makeFinalResult(textSplited, listOfWordWithOutFirstLetter, finalResult);

        return makeAStringBuilder(finalResult);
    }


    public static void main(String[] args) {
        String text = "";
        ProvaRefatorada util = new ProvaRefatorada();
        Scanner myObj = new Scanner(System.in);
        text = myObj.nextLine();

        System.out.println(util.main(text));

    }
}
