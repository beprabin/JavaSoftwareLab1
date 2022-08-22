/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.*;

/**
 *
 * @author USER
 */
public class Q4ThreeButtons {
    Q4ThreeButtons (){
        Frame f=new Frame("Hello World");
        
        Button b1=new Button("Apple");
        Button b2=new Button("Orange");
        Button b3=new Button("Guava");
        b1.setBounds(30,80,80,30);
        b2.setBounds(120,80,80,30);
        b3.setBounds(210,80,80,30);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        Q4ThreeButtons f=new Q4ThreeButtons();
    }
}
