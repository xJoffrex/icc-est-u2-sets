package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import src.Controllers.Sets;


public class Main {
    public static void main(String[] args) {
        Sets set = new Sets();
        System.out.println("-------------HashSet---------------");
        runHashSet(set);
        System.out.println("-----------LinkedHashSet---------------");
        runLinkedHashSet(set);
        System.out.println("--------------TreeSet--------------");
        runTreeSet(set);
        System.out.println("-----------Comparador---------------");
        runTreeSetComparador(set);
        System.out.println("------Comparador Inversa---------");
        runTreeSetComparadorInv(set);
        
       

    }

    public static void runHashSet(Sets sets){

        Set<String> palabras = sets.construirHashSet();

        for (String palabra : palabras) {
            System.out.println("Palabra: " + palabra);
        }

    }

    public static void runLinkedHashSet(Sets sets){

        Set<String> palabras = sets.construirLinkedHashSet();

        for (String palabra : palabras) {
            System.out.println("Palabra: " + palabra);
        }

    }
    public static void runTreeSet(Sets sets){

        Set<String> palabras = sets.construirTreeSet();

        for (String palabra : palabras) {
            System.out.println("Palabra: " + palabra);
        }

    }

    public static void runTreeSetComparador(Sets sets){

        Set<String> palabras = sets.ConstruirSetConComparador();

        for (String palabra : palabras) {
            System.out.println("Palabra: " + palabra);
        }

    }

    public static void runTreeSetComparadorInv(Sets sets){

        Set<String> palabras = sets.ConstruirSetConComparador();
        List<String> inversa = new ArrayList<>(palabras);


        for (int i = inversa.size() - 1 ; i >= 0 ; i--) {
            System.out.println(inversa.get(i));
        }

    }
}
