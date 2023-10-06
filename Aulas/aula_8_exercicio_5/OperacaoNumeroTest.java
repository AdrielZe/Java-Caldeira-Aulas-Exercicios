package aula_8_exercicio_5;


import org.junit.Assert;
import org.junit.Test;

public class OperacaoNumeroTest {
    @Test
    public void testaSoma(){
        OperacaoNumero operacao = new OperacaoNumero(); //Preparação
        int[] numerosParaSomar = {2, 7, 4, 3};

        int soma = operacao.somarNumeros(numerosParaSomar);// Ação

        Assert.assertEquals(16,soma); //Verificação
    }

    @Test
    public void testaEhPar(){
        OperacaoNumero operacao = new OperacaoNumero(); //Preparação

        boolean yesOrNo = operacao.ehPar(2) ;// Ação

        Assert.assertEquals(true,yesOrNo); //Verificação
    }

    @Test
    public void testaCalcularFatorial(){
        OperacaoNumero operacao = new OperacaoNumero(); //Preparação

        int fatoracao = operacao.calcularFatorial(4) ;// Ação

        Assert.assertEquals(24,fatoracao); //Verificação
    }

    @Test (expected = IllegalArgumentException.class) //Verificação
    public void testaExcecaoDoCalcularFatorial(){
        OperacaoNumero operacao = new OperacaoNumero(); //Preparação

        operacao.calcularFatorial(-1) ;// Ação
    }

    @Test
    public void testaEhPalindromo(){
        OperacaoNumero operacao = new OperacaoNumero();

        boolean yesOrNo = operacao.ehPalindromo("Asa");

        Assert.assertEquals(true,yesOrNo);
    }

    @Test
    public void testaCalcularFibonacci() {
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        int fibonacci = operacaoNumero.calcularFibonacci(6);

        Assert.assertEquals(8,fibonacci);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testaExcecacoDaCalcularFibonacci(){
        OperacaoNumero operacaoNumero = new OperacaoNumero();

        operacaoNumero.calcularFibonacci(-1);
    }
}