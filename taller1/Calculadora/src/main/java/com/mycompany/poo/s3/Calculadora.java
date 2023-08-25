/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */package com.mycompany.poo.s3;

import javax.swing.JOptionPane;

/**
 *  * * @author LAB10 
 */
public class Calculadora {

    int num1;
    int num2;
    int sum, rest, mul, div;

    public void multiplicacion() {
    mul = num1 * num2;
    }
    public void dividir() {
    div = num1 / num2;    
    }
    public void restar() {
        rest = num1 - num2;
}
    public void sumar() {
        sum = num1 + num2;
}
    public void ingresarDatos() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresar el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresar el seguno numero"));
}
    public void mostrarDatos() {
        JOptionPane.showInputDialog(null, "la suma es" + sum);
        JOptionPane.showInputDialog(null, "la resta es" + rest);
        JOptionPane.showInputDialog(null, "la multiplicacion es" + mul);
        JOptionPane.showInputDialog(null, "la division es" + div);
    

}
}
