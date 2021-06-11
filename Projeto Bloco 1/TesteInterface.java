package Turma24;

public class TesteInterface {

    public static void main(String[] args){

        Filme filme = new Animacao("Teste1", "Test", 120, "Livre", 0, "AISjioJINDn");

        UserInterface user = new UserInterface("Test", "Test", "Test", "Test", "Test", filme);

        user.menu();


    }

}