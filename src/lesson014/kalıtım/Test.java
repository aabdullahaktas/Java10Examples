package lesson014.kalıtım;

public class Test {
	public static void main(String[] args) {
//		Pokemon pokemon1 = new Pokemon();
//		pokemon1.setAd("charizard");
//		pokemon1.setGuc(5000);
//		pokemon1.setCan(350);
//		pokemon1.setSeviye(3);
//		pokemon1.setTur	("ates");
//		
//		ElektrikPokemon pokemon3 = new ElektrikPokemon();
//		pokemon1.setAd("charizard");
//		pokemon1.setGuc(5000);
//		pokemon1.setCan(350);
//		pokemon1.setSeviye(3);
//		pokemon1.setTur	("elektrik");
//		
//		SuPokemon pokemon4 = new  SuPokemon();
//		pokemon4.setAd("charizard");
//		pokemon4.setGuc(5000);
//		pokemon4.setCan(350);
//		pokemon4.setSeviye(3);
//		pokemon4.setTur	("elektrik");
		
		
		AtesPokemonu pokemon4 = new AtesPokemonu("Charizad", 350, 3, 5000, "ates", 650);
		
		pokemon4.saldir();
		pokemon4.pokedex();
		
		SuPokemon suPokemonu = new SuPokemon("squirtle", 500, 5, 5500, "su", 100, 100);
		
		
		
	}
}
