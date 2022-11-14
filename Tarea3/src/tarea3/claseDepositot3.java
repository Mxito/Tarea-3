
package tarea3;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.image.ImageObserver;

class Deposito{
    private ArrayList<Bebida> D;
    public Deposito(){
      D = new ArrayList<>();
    }
    public void paint(Graphics g, int x, int y, int n){
        if(D.get(n)!= null){
        D.get(n).paint(g, x, y); 
        }
    }
    public void addBebida(Bebida a){
        D.add(a);
    }  
    public Bebida getBebidas() throws customException{
        return D.remove(0);
    }
    public ArrayList getArrayBebidas(){
        return D;
    }
    public Bebida getBebida(int n){
        return D.get(n);
    }
}

