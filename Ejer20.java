import javax.swing.*;

public class Ejer20 extends Base{
    public static void main(String[] args) {
        String mensaje = "";
        int numero1 = 0;
        int numero2 = 0;

        mensaje = "Ingrese un numero";
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese otro numero";
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.sonAmigos(numero1,numero2))
            mensaje = "los numeros " + numero1 + " y " +numero2+ " si son amigos ";
        else
            mensaje = "los numeros " + numero1 + " y " +numero2+ " no son amigos ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}