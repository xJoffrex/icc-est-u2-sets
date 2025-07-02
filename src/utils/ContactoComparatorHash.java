package src.utils;

import java.util.Comparator;

import src.Models.Contacto;

public class ContactoComparatorHash implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int result = Integer.compare(o1.hashCode(), o2.hashCode());

        if (result == 0){
            return Integer.compare(o1.getApellido().hashCode(), o2.getApellido().hashCode());
        }else{
            return result;
        }
    }

    
}
