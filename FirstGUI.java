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
public class FirstGUI {
    FirstGUI(){
        Frame f=new Frame("My First GUI Program");
        f.setSize(600,400);
        f.setVisible(true);
    }
    public static void main(String[] args){
        FirstGUI w =new FirstGUI();
    }           
}
