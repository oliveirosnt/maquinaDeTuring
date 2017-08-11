import java.util.Scanner;

public class MaquinaDeTuring {
	
	static String fita = "";

	public static void leituraDaFita() {
		Scanner sc = new Scanner(System.in);
		fita = sc.nextLine();
	}

	public static void leituraDaRegra(){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] regraArray = line.split(" ");
	}
	
	public static void printFita(){
		System.out.println(fita);
	}	

	public static void main(String[] args) {
		leituraDaFita();
		leituraDaRegra();
		printFita();
	}

}