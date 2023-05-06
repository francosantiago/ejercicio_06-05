package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.planTelefonia;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    private VentanaPrincipal venPrin;
    private planTelefonia model;
    
    public Controlador(VentanaPrincipal pVenPrin, planTelefonia pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();
        
        if(comando.equals("añadir"))
        {   
            try
            {
                String Operador = venPrin.miPanelEntradaDatos.getOperador();
                int Numero1 = Integer.parseInt(venPrin.miPanelEntradaDatos.getNumero());
                int Minutos = Integer.parseInt(venPrin.miPanelEntradaDatos.getMinutos());
                int Costo = Integer.parseInt(venPrin.miPanelEntradaDatos.getCosto());
                double Numero = Numero1;

                model = new PlanTelefonia(Operador, Numero, Minutos, Costo);
                
                venPrin.miPanelResultado.mostrarResultado("Se ha creado un plan Telefonico");
                venPrin.miPanelResultado.mostrarResultado("Su número es " + model.getNumero());
                venPrin.miPanelResultado.mostrarResultado("los minutos deseados son: " + model.getMinutos());
                venPrin.miPanelResultado.mostrarResultado("El costo por minuto seleccionado es:" + model.getCostoMinuto());
                venPrin.miPanelResultado.mostrarResultado("Su Operador es " + model.getOperador());
                
                venPrin.miPanelOperaciones.desactivarBotonCrear();
                venPrin.miPanelOperaciones.activarBotones();  
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
        
        else if(comando.equals("Total"))
        {
            int Minutos = Integer.parseInt(venPrin.miPanelEntradaDatos.getMinutos());
            int Costo = Integer.parseInt(venPrin.miPanelEntradaDatos.getCostoTotal());
            model.CostoTotal(Minutos, Costo);

            String Operador = venPrin.miPanelEntradaDatos.getOperador();

            venPrin.miPanelResultado.mostrarResultado("\nEl valor a pagar por es de: " + model.getCostoTotal());
        }

        else if(comando.equals("Salir"))
        {
            System.exit(0);
        }
    }    
}