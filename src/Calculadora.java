public class Calculadora {


    public double soma(Double numero1, Double numero2) {
        if((numero1 == null) || (numero2 == null)){
            throw new IllegalArgumentException();
        }

        return numero1+numero2;
    }

    public Double subtracao(Double numero1, Double numero2) {
        if((numero1 == null) || (numero2 == null)){
            throw new IllegalArgumentException();
        }
        return numero1 - numero2;
    }

    public Double multiplicacao(Double numero1, Double numero2) {
        if((numero1 == null) || (numero2 == null)){
            throw new IllegalArgumentException();
        }
        return numero1*numero2;
    }

    public Double divisao(Double numero1, Double numero2) {
        if((numero1 == null) || (numero2 == null)){
            throw new IllegalArgumentException();
        }
        if(numero2 == 0){
            throw new IllegalArgumentException();
        }
        return numero1/numero2;
    }
}
