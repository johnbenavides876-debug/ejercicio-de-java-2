
package vista;

import javax.swing.JOptionPane;

public class ej5 {

    public static double leerDiagonal(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0) {
                    return valor;
                }
                JOptionPane.showMessageDialog(null, "La diagonal debe ser mayor que 0.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            }
        }
    }

    public static void main(String[] args) {
        double diagMayor = leerDiagonal("Ingrese la diagonal mayor:");
        double diagMenor = leerDiagonal("Ingrese la diagonal menor:");

        while (diagMenor > diagMayor) {
            JOptionPane.showMessageDialog(null,
                    "La diagonal menor no puede ser mayor que la diagonal mayor.");
            diagMenor = leerDiagonal("Ingrese la diagonal menor:");
        }

        double mitadMayor = diagMayor / 2;
        double mitadMenor = diagMenor / 2;
        double lado = Math.sqrt(mitadMayor * mitadMayor + mitadMenor * mitadMenor);

        double perimetro = lado * 4;
        double area = diagMayor * diagMenor / 2;

        JOptionPane.showMessageDialog(null,
                "Lado del rombo: " + String.format("%.2f", lado) + "\n"
                + "Perímetro: " + String.format("%.2f", perimetro) + "\n"
                + "Área: " + String.format("%.2f", area));
    }
}