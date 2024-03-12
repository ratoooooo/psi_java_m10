package ProjetosFinais_M10;
import java.util.Scanner;

public class Animais {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Peixe peixe = new Peixe("Tobite", 5);
		Anfíbio anfíbio = new Anfíbio("Filho de Pescador", 4);
		Reptil reptil = new Reptil("Ovo", 7);
		Ave ave = new Ave("Toni", 3,6, true);
		Mamifero mamifero = new Mamifero("Kevin", 5);
		int op;
		
		do {
			menu();
			op = ler.nextInt();
			switch (op) {
			case 1:
				System.out.println(peixe.toString());
				break;
			case 2:
				System.out.println(anfíbio.toString());
				break;
			case 3:
				System.out.println(reptil.toString());
				break;
			case 4:
				System.out.println(ave.toString());
				break;
			case 5:
				System.out.println(mamifero.toString());
				break;
			default:
				System.out.println("Opeção Inalida");
				break;
			}
			
		} while (op != 0);
		
		ler.close();
	}

	private static void menu()
	{
		System.out.println("1-Ver exemplo de Peixe");
		System.out.println("2-Ver exemplo de Anfíbio");
		System.out.println("3-Ver exemplo de Réptil");
		System.out.println("4-Ver exemplo de Ave");
		System.out.println("5-Ver exemplo de Mamífero");
		System.out.println("Escolha uma opção: ");
	}
}
