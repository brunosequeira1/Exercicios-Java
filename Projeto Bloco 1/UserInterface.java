package Turma24;


import java.util.Scanner;
import java.util.ArrayList;

// - Classe destinada a intera��es do usu�rio com a plataforma
public class UserInterface extends Perfil {

    // - Propriedades
    Scanner in = new Scanner(System.in);
    private ArrayList<Filme> favs;
    private ArrayList<Filme> forYou;
    private Filme selected;
    private String lastWatch;

    // - Construtor
    UserInterface(String nome, String email, String plano, String login, String senha, Filme selected) {

        super(nome, email, plano, login, senha);
        setFav(new ArrayList<Filme>());
        setForYou(new ArrayList<Filme>());
        setSelected(selected);
        setLastWatch(lastWatch = "N/A");

    }

    // - Validador de entrada
    int checker(int a, int b, String c){
        int x = -1;
        while (x < a || x > b) {
            x = in.nextInt();
            if (x >= a && x <= b) break;
            System.out.printf("Op��o inv�lida! Digite um n�mero entre %d e %d: %s", a , b, c);
        }
        return x;
    }

    // - M�todo para chamar o menu inicial
    public void menu() {
        System.out.println("-----MENU DE USU�RIO-----");
        System.out.println("Digite o que gostaria de fazer: ");
        System.out.println("1 - Iniciar filme atual");
        System.out.println("2 - Buscar Filmes");
        System.out.println("3 - Assistir � nossa indica��o di�ria");
        System.out.println("6 - Acessar configura��es de usu�rio");
        System.out.println("9 - Trocar de perfil");

        int x = checker(1, 6, "");
        if(x == 1) {
            start(selected); // ADICIONEI O METODO START PARA AUDIO E LEGENDA
        	selected.mensagemInicio();
            selected.efeitoVisual();
            menuMovie(selected);
        }
        if (x == 2) {
    		searchMovie();
    		start(selected); // ADICIONEI O METODO START PARA AUDIO E LEGENDA
        	selected.mensagemInicio();
            selected.efeitoVisual();
            menuMovie(selected);
        }
        if (x == 3) {
        	
        	//CRIAR INDICA��O DIARIA
        }
        
        if (x == 6) {
        	System.out.println("-----CONFIGURA��ES-----");
        	System.out.println("1 - Dados do Usu�rio");
            System.out.println("2 - Alterar Email");
            System.out.println("3 - Alterar Senha");
            System.out.println("4 - Alterar Plano");
            System.out.println("5 - Verificar Dados");
            
            int y = checker(1, 6, ""); //VERIFICAR COM ED COMO MONTAR ESTE CHECKER

            if (y == 1) {
            	
            	apresentarDados();
            	System.out.println("\nVoltar ao Menu Principal? 1-SIM | 2-N�O");
            	int z = checker(1,2,"");
            		if (z == 1) {
            			menu();
            		}
                	else  {
                    	;
                	}
                	

            }
        }
        
        if (x == 9) {
        	
        }
    }

    // - M�todo para buscar filmes
    
   public void searchMovie()
   {
       System.out.println("-----ESCOLHA UMA CATEGORIA-----");
       System.out.println("1 - Anima��o");
       System.out.println("2 - Fic��o Cient�fica");
       System.out.println("3 - Suspense");
       System.out.println("4 - Terror");
       System.out.println("5 - Aventura");
       System.out.println("6 - Com�dia");
       System.out.println("7 - Romance");
       System.out.println("8 - A��o");
       System.out.println("9 - Drama");
       System.out.println("10 - Document�rio\n");
       int x = in.nextInt();
      
       if(x == 1) {
           System.out.println("\n-----ANIMA��O-----");
           System.out.println("\nEscolha um filme:"); // ver como apresentar aqui aqui...
           
           
       }
       if (x == 2) {
    	   
       }
       ;

   }
    
    // - M�todo para controlar os filmes
    public void menuMovie(Filme mov) {
        System.out.println("-----MENU DE FILME-----");
        System.out.println("Digite o que gostaria de fazer: ");
        System.out.println("1 - Assistir");
        System.out.println("2 - Pausar");
        System.out.println("3 - Parar");
        System.out.println("4 - Favoritar");
        System.out.println("5 - Deixar avalia��o");
        System.out.println("6 - Deixar coment�rio");

        checker(1, 6, "");
    }
    	
    
    // - M�todo para iniciar filme
    public void start (Filme mov) {

        System.out.println("\nO filme " + mov.getNome() + " j� ir� iniciar!");
        System.out.println("Selecione o idioma: (1 - PT | 2 - EN | 3 - ES)");

        int aux = checker(1, 3, "(1 - PT | 2 - EN | 3 - ES)");

        System.out.println("Gostaria de uma legenda? (1 - PT | 2 - EN | 3 - ES | 4 - Sem legenda)" );

        checker(1, 4, "(1 - PT | 2 - EN | 3 - ES | 4 - Sem legenda)");

        if (aux == 1) System.out.println("\nBom filme!\n ");
        if (aux == 2) System.out.println("\nHave a nice movie!\n ");
        if (aux == 3) System.out.println("\nBuena pel�cula!\n ");

    }

    // - M�todo para favoritar um filme
    public void addFavs(Filme mov) {
        System.out.println("O filme " + mov.getNome() + " foi adicionado aos seus favoritos. ");
        favs.add(mov);
    }

    // - M�todo para avaliar um filme
    int rate() {
        int ret = 0;

        return ret;
    }

    // - M�todo para adicionar um coment�rio ap�s avaliar um filme
    String comment(){
        String s = "";

        return s;
    }



    // - Getters e Setters
    public ArrayList<Filme> getFav() { return favs; }
    public void setFav(ArrayList<Filme> fav) { this.favs = fav; }
    public ArrayList<Filme> getForYou() { return forYou; }
    public void setForYou(ArrayList<Filme> forYou) { this.forYou = forYou; }
    public Filme getSelected() { return selected; }
    public void setSelected(Filme selected) { this.selected = selected; }
    public String getLastWatch() { return lastWatch; }
    public void setLastWatch(String lastWatch) { this.lastWatch = lastWatch; }

}











/*
    public void controller(Filme mov) {
        System.out.println("Voc� est� acessando o controle de v�deo. ");
        System.out.println("O que deseja fazer? (1 - Rodar | 2 - Pausar | 3 - Parar)");
        int aux = checker(1, 3, "(1 - Rodar | 2 - Pausar | 3 - Parar)");
        //if (aux == 1) mov.rodar();
        if (aux == 2) mov.pausar();
        if (aux == 3) mov.parar();
    }
 */