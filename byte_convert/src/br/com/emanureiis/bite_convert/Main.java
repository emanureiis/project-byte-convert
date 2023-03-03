
package br.com.emanureiis.bite_convert;

import java.util.*;
/*
    Primeira versão da aplicação Byte Convert, cujo objetico é converter número binários em decimais;
    Esta é a primeira versão de tese;
 */
public class Main {
    public static void main(String[] args) {

        int resultado= 0;
        int base = 2;
        int aux = base;
        int n = 1;

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("2 ao " + i + " é: " + (aux = 1));
                System.out.println("resultado: " + aux * n);
            } else {
                System.out.println("2 ao " + i + " é: " + (aux = aux * base));
                System.out.println("resultado: " + aux * n);
            }
            resultado = resultado + aux;
            System.out.println(resultado);
        }
    }
}
