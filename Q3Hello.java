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
public class Q3Hello {
    Q3Hello(){
        Frame f=new Frame("Hello World");
        
        Button b=new Button("Hello");
        b.setBounds(30,80,90,30);
        f.add(b);
        
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        Q3Hello f=new Q3Hello();
    }
}
