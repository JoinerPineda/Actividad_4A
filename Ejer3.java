import javax.swing.*;

public class Ejer3 extends Base {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esImpar(numero))
            mensaje = "el numero " + numero + " si es impar ";
        else
            mensaje = "el numero " + numero + " no es impar ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}