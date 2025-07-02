package src.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public void Set(){




    }

    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");

        return palabras;
    }

    public LinkedHashSet<String> construirLinkedHashSet(){
        LinkedHashSet<String> palabrass = new LinkedHashSet<>();
            palabrass.add("Laptop");
            palabrass.add("Manzana");
            palabrass.add("Pera");
            palabrass.add("Celular");
            palabrass.add("Laptop");
            palabrass.add("Celular");

        return palabrass;
    }

    public TreeSet<String> construirTreeSet(){
        TreeSet<String> palabrasT = new TreeSet<>();  
            palabrasT.add("Laptop");          
            palabrasT.add("Manzana");
            palabrasT.add("Pera");
            palabrasT.add("Celular");
            palabrasT.add("Laptop");
            palabrasT.add("Celular");
            palabrasT.add("Celulas");

        return palabrasT;
    }

    public Set<String> ConstruirSetConComparador() {
        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               int result = Integer.compare(s1.length(), s2.length());
                if (result == 0){
                    return s1.compareTo(s2);
                }else{
                    return result;
                }
            }
        };

        Set<String> palabrasT = new TreeSet<>(comparador);
        palabrasT.add("Laptop");
        palabrasT.add("Manzana");
        palabrasT.add("Pera");
        palabrasT.add("Celular");
        palabrasT.add("Laptop");
        palabrasT.add("Celular");
        palabrasT.add("Celulas");

        return palabrasT;
    }

}
