package br.inf.ufg.palindromo;
import org.junit.Assert;
import org.junit.Test;


public class TestePalindromo {

	@Test
	public void deveAfirmarQueEhPalindromo() {
		Palindromo p = new Palindromo();
		String palindromo1 = "O galo ama o lago";
		String palindromo2 = "A dama admirou o rim da amada";
		String palindromo3 = "A base do teto desaba";
		
		Assert.assertTrue(p.ehPalindromo(palindromo1));
		Assert.assertTrue(p.ehPalindromo(palindromo2));
		Assert.assertTrue(p.ehPalindromo(palindromo3));
	}
	
	@Test
	public void deveNegarQueEhPalindromo() {
		Palindromo p = new Palindromo();
		String palindromo1 = "Uma frase aleatoria";
		String palindromo2 = "Teste 2";

		
		Assert.assertFalse(p.ehPalindromo(palindromo1));
		Assert.assertFalse(p.ehPalindromo(palindromo2));
		
	}
}
