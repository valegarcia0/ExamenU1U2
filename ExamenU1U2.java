/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner porcentaje = new Scanner(System.in);
        System.out.println("Ingresa el primer instrumento ");
        String ins1 = porcentaje.nextLine();

        System.out.println("Ingresa el segundo instrumento ");
        String ins2 = porcentaje.nextLine();

        System.out.println("Ingresa el tercer  instrumento ");
        String ins3 = porcentaje.nextLine();

        System.out.println("Ingresa el precio compra del intrumento uno ");
        Double i1 = porcentaje.nextDouble();

        System.out.println("Ingresa el precio compra del intrumento dos ");
        Double i2 = porcentaje.nextDouble();

        System.out.println("Ingresa el precio compra del intrumento tres ");
        Double i3 = porcentaje.nextDouble();

        double ganancia1 = 1250.45 - i1;
        double ganancia2 = 3743.00 - i2;
        double ganancia3 = 2683.78 - i3;

        double total = (ganancia1 / i1) * 100;
        double tota2 = (ganancia2 / i1) * 100;
        double tota3 = (ganancia3 / i1) * 100;

        System.out.println("La ganacia de " + ins1 + "es" + total);
        System.out.println("La ganacia de " + ins2 + "es" + tota2);
        System.out.println("La ganacia de " + ins3 + "es" + tota3);

    }

}
