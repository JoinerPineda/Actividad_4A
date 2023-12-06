import javax.swing.*;

public class Ejer5 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esNegativo(numero))
            mensaje = "el numero " + numero + " si es negativo ";
        else
            mensaje = "el numero " + numero + " no es negativo ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}