package com.greatlearning.Denomination;

public class NotesCount {
	
	public void notescountImplementation(int notes[],  int amount) {
		
		int[] counter =  new int[notes.length];
		
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					counter[i] = amount / notes[i];
					amount = amount - counter[i] * notes[i];				
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount cannot given with the highest denomination");	
			} else {
				System.out.println(" Your payment approach in order to give minimum no.of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (counter[i] != 0) {
						System.out.println(notes[i] + ": "+ counter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e+ "notes of denomination 0 is invalid");
			
		}
		
	}

}
