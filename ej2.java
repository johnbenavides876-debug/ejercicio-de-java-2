
package vista ;

import javax.swing.JOptionPane;

public class ej2 {

    public static int leerEdad(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                int edad = Integer.parseInt(entrada);
                if (edad > 0) {
                    return edad;
                }
                JOptionPane.showMessageDialog(null, "La edad debe ser mayor que 0.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero.");
            }
        }
    }

    public static void main(String[] args) {
        int edadActualMadre = leerEdad("Ingrese la edad actual de la madre:");
        int edadActualHijo = leerEdad("Ingrese la edad actual del hijo:");

        while (edadActualHijo >= edadActualMadre) {
            JOptionPane.showMessageDialog(null,
                    "El hijo debe ser menor que la madre.");
            edadActualHijo = leerEdad("Ingrese la edad actual del hijo:");
        }

        // Edad de la madre cuando nació el hijo
        int edadAlNacer = edadActualMadre - edadActualHijo;
        JOptionPane.showMessageDialog(null,
                "La madre tenía " + edadAlNacer + " años cuando nació su hijo.");
    }
}