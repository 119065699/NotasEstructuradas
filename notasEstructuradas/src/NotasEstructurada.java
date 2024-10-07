import javax.swing.JOptionPane;

public class NotasEstructurada {
    public static void main(String[] args) throws Exception {
        for(int est = 1; est <=2; est++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante: ");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante: "));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2 del estudiante: "));
            float notaF = (nota1+nota2)/2;
            JOptionPane.showMessageDialog(null, "Información del estudiante\nnombre" + nombre + "Nota Final: " + notaF);
            if(notaF <= 3) {
                JOptionPane.showMessageDialog(null, "El estudiante reprobo el curso");
            }else {
                JOptionPane.showMessageDialog(null, "El estudiante aprobo el curso");
            }
        }
    }
}
