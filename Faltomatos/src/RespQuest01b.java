import java.util.Scanner;
public class RespQuest01b {

	public static void main(String[] args) {
		
	char linguagem = 'a';
    int i = 0;
	Scanner ler = new Scanner(System.in);
	int x;
    System.out.println("Valor do i: ");
    x = ler.nextInt();
    x = x * x;
    System.out.println("Resposta: ");
    while(i < x){
    	System.out.print(linguagem);
        i++;
    }
	}
}