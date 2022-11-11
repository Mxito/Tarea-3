package tarea3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
    private Expendedor exp;
    private Comprador com;;
    private JButton m100;
    private JButton m500;
    private JButton m1000;
    public PanelPrincipal() throws customException{
        this.setBackground(Color.darkGray);
        this.setLayout(null);
        exp = new Expendedor(9, 1500);
        com = new Comprador();
        Botones();
        clickSaldo();
    }
    public void Botones(){
     
        m500 = new JButton();
        m500.setBounds(50, 200, 50, 50);
        ImageIcon m500i = new ImageIcon("moneda500.png");
        m500.setIcon(new ImageIcon(m500i.getImage().getScaledInstance(m500.getWidth(), m500.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m500);
        
        m100 = new JButton();
        m100.setBounds(50, 140, 50, 50);
        ImageIcon m100i = new ImageIcon("moneda100.png");
        m100.setIcon(new ImageIcon(m100i.getImage().getScaledInstance(m100.getWidth(), m100.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m100);
        
        m1000 = new JButton();
        m1000.setBounds(50, 260, 50, 50);
        ImageIcon m1000i = new ImageIcon("moneda1000.png");
        m1000.setIcon(new ImageIcon(m1000i.getImage().getScaledInstance(m1000.getWidth(), m1000.getHeight(), Image.SCALE_SMOOTH)));
        this.add(m1000);
        
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
        
        JButton receptorMonedas;
        receptorMonedas = new JButton();
        receptorMonedas.setBounds(556, 285, 64, 58);
        this.add(receptorMonedas);
        receptorMonedas.setOpaque(false);
        receptorMonedas.setContentAreaFilled(false);
        receptorMonedas.setBorderPainted(false);
        repaint();
    }
      
    public void clickSaldo(){
        MouseListener oyenteMouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                com.agregarSaldo(new Moneda100());
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        m100.addMouseListener(oyenteMouse);
        MouseListener oyenteMouse2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                com.agregarSaldo(new Moneda500());
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        m500.addMouseListener(oyenteMouse2);
        MouseListener oyenteMouse3 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                com.agregarSaldo(new Moneda1000());
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        m1000.addMouseListener(oyenteMouse3);
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        exp.paint(g);
        com.paint(g);
    }
      
        
}
