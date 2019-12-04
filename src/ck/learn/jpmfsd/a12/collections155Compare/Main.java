package ck.learn.jpmfsd.a12.collections155Compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ck.learn.jpmfsd.a12.collections155Compare.Theatre.Seat;

public class Main {

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre("Olypian", 8, 12);
		
		if(theatre.reserveSeat("D12")) {
			System.out.println("Please pay for D12");
		} else {
			System.out.println("Seat already taken");
		}
		
		if(theatre.reserveSeat("D12")) {
			System.out.println("Please pay for D12");
		} else {
			System.out.println("Seat already taken");
		}
		
		if(theatre.reserveSeat("B13")) {
			System.out.println("Please pay for B13");
		} else {
			System.out.println("Seat already taken");
		}
		
		List<Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
		Collections.reverse(reverseSeats);
		printList(reverseSeats);
		
		List<Seat> priceSeats = new ArrayList<>(theatre.getSeats());
		priceSeats.add(theatre.new Seat("B00", 13.00));
		priceSeats.add(theatre.new Seat("A00", 13.00));
		Collections.sort(priceSeats, theatre.PRICE_ORDER);
		printList(priceSeats);
		
	}
	
	public static void printList(List<Theatre.Seat> list) {
		for (Seat seat : list) {
			System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
		}
		System.out.println();
		System.out.println("======================================================================");
	}
	
	

}
