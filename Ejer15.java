import javax.swing.*;

public class Ejer15 extends Base
{
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int sumdivisores = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sumdivisores=Funciones.sumDivisores(numero);

        mensaje="La suma de los divisores de este numero son: "+sumdivisores;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}