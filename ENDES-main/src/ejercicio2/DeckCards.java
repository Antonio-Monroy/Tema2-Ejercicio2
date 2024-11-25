package ejercicio2;

import java.util.ArrayList;
//Importamos la función "ArrayList" del paquete "java.util"

public class DeckCards {

	public static void main(String[] args) {
		//Escribimos el método principal de la clase

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		ArrayList<Card> deck = new ArrayList<Card>();
		//Introducimos las variables

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
			//Hacemos un bucle para generar una carta
		}

		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		//Hacemos otro bucle para almacenar las cartas en la baraja

		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}
		//Finalmente hacemos un último bucle para mostrar por pantalla la baraja de cartas

	}

}
