/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica.evaluada.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class PrácticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JOptionPane.showMessageDialog(null, "Bienvenido al programa ¨Silescalculator¨ de la empresa ¨Los Patitos S.A¨\n"
                + "Por favor, digite los datos que se le solicitan");// Mensaje de bienvenida al programa

        // Definivmos Variables
        String lectura = ""; // Definimos String para luego pasarlo a int
        double SAM = 0.0925; // Definimos variable como monto por cargos SAM
        double IVM = 0.0508; // Definimos variable como monto por cargos IVM
        double asociacion = 0.025;

        //Proceso de cambiar String a int
        lectura = JOptionPane.showInputDialog("Digite el salario  mensual del empleado"); //Entrada de datos del salario
        int salario;
        salario = Integer.parseInt(lectura); //Cambiamos el String a int

        //Definivmos variabless para los calculos
        double calculo1 = salario * SAM;
        double calculo2 = salario * IVM;
        double calculo3 = salario * asociacion;
        
        //Salida de datos
        JOptionPane.showMessageDialog(null, "El salario bruto del empleado es de: " + salario); //Salida de datos del salario bruto
        JOptionPane.showMessageDialog(null, "El monto restante por SAM: " + calculo1);//Salida de datos del monto a pagar por SAM
        JOptionPane.showMessageDialog(null, ("El monto restante por IVM es de: " + calculo2)); //Salida de datos del monto a pagar por IVM
        JOptionPane.showMessageDialog(null, ("El monto restante por asociación es de: " + calculo3)); //Salida de datos del monto a pagar por Asociación
        JOptionPane.showMessageDialog(null, "La empresa en total deberá pagar: " + (calculo1 + calculo2 + calculo3)); //Salida de datos del monto que la empresa deberá pagar

    }

}
