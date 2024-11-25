package ejercicio2;

public class Card {
//Establecemos la clase "Card"
	
	public String suit;
	public String value;
	//Introducimos las variables 
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	//Le damos un valor a las variables introducidas
	
	public String toString () {
		return (this.suit+"-"+this.value);
	}
	//Devolvemos las variabless
}
