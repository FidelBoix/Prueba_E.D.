package ud04;

import javax.swing.JOptionPane;

public class _01Estaturas {
    public static void main(String[] args) {
        int cantidad;
        int i=0;
        String valores="";

        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantas estaturas vas a introducir?"));

        double estatura[] = new double[cantidad];

        while(i<cantidad){
            estatura[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la estatura "+(i+1)+":"));
            i++;
        }
