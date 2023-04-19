package jdr;

public class EmpleadoZoo implements Cuidador {
//CREAMOS LOS ATRIBUOS DE LA CLASE EMPLEADOZO
    private int numeroEmpleado;
    private String nombre;
    private String apellidos;
    private double salario;

    public EmpleadoZoo(int numeroEmpleado, String nombre, String apellidos, double salario) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

// ALIMENTAMOS AL ANIMAL CON LA COMIDA ESPECIFICA
    public void alimentar(double cantidadAlimento) {
        System.out.println("El animal ha sido alimentado con " + cantidadAlimento + " gramos.");
    }

    
//ESTABLECEMOS LOS GET Y SET
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
