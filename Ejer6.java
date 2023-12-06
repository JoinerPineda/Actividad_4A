import javax.swing.*;

public class Ejer6 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero1 = 0;
        int numero2 = 0;
        int mayor = 0;

        mensaje = "Ingrese el primer numero";
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese el segundo numero";
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        mayor=Funciones.mayor(numero1, numero2);

        mensaje="El numero mayor es: "+mayor;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}