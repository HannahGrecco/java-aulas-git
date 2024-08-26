package org.example;

import java.util.Scanner;


public class Atv03Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, soma = 0, cont = 0;
        for (cont = 0; cont < 5; cont++ ) {
            System.out.println("Informe o número que você deseja somar:  ");
            x = ler.nextInt();
            soma += x;
        }
        System.out.println("O somatório dos números é: "+soma+" ");

    }
}
