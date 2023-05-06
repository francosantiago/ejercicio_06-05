package ejecutable;

import modelo.planTelefonia;
import controlador.Controlador;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        planTelefonia miPlanTelefonia = null;
        Controlador miControlador = new Controlador(miVentana, miPlanTelefonia);
    }    
}

