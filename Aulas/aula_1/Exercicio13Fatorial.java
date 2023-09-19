package Aula_1;

public class Exercicio13Fatorial {
    public static int calculateFactorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * calculateFactorial(n-1);
        }
    }
}
