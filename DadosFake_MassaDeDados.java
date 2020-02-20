// Sites para aprender a usar:
// 
// https://java-faker.herokuapp.com/
// https://java-faker.herokuapp.com/
// 
// Git hub: https://github.com/DiUS/java-faker
// 
// MVN: https://mvnrepository.com/artifact/com.github.javafaker/javafaker
// 
// 
// Formas de uso:


	//Coloco a linguagem que Eu quero usar
	Faker DadosFake = new Faker(new Locale("pt-BR"));
	
	//Determino os campos e atribuo strings a eles
	String NomeProduto = DadosFake.commerce().productName();
	String DataValidade = DadosFake.code().ean8();
	String PrecoProduto = DadosFake.commerce().price(0,2).replace(",", ".");