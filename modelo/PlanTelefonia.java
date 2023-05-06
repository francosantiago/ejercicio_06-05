package modelo;

public class planTelefonia 
{
    private String Operador;
    private double Numero;
    private int MinutosUsados;
    private int CostoMinuto;
    private int CostoTotal;

    public void PlanTelefonia(String Operador, double Numero, int MinutosUsados, int CostoMinuto)
        {
            this.Operador = Operador;
            this.Numero = Numero;
            this.MinutosUsados = MinutosUsados;
            this.CostoMinuto = CostoMinuto;
            this.CostoTotal = 0;
        }
    
        public String getOperador()
        {
            return this.Operador;
        }
    
        public double getNumero()
        {
            return this.Numero;
        }
    
        public int getMinutosUsados()
        {
            return this.MinutosUsados;
        }
    
        public int getCostoMinuto()
        {
            return this.CostoMinuto;
        }

        public int getCostoTotal()
        {
            return this.CostoTotal;
        }

        public void setOperador(String pOperador)
        {
            this.Operador = pOperador;
        }
    
        public void setNumero(double pNumero)
        {
            this.Numero = pNumero;
        }
    
        public void setMinutosUsados(int pMinutos)
        {
            this.MinutosUsados = pMinutos;
        }
    
        public void setCostoMinuto(int pCostoMinuto)
        {
            this.CostoMinuto = pCostoMinuto;
        }
        public void setCostoTotal(int CostoTotal)
        {
            this.CostoTotal = CostoTotal;
        }

        public void CostoTotal(String Operador)
        {
            if(Operador == "WOM")
            {
                setCostoTotal(getCostoTotal()/2);
            }

            else
            {
                setCostoTotal(getMinutosUsados() * getCostoMinuto());
            }
        }

        public String resultado()
        {
            return "Numero de celular: " + Numero + "\nMinutos usados: " + MinutosUsados + "\nOperador: " + Operador + "\nCosto por Minuto: "+ CostoMinuto + "\nTotal a pagar: " + getCostoTotal();
        }

        public void CostoTotal(int minutos, int costo) {
        }
}
