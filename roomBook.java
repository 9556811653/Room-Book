package com.singleton1.pack40;

import java.util.Scanner;

class Room {
	int totalAcRoom ;
	int totalNonAcRoom ;
	{
		totalAcRoom=100;
		totalNonAcRoom=150;
	}
	private static Room book = null;
	
	private Room() {

	}

	public static Room getInstance() {
		if (book == null) {
			book = new Room();
		}
		return book;
	}

	public void AcRoom(int acRoom) {
		if (acRoom > totalAcRoom) {
			System.out.println(acRoom + " are not available");
			System.out.println(totalAcRoom + "are available");
			return;
		}
		else {
			totalAcRoom = totalAcRoom - acRoom;
			System.out.println(acRoom + " acrooms are  booked");
			System.out.println(totalAcRoom + " acRooms are  available now");
			return;
		}
	}

	public void nonAcroom(int nonAc) {
		if (nonAc > totalNonAcRoom) {
			System.out.println(nonAc + " are not available");
			System.out.println(totalNonAcRoom + " are available");
			return;
		}
		else {
			totalNonAcRoom = totalNonAcRoom - nonAc;
			System.out.println(nonAc + " non - ac rooms are  booked");
			System.out.println(totalNonAcRoom + " non-ac Rooms are  available now");
			return;
		}
	}
}
class roomBooking {
	public void m1() {
		//for ac room
		Scanner sc = new Scanner(System.in);
		Room room = Room.getInstance();
		System.out.println("Total Ac room available:"+room.totalAcRoom);
		System.out.println("how many Ac rooms you want to book?");
		int bookRoom = sc.nextInt();
		room.AcRoom(bookRoom);
	}
	public void m2() {
		//for non ac room
		Scanner sc = new Scanner(System.in);
		Room room1 = Room.getInstance();
		System.out.println("Total non Ac room available:"+room1.totalNonAcRoom);
		System.out.println("how many non Ac rooms you want to book?");
		int bookRoom = sc.nextInt();
		room1.nonAcroom(bookRoom);
		
	}
}

public class roomBook {
	public static void main(String[] args) {

//		roomBooking person1 = new roomBooking();
//		person1.m1();
//		person1.m2();

		Scanner sc = new Scanner(System.in);
		System.out.print("enter your choice:");
		System.out.println();
		System.out.println(" 1.Ac room \n 2.Non-Ac room");
		int choice = sc.nextInt();
		if (choice == 1) {
			roomBooking person1 = new roomBooking();
			roomBooking person2 = new roomBooking();
			roomBooking person3 = new roomBooking();
			person1.m1();
			person2.m1();
			person3.m1();
			System.out.println("-------------------------------------------");
		} else if (choice == 2) {
			roomBooking person4 = new roomBooking();
			roomBooking person5 = new roomBooking();
			roomBooking person6 = new roomBooking();
			person4.m2();
			person5.m2();
			person6.m2();
			System.out.println("---------------------------------------------");
			sc.close();
		}
	}
}
