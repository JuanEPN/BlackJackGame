package blackjack.GUI_BlackJack;
import java.util.ArrayList;
import blackjack.Model_Card.Model_Card;
import blackjack.Deck_Cards.Deck_Cards;
import javax.swing.JOptionPane;

/**
 * Juan Esteban Pereira
 * Miguel Ángel Pineda
 * Alejandro Gonzalez
 */

public class GUI_BlackJack extends javax.swing.JFrame {
    Deck_Cards D1 = new Deck_Cards();
        
    public GUI_BlackJack() {
        initComponents();
        CardsVisual();
        this.setTitle("Black Jack");
        this.setLocationRelativeTo(null);
    }
    
    private void CardsVisual(){
        //Puntaje Cartas
        int puntajeC = D1.puntajeCroupier();
        int puntajeP = D1.puntajeJugador();

        String puntajeString = String.valueOf(puntajeP);
        puntajeNum.setText(puntajeString);
        
        //CartaOculta
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Cards/BACK.png")));
        
        P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Cards/BACK.png")));
        P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Cards/BACK.png")));
        //CartaCroupier
        ArrayList<Model_Card> manoCroupier = D1.manoCroupier();
        for (int i = 0; i < manoCroupier.size(); i++) {
            Model_Card carta = manoCroupier.get(i);
            String CartaCroupier = carta.toString();
            String rutaImagenC = "/blackjack/Cards/" + CartaCroupier +".png";
            if (i == 1) {
                C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenC)));
            }
        }     
        //CartaJugador
        ArrayList<Model_Card> manojugador = D1.manoJugador();
        for (int i = 0; i < manojugador.size(); i++) {
            Model_Card carta = manojugador.get(i);
            String CartaJugador = carta.toString();
            String rutaImagenP = "/blackjack/Cards/" + CartaJugador +".png";
            switch (i) {
        case 0 -> P1.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenP)));
        case 1 -> P2.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenP)));
        case 2 -> P3.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenP)));
        case 3 -> P4.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenP)));
        default -> {}
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mesa_Juego = new javax.swing.JPanel();
        Player = new javax.swing.JPanel();
        P1 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        Jugar = new javax.swing.JButton();
        NJuego = new javax.swing.JButton();
        Pedir = new javax.swing.JButton();
        puntajePanel = new javax.swing.JPanel();
        puntaje = new javax.swing.JLabel();
        puntajeNum = new javax.swing.JLabel();
        Croupier = new javax.swing.JPanel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 800));

        Mesa_Juego.setBackground(new java.awt.Color(0, 85, 51));

        Player.setBackground(new java.awt.Color(255, 255, 255));
        Player.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Jugador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        Player.setPreferredSize(new java.awt.Dimension(670, 210));

        P1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        P2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        P3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        P4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PlayerLayout = new javax.swing.GroupLayout(Player);
        Player.setLayout(PlayerLayout);
        PlayerLayout.setHorizontalGroup(
            PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        PlayerLayout.setVerticalGroup(
            PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerLayout.createSequentialGroup()
                .addGroup(PlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Jugar.setBackground(new java.awt.Color(255, 255, 255));
        Jugar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        Jugar.setForeground(new java.awt.Color(0, 0, 0));
        Jugar.setText("Jugar");
        Jugar.setToolTipText("");
        Jugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        NJuego.setBackground(new java.awt.Color(255, 255, 255));
        NJuego.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        NJuego.setForeground(new java.awt.Color(0, 0, 0));
        NJuego.setText("Nuevo Juego");
        NJuego.setToolTipText("");
        NJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NJuegoActionPerformed(evt);
            }
        });

        Pedir.setBackground(new java.awt.Color(255, 255, 255));
        Pedir.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        Pedir.setForeground(new java.awt.Color(0, 0, 0));
        Pedir.setText("Pedir");
        Pedir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedirActionPerformed(evt);
            }
        });

        puntajePanel.setBackground(new java.awt.Color(153, 8, 65));
        puntajePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        puntaje.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        puntaje.setForeground(new java.awt.Color(255, 255, 255));
        puntaje.setText("Puntaje:");

        puntajeNum.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        puntajeNum.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout puntajePanelLayout = new javax.swing.GroupLayout(puntajePanel);
        puntajePanel.setLayout(puntajePanelLayout);
        puntajePanelLayout.setHorizontalGroup(
            puntajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puntajePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puntaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntajeNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        puntajePanelLayout.setVerticalGroup(
            puntajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puntajePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(puntajePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(puntaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puntajeNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Croupier.setBackground(new java.awt.Color(255, 255, 255));
        Croupier.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Croupier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        Croupier.setPreferredSize(new java.awt.Dimension(670, 210));

        C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout CroupierLayout = new javax.swing.GroupLayout(Croupier);
        Croupier.setLayout(CroupierLayout);
        CroupierLayout.setHorizontalGroup(
            CroupierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CroupierLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CroupierLayout.setVerticalGroup(
            CroupierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CroupierLayout.createSequentialGroup()
                .addGroup(CroupierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Mesa_JuegoLayout = new javax.swing.GroupLayout(Mesa_Juego);
        Mesa_Juego.setLayout(Mesa_JuegoLayout);
        Mesa_JuegoLayout.setHorizontalGroup(
            Mesa_JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa_JuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Mesa_JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Croupier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(Mesa_JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pedir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jugar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(puntajePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        Mesa_JuegoLayout.setVerticalGroup(
            Mesa_JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa_JuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Croupier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Mesa_JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Mesa_JuegoLayout.createSequentialGroup()
                        .addComponent(Jugar)
                        .addGap(18, 18, 18)
                        .addComponent(Pedir)
                        .addGap(18, 18, 18)
                        .addComponent(NJuego)
                        .addGap(18, 18, 18)
                        .addComponent(puntajePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mesa_Juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mesa_Juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NJuegoActionPerformed
        D1.reiniciar();
        CardsVisual();
        P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Cards/BACK.png")));
        P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Cards/BACK.png")));
        Pedir.setEnabled(true);
        Jugar.setEnabled(true);
    }//GEN-LAST:event_NJuegoActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
      int puntajeC = D1.puntajeCroupier();
      int puntajeP = D1.puntajeJugador();
      ArrayList<Model_Card> manoCroupier = D1.manoCroupier();
        
      if (puntajeP > puntajeC && puntajeP <= 21) {
          for (int i = 0; i < manoCroupier.size(); i++) {
            Model_Card carta = manoCroupier.get(i);
            String CartaCroupier = carta.toString();
            String rutaImagenC = "/blackjack/Cards/" + CartaCroupier +".png";
            if (i == 0) {
                C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenC)));
            }
        }
          JOptionPane.showMessageDialog(null,"!!!HAZ GANADOOOOO!!!");
          Pedir.setEnabled(false);
          Jugar.setEnabled(false);
      }
      else if (puntajeP < puntajeC && puntajeP <= 21) {
          for (int i = 0; i < manoCroupier.size(); i++) {
            Model_Card carta = manoCroupier.get(i);
            String CartaCroupier = carta.toString();
            String rutaImagenC = "/blackjack/Cards/" + CartaCroupier +".png";
            if (i == 0) {
                C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenC)));
            }
        }
          JOptionPane.showMessageDialog(null,"!!!HAZ PERDIDO!!!");
          Pedir.setEnabled(false);
          Jugar.setEnabled(false);
      }
      else if (puntajeP > puntajeC && puntajeP >= 21) {
          for (int i = 0; i < manoCroupier.size(); i++) {
            Model_Card carta = manoCroupier.get(i);
            String CartaCroupier = carta.toString();
            String rutaImagenC = "/blackjack/Cards/" + CartaCroupier +".png";
            if (i == 0) {
                C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenC)));
            }
        }
          JOptionPane.showMessageDialog(null,"!!!HAZ PERDIDO!!!");
          Pedir.setEnabled(false);
          Jugar.setEnabled(false);
      }
      else if (puntajeP > puntajeC && puntajeP >= 21) {
          for (int i = 0; i < manoCroupier.size(); i++) {
            Model_Card carta = manoCroupier.get(i);
            String CartaCroupier = carta.toString();
            String rutaImagenC = "/blackjack/Cards/" + CartaCroupier +".png";
            if (i == 0) {
                C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaImagenC)));
            }
        }
          JOptionPane.showMessageDialog(null,"!!!HAZ PERDIDO!!!");
           Pedir.setEnabled(false);
           Jugar.setEnabled(false);
      }
        
    }//GEN-LAST:event_JugarActionPerformed

    private void PedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedirActionPerformed
        D1.pedirCarta();
        CardsVisual();
    }//GEN-LAST:event_PedirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JPanel Croupier;
    private javax.swing.JButton Jugar;
    private javax.swing.JPanel Mesa_Juego;
    private javax.swing.JButton NJuego;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JButton Pedir;
    private javax.swing.JPanel Player;
    private javax.swing.JLabel puntaje;
    private javax.swing.JLabel puntajeNum;
    private javax.swing.JPanel puntajePanel;
    // End of variables declaration//GEN-END:variables
}