import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Naves seleccion = new Naves();
        seleccion.tipo_nave();
        

        Scanner dato = new Scanner(System.in);
            seleccion.tipo_nave();
            System.out.println("1. " + seleccion.vehiculo1 );
            System.out.println("2. " + seleccion.vehiculo2 );
            System.out.println("3. " + seleccion.Vehiculo3 );
            seleccion.seleccionar_nave();
            String navess = dato.nextLine();
            String eleccion1 = navess;
            System.out.println("Seleccionaste nave tipo " + Integer.parseInt(eleccion1)  );
            int resultado = Integer.parseInt(eleccion1);

            if(resultado == 1){
                System.out.println("Puedes seleccionar las siguientes opciones");
                int i;
                
                for(i=0;i<=2;i++){ 
                    
                    System.out.println(seleccion.naveTipo1[i]);


                }
                System.out.print("Escribe el numero de la que has elegido: ");
                Scanner seleccionTipo1 = new Scanner(System.in);
                String naveReferencia = seleccionTipo1.nextLine();
                int selector = Integer.parseInt(naveReferencia);
                System.out.println("Buena eleccion tu nave es " + seleccion.naveTipo1[selector]);
                Despeque inicioVuelo = new Despeque();
                inicioVuelo.Acelerar_nave();
                inicioVuelo.AterrizaNave();


            }if(resultado == 2){
                System.out.println("Puedes seleccionar las siguientes opciones");
                int i;
                for(i=0;i<=2;i++){ 
                    
                    System.out.println(seleccion.naveTipo2[i]);


                }
                System.out.print("Escribe el numero de la que has elegido: ");
                Scanner seleccionTipo2 = new Scanner(System.in);
                String naveReferencia2 = seleccionTipo2.nextLine();
                int selector = Integer.parseInt(naveReferencia2);
                System.out.println("Buena eleccion tu nave es " + seleccion.naveTipo2[selector]);
                Despeque inicioVuelo2 = new Despeque();
                inicioVuelo2.Acelerar_nave();
                inicioVuelo2.AterrizaNave();
            }if(resultado == 3){
                System.out.println("Puedes seleccionar las siguientes opciones");
                int i;
                for(i=0;i<=2;i++){ 
                    
                    System.out.println(seleccion.naveTipo3[i]);


                }
                System.out.print("Escribe el numero de la que has elegido: ");
                Scanner seleccionTipo3 = new Scanner(System.in);
                String naveReferencia3 = seleccionTipo3.nextLine();
                int selector = Integer.parseInt(naveReferencia3);
                System.out.println("Buena eleccion tu nave es " + seleccion.naveTipo3[selector]);
                Despeque inicioVuelo3 = new Despeque();
                inicioVuelo3.Acelerar_nave();
                inicioVuelo3.AterrizaNave();
            }

        

    }
}
