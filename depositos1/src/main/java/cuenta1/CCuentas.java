/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta1;

/**
 * Comentarios para la clase cuentas
 * @author dabf1
 */
public class CCuentas {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre; // Comentarios de los atributos
    private String cuenta; // Comentarios de los atributos
    private double saldo; // Comentarios de los atributos
    private double tipoInterés; // Comentarios de los atributos

    
    /**
     * Comentario para el contructor 
     */
    public CCuentas()
    {
    }

    /**
     * Comentarios para el constructor
     * @param nom  parametros que recibe el constructor 
     * @param cue parametros que recibe el constructor
     * @param sal parametros que recibe el constructor
     * @param tipo  parametros que recibe el constructor
     */
    public CCuentas(String nom, String cue, double sal, double tipo)
    {
        nombre =nom; 
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Comentarios Método estado
     * @return  información sobre el retorno
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Comentarios Método ingresar
     * @param cantidad informacion de los parametros
     * @throws Exception información de las excepciones
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)// informacion sobre el procedimiento if
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Comentarios Método retirar
     * @param cantidad informacion de los parametros
     * @throws Exception información de las excepciones
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0) // informacion sobre el procedimiento if
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad) // informacion sobre el procedimiento if
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
