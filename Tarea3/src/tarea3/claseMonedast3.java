
package tarea3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

abstract class Moneda{
    private final int valor;
    public abstract void paint(Graphics g);
    public Moneda(int n){
        valor = n;
    }
    public int getValor(){
        return valor;
    }
    public String toStringMoneda(){
        return "Valor: "+valor+"\nSerie:"+this.toString()+"\n";
    }
}

class Moneda100 extends Moneda{
    public Moneda100(){
        super(100);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(50, 260, 10, 20);
    }
}

class Moneda500 extends Moneda{
    public Moneda500(){
        super(500);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(50, 230, 10, 20);
    }
}

class Moneda1000 extends Moneda{
    public Moneda1000(){
        super(1000);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(50, 200, 10, 20);
    }
}

