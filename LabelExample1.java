package com.antoniogarciaprats.labelexample1;

import java.awt.*;

public class LabelExample1 extends Frame {
    
    LabelExample1 () {
        
        super ();
        
        Label l1 = new Label("Primera etiqueta");
        Label l2 = new Label("Segunda etiqueta");
        
        l1.setBounds(50,100,100,30);
        l2.setBounds(50,150,100,30);
        
        this.add(l1);
        this.add(l2);
        
        this.setTitle("Ejemplo Etiqueta 1");
        this.setSize(330, 290);
        this.setLayout(null);
        this.setVisible(true);
        
    }

    public static void main(String[] args) {
        LabelExample1 f = new LabelExample1();
    }
}
