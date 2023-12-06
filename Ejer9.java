import javax.swing.*;

public class Ejer9 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int doblefactorial = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        doblefactorial=Funciones.dobleFactorial(numero);

        mensaje="El doble factorial de este numero es: "+doblefactorial;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}