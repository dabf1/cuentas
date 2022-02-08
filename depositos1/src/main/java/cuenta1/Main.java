/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta1;

/**
 * información sobre la clase Main
 * @author dabf1
 */
public class Main {

    /**
     * informacion sobre la clase principal Main
     * @param args 
     */
    public static void main(String[] args) {
        CCuentas cuenta1; // Informacion sobre los atributos
        double saldoActual; // comentarios sobre los atributos

        cuenta1 = operativa_cuenta();

        try { // Información sobre las excepciones
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try { // Mas comentarios
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    private static CCuentas operativa_cuenta() {
        
        float cantidad;
        CCuentas cuenta1;
        double saldoActual;
        cuenta1 = new CCuentas("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        return cuenta1;
    }
}
