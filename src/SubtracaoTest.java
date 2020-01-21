import org.junit.Assert;
import org.junit.Test;

public class SubtracaoTest {

    @Test
    public void testaSubtracaoDeDoisNumerosPositivos() {
        Double numero1 = 20.0;
        Double numero2 = 15.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.subtracao(numero1, numero2);
        Assert.assertEquals(5.0, resultado, 0.001);
    }

    @Test
    public void testaSubtracaoDeDoisNumerosNegativos(){
        Double numero1 = -20.0;
        Double numero2 = -5.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.subtracao(numero1, numero2);
        Assert.assertEquals(-15.0, resultado, 0.001);
    }

    @Test
    public void testaSubtracaoDeUmNumeroPositivoEUmNegativo(){
        Double numero1 = -20.0;
        Double numero2 = 5.0;

        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.subtracao(numero1, numero2);
        Assert.assertEquals(-25.0, resultado, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaSubtracaoDeDoisNulls(){
        Double numero1 = null;
        Double numero2 = null;

        Calculadora calculadora = new Calculadora();
        calculadora.subtracao(numero1, numero2);
    }
}