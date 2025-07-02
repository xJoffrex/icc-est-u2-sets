package src.utils;

import java.util.Comparator;

import src.Models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //primero se compara por el apellido alfabeticamente
        int resulComparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());

        if (resulComparacionApellido != 0){
            return resulComparacionApellido;
        }
        int resulComparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resulComparacionNombre;
    }
    

}
