package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    private JTextArea taResultado;
    private JScrollPane spResultado;
    
    public PanelResultados()
    {
        setLayout(null);
        setBackground(Color.WHITE);
        
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20, 360, 210);
        add(spResultado);
       
        
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.RED);
        setBorder(borde);
    }
    
    public void borrar()
    {
        taResultado.setText("");
    }
    
    public void mostrarResultado(String msj)
    {
        taResultado.append(msj+"\n");
    }
}