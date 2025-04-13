package blackjack.Model_Card;

/**
 * Juan Esteban Pereira
 * Miguel Ángel Pineda
 * Alejandro Gonzalez
 */

public class Model_Card {
    private String valor; 
    private String tipo; 
    
    public Model_Card (String valor, String tipo){
           this.valor=valor; 
           this.tipo=tipo; 
    }
    
    public Model_Card(){
     } 

    public int getValor() {
        if ("AJQK".contains(valor)){
            if ("A".equals(valor)){
                return 11; 
            }
            return 10; 
        }
        return Integer.parseInt(valor); 
    }
    
    public boolean isAce(){
        return "A".equals(valor); 
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  valor  + "-" +  tipo ;
    }
}