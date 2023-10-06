package aula_7;

public enum Exercicio4Enum implements Exercicio4Calculavel {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;

    public static double realizaOperacao(Exercicio4Enum operacao, int n1, int n2){
        switch (operacao){
            case SOMA -> {
                return Exercicio4Calculavel.sum(n1,n2);
            }
            case SUBTRACAO -> {
                return Exercicio4Calculavel.subtract(n1,n2);
            }
            case MULTIPLICACAO -> {
                return Exercicio4Calculavel.multiply(n1,n2);
            }
            case DIVISAO ->{
                return Exercicio4Calculavel.divide(n1,n2);
            }
            default -> {
                return 0;
            }
        }
    }
}
