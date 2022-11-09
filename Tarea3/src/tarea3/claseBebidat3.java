package tarea3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

abstract class Bebida{
   public abstract String tipoBebida();
   public abstract void paint(Graphics g);
   private int serie;
   public Bebida (int numSerie){
       serie = numSerie;
   }
    public int getSerie() {
        return serie;
    }
    
}

class CocaCola extends Bebida{
    private Image coca;
    public CocaCola(int numSerie){
        super(numSerie);
        coca = new ImageIcon("coke.png").getImage();
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(100, 260, 10, 20);
    }
    @Override
    public String tipoBebida(){
        return "Coca-Cola";
    }
}
class Sprite extends Bebida{
    public Sprite(int numSerie){
        super(numSerie);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(100, 230, 10, 20);
    }
    @Override
    public String tipoBebida(){
        return "Sprite";
    }
}
class Fanta extends Bebida{
    public Fanta(int numSerie){
        super(numSerie);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(100, 200, 10, 20);
    }
    @Override
    public String tipoBebida(){
        return "Fanta";
    }
}
