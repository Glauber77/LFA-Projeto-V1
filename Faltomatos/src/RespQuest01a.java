import java.util.Scanner;
public class RespQuest01a {

	public static void main(String[] args) {
        
		int tam = 0; 
		int tam2 = 0; 
		int cont = 0;
	    String cadeia;
	    Scanner ler = new Scanner(System.in);
	    System.out.print("Cadeia : ");
	    cadeia = ler.nextLine();
	    
	    tam = cadeia.length()-1;
	    tam2 = tam;
	    
		if((tam2+1) % 2 != 0) {
		System.out.print("Cadeia Nao Aceita");
	   	}
	   
		
		
	   	for(int i=0;i <= tam2/2;i++){
	   		if(cadeia.charAt(i) == cadeia.charAt(tam)){
	    	cont++;
	   		}
	   		
	    	tam--;    
	    }

	    if(cont == (tam2+1)/2){
	    	System.out.print("Cadeia Aceita");
		}
			
	    else{
	    	System.out.print("Cadeia Nao Aceita");
		}
		
    }
}
