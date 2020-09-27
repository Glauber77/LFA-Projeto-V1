import java.util.Scanner;
public class RespQuest03b {

	public static void main(String[] args) {

		int i = 0, tam = 0, cont0 = 0, cont1 = 0;
		String cadeia;
		Scanner ler = new Scanner(System.in);
	    System.out.print("Digite a Cadeia: ");
	    cadeia = ler.nextLine();
	    tam = cadeia.length()-1;
		
		
		while(i <= tam){
		    if(cadeia.charAt(i) == '0' || cadeia.charAt(i) == '1'){
		        if(cadeia.charAt(i) == '0') cont0++;
		        if(cadeia.charAt(i) == '1') cont1++;
		    }
		    i++;
		}

		
		if((cont0 % 2 == 0) && (cont1 % 2 == 0)) System.out.print("Cadeia Pertence!");
		else System.out.print("Cadeia não Pertence!");

		}

	}