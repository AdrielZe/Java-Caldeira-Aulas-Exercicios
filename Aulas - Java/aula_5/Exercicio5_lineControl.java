package aula_5;

import java.util.LinkedList;

public class Exercicio5_lineControl {
    public String getFirstDocumentOfLine(LinkedList<Object> printingLine){
        for(Object o : printingLine){
            Exercicio5_document firstDocument = (Exercicio5_document) o;
            return firstDocument.getNameOfOwner();
        }
        return "A fila está vazia.";
    };

}
