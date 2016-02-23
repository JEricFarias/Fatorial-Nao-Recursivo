/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorialnaorecursivo;

/**
 *
 * @author Eric Farias
 * 
 */

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o número para calcular o fatorial: ");
        int num = input.nextInt();
        System.out.println("O Fatorial é: " + FatorialNaoRecursivo.fatorial(num));
    }
}
