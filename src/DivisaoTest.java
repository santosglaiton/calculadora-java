import org.junit.Assert;
import org.junit.Test;

public class DivisaoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testaDivisaoComUmPositivoEUmZero(){

        Double numero1 = 10.0;
        Double numero2 = 0.0;

        Calculadora calculadora = new Calculadora();
        calculadora.divisao(numero1, numero2);
    }

    @Test
    public void testaDivisaoDeDoisNumerosPositivos(){
        Double numero1 = 10.0;
        Double numero2 = 5.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.divisao(numero1, numero2);

        Assert.assertEquals(2.0, resultado, 0.001 );
    }

    @Test
    public void testaDivisaoDeDoisNumerosNegativos(){
        Double numero1 = -10.0;
        Double numero2 = -5.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.divisao(numero1, numero2);

        Assert.assertEquals(2.0, resultado, 0.001 );
    }

    @Test
    public void testaDivisaoDeUmNumeroPositivoEUmNegativo(){
        Double numero1 = -10.0;
        Double numero2 = 5.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.divisao(numero1, numero2);

        Assert.assertEquals(-2.0, resultado, 0.001 );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaDivisaoDeNullComUmNumero(){
        Double numero1 = null;
        Double numero2 = 5.0;

        Calculadora calculadora = new Calculadora();
        calculadora.divisao(numero1, numero2);
    }



}
