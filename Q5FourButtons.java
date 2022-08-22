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
public class Q5FourButtons {
     Q5FourButtons (){
        Frame f=new Frame("Hello World");
        
        Button b1=new Button("One");
        Button b2=new Button("Two");
        Button b3=new Button("Three");
        Button b4=new Button("Four");
        b1.setBounds(30,80,80,30);
        b2.setBounds(120,80,80,30);
        b3.setBounds(30,120,80,30);
        b4.setBounds(120,120,80,30);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        Q5FourButtons f=new Q5FourButtons();
}
}
