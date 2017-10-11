
package archivos;
import java.io.File; 
import java.io.IOException; 
import javax.swing.JOptionPane;

public class Archivos 
{
    
 public static int menu()
    { 
      int opcion = 0;
      // nuevo cambio

      do{
          opcion = Integer.parseInt(JOptionPane.showInputDialog("=== IMPLEMENTACIÓN DE ARCHIVOS - OPCIÓN DEL MENÚ ===\n\n" +"1. Guardar Nombres en el Archivo \n"+"2. Listar los Nombres del Archivo \n"+"3. Cantidad de Nombres Guardados\n"+"4. Informacion General del Archivo \n"+"5. Salir"+"\n \n Seleccione una opcion del 1 al 5"));
        }
        while(opcion <= 0 || opcion > 5); 
        return opcion; 
    }
 public static void informeArchivo(LeerEscribirArchivo arch)
    {
      File inf = new File(arch.getRutaArchivo());
      JOptionPane.showMessageDialog(null,"====== INFORMACÓN DEL ARCHIVO ======"+"\n"+"\n Ubicación: "+ inf.getAbsolutePath()+"\n Tamaño: "+ inf.length());   
    }
 public static void main(String[] args) throws IOException
    {
      int opcion; 
      LeerEscribirArchivo arch = new LeerEscribirArchivo();
      arch.setRutaArchivo("C:\\personas.txt");
      do
        {
          opcion = menu();
          
          switch(opcion) 
            {
              case 1: String dato = JOptionPane.showInputDialog(null, "Digite el NOMBRE: ");
                  arch.guardarArchivo(dato);
              break;
              case 2: 
                 JOptionPane.showMessageDialog(null,"====== NOMBRES DEL ARCHIVO ======"+"\n"+ arch.leerArchivo(arch.getRutaArchivo())+"\n"); 
              break;
              case 3: 
                 JOptionPane.showMessageDialog(null,"====== NOMBRES DEL ARCHIVO ======"+"\n"+"\n"+"Se han registrado: "+ arch.cantidadLineasArchivo()+" Nombres \n\n"); 
              break;
              case 4: 
                 informeArchivo(arch);
              break;
              case 5:
              break; 
            }
        }while(opcion != 5); 
     }
}    
   
    



