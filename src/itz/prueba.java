package itz;

import javax.swing.JOptionPane;
public class prueba {
    public static void main(String[] args) {
        prueba n=new prueba();
    }
    public prueba(){
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un numero"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un numero"));
        int sum=suma(x, y);
        JOptionPane.showMessageDialog(null,sum);
    }
    public int suma(int x,int y){
        return x+y;
    }
}
