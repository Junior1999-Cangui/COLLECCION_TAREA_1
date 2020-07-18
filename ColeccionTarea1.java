
package colecciontarea1;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Junior Steven Cangui Topanta
 */
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n");
        System.out.println("Asiganatura: Programación");
        System.out.println("Estudiante: Junior Steven Cangui Toapanta");
        System.out.println("Nivel: 4to");
        System.out.println("Carrera: Ingeniería Automotriz\n");
        System.out.println("Tema: COLECCION\n");
        System.out.println("Elementos utilizados en la elaboración de un prototipo  "
                + "a escala de un Mini Elevador Electrico:\n");
        
        Collection listaElementosMiniElevador=new ArrayList<String>();
        
       listaElementosMiniElevador.add("Tiras de madera\n");
       listaElementosMiniElevador.add("Palitos de madera\n");
       listaElementosMiniElevador.add("Silicona\n");
       listaElementosMiniElevador.add("Brujita\n");
       listaElementosMiniElevador.add("Pistola de silicona\n");
       listaElementosMiniElevador.add("Engranaje recto 1\n");
       listaElementosMiniElevador.add("Engranaje recto 2\n");
       listaElementosMiniElevador.add("Engranaje circular 1\n");
       listaElementosMiniElevador.add("Engranaje circular 2\n");
       listaElementosMiniElevador.add("Motor electrico 1\n");
       listaElementosMiniElevador.add("Motor electrico 2\n");
       listaElementosMiniElevador.add("Cautin\n");
       listaElementosMiniElevador.add("Estaño\n");
       listaElementosMiniElevador.add("Led Blue\n");
       listaElementosMiniElevador.add("Alambre flexible\n");
       listaElementosMiniElevador.add("Alambre sólido\n");
       listaElementosMiniElevador.add("Pila Bateria de 9V\n");
       listaElementosMiniElevador.add("Pulsador de 5v\n");
       listaElementosMiniElevador.add("Broche de pila bateria");
      
       System.out.println("Número de elementos del MINI ELEVADOR antes de ser utilizados:"
               +listaElementosMiniElevador.size() + "\n");
       System.out.println("LOS ELEMENTOS DEL MINI ELEVADOR ELÉCTRICO SON:");
       System.out.println(listaElementosMiniElevador.toString());
       
       listaElementosMiniElevador.remove("Tiras de madera\n");
       listaElementosMiniElevador.remove("Palitos de madera\n");
       listaElementosMiniElevador.remove("Silicona\n");
       listaElementosMiniElevador.remove("Brujita\n");
       listaElementosMiniElevador.remove("Pistola de silicona\n");
       listaElementosMiniElevador.remove("Engranaje recto 1\n");
       listaElementosMiniElevador.remove("Engranaje recto 2\n");
       listaElementosMiniElevador.remove("Engranaje circular 1\n");
       listaElementosMiniElevador.remove("Engranaje circular 2\n");
       listaElementosMiniElevador.remove("Motor electrico 1\n");
       listaElementosMiniElevador.remove("Motor electrico 2\n");
       listaElementosMiniElevador.remove("Cautin\n");
       listaElementosMiniElevador.remove("Estaño\n");
       listaElementosMiniElevador.remove("Alambre flexible\n");
       listaElementosMiniElevador.remove("Alambre sólido\n");
       listaElementosMiniElevador.remove("Pila Bateria de 9V\n");
       listaElementosMiniElevador.remove("Broche de pila bateria");
       
       System.out.println("Número de elementos del MINI ELEVADOR despues de ser "
               + "utilizados en su prototipo son:"+listaElementosMiniElevador.size()+ "\n");
       System.out.println("LOS ELEMENTOS QUE NO SE UTILIZARON PARA LA CONSTRUCCION DEL MINI "
               + "ELEVADOR ELÉCTRICO SON:");
       System.out.println(listaElementosMiniElevador.toString());
       
    }
    
}
