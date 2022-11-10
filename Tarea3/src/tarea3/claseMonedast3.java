
package tarea3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
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
class Moneda500 extends Moneda{
    private Image m500;
    public Moneda500(){
        super(500);
        m500 = new ImageIcon("moneda500.png").getImage();
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(m500, 50, 140, 50, 50, null);
    }
}

class Moneda1000 extends Moneda{
    private Image m1000;
    public Moneda1000(){
        super(1000);
         m1000 = new ImageIcon("moneda1000.png").getImage();
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(m1000, 50, 200, 50, 50, null);
    }
}
class Moneda100 extends Moneda{
    private Image m100;
    public Moneda100(){
        super(100);
        m100 = new ImageIcon("moneda100.png").getImage();
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(m100, 50, 260, 50, 50, null);
    }
}

