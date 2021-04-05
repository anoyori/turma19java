package lista5LacosDecisao;

import java.util.Scanner;

public class Exercicio2LacosDecisao2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
        System.out.print("Digite o primeiro numero: ");
        a = leia.nextInt();
        System.out.print("Digite o segundo numero: ");
        b = leia.nextInt();
        System.out.print("Digite o terceiro numero: ");
        c = leia.nextInt();
        
        if (a <= b && a <= c && b <= c) {
            System.out.printf("%d, %d, %d",a,b,c);
        } else if (b <= c && c <= a) {
            System.out.printf("%d, %d, %d",b,c,a);
        } else if (c <= a && b <= a) {
            System.out.printf("%d, %d, %d",c,b,a);
        }
        else if(b <= a && b <= c && a <= c) {
            System.out.printf("%d, %d, %d",b,a,c);
        } else if(c <= a && c <= b && a <= b ) {
            System.out.printf("%d, %d, %d",c,a,b);
		} else if(a <= c && a <= b && c <= b ) {
        System.out.printf("%d, %d, %d", a,c,b);
		}
    }
	

}
