package org.example;

import java.util.Scanner;
public class Atv03Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            double nota1, nota2, nota3, media = 0;
            int cod = 0;

            do {
                System.out.println("Informe o Código do aluno: ");
                cod = ler.nextInt();
                //
                if(cod ==0){
                    break;
                }
                System.out.println("Informe a sua primeira nota: ");
                nota1 = ler.nextDouble();

                System.out.println("Informe a sua segunda nota: ");
                nota2 = ler.nextDouble();

                System.out.println("Informe a sua terceira nota nota: ");
                nota3 = ler.nextDouble();
                media = (nota1+nota2+nota3)/3;

                System.out.println("A sua média de nota é: "+media+".");
            }while(cod != 0);





    }


}
