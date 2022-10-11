package ua.lviv.lgs;

import java.util.Scanner;

public class Main {
	public static void main() {
		System.out.println("Нажміть 1, щоб перевірити чи буде слово паліндромом: ");
		System.out.println("Нажміть 2, щоб замінити всі голосні букви на тире: ");
		System.out.println("Нажміть 3, щоб порахувати кількість слів у реченні: ");
		System.out.println("Нажміть 4, щоб визначити, яке слово найбільше вживається в реченні: ");
	}
	public static void main(String[] args) throws Exception {
		Scanner words = new Scanner(System.in);
		while(true) {
			main();
			switch (words.next()) {
			case "1": {
				System.out.println("Введіть слово: ");
				words = new Scanner(System.in);
				String word = words.nextLine().toUpperCase();
				int word1 = word.length();
				if(word1 == 5) {
						System.out.println("Слово є паліндромом");
					}else {
						throw new Exception("Слово не складається з 5 букв");
					}
			}break;
			case "2": {
				System.out.println("Введіть речення: ");
				words = new Scanner(System.in);
				String word = words.nextLine();
				String minus = "-";
				String[] type = new String[] {"а", "о", "у", "и", "ї", "і", "е", "є", "я", "ю"};
				String wordreplace = word.replace(type[0], minus).replace(type[1], minus).replace(type[3], minus)
						.replace(type[4], minus).replace(type[5], minus).replace(type[6], minus).replace(type[7], minus)
						.replace(type[8], minus).replace(type[9], minus).replace(type[2], minus);
				System.out.println(wordreplace);
		}break;
			case "3": {
				System.out.println("Введіть речення: ");
				words = new Scanner(System.in);
				String word = words.nextLine();
				int wordcount = 0;
				if(word.length() != 0) {
					wordcount = word.split(" ").length;
				System.out.println("У вашому реченні "+ wordcount + " слів");
			}
	}break;
			case "4": {
				System.out.println("Введіть речення: ");
				words = new Scanner(System.in);
				String word = words.nextLine();
				 String[] wordsplit = word.split(" ");       
			     int[] number = new int[wordsplit.length];   
			     int count = 0;                     
			     int index = 0;                         
			     for(int i=0; i<wordsplit.length; i++) {
			        for(int i1=0; i1<wordsplit.length; i1++) {
			            if(wordsplit[i].equals(wordsplit[i1])) {
			               number[i]++; 
			                }	
			            }	
			        }
			     for(int i = 0; i < number.length; i++) {
			        if(number[i]>count) {
			              count = number[i];                 
			              index = i;                              
			            }
			        }
			    System.out.println("Найбільш вживаним словом у вашому речені є слово " + wordsplit[index]);
	}break;
	}
}
}
}