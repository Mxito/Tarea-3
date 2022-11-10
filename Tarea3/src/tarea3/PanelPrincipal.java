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
        this.setBackground(Color.darkGray);
        this.setLayout(null);
        
        exp = new Expendedor(9, 1500);
        com = new Comprador(m);
        com1= new Comprador(m1);
        com2= new Comprador(m2);
        Botones();
    }
      public void Botones(){
        JButton fantaBoton = new JButton();
        fantaBoton.setBounds(547, 360, 80, 30);
        ImageIcon fantaImage = new ImageIcon("fanta-etiqueta.png");
        fantaBoton.setIcon(new ImageIcon(fantaImage.getImage().getScaledInstance(fantaBoton.getWidth(), fantaBoton.getHeight(), Image.SCALE_SMOOTH)));
        this.add(fantaBoton);
        
        JButton cocaBoton = new JButton();
        cocaBoton.setBounds(547, 395, 80, 30);
        ImageIcon cocaImage = new ImageIcon("coca-etiqueta.jpg");
        cocaBoton.setIcon(new ImageIcon(cocaImage.getImage().getScaledInstance(cocaBoton.getWidth(), cocaBoton.getHeight(), Image.SCALE_SMOOTH)));
        this.add(cocaBoton);
        
        JButton spriteBoton = new JButton();
        spriteBoton.setBounds(547, 430, 80, 30);
        ImageIcon spriteImage = new ImageIcon("sprite-etiqueta.png");
        spriteBoton.setIcon(new ImageIcon(spriteImage.getImage().getScaledInstance(spriteBoton.getWidth(), spriteBoton.getHeight(), Image.SCALE_SMOOTH)));
        this.add(spriteBoton);
        
        JButton boton;
        boton = new JButton();
        boton.setBounds(556, 285, 64, 58);
        this.add(boton);
        boton.setOpaque(false);
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(false);
        
        JButton m500 = new JButton();
        m500.setBounds(50, 200, 50, 50);
        ImageIcon m500i = new ImageIcon("moneda500.png");
        m500.setIcon(new ImageIcon(m500i.getImage().getScaledInstance(m500.getWidth(), m500.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m500);
        
        JButton m100 = new JButton();
        m100.setBounds(50, 140, 50, 50);
        ImageIcon m100i = new ImageIcon("moneda100.png");
        m100.setIcon(new ImageIcon(m100i.getImage().getScaledInstance(m100.getWidth(), m100.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m100);
        
        JButton m1000 = new JButton();
        m1000.setBounds(50, 260, 50, 50);
        ImageIcon m1000i = new ImageIcon("moneda1000.png");
        m1000.setIcon(new ImageIcon(m1000i.getImage().getScaledInstance(m1000.getWidth(), m1000.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m1000);
        
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        exp.paint(g);
        com.paint(g);
        com1.paint(g);
        com2.paint(g);   
    }
      
        
}
