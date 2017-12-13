package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *SANTHIAGO COLUMBA
 *Programacion Visual II
 * @author ${user}
 */
public class ControlFlujo {

    public static void flujoSwitch() {
        
        int op = Integer.parseInt(JOptionPane.showInputDialog(""
                + "1.- Iteracion\n"
                + "2.- Suma arreglo\n"
                + "3.- SalirIngrese una opcion"));
        switch (op) {
            case 1:
                iteracionFor();
                break;
            case 2:
                sumaArreglo();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "esta en construcción");
                break;
        }
    }

    public static void condicionalDoWhile() {
        int x;
        do {
            flujoSwitch();
            x = JOptionPane.showConfirmDialog(null, "desea continuar");

        } while (x != 1);
    }

    public static void iteracionFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("valor de i:" + i);
            if (i == 2 || i == 4) {
                continue;
            }
            System.out.println("paso i:" + i);

        }
    }

    public static void sumaArreglo() {
        int[] array = {9, 6, 7};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        JOptionPane.showMessageDialog(null, ++sum);
    }
    
    
}
