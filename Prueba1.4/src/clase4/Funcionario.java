/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Seba
 */
public class Funcionario {
    
    private String rut;
    private String nombrecompleto;
    private String domicilio;
    private String fechanacimiento;
    private double sueldobruto;

    public Funcionario(String rut, String nombrecompleto, String domicilio, String fechanacimiento, double sueldobruto) {
        this.rut = rut;
        this.nombrecompleto = nombrecompleto;
        this.domicilio = domicilio;
        this.fechanacimiento = fechanacimiento;
        this.sueldobruto = sueldobruto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public double getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }
    
    public String getAtributos(){
        return this.rut+" "+this.nombrecompleto+" "+this.domicilio;
    }
}
