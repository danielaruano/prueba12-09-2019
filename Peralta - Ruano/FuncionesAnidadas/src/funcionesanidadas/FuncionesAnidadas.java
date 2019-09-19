
package funcionesanidadas;


public class FuncionesAnidadas {

    
    public static void main(String[] args) {
       String usuario= "Juan", contraseña="pass";
       
       verificar(usuario, contraseña);
    }
       
       
       
       public static String saludar(String nombre){
           System.out.println("Hola, bienvenido" + nombre);
       }
       
       public static String error(String nombre){
           System.out.println("Error en la validacion: " +nombre+ "Es tu usuario?");
       
       }
       public static void verificar (String usuario, String contraseña){
           String usuarioValido="111mil";
           String contraseñaValida="GralDeheza";
           
           if(usuarioValido.equalsIgnoreCase(usuario) && 
                   contraseñaValida.equalsIgnoreCase(contraseña)){
                             System.out.println(saludar(usuario));
                             return;
           }
           
           System.out.println(error(usuario));
       }

}

    

