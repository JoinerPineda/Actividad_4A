import javax.swing.*;

public class Ejer8 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int factorial = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        factorial=Funciones.factorial(numero);

        mensaje="El factorial de este numero es: "+factorial;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}