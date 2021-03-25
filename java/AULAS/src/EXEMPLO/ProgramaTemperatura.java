package EXEMPLO;

import java.util.Scanner;

public class ProgramaTemperatura {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
		 double temperaturaC;
		 double temperaturaF;
		 
		 System.out.println("Digite a temperatura em Celsius: ");
		 temperaturaC = leia.nextDouble();
		
 		 temperaturaF = temperaturaC*1.8+32;
 		 System.out.println("A temperatura em Fahrenheit é: "+temperaturaF);
		
	}

}
