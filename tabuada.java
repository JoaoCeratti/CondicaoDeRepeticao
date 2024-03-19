package br.unipar.main;
import java.util.Scanner;

public class ExempleFor {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("------------TABUADA-------------");
        System.out.printf("Digite um número: ");
        int num1 = scr.nextInt();
        for (int i = 0; i <= 10;i++){

            System.out.println(num1 + "x" + i + "=" + num1 * i );
        }


    }
}
