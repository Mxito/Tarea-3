
package tarea3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JButton;

abstract class Moneda{
    private final int valor;
    public abstract void paint(Graphics g,int x, int y);
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
class Moneda500 extends Moneda{
    public Moneda500(){
        super(500);
    }
    
    @Override
    public void paint(Graphics g, int x , int y) {
        g.setColor(Color.yellow);
        g.fillRoundRect(x, y, 20, 5, 10, 10);
    }
}

class Moneda1000 extends Moneda{
    public Moneda1000(){
        super(1000);
    }
    @Override
    public void paint(Graphics g, int x , int y) {
        g.setColor(Color.green);
        g.fillRoundRect(x, y, 20, 5, 10, 10);
    }
}
class Moneda100 extends Moneda{
    public Moneda100(){
        super(100);
    }
    @Override
    public void paint(Graphics g, int x , int y) {
        g.setColor(Color.lightGray);
        g.fillRoundRect(x, y, 20, 5, 10, 10);
    }
}

