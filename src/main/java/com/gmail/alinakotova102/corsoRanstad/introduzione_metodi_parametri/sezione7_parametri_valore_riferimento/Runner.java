package com.gmail.alinakotova102.corsoRanstad.introduzione_metodi_parametri.sezione7_parametri_valore_riferimento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public List<String> lista = new ArrayList<>();

    public static void main(String[] args) {
        Runner runner = new Runner();
        System.out.println(runner.incrementa(2));
        runner.aggiungiElemento("Chi-chi");
        System.out.println(runner.lista);
        int[] svuoto = new int[]{3, 5, 2, 4, 2, 1, 4};
        runner.svuotaArray(svuoto);
        System.out.println(Arrays.toString(svuoto));
    }

    public void svuotaArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    /*public int incrementa(int x) { // il valore non si cambia
        return x++;
    }
    */

    public int incrementa(int x) {
        return ++x;
    }

    public void aggiungiElemento(String elemento) {
        lista.add(elemento);
    }
}
