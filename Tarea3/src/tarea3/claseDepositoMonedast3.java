
package tarea3;
import java.awt.Graphics;
import java.util.ArrayList;

class DepositoMonedas {
    private ArrayList<Moneda> M;
    public DepositoMonedas(){
        M = new ArrayList<>();
    }
    public void paint(Graphics g){
        Moneda100 m1 = new Moneda100();
        m1.paint(g);
    }
    public void addMoneda(Moneda m){
        M.add(m);
    }
    public Moneda removeMoneda(){
        return M.remove(0);
    }
    public ArrayList getDMonedas(){
        return M;
    }
}
