/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;


public class Persona {
    
    private String rut;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String domicilio;

    public Persona(String rut, String nombre, String apellidopaterno, String apellidomaterno) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
    }

    public Persona(String rut, String nombre, String apellidopaterno, String apellidomaterno, String domicilio) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.domicilio = domicilio;
    }
}
