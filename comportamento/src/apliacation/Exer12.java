package apliacation;


import java.util.Scanner;

import entities.Rent;

public class Exer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rent[] room = new Rent[10];

		System.out.print("How many rooms will be rent? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			room[roomNumber] = new Rent(name, email); // o numero do quarto recebe o objeto

		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (room[i] != null) {
				System.out.println(i + ": " +room[i]);
			}

		}

		sc.close();

	}

}
