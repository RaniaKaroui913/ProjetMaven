package metier;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProduit {

	@Test
	public void test() {
		double a=5;
		double b=8;
		double expected=40;
		Produit p=new Produit();
		double res=p.produit(a,b);/* j'appelle ue methode qui s'appelle produit qui recoit a et b */
		assertEquals(expected, res , 0.001);/*c'est un test unitaire */
		
	}

}
