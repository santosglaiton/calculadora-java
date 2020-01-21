import org.junit.Assert;
import org.junit.Test;

public class MultiplicacaoTest {
    
    @Test
    public void testaMultiplicacaoDeDoisNumerosPositivos(){
        
        Double numero1 = 10.0;
        Double numero2 = 5.0;
        
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.multiplicacao(numero1,numero2);

        Assert.assertEquals(50.0,resultado,0.001);
    }

    @Test
    public void testaMultiplicacaoDeDoisNumerosNegativos(){
        Double numero1 = -10.0;
        Double numero2 = -5.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.multiplicacao(numero1,numero2);

        Assert.assertEquals(50.0,resultado,0.001);
    }

    @Test
    public void testaMultiplicacaoDeUmNumeroNegativoEUmPositivo(){
        Double numero1 = -10.0;
        Double numero2 = 5.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.multiplicacao(numero1,numero2);

        Assert.assertEquals(-50.0,resultado,0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaMultiplicacaoDeNullComUmNumero(){
        Double numero1 = null;
        Double numero2 = 5.0;

        Calculadora calculadora = new Calculadora();
        calculadora.multiplicacao(numero1,numero2);
    }
    
}
