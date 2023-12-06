import javax.swing.*;

public class Ejer11 extends Base {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int cantdivisoresneg = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        cantdivisoresneg=Funciones.cantDivisoresNeg(numero);

        mensaje="La cantidad de divisores negativos de este numero son: "+cantdivisoresneg;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}