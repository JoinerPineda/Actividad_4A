import javax.swing.*;

public class Ejer7 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero1 = 0;
        int numero2 = 0;
        int menor = 0;

        mensaje = "Ingrese el primer numero";
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese el segundo numero";
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        menor=Funciones.menor(numero1, numero2);

        mensaje="El numero menor es: "+menor;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}