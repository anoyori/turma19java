package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = leia.nextInt();
		
		Room [] vect = new Room[10];
		for(int i=1; i<=n; i++) {
			System.out.printf("Rent %d:\n", i);
			System.out.print("Name: ");
			String name = leia.next();
			System.out.print("email: ");
			String email = leia.next();
			System.out.print("Room: ");
			int room = leia.nextInt();
			vect[room] = new Room(name,email);
		}
		
		System.out.print("Busy rooms: \n");
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i+": " + vect[i]);
			}
		}
		

	}

}
