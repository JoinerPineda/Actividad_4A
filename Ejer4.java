import javax.swing.*;

public class Ejer4 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPositivo(numero))
            mensaje = "el numero " + numero + " si es positivo ";
        else
            mensaje = "el numero " + numero + " no es positivo ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}