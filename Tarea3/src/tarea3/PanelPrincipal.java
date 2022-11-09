package tarea3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
    private Comprador com;
    private Comprador com1;
    private Comprador com2;
    private Expendedor exp;
    Moneda100 m = new Moneda100();
    Moneda500 m1 = new Moneda500();
    Moneda1000 m2 = new Moneda1000();
    public PanelPrincipal() throws customException{
        this.setBackground(Color.white);
        this.setLayout(null);
        
        exp = new Expendedor(9, 1000);
        Botones();
        com = new Comprador(m);
        com1= new Comprador(m1);
        com2= new Comprador(m2);
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        exp.paint(g);
        com.paint(g);
        com1.paint(g);
        com2.paint(g);   
    }
        public void Botones(){
        JButton fantaBoton = new JButton("FANTA");
        fantaBoton.setBounds(547, 360, 80, 20);
        this.add(fantaBoton);
        
        JButton cocaBoton = new JButton("COCA-COLA");
        cocaBoton.setBounds(547, 390, 80, 20);
        this.add(cocaBoton);
        
        JButton spriteBoton = new JButton("SPRITE");
        spriteBoton.setBounds(547, 420, 80, 20);
        this.add(spriteBoton);
    }
}
