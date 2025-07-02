package src.Controllers;
import src.Models.Contacto;
import src.utils.ContactoComparator;
import src.utils.ContactoComparatorHash;
import src.utils.ContactoComparatorTelefono;

import java.util.TreeSet;

public class ContactoController {
    public ContactoController(){
        runTreeContact();
        runTreeContactTelefono();
        runTreeContactHash();
    }


    public void runTreeContact(){
        ContactoComparator cmp = new ContactoComparator();
        TreeSet<Contacto> agenda = new TreeSet<>(cmp);
        
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("Lista Apellido - Nombre");

        for (Contacto contactos : agenda){
            System.out.println(contactos);
        }
        
    }

    public void runTreeContactTelefono(){
        ContactoComparatorTelefono cmp1 = new ContactoComparatorTelefono();
        TreeSet<Contacto> agenda = new TreeSet<>(cmp1);
        
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("Lista Apellido - Nombre - Telefono");

        for (Contacto contactos : agenda){
            System.out.println(contactos);
        }
    }

    public void runTreeContactHash(){
        ContactoComparatorHash cmp2 = new ContactoComparatorHash();
        TreeSet<Contacto> agenda = new TreeSet<>(cmp2);
        
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));

        System.out.println("Hash");
        for (Contacto contactos : agenda){
            System.out.println(contactos);
        }
    }
}
