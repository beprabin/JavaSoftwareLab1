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
public class Q6Textarea {
    Q6Textarea(){
        Frame f=new Frame();
        
        Label l=new Label("User ID");
        TextField t=new TextField();
        l.setBounds(20,80,80,20);
        t.setBounds(110,80,100,20);
        f.add(l);
        f.add(t);
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] agrs){
        Q6Textarea f=new Q6Textarea();
    }
}
