/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradora;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class IntegradorA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vResp;
        do {
            System.out.println("**** MENU ****");
            System.out.println("1 - Convertir un numero a Dias");
            System.out.println("2 - Usar un Auxiliar");
            System.out.println("3 - Es una vocal?");
            System.out.println("4 - Convertir un numero a numeros romano");
            System.out.println("5 - Descuentos a Socios");
            System.out.println("6 - Calculos de Alturas");
            System.out.println("7 - Calcula Maximo, Minimo y promedio");
            System.out.println("8 - Leer numeros Enteros");
            System.out.println("9 - Divide Restando");
            System.out.println("10 - Adivica Resultado");
            System.out.println("11 - Contar Digitos");
            System.out.println("12 - Publicidad");
            System.out.println("13 - Escalera de Numeros");
            System.out.print(" Ingresa S para Salir  ");    
            vResp = teclado.nextLine();
            switch (vResp) {
                case "1":
                    ExtrasG1.convertirADias(1510);
                    break;
                case "2":
                    ExtrasG1.usarAxiliar();
                    break;
                case "3":
                    ExtrasG1.esVocal();
                    break;
                case "4":
                    ExtrasG1.aRoma();
                    break;
                case "5":
                    ExtrasG1.descurntoSocio();
                    break;
                case "6":
                    ExtrasG1.calculaAltura();
                    break;
                case "7":
                    System.out.println("Con un Ciclo For");
                    ExtrasG1.calcMaxMinPromFor();
                    System.out.println("Con un Ciclo Do - While");
                    ExtrasG1.calcMaxMinPromDo();
                    System.out.println("Con un Ciclo While");
                    ExtrasG1.calcMaxMinPromWhile();
                    break;
                case "8":
                    ExtrasG1.leerNumeros();
                    break;
                case "9":
                    ExtrasG1.divideRestando(12, 3);
                    break;
                case "10":
                    ExtrasG1.adivinaResultado();
                    break;
                case "11":
                    ExtrasG1.contarDigitos();
                    break;
                case "12":
                    ExtrasG1.publicidad();
                    break;
                case "13":
                    ExtrasG1.escaleraDeNumeros();
            }
        }while (!"S".equals(vResp));
        System.out.println("Gracias por usar nuestros sistemas!!! - vuelva pronto");
    }
    
    
    
    
}
