import java.util.Scanner;
public class RespQuest03a {
	
	public static void main(String[] args) {
		
		
		int tam = 0;
		int cont = 0; 
		
	    String cadeia;
	    Scanner ler = new Scanner(System.in);
	    System.out.println("Digite a cadeia: ");
	    cadeia = ler.nextLine();
	    tam = cadeia.length()-1;
	    
	    for(int i=0;i <= tam;i++){
	        if(cadeia.charAt(i) == 'o' || cadeia.charAt(i) == 'k'){
	            if((cadeia.charAt(i) == 'o') && (cadeia.charAt(i+1) == 'k')){
	            	cont++;
				} 
	        }
	        else{
	        System.out.print("Cadeia nao Aceita");
			} 
	       
	    }
	    
	    if(cont >= 1) { System.out.print("Cadeia Aceita"); }
	    else{ System.out.print("Cadeia nao Aceita");  }
	    
		
	}
}