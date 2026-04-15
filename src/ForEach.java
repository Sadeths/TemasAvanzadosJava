public class ForEach {
    public static void main(String[] args) {
        int edades[] = {5,10,30,45,60};
        //foreach
        for(int edad : edades){
            System.out.println("Edad: " + edad);
        }

        int numeros[] = {10,20,30,40,50};
        var suma = 0;
        for(int numero : numeros){
           System.out.println("Numeros: " + numero);
            suma += numero;
            
        }
        System.out.println("La suma total es: " + suma);

        String nombres [] = {"Ana" , "Luis", "Carlos", "Maria"};
        for (String nombre : nombres){
            System.out.println("Nombre: " + nombre);
        }
    }
}
