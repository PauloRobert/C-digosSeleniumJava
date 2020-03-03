package br.com.apippv.massaDados;

/*Inclua a Lib // https://java-faker.herokuapp.com/ em seu código*/


import java.util.Locale;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.github.javafaker.Faker;

@FixMethodOrder(MethodSorters.DEFAULT)
public class GeracaoMassaDados {

	Faker DadosFake = new Faker(new Locale("pt-BR"));

	@Test
	public String nomeEmpresa() {
		String nomeEmpresa = DadosFake.company().name();
		return nomeEmpresa;
	}

	@Test
	public String  NomeCidade() {
		String NomeCidade = DadosFake.address().cityName();
		return NomeCidade;
	}
	@Test
	public String  NomeCompleto() {
		String NomeCompleto = DadosFake.name().fullName();
		return NomeCompleto;
	}
	@Test
	public String  primeiroNome() {
		String primeiroNome = DadosFake.name().firstName();
		return primeiroNome;
	}
	@Test
	public String  sobreNome() {
		String sobreNome = DadosFake.name().lastName();
		return sobreNome;
	}

	@Test
	public String  DataNascimentoLong() {
		String DataNascimentoLong = DadosFake.code().ean8();
		return DataNascimentoLong;

	}
	
	@Test
	public String  DataNascimento() {
		String DataNascimento = DadosFake.business().creditCardExpiry();
		return DataNascimento;

	}

	@Test
	public String  hashMD5() {
		String hashMD5 = DadosFake.crypto().md5();
		return hashMD5;

	}

	@Test
	public String  numeroCartaoCredito() {
		String numeroCartaoCredito = DadosFake.business().creditCardNumber();
		String numeroCartaoCredito2 = DadosFake.finance().creditCard();
		return numeroCartaoCredito2;
	}

	@Test
	public String  TelefoneCelular() {
		String numeroCelular = DadosFake.phoneNumber().cellPhone();
		return numeroCelular;
	}

	@Test
	public String  TelefoneFixo() {

		String TelefoneFixo = DadosFake.phoneNumber().phoneNumber();
		return TelefoneFixo;

	}

	@Test
	public String  nomePais() {
		String nomePais = DadosFake.address().country();
		return nomePais;
	}

	@Test
	public String  nomeProduto() {
		String nomeProduto = DadosFake.commerce().productName();
		return nomeProduto;
	}

	@Test
	public String  precoProduto() {
		String precoProduto = DadosFake.commerce().price(999, 2)
				.replace(",", ".");
		return precoProduto;
	}

	@Test
	public String  email() {
		String email = DadosFake.internet().emailAddress();
		return email;
	}

	@Test
	public String  emailFalso() {
		String emailFalso = DadosFake.internet().safeEmailAddress();
		return emailFalso;
	}

	@Test
	public String  emailParcial() {
		String emailParcial = DadosFake.internet().emailAddress("Paulo");
		return emailParcial;
	}

	@Test
	public String  Habilidades() {
		String Habilidades = DadosFake.job().keySkills();
		return Habilidades;
	}

	@Test
	public String  loremIpsum() {
		String loremIpsum = DadosFake.lorem().paragraph(2);
		return loremIpsum;
	}

	@Test
	public String  tipoSanguineo() {
		String tipoSanguineo = DadosFake.name().bloodGroup();
		return tipoSanguineo;
	}

	@Test
	public String  username() {
		String username = DadosFake.name().username();
		return username;
	}

	@Test
	public String  digito() {
		//String digito = DadosFake.number().digit();
		String digito = DadosFake.idNumber().valid();
		return digito;
	}
	
	@Test
	public String  Codigo10Digitos() {
		String Codigo10Digitos = DadosFake.code().isbn10();
		return Codigo10Digitos;
	}

}
