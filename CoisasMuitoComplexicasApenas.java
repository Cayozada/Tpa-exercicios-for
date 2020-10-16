import java.util.Scanner;
public class CoisasMuitoComplexicasApenas {
	public static void  main(String []args) {
	    Scanner yone = new Scanner(System.in);

		int maisque50 = 0;
		float alt10e20 = 0;
		int pes10e20 = 0;
		int pesomenor40 = 0;
		int idadenova = 9999;
		int idadevelha = 0;
		float pesonova = 0;
		float pesovelha = 0;
		for(int i = 1; i<=25; i++) {
		       System.out.println("Idade: ");
		       int scidade = yone.nextInt();
		       System.out.println("Altura: ");
		       Float scalt = yone.nextFloat();
		       System.out.println("Peso: ");
		       Float scpeso = yone.nextFloat();
		       System.out.println("\n");
		       if(scidade > 50){
		       maisque50++;
		       }
		       if(scidade >=10 && scidade <=20){
		           alt10e20 = alt10e20 + scalt;
		           pes10e20++;
		       }
		       if(scpeso < 40){
		           pesomenor40++;
		       }
		       if(scidade < idadenova){
		          idadenova = scidade;
		          pesonova = scpeso;
		       }
		       if(scidade > idadevelha){
		          idadevelha = scidade;
		          pesovelha = scpeso;
		       }
		       }
		        yone.close();
		        System.out.println("Pessoas com idade superior a 50 anos: " + maisque50);
		        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " +  alt10e20 / pes10e20);
		        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: " + (pesomenor40*100)/25 + "%");
		        System.out.println(pesomenor40);
		        System.out.println("Peso da pessoa mais velha: " + pesovelha);
		        System.out.println("Peso da pessoa mais nova: " + pesonova);
		    }
	}