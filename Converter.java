import java.io.*;
import java.util.*;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("What is your weight on Earth? ");
		double weight = kbScanner.nextDouble();
		System.out.println("Select a planet:\n1: Voltar\n2:Krypton\n3:Fertos\n4:Servontos\n");
		int selection = kbScanner.nextInt();
		switch (selection){
		case 1:
			weight *= .091;
			System.out.println("Your weight on Volatar would be " + weight);
			break;
		case 2:
			weight *= .720;
			System.out.println("Your weight on Krypton would be " + weight);
			break;
		case 3:
			weight *= .865;
			System.out.println("Your weight on Fertos would be " + weight);
			break;
		case 4:
			weight *= 4.612;
			System.out.println("Your weight on Servontos would be " + weight);
			break;
		default:
			System.out.println("Invalid Selection");
		}
	}

}