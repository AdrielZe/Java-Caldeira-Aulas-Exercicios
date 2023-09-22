package aula_5;

public class Exercicio5_document {
    private String nameOfOwner;
    private int pageNumbers;

    public Exercicio5_document(String nameOfOwner, int pageNumbers) {
        this.nameOfOwner = nameOfOwner;
        this.pageNumbers = pageNumbers;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }
}
