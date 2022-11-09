package tarea3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
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
        ImageObserver observer = new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
               return true;
            }
        };
        g.drawImage(coca, 100, 350, 25, 55, observer);
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
    public void paint(Graphics g){

        ImageObserver observer = new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
               return true;
            }
        };
        g.drawImage(esprait, 100, 280, 25, 55, observer);
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
    public void paint(Graphics g){

        ImageObserver observer = new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
               return true;
            }
        };
        g.drawImage(phanta, 100, 200, 25, 55, observer);
    }
    @Override
    public String tipoBebida(){
        return "Fanta";
    }
}
