
package tarea3;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

class Expendedor {
    private Image Exp;
    private ArrayList<Deposito> DBebidas;
    private DepositoMonedas DMonedas;
    private int precio;
    private String price;
    private int vueltoTotal;
    private int Cantidad;
    private Bebida soda;
    public Expendedor(int numBebidas, int precioUnico){
        precio = precioUnico;
        price = String.valueOf(precio);
        Cantidad = numBebidas;
        vueltoTotal = 0;
        Exp = new ImageIcon("Expendedor.png").getImage();
        DMonedas = new DepositoMonedas();
        DBebidas = new ArrayList<>(3);
        DBebidas.add(new Deposito());
        DBebidas.add(new Deposito());
        DBebidas.add(new Deposito());
        for(int i = 0; i < numBebidas; i++){
            DBebidas.get(0).addBebida(new Fanta(1000+i));
            DBebidas.get(2).addBebida(new Sprite(2000+i));
            DBebidas.get(1).addBebida(new CocaCola(3000+i));
        }
    }
    public void pagoCompra(DepositoMonedas DepMonedas){
        for(int i =0 ; i < DepMonedas.getDMonedas().size(); i++){
            DMonedas.addMoneda(DepMonedas.getMoneda(i));
        }
    }
    public Bebida comprarBebida(int numero) throws customException{
        int dineroExpendedor = 0;
        while (dineroExpendedor <= precio) {
            for(int i=0; i< DMonedas.getDMonedas().size(); i++){
            dineroExpendedor += DMonedas.getMoneda(i).getValor();
            }
        }
        if (dineroExpendedor < precio){
            throw new customException("PagoIncorrectoException");
        }
        if(numero == 1){
            dineroExpendedor = 0;
            while(dineroExpendedor < precio) {
                dineroExpendedor += DMonedas.removeMoneda().getValor();
            }
            return soda = DBebidas.get(0).getBebidas();
        }
        if(numero == 2){
            dineroExpendedor = 0;
            while(dineroExpendedor < precio) {
                dineroExpendedor += DMonedas.removeMoneda().getValor();
            }
            return soda = DBebidas.get(1).getBebidas();
        }
        if(numero == 3){
            dineroExpendedor = 0;
            while(dineroExpendedor < precio) {
                dineroExpendedor += DMonedas.removeMoneda().getValor();
            }
            return soda = DBebidas.get(2).getBebidas();
        }
        throw new customException("NoHayBebidaException");
    }
    public int valorVuelto(int n){
        if(n == 1){
            vueltoTotal = DBebidas.get(0).darVuelto();
        }
        if(n == 2){
            vueltoTotal = DBebidas.get(1).darVuelto();
        }
        if(n == 3){
            vueltoTotal = DBebidas.get(2).darVuelto();
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
    public Bebida getaBebida(){
        Bebida refresco = soda;
        soda = null;
        return refresco;
    } 
    public void paint(Graphics g){
        g.drawImage(Exp,200, 100, 450, 550, null);
        g.fillRoundRect(547, 483, 80, 20, 20, 20);
        Font font = new Font("Space Invaders",Font.BOLD,12);
        g.setFont(font);
        g.setColor(Color.white);
        g.drawString("$"+price, 555, 497);
        for (int i = 1; i < DBebidas.get(0).getArrayBebidas().size()+1; i++) {
            DBebidas.get(0).paint(g, 240+30*(i-1), 282, i-1);   
        }
        for (int i = 1; i < DBebidas.get(1).getArrayBebidas().size()+1; i++) {
            DBebidas.get(1).paint(g, 240+30*(i-1), 350,i-1); 
        }
        for (int i = 1; i < DBebidas.get(2).getArrayBebidas().size()+1; i++) {
            DBebidas.get(2).paint(g, 240+30*(i-1), 420,i-1);   
        }
        for(int i = 1; i < DMonedas.getDMonedas().size()+1; i++){
            DMonedas.paint(g, 500+20*(i-1), 520, i-1);
        }
        if(soda != null){
            soda.paint(g, 230, 500);
        }
    }
}
