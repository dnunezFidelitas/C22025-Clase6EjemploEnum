/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploenum;

/**
 *
 * @author viti
 */
public class Empleado {
    //atributos
    private int id;
    private String nombre;
    private EstadoEmpleado estado;
    
    //Constructor
    public Empleado(int id, String nombre, EstadoEmpleado estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    //Seter y Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoEmpleado getEstado() {
        return estado;
    }

    public void setEstado(EstadoEmpleado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
}
