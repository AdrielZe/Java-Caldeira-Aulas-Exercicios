package aula_7;

public enum exercicio4Enum implements exercicio4Calculavel {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;

    public static double realizaOperacao(exercicio4Enum operacao, int n1,int n2){
        switch (operacao){
            case SOMA -> {
                return exercicio4Calculavel.sum(n1,n2);
            }
            case SUBTRACAO -> {
                return exercicio4Calculavel.subtract(n1,n2);
            }
            case MULTIPLICACAO -> {
                return exercicio4Calculavel.multiply(n1,n2);
            }
            case DIVISAO ->{
                return exercicio4Calculavel.divide(n1,n2);
            }
            default -> {
                return 0;
            }
        }
    }
}
