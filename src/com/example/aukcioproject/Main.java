package com.example.aukcioproject;

public class Main {
	public static void main(String[] args) {
		Festmeny festmeny=new Festmeny("uj festmeny","teszt elek","futurizmus");
		for (int i = 0; i < 100; i++) {
			festmeny.licit();
			System.out.println(festmeny.getLegmagasabbLicit());
		}
	}
}
