package blackjack.Deck_Cards;
import java.util.ArrayList; 
import blackjack.Model_Card.Model_Card; 
import java.util.Random;

/**
 * Juan Esteban Pereira
 * Miguel Ángel Pineda
 * Alejandro Gonzalez
 */

public final class Deck_Cards {
    
    public Deck_Cards(){
           iniciar(); 
        }
    public static ArrayList<Model_Card> mazo = new ArrayList(); 
    Random random= new Random(); 
    
    ArrayList<Model_Card> Croupier; 
    int CroupierSuma; 
    int CroupierAcecuenta; 
    
    ArrayList<Model_Card> manojugador;
    int sumajugador; 
    int cuentaAcejugador;   
    
    public void reiniciar(){
        manojugador.clear();
        iniciar();
    }
    
    public void iniciar(){
        construirmazo(); 
        barajar(); 
        //Cartas del anfitrion 
        Croupier=new ArrayList<>(); 
        CroupierSuma=0; 
        CroupierAcecuenta=0; 
                
        Model_Card carta = mazo.remove(mazo.size()-1); 
        
        for (int i= 0; i< 2; i++){
            carta = mazo.remove(mazo.size()-1); 
            CroupierSuma += carta.getValor(); 
            CroupierAcecuenta +=  carta.isAce() ? 1 : 0; 
            Croupier.add(carta); 
        }
        
        System. out.println("Croupier: ");  
        System. out.println(Croupier); 
        System. out.println(CroupierSuma); 
        System. out.println(CroupierAcecuenta); 
        
        //cartas del jugador; 
        manojugador= new ArrayList<>(); 
        sumajugador=0; 
        cuentaAcejugador=0; 
        
        for (int i= 0; i< 2; i++){
            carta = mazo.remove(mazo.size()-1); 
            sumajugador += carta.getValor(); 
            cuentaAcejugador +=  carta.isAce() ? 1 : 0; 
            manojugador.add(carta); 
        }
        
        System. out.println("Jugador: "); 
        System. out.println(manojugador); 
        System. out.println(sumajugador); 
        System. out.println(cuentaAcejugador); 
       
    } 
    public void pedirCarta (){
        if (manojugador.size() < 4) {
            Model_Card carta = mazo.remove(mazo.size() - 1);
            sumajugador += carta.getValor();
            cuentaAcejugador += carta.isAce() ? 1 : 0;
            manojugador.add(carta);
        }
    }
    
    public ArrayList<Model_Card> manoJugador() {
    return manojugador;
    }
    public ArrayList<Model_Card> manoCroupier() {
    return Croupier;
    }

    public int puntajeJugador(){
        return sumajugador;
    }
    public int puntajeCroupier(){
        return CroupierSuma;
    }
   
    public void construirmazo(){
        String[] valores= {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; 
        String[] tipos= {"C", "D", "H", "S"};  
        for (String tipo : tipos) {
            for (String valore : valores) {
                Model_Card carta = new Model_Card(valore, tipo);
                mazo.add(carta);
            }
        }
        System. out.println("Mazo creado: "); 
        System. out.println(mazo ); 
        
    }

    private void barajar() {
        for (int i=0; i<mazo.size(); i++){
            int j=random.nextInt(mazo.size()); 
            Model_Card cCard= mazo.get(i); 
            Model_Card randomCarta=mazo.get(j); 
            mazo.set(i, randomCarta); 
            mazo.set(j, cCard); 
            
        }
        System.out.println("Después de barajar:");  
        System.out.println(mazo); 
    }
}