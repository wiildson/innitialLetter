
/*Crie um algoritmo que solicite ao usuário que digite 3 nomes e no final imprima o total de nomes que come-
çam com a primeira letra com uma vogal e o total de nomes que começam com a primeira letra com uma conso-
ante.*/


package exerciseList;

import java.util.Locale;
import java.util.Scanner;



public class QuestionOne {

	static String[] nome = new String[3];
	static int v = 0;
	static int c = 0;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			System.out.println("Digite o " + (i+1) + "º nome:");
			nome[i] = sc.nextLine();
			
			}
		
		for (int i = 0; i <3; i++) {
            char nam = Character.toLowerCase(nome[i].charAt(0));
            if (nam == 'a' || nam == 'e' || nam == 'i' || nam == 'o' || nam == 'u') {
                v++;
            } else {
                c++;
            }
        }

        System.out.println(v + " dos nomes digitados começam com uma vogal.");
        System.out.println(c + " dos nomes digitados começam com uma consoante.");
    }
		
	}