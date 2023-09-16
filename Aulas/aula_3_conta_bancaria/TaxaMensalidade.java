package aula_3_conta_bancaria;

import java.time.LocalDateTime;

public class TaxaMensalidade {
    public LocalDateTime currentTime = LocalDateTime.now();
    public int month = currentTime.getMonthValue();
    public int yearAccountWasCreated = 2023;
    public int monthAccountWasCreated = 9;
    public int lastMonthCharged = 0;
    public int lastYearCharged = 0;
    public int lastMonthAdded = 0;
    public int lastYearAdded = 0;
    private double monthlyTax = 12.5;

    public boolean chargeTax(BankAccount account) {
        if (account.getActive()) {
            if (this.month == this.lastMonthCharged) { //Se esse mês for igual ao ultimo mês de cobrança , não é cobrada nenhuma taxa
                return false;
            }
            if (this.lastMonthCharged == 0) { //Se ainda não houver um último mês de cobrança , ele é definido como o mês em que a conta foi criada
                this.lastMonthCharged = this.monthAccountWasCreated;
            }
            if (this.lastYearCharged == 0) {//Se ainda não houver um último ano de cobrança , ele é definido como o ano em que a conta foi criada
                this.lastYearCharged = this.yearAccountWasCreated;
            }
            int timesToCharge = this.month - this.lastMonthCharged;//Calcularemos as vezes à serem cobradas a taxa a partir da diferença entre o mês atual e o último mês em que foi cobrado a taxa -
            if (this.currentTime.getYear() != this.lastYearCharged) { // Se o ano atual for diferente do último ano em que foi realizada uma cobrança, precisamos realizar um cálculo diferente para calcular o número->
                timesToCharge += 12;// somamos o resto das vezes à serem cobradas a 12, e assim obteremos o número de meses a serem cobrados corretamente.
                account.setBalance(-(timesToCharge * this.monthlyTax));
                System.out.println("Uma taxa de manuntencao de " + (this.monthlyTax * timesToCharge) + " foi reduzida da sua conta.");
                this.lastMonthCharged = this.month; //Definimos o mês atual como o último mês de cobrança.
            } else { //Caso o ano não seja diferente, calcumos as vezes a serem cobradas a partir da diferença entre o mês atual e o último mês que foi cobrado.
                this.lastMonthCharged = this.month;
                account.setBalance(-(timesToCharge * this.monthlyTax));
                System.out.println("Uma taxa de manuntencao de " + (this.monthlyTax * timesToCharge) + " foi reduzida da sua conta.");
                return true;
            }
            return true;
        } else {
            System.out.println("Erro! Conta inativa ou inexistente!");
            return false;
        }
    }

    public boolean addFee(BankAccount account) {
        if (account.getActive()) {
            if (this.month == this.lastMonthAdded) {
                return false;
            }
            if (this.lastMonthAdded == 0) {
                this.lastMonthAdded = this.monthAccountWasCreated;
            }
            if (this.lastYearAdded == 0) {
                this.lastYearAdded = this.yearAccountWasCreated;
            }
            int timesToAdd = this.month - this.lastMonthAdded;
            if (this.currentTime.getYear() != this.lastYearAdded) {
                timesToAdd += 12;
                account.setBalance((timesToAdd * account.getBalance() / 99));
                System.out.println("Uma taxa de juros de - " + (account.getBalance() * timesToAdd) + " - foi adicionada a sua conta.");
                this.lastMonthAdded = this.month;
            } else {
                this.lastMonthAdded = this.month;
                System.out.println("Uma taxa de juros de - " + ((timesToAdd * ((int) Math.round(account.getBalance() / 99)))) + " - foi adicionada a sua conta.");
                account.setBalance((timesToAdd * ((int) Math.round(account.getBalance() / 99))));
                return true;
            }
            return true;
        }else{
            return false;
        }
    }
}


