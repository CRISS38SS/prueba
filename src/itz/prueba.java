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
        int res=resta(x, y);
        int mult=multiplicacion(x,y);
        JOptionPane.showMessageDialog(null,"la suma es "+sum+", la resta es "+res+" y la multiplicacion es "+mult);
    }
    public int suma(int x,int y){
        return x+y;
    }

    public int resta(int x, int y){
        return x-y;
    }

    public int multiplicacion(int x, int y){
        return x*y;
    }
}
