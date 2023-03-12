package br.com.jfs_junior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>() {{
           add(new Gato("Spock", 116, "Branco"));
           add(new Gato("Uhura", 26, "Preto"));
           add(new Gato("Data", 2, "Tigrado"));
        }};
        System.out.println("[[[ ORDEM DE INSERCAO ]]]");
        System.out.println(meusGatos);

        System.out.println("[[[ ORDEM ALEATORIA ]]]");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("[[[ ORDEM NATURAL ]]]");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("[[[ ORDEM IDADE ]]]");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("[[[ ORDEM COR ]]]");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("[[[ ORDEM NOME/COR/IDADE ]]]");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}