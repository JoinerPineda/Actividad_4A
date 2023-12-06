import javax.swing.*;

public class Ejer17 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPrimo(numero))
            mensaje = "el numero " + numero + " si es primo ";
        else
            mensaje = "el numero " + numero + " no es primo ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}