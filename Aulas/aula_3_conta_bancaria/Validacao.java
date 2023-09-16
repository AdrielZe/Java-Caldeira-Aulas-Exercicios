package aula_3_conta_bancaria;

public class Validacao {
    private int n = 0;
    private int j = 10;

    public boolean validaCpf(String cpf){
        if(cpf.length() != 11   ||
           cpf.equals("11111111111") ||
           cpf.equals("22222222222") ||
           cpf.equals("33333333333") ||
           cpf.equals("44444444444") ||
           cpf.equals("55555555555") ||
           cpf.equals("66666666666") ||
           cpf.equals("77777777777") ||
           cpf.equals("88888888888") ||
           cpf.equals("99999999999")
        ){
            return false;
        } else {
            for (int i = 0; i < 9; i++) {
                this.n += Character.getNumericValue(cpf.charAt(i)) * this.j;
                this.j--;
            }
            this.n = (this.n * 10) % 11;
            int firstDigit = this.n;
            if (firstDigit != Character.getNumericValue(cpf.charAt(9))) {
                return false;
            }
            this.j = 11;
            this.n = 0;
            for (int i = 0; i < 10; i++) {
                this.n += Character.getNumericValue(cpf.charAt(i)) * this.j;
                this.j--;
            }
            this.n = (this.n * 10) % 11;
            int secondDigit = this.n;
            this.j = 10;
            this.n = 0;
            return secondDigit == Character.getNumericValue(cpf.charAt(10));
        }
    }
}
