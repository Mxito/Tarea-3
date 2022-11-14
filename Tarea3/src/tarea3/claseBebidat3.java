package tarea3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

abstract class Bebida{
   public abstract String tipoBebida();
   public abstract void paint(Graphics g, int x, int y);
   private int serie;
   public Bebida (int numSerie){
       serie = numSerie;
   }
    public String getSerie() {
        return serie+"";
    }
    
}

class CocaCola extends Bebida{
    private Image coca;
    public CocaCola(int numSerie){
        super(numSerie);
        coca = new ImageIcon("coke.png").getImage();
    }
    @Override
    public void paint(Graphics g, int x, int y) {
        g.drawImage(coca, x, y, 25, 55, null);
    }
    @Override
    public String tipoBebida(){
        return "Coca-Cola";
    }
}

class Sprite extends Bebida{
    private Image esprait;
    public Sprite(int numSerie){
        super(numSerie);
        esprait = new ImageIcon("sprite.png").getImage();
    }
    @Override
    public void paint(Graphics g, int x, int y) {
        g.drawImage(esprait, x, y, 25, 55, null);
    }
    @Override
    public String tipoBebida(){
        return "Sprite";
    }
}
class Fanta extends Bebida{
    private Image phanta;
    public Fanta(int numSerie){
        super(numSerie);
        phanta = new ImageIcon("fanta.png").getImage();
    }
    @Override
     public void paint(Graphics g, int x, int y) {
        g.drawImage(phanta, x, y, 25, 55, null);
        g.fill3DRect(x, y+25, 25, 10, true);
        g.drawString(this.getSerie(), x, y);
    }
    @Override
    public String tipoBebida(){
        return "Fanta";
    }
}

