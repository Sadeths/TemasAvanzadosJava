package maquina_snacks;

import java.io.Serializable;

public class Snack implements Serializable {
    private static int contadorSnacks;
    private int idSnacks;
    private String nombre;
    private double precio;

    public Snack(){
        this.idSnacks = ++Snack.contadorSnacks;
    }

    public Snack(String nombre, double precio){
        this(); //Debe ser la primer linea llamada al constructor 
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    public int getIdSnacks() {
        return idSnacks;
    }

    public void setIdSnacks(int idSnacks) {
        this.idSnacks = idSnacks;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack [idSnacks=" + idSnacks + ", nombre=" + nombre + ", precio=" + precio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idSnacks;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Snack other = (Snack) obj;
        if (idSnacks != other.idSnacks)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    }

    

    


}
