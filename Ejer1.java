import javax.swing.*;
public class Ejer1 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero1 = 0;
        int numero2 = 0;

        mensaje = "Ingrese el primer numero";
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese el segundo numero";
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if(Funciones.esDivisor(numero1,numero2))
            mensaje= numero1+ " si es divisible por "+numero2;
        else
            mensaje= numero1+ " no es divisible por "+numero2;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}