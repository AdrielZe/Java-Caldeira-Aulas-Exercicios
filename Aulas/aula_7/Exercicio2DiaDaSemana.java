package aula_7;

public enum Exercicio2DiaDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO;

    public static void escolherDiaDaSemana(Exercicio2DiaDaSemana dia){
        if (dia.equals(Exercicio2DiaDaSemana.SEGUNDA)){
            System.out.println("Hoje é segunda e é dia de SEGUNDA DO DALE!!! Aproveita.");
        } else if (dia.equals(Exercicio2DiaDaSemana.TERCA)){
            System.out.println("Hoje é terça e você tem AULA NO CALDEIRA, aproveite!!");
        } else if (dia.equals(Exercicio2DiaDaSemana.QUARTA)){
            System.out.println("Hoje é quarta e você tem AULA COM O SEBRAE :)");
        } else if (dia.equals(Exercicio2DiaDaSemana.QUINTA)){
            System.out.println("Hoje é quinta e você tem AULA NO CALDEIRA, aproveite!!");
        } else if (dia.equals(Exercicio2DiaDaSemana.SEXTA)){
            System.out.println("Hoje é sexta e você náo tem aula com o Caldeira :(, vai codar!!");
        } else if (dia.equals(Exercicio2DiaDaSemana.SABADO)){
            System.out.println("Hoje é sábado, CODE!!");
        } else if (dia.equals(Exercicio2DiaDaSemana.DOMINGO)){
            System.out.println("Hoje é domingo, DESCANSE!!!");
        }
     }

}

