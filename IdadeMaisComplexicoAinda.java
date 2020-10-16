import java.util.Scanner;
public class IdadeMaisComplexicoAinda {
	public static void  main(String []args) {
		Scanner yone = new Scanner (System.in);
		int adolescente = 0;
        int adolescenteaadulto = 0;
        int adultoameiaidade = 0;
        int meiaidadeavelho = 0;
        int velho = 0;
		int idade;
		int i = 0;
		for (i = 0; i <= 14; i++) {
            System.out.println("Idade n° " + (i+1) + ": ");
            idade = yone.nextInt();
            if(idade <= 15) {
            	 adolescente++;
            }
            if(idade >= 16 && idade <=30) {
                adolescenteaadulto++;
            }
            if(idade >= 31 && idade <= 45) {
                adultoameiaidade++;
            }
            if(idade >= 46 && idade <= 60) {
                meiaidadeavelho++;
            }
            if(idade > 61) {
                velho++;
            }yone.close();
        }
        System.out.println("Até 15 anos: " + adolescente + " - " + (float)(adolescente*100)/15 + "%");
        System.out.println("De 16 a 30 anos: " + adolescenteaadulto + " - " + (float)(adolescenteaadulto*100)/15 + "%");
        System.out.println("De 31 a 45 anos: " + adultoameiaidade + " - " + (float)(adultoameiaidade*100)/15 + "%");
        System.out.println("De 46 a 60 anos: " + meiaidadeavelho + " - " +  (float)(meiaidadeavelho*100)/15 + "%");
        System.out.println("Acima de 61 anos: " + velho + " - " + (float)(velho*100)/15 + "%");
		}
}