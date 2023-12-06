import javax.swing.*;

public class Ejer12 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int cantdivisores = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        cantdivisores=Funciones.cantDivisores(numero);

        mensaje="La cantidad de divisores de este numero son: "+cantdivisores;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}