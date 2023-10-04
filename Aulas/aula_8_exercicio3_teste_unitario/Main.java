package aula_8_exercicio3_teste_unitario;


public class Main {
    public static void main(String[] args) {
        CalculadoraDeHipoteca hipoteca = new CalculadoraDeHipoteca(2278,15,6); //total 1400, ~ 29.16666668 por mês
        System.out.println(hipoteca.calculaHipoteca(hipoteca.getValorDoEmprestimo(), hipoteca.getTaxaDeJurosAnual(), hipoteca.getAnosParaPagar()));
        }
    }
