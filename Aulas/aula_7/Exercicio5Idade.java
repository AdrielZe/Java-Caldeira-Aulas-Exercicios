package aula_7;

public class Exercicio5Idade {
    public void verificaIdade(int idade){
        if(idade < 0 || idade > 150){
            throw new Exercicio5IdadeInvalidaException("Que isso ?? A sua idade está errada");
        } else{
            System.out.println("Ok, tudo certo!");
        }
    }
}
