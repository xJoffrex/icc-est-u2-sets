package src.Controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";

        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";

        System.out.println("Ejercicios");
        int[] numeros = {1, 2, 3, 4, 5, 2};
        System.out.println(tieneDuplicados(numeros));
        System.out.println("Ejercicio 2");
        System.out.println(esIsograma("Murcielago"));
        System.out.println(esIsograma("Camaleon"));
        System.out.println(contarPalabrasUnicas(texto));
        System.out.println("Ejercicio 3");
        comprarTextos(texto1, texto2);

        
    }

    public boolean tieneDuplicados(int[] numeros) {
        HashSet<Integer> vistos = new HashSet<>();
        for (int num : numeros) {
            if (vistos.contains(num)) {
                return true; 
            }
            vistos.add(num);
        }
        return false; 

    }
    public boolean esIsograma(String palabra){
        HashSet<Character> palabras = new HashSet<>();
       
        for (char c : palabra.toLowerCase().toCharArray()){
            if (palabras.contains(c)){
                return true;
            }
            palabras.add(c);
        }
        return false;
    }

    public int contarPalabrasUnicas(String frase){
        HashSet<String> palabras = new HashSet<>();
        for (String palabra : frase.toLowerCase().split(" ")) {
            if (!palabra.isEmpty()) {
                palabras.add(palabra);
            }
        }
        return palabras.size();       
    }

    public HashSet<String> PlabrasUnicas(String frase){
        HashSet<String> palabras = new HashSet<>();
        for (String palabra : frase.toLowerCase().split(" ")) {
            if (!palabra.isEmpty()) {
                palabras.add(palabra);
            }
        }
        return palabras;
    }

    public void comprarTextos(String texto1, String texto2){
        Set<String> palabras1 = PlabrasUnicas(texto1);
        Set<String> palabras2 = PlabrasUnicas(texto2);
        Set<String> comunes = new HashSet<>(palabras1);

        comunes.retainAll(palabras2);

        Set<String> soloTexto1 = new HashSet<>(palabras1);
        soloTexto1.removeAll(palabras2);

        Set<String> soloTexto2 = new HashSet<>(palabras2);
        soloTexto2.removeAll(palabras1);

        Set<String> union = new HashSet<>(palabras1);
        union.addAll(palabras2);

        double coincidencia = 0.0;
        if (!union.isEmpty()) {
            coincidencia = (double) comunes.size() / union.size() * 100;
        }

        System.out.println("Texto 1: " + soloTexto1.size() + " palabras unicas");
        System.out.println("Texto 2: " + soloTexto2.size() + " palabras unicas");
        System.out.println("Cuantas palabras comunes: " + comunes.size());
        System.out.println("Solo en texto 1: " + soloTexto1);
        System.out.println("Solo en texto 2: " + soloTexto2);
        System.out.printf("Coincidencia lexica: %.5f%%\n", coincidencia);
    }
    
}


//Texto 1: 15 ppalabras Unicas
//Texto 2: 13 palabras unicas
//Palabras comunes 4
//coincidencia lexica 16.66666
