
package vista;

import javax.swing.JOptionPane;

public class ej3 {

    public static double leerPositivo(String mensaje, boolean permiteCero) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0 || (permiteCero && valor == 0)) {
                    return valor;
                }
                JOptionPane.showMessageDialog(null, "El valor no es válido.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            }
        }
    }

    public static void main(String[] args) {
        double valorDolar = leerPositivo(
                "Ingrese cuántos pesos colombianos vale 1 dólar:", false);
        double pesos = leerPositivo(
                "Ingrese la cantidad de pesos colombianos a convertir:", true);

        double dolares = pesos / valorDolar;

        JOptionPane.showMessageDialog(null,
                "Valor de 1 dólar: " + String.format("%.2f", valorDolar) + " pesos\n"
                + "Pesos a convertir: " + String.format("%.2f", pesos) + "\n"
                + "Equivalen a: " + String.format("%.2f", dolares) + " dólares");
    }
}