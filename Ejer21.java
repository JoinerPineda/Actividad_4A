import javax.swing.*;

public class Ejer21 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int liminferior = 0;
        int limsuperior = 0;
        int numAleatorio = 0;

        mensaje = "Ingrese un limite inferior";
        liminferior = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese un limite superior";
        limsuperior = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        numAleatorio=Funciones.generarAleatorio(liminferior, limsuperior);

        mensaje="EL numero aleatorio en el rango generado es: "+numAleatorio;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}