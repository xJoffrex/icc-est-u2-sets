package src.utils;
import java.util.Comparator;

import src.Models.Contacto;

public class ContactoComparatorTelefono implements Comparator<Contacto>{


    @Override
    public int compare(Contacto o1, Contacto o2) {
        int resulComparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        int resultComparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());

        if (resulComparacionApellido != 0){
            return resulComparacionApellido;
        }else if (resulComparacionApellido == 0){
            return resultComparacionNombre;
        }
        int resultTelefono = o1.getTelefono().compareTo(o2.getTelefono());
        return resultTelefono;
            
        
    }
}
