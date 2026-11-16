
package vista;

import javax.swing.JOptionPane;

public class Ej1 {

    public static double leerNota(String ordinal) {
        String mensaje = "Ingrese la " + ordinal + " calificación (1 al 10):";
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                double nota = Double.parseDouble(entrada);
                if (nota >= 1 && nota <= 10) {
                    return nota;
                }
                mensaje = "Nota no válida. Ingrese la " + ordinal + " calificación (1 al 10):";
            } catch (NumberFormatException e) {
                mensaje = "Debe ingresar un número. Ingrese la " + ordinal + " calificación (1 al 10):";
            }
        }
    }

    public static void main(String[] args) {
        double calif1 = leerNota("primera");
        double calif2 = leerNota("segunda");
        double calif3 = leerNota("tercera");

        double resultado = (calif1 + calif2 + calif3) / 3;
        JOptionPane.showMessageDialog(null,
                "El promedio final es: " + String.format("%.2f", resultado));
    }
}