import java.util.Arrays;

public class Matriz {

    public static void main(String[] args) {
        double[][] notasAlunos = new double[4][4];

        notasAlunos[0][0] = 1.1;
        notasAlunos[0][1] = 1.2;
        notasAlunos[0][2] = 1.3;
        notasAlunos[0][3] = 1.4;

        notasAlunos[1][0] = 9.1;
        notasAlunos[1][1] = 9.2;
        notasAlunos[1][2] = 9.3;
        notasAlunos[1][3] = 9.4;

        notasAlunos[2][0] = 5.1;
        notasAlunos[2][1] = 5.2;
        notasAlunos[2][2] = 5.3;
        notasAlunos[2][3] = 5.4;

        notasAlunos[3][0] = 2.1;
        notasAlunos[3][1] = 2.2;
        notasAlunos[3][2] = 2.3;
        notasAlunos[3][3] = 2.4;

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
