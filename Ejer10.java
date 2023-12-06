import javax.swing.*;

public class Ejer10 extends Base {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int cantdivisorespos = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        cantdivisorespos=Funciones.cantDivisoresPos(numero);

        mensaje="La cantidad de divisores positivos de este numero son: "+cantdivisorespos;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}