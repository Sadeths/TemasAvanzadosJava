
import java.io.Serializable;

public class JavaBeanLibro {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Star Wars");
        libro.setAutor("Samahel Thomas");
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
    }
}

class Libro implements Serializable{
    private String titulo;
    private String autor;

    public Libro(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
    }

    
}