public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4,5); // varags
        variosParametros("Karla", 10,20,30);
        log("Usuario creado: ", "ID: " , 101, "Nombre: ", "Sama");
                    }
                
        static void variosParametros(String nombre, int... numeros) {
                System.out.println("Nombre: " + nombre);
                imprimirNumeros(numeros);
            }
        
        static void imprimirNumeros(int... numeros) {
        for(var i = 0; i < numeros.length; i++)
            System.out.println(numeros[i] + " ");
            }
        
        static void log (String mensaje, Object... datos){
            System.out.print(mensaje + ": ");
            for(Object dato : datos){
                System.out.println(dato + " ");
            }
            System.out.println();
        }


        

}
