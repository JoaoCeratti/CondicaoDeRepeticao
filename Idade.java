package br.unipar.main;

import java.util.Scanner;

public class ExempleFor {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int[] num = new int[4];

        int par = 0;
        int impar = 0;
        for (int i = 0; i < 4; i++) {

            System.out.println("Digite a idade da pessoa " + i + ":");
            num[i] = scr.nextInt();

            if (num[i] <= 18) {

                par++;
            } else {
             
                impar++;
            }

        }
        System.out.println("pessoas maiores de idade: " + par);
        System.out.println("pessoas menores de idade: " + impar);
    }
}
