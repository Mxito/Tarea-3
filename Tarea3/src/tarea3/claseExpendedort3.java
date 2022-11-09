
package tarea3;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

class Expendedor {
    private Image Exp;
    private ArrayList<Deposito> D;
    private int precio;
    private int vueltoTotal;
    private int Cantidad;
    public Expendedor(int numBebidas, int precioUnico){
        precio = precioUnico;
        Cantidad = numBebidas;
        vueltoTotal = 0;
        Exp = new ImageIcon("Expendedor.png").getImage();
        D = new ArrayList<>(3);
        D.add(new Deposito());
        D.add(new Deposito());
        D.add(new Deposito());
        for(int i = 0; i < numBebidas; i++){
            D.get(0).addBebida(new Fanta(1000+i));
            D.get(1).addBebida(new Sprite(2000+i));
            D.get(2).addBebida(new CocaCola(3000+i));
        }
    }
    public void paint(Graphics g){
        ImageObserver observer = new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
               return true;
            }
        };
        g.drawImage(Exp,300, 100, 350, 550, observer);
        for (int i = 1; i < Cantidad+1; i++) {
            D.get(0).paint(g, 330+30*(i-1), 282);
            D.get(1).paint(g, 330+30*(i-1), 350);
            D.get(2).paint(g, 330+30*(i-1), 420);   
        }
    }
    public Bebida comprarBebida(Moneda m, int numero) throws customException{
        if (m == null){
            throw new customException("PagoIncorrectoException");
        }
        if(numero == 1){
            return D.get(0).getBebida(m, precio);
        }
        if(numero == 2){
            return D.get(1).getBebida(m, precio);
        }
        if(numero == 3){
            return D.get(2).getBebida(m, precio);
        }
        throw new customException("NoHayBebidaException");
    }
    public int valorVuelto(int n){
        if(n == 1){
            vueltoTotal = D.get(0).darVuelto();
        }
        if(n == 2){
            vueltoTotal = D.get(1).darVuelto();
        }
        if(n == 3){
            vueltoTotal = D.get(2).darVuelto();
        }
        return vueltoTotal;
    }
    public Moneda getVuelto(){
        if(vueltoTotal > 0){
            vueltoTotal -= 100;
            return new Moneda100();
        }
        return null;
    }
}
