import java.util.Arrays;
import java.util.List;

public class Patinhos {
    int ducks = 6;
    String music1 = "patinhos foram passear";
    String music2 = "Além das montanhas";
    String music3 = "Para brincar";
    String music4 = "A mamãe gritou: Quá, quá, quá, quá";
    String music5 = "Mas só";
    String music6 = "patinhos voltaram de lá.";
    String end = "-------------------------------";
    int totalDucks = ducks;


    public void song() {
        for(int i = 0; i < ducks; i++) {
            String conca = totalDucks+" "+music1;
            totalDucks--;
            String conca2 = "";
            if (totalDucks == 0) {
                conca2 = "Mas nenhum patinho voltou de lá";
            } else {
                conca2 = music5+" "+totalDucks+" "+music6;
            }
            List<String> songs = Arrays.asList(conca, music2, music3, music4, conca2, end);
            songs.stream().forEach((song) -> {
                System.out.println(song);
            });
        }

        String voltaDosPatinhos = "A mamãe patinha foi procurar \nAlém das montanhas \nNa beira do mar \nA mamãe gritou: Quá, quá, quá, quá\nE os "+ducks+" patinhos voltaram de lá.";
        System.out.println(voltaDosPatinhos);
    }

    public static void main(String[] args) {

        Patinhos main = new Patinhos();

        main.song();

    }
}

