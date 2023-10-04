package aula_8_exercicio3_teste_unitario;


import org.junit.Assert;
import org.junit.Test;



public class CalculadoraTeste {
    @Test
    public void adicionar() {
        Calculadora calculadora = new Calculadora(); //Preparação

        int adicao = calculadora.adicao(2, 6); //Ação

        Assert.assertEquals(8, adicao); //Verificação
    }

    @Test
    public void subtrair() {
        Calculadora calculadora = new Calculadora(); //Preparação

        int subtracao = calculadora.subtracao(1,4); //Ação

        Assert.assertEquals(-3, subtracao); //Verificação
    }

    @Test
    public void multiplicar() {
        Calculadora calculadora = new Calculadora(); //Preparação

        int multiplicacao = calculadora.multiplicacao(3,6); //Ação

        Assert.assertEquals(18, multiplicacao); //Verificação
    }

    @Test
    public void dividir() {
        Calculadora calculadora = new Calculadora(); //Preparação

        int divisao = calculadora.divisao(18,2); //Ação

        Assert.assertEquals(9, divisao); //Verificação
    }

    @Test
    public void raizQuadrada() {
        Calculadora calculadora = new Calculadora(); //Preparação

        double sqrt = calculadora.raizQuadrada(9.0); //Ação

        Assert.assertEquals(3.0, sqrt, 0.001); //Verificação
    }

    @Test
    public void potenciacao() {
        Calculadora calculadora = new Calculadora(); //Preparação

        double potencia = calculadora.potenciacao(2,5); //Ação

        Assert.assertEquals(32,potencia, 0.001); //Verificação
    }
}
