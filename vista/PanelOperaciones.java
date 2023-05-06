package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    public JButton bAñadir;
    public JButton bSaldo;
    public JButton bSalir;
    
    //Constructor
    public PanelOperaciones()
    {
        setLayout(null);
        setBackground(Color.WHITE);
        
        bAñadir = new JButton("Añadir");
        bAñadir.setFont(new Font("Arial", BOLD, 12));
        bAñadir.setBounds(10,20,80,20);
        add(bAñadir);
        bAñadir.setActionCommand("añadir");
        
        
        bSaldo = new JButton("Calcular Total");
        bSaldo.setFont(new Font("Arial", BOLD, 12));
        bSaldo.setBounds(120,20,120,20);
        add(bSaldo);
        bSaldo.setActionCommand("Total");
        bSaldo.setEnabled(false);

        bSalir = new JButton("Salir");
        bSalir.setFont(new Font("Arial", BOLD, 12));
        bSalir.setBounds(260,20,90,20);
        add(bSalir);
        bSalir.setActionCommand("Salir");
        
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.RED);
        setBorder(borde);

    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bAñadir.addActionListener(pAL);
        bSaldo.addActionListener(pAL);
    }
    
    public void desactivarBotonCrear()
    {
        bAñadir.setEnabled(false);
    }
    
    public void activarBotones()
    {
        bSaldo.setEnabled(true);
    }
}