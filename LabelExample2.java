package com.antoniogarciaprats.labelexample2;

import java.awt.*;
import java.awt.event.*;

public class LabelExample2 extends Frame
    implements ActionListener {
    
    TextField tf;
    Button b;
    Label l;

    LabelExample2 () {
        
        super();
        
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        l = new Label ();
        l.setBounds(50, 100, 250, 60);
        b = new Button("Encuentra la IP");
        b.setBounds(50,150,60,30);
        b.addActionListener(this); 
        
        this.add(tf);
        this.add(l);
        this.add(b);
        
        this.setSize (400,400);
        this.setTitle("Ejemplo etiqueta");
        this.setLayout(null);
        this.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {    
        try {    
        String host = tf.getText();    
        String ip = java.net.InetAddress.getByName(host).getHostAddress();    
        l.setText("IP of "+host+" is: "+ip);    
        }   
        catch (Exception ex) {  
            System.out.println(ex);  
        }    
    }    
    
    public static void main(String[] args) {
        LabelExample2 f = new LabelExample2();
    }
}
