package logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solutions {

    public Integer solutionTask2(int a, int b) {
        int maxLengthOfStick = (a+b)/4;   // A solução deverá estar entre 0 e o resultado dessa divisão
        while(maxLengthOfStick>0){
            int A = a/maxLengthOfStick; // Garanto que só pegará o valor inteiro pois a divisão de dois inteiros em JAVA gera outro inteiro, no caso os dois input dessa função são inteiros
            int B = b/maxLengthOfStick; // Garanto que só pegará o valor inteiro pois a divisão de dois inteiros em JAVA gera outro inteiro, no caso os dois input dessa função são inteiros
            if(A + B  == 4) // Se a soma de A + B resultar em 4 sticks então teremos o resultado do tamanho do stick
                return maxLengthOfStick;
            --maxLengthOfStick;
        }
        return 0;
    };

//    public Integer solutionTask2(int a, int b) {
    // SOMA OS 2 INPUTS, para pode dividir por 4 e saber qual seria o maior tamanho de stick possivel
//        int maxLength = (10+21)/4;   // Our solution will live between 0 and this max length only
    //      Faz a divisão dentro do A e do B, nesse caso o 10/7 ficará ~1.4, no caso só é possivel possuir um stick de tamanho 7,
    //      O mesmo é feito com o 21 que ao dividir por 7, resulta em 3, então esse valor será possivel possuir 3 stick de tamanho 7
    //      Agora eu preciso saber se a soma dessas duas divisões me resultam em 4 stick para formar o quadrado, caso nao resulte
    //      será realizado -1 no maxLength, o que nesse casso passará a ser 6, e repetira tudo de novo até que a soam das duas divisões resulte em 4.
//        while(7>0){
//            if(10/maxLength + 21/maxLength == 4) // If we get total 4 sticks out of 2 large sticks then we will get solution
//                return maxLength;
//            --maxLength;
//        }
//        return 0;
//    };

    public Integer solutionTask3(String S) {
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

    public Integer solutionTask4(int a[], int b[]) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }
        int count = 0;
        int tempA = a[0];
        int tempB = b[0];

        for (int i = 1; i < a.length; i++) {
            if (i != 1 && tempA == tempB && 2 * tempA == sumA && 2 * tempB == sumB) {
                count++;
            }
            tempA += a[i];
            tempB += b[i];
        }
        return count;
    };

    public static void main(String[] args) {
        Solutions s = new Solutions();

        System.out.println("TASK 2:");
        System.out.println(s.solutionTask2(10, 21));
        System.out.println(s.solutionTask2(13, 11));
        System.out.println(s.solutionTask2(2, 1));
        System.out.println(s.solutionTask2(1, 8));
        System.out.println("------------------");


        System.out.println("TASK 3:");
        System.out.println(s.solutionTask3("world"));
        System.out.println(s.solutionTask3("dddd"));
        System.out.println(s.solutionTask3("cycle"));
        System.out.println(s.solutionTask3("abba"));
        System.out.println("------------------");

        int[] array1 = {0, 4, -1, 0, 3};
        int[] array2 = {0, -2, 5, 0, 3};

        int[] array3 = {2, -2, -3, 3};
        int[] array4 = {0, 0, 4, -4};

        int[] array5 = {4, -1, 0, 3};
        int[] array6 = {-2, 6, 0, 4};

        int[] array7 = {3, 2, 6};
        int[] array8 = {4, 1, 6};

        int[] array9 = {1, 4, 2, -2, 5};
        int[] array10 = {7, -2, -2, 2, 5};
        System.out.println("TASK 4:");
        System.out.println(s.solutionTask4(array1, array2));
        System.out.println(s.solutionTask4(array3, array4));
        System.out.println(s.solutionTask4(array5, array6));
        System.out.println(s.solutionTask4(array7, array8));
        System.out.println(s.solutionTask4(array9, array10));
        System.out.println("------------------");
    }
}
