
package tarea3;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.image.ImageObserver;

class Deposito{
    private ArrayList<Bebida> D;
    private int vueltoDeposito;
    public Deposito(){
      D = new ArrayList<>();
      vueltoDeposito = 0;
    }
    public void paint(Graphics g, int x, int y){
        for(int i = 0; i< D.size(); i++){
            D.get(i).paint(g, x, y);
        }  
    }
    public void addBebida(Bebida a){
        D.add(a);
    }
    
    public Bebida getBebida(Moneda m, int precio) throws customException{
        if(D.isEmpty()){
            vueltoDeposito = m.getValor();
            throw new customException("NoHayBebidaException");
        }
        if(m.getValor() < precio){
            vueltoDeposito = m.getValor();
            throw new customException("PagoInsuficienteException");
        }else{
            vueltoDeposito = m.getValor() - precio;
            return D.remove(0);
        }
    }
    public int darVuelto(){
        return vueltoDeposito;
    }
}

