package vista;

import javax.swing.JOptionPane;

public class ej4 {

    public static double leerRadio() {
        while (true) {
            String entrada = JOptionPane.showInputDialog(
                    null, "Ingrese el radio del círculo:");
            if (entrada == null) {
                System.exit(0); // el usuario canceló
            }
            try {
                double radio = Double.parseDouble(entrada);
                if (radio > 0) {
                    return radio;
                }
                JOptionPane.showMessageDialog(null, "El radio debe ser mayor que 0.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            }
        }
    }

    public static void main(String[] args) {
        double radio = leerRadio();

        double diametro = radio * 2;
        double perimetro = Math.PI * diametro;
        double area = Math.PI * Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null,
                "Radio: " + String.format("%.2f", radio) + "\n"
                + "Diámetro: " + String.format("%.2f", diametro) + "\n"
                + "Perímetro: " + String.format("%.2f", perimetro) + "\n"
                + "Área: " + String.format("%.2f", area));
    }
}