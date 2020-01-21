import org.junit.Assert;
import org.junit.Test;

public class SomaTest {

    @Test
    public void testaSomaDeDoisNumerosPositivos(){
        Double numero1 = 15.0;
        Double numero2 = 15.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.soma(numero1, numero2);

        Assert.assertEquals(30.0, resultado,0.001 );

    }

    @Test
    public void testeSomaDeDoisNumerosNegativos(){
        Double numero1 = -15.0;
        Double numero2 = -1.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.soma(numero1, numero2);

        Assert.assertEquals(-16.0, resultado,0.001 );
    }
    @Test
    public void testaSomaDeUmNumeroPositivoEUmNegativo(){
        Double numero1 = 15.0;
        Double numero2 = -1.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.soma(numero1, numero2);

        Assert.assertEquals(14.0, resultado,0.001 );
    }
    @Test(expected = IllegalArgumentException.class)
    public void testaSomaDeUmNullComUmNumeroPositivo(){
        Double numero1 = 15.0;
        Double numero2 = null;

        Calculadora calculadora = new Calculadora();
        calculadora.soma(numero1, numero2);
    }

}
