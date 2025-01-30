import pro.projetinho;
import java.util.Scanner;

public class Main {
    public static void main(String[]Args){


        projetinho Projeto = new projetinho(3); //aqui você define o tanto de ninja
        //que podem ser cadastrados

        Scanner sc = new Scanner(System.in);


        Projeto.entrada(sc);
        Projeto.interfaceUsuario(sc);
        Projeto.fim();


    }
}