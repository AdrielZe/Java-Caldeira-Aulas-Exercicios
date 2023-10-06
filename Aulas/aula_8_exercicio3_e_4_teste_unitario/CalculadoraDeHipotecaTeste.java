package aula_8_exercicio3_e_4_teste_unitario;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraDeHipotecaTeste {
    @Test
    public void hipoteca(){
        CalculadoraDeHipoteca hipotecaTeste = new CalculadoraDeHipoteca(2278,15,6);

        double valorPorMes = hipotecaTeste.calculaHipoteca(hipotecaTeste.getValorDoEmprestimo(), hipotecaTeste.getTaxaDeJurosAnual(), hipotecaTeste.getAnosParaPagar());

        Assert.assertEquals(60.1138888, valorPorMes, 0.001);
    }
}
