


//En esta clase definiremos las caracteristicas de las naves espaciales
abstract class Vehiculo_aereo {
    String vehiculo1 = "Lanzadera";
    String vehiculo2 = "Nave Espacial no Tripulada";
    String Vehiculo3 =  "Naves Tripuladas";
    String[] naveTipo1={"0 SATURNO","1 TRANSBORDADOR ESPACIAL","2 PROTON"};
    String[] naveTipo2={"0 EXPLORER","1 PROGRESO M","2 ATV****"};
    String[] naveTipo3={"0 DRAGON V2","1 VOSTOK","2 EEI"};
    String eleccion1;

    



    abstract public void tipo_nave();
    abstract public void seleccionar_nave();


    
}
