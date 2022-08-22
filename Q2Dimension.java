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
public class Q2Dimension {
    Q2Dimension(){
      Frame f=new Frame("My First GUI Program");
      Dimension d=new Dimension(600,400);
      f.setSize(d);
      f.setVisible(true);
  }
  public static void main(String[] args){
      new Q2Dimension();
  }           
}
