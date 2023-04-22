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
public class ExtrasG1 {
    
    /* 1. Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en
días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas. */
    public static void convertirADias(int minutos){
        int dias,horas;
        dias = minutos / 1440;
        minutos = minutos - (dias * 1440);
        horas = minutos / 60;
        minutos = minutos - (horas * 60);
        System.out.println("Serian " + dias + " Dias, con " + horas + " horas y " + minutos + " minutos.");
    }
    
    /* 2. Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle
un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B
tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */
    
    public static void usarAxiliar(){
        int a=1,b=2,c=3,d=4,aux;
        
        System.out.println("Los Valores iniciales son: a = " + a + ", b= " + b + ", c= " + c + ", d= " + d);
        aux = b;
        b=c;
        c=aux;
        aux=c;
        c=a;
        a=aux;
        aux = a;
        a=d;
        d=aux;
        aux=d;
        d=b;
        b=aux;
        System.out.println("Los Valores finales son: a = " + a + ", b= " + b + ", c= " + c + ", d= " + d);
        
        
    }
    
    /* 3. Elaborar un método en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso
contrario mostrar un mensaje. */
    
    public static void esVocal(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una letre ");
        String vLetra = teclado.nextLine();
        if ( vLetra.equals("a") || vLetra.equals("e") || vLetra.equals("i") || vLetra.equals("o") || vLetra.equals("u") )
            System.out.println("Es una Vocal");
        else
            System.out.println("No es una Vocal");
        
    }
    
    /* 4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente
en romano. */
    
    public static void aRoma(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un numero ");
        int vNumero = teclado.nextInt();
        switch(vNumero){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("No tengo ese numero");
                break;
        }
    }
    
    /* 5. Una obra social tiene tres clases de socios:
 Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
los tipos de tratamientos.
 Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los
mismos tratamientos que los socios del tipo A.
 Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho
socio. Crear un método con el algoritmo para dar solución a lo propuesto. */
    
    public static void descurntoSocio(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese tipo de Socio: ");
        String socio = teclado.nextLine();
        System.out.print("Costo a cobrar al Socio: ");
        double costo = teclado.nextDouble();
        switch (socio) {
            case "A":
                System.out.println("El importe es de " + (costo - (costo * 50 / 100)));
                break;
            case "B":
                System.out.println("El importe es de " + (costo - (costo * 35 / 100)));
                break;
            case "C":
                System.out.println("El importe es de " + costo);
                break;
        }
    }
    
    /* 6. Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y
determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de
estaturas en general. */
    
    public static void calculaAltura(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas personas mediremos!! ");
        int vCant = teclado.nextInt();
        int vMinions=0;
        
        for (int i = 0; i<vCant; i++){
            System.out.print("Ingrese la altura de la persona Nro " + (i+1) + ": ");
            double vAlt = teclado.nextDouble();
            if (vAlt <= 1.60)
                vMinions++;
        }
        System.out.println("La cantidad promedio de minions es de " + ( vMinions * 100 / vCant));
        
    }
    
    /* 7. Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de
n números (n>0). El valor de n se solicitará al principio del programa y los números serán
introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra
con el bucle “do - while”. */
    
    public static void calcMaxMinPromFor(){
        
        // Se realizo inicialmente con todos los variables INT pero el promedio se redondeava ej 16/5 = 3 y no 3.2 no se porque
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros cargaremos ");
        double vCant = teclado.nextDouble();
        double vMin=99999,vMax=-9999,vAcumulador=0;
        for (int i = 0; i<vCant; i++){
            System.out.print("Ingrese el nro " + (i+1) + ": ");
            double vAlt = teclado.nextDouble();
            if (vAlt > 0) {
                if (vAlt < vMin) {
                    vMin = vAlt;
                }
                if (vAlt > vMax) {
                    vMax = vAlt;
                }
                vAcumulador = vAcumulador + vAlt;
            }
        }
        System.out.println(vCant);
        System.out.println("el maximo ingresado fue el: " + vMax);
        System.out.println("el minimo ingresado fue el: " + vMin);
        //double vProm = vAcumulador/vCant;
        //System.out.println("el promedio fue de: " + vProm);
        System.out.println("el promedio fue de: " + (vAcumulador/vCant));
    }
    public static void calcMaxMinPromDo(){
        
        // Se realizo inicialmente con todos los variables INT pero el promedio se redondeava ej 16/5 = 3 y no 3.2 no se porque
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros cargaremos ");
        int i = 0;
        double vCant = teclado.nextDouble();
        double vMin=99999,vMax=-9999,vAcumulador=0;
        do{
            System.out.print("Ingrese el nro " + (i+1) + ": ");
            double vAlt = teclado.nextDouble();
            if (vAlt > 0) {
                if (vAlt < vMin) {
                    vMin = vAlt;
                }
                if (vAlt > vMax) {
                    vMax = vAlt;
                }
                vAcumulador = vAcumulador + vAlt;
            }
            i++;
        }while (i<vCant);
        System.out.println(vCant);
        System.out.println("el maximo ingresado fue el: " + vMax);
        System.out.println("el minimo ingresado fue el: " + vMin);
        //double vProm = vAcumulador/vCant;
        //System.out.println("el promedio fue de: " + vProm);
        System.out.println("el promedio fue de: " + (vAcumulador/vCant));
    }
    public static void calcMaxMinPromWhile(){
        
        // Se realizo inicialmente con todos los variables INT pero el promedio se redondeava ej 16/5 = 3 y no 3.2 no se porque
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros cargaremos ");
        int i = 0;
        double vCant = teclado.nextDouble();
        double vMin=99999,vMax=-9999,vAcumulador=0;
        while (i<vCant){
            System.out.print("Ingrese el nro " + (i+1) + ": ");
            double vAlt = teclado.nextDouble();
            if (vAlt > 0) {
                if (vAlt < vMin) {
                    vMin = vAlt;
                }
                if (vAlt > vMax) {
                    vMax = vAlt;
                }
                vAcumulador = vAcumulador + vAlt;
            }
            i++;
        }
        System.out.println(vCant);
        System.out.println("el maximo ingresado fue el: " + vMax);
        System.out.println("el minimo ingresado fue el: " + vMin);
        //double vProm = vAcumulador/vCant;
        //System.out.println("el promedio fue de: " + vProm);
        System.out.println("el promedio fue de: " + (vAcumulador/vCant));
    }
    
    /* 8. Escriba un método que lea números enteros. Si el número es múltiplo de cinco debe detener la
lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de
números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
Nota: recordar el uso de la sentencia break. */
    
    public static void leerNumeros(){
        Scanner teclado = new Scanner(System.in);
        int i=0,vCantPares=0,vCantImpares=0,vCoincidencias=0,vNum;
        do{
            System.out.print("Ingrese un numero: ");
            vNum = teclado.nextInt();
            if (vNum >= 0){
                if (vNum % 2 == 0){
                    vCantPares++;
                } else {
                    for (int b = 2; b < vNum; b++) {
                        if (vNum % b == 0) {
                            vCoincidencias++;
                        }
                    }
                    if (vCoincidencias == 0) {
                        vCantImpares++;
                    }
                }
            }
            i++;
        }while (vNum % 5 != 0);
        System.out.println("La cantidad de numero pares fue de " + vCantPares);
        System.out.println("La cantidad de numero impares fue de " + vCantImpares);
        System.out.println("La cantidad de numero leidos fue de " + i);
    }
    
    /* 9. Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el
dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
Crear un método con el algoritmo necesario para dar solución a lo propuesto. */
    public static void divideRestando(int a, int b){
        int i = 0;
        while (a>=b){
            a = a - b;
            i++;
        }
        System.out.println("El resultado de la division seria de " + i);
        System.out.println("El resto de la division es " + a);
    }
    
    /* 10. Realice un método para que el usuario adivine el resultado de una multiplicación entre dos
números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta
es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su
respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
Math.random() de Java. */
    public static void adivinaResultado(){
        Scanner teclado = new Scanner(System.in);
        int a= (int) (Math.random()*10);
        int b= (int) (Math.random()*10);
        int vResp;
        System.out.println("Aleatorios " + a + " y " + b);
        do{
            System.out.print("Adivina el numero:  ");
            vResp = teclado.nextInt();
            if (vResp == (a*b)){
                System.out.println("Ding Ding Ding Correcto!! porfin le atinaste a algo!!!!");
            }else{
                System.out.println("Nop le fallaste, intenta de nuevo!!! nadie se va sin adivinar!!!!");      
            }
        }while(vResp!=(a*b));
    }
    
    /* 11. Escribir un método que lea un número entero y devuelva el número de dígitos que componen
ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar
que las variables de tipo entero truncan los números o resultados. */
    public static void contarDigitos(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int vNum = teclado.nextInt();
        int vCont= 1,vNum1 = vNum;
        while (vNum1>9){
            vNum1 = vNum1/10;
            vCont++;
        }
        System.out.println("La cantidad de digitos del numero " + vNum + " es de " + vCont);
    }
    
    /* 12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0
al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Crear un método que dé solución a lo propuesto en el enunciado. */
    public static void publicidad() {
        String vCadena="";
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    if (a==3)
                        vCadena = vCadena + "E-";
                    else
                        vCadena = vCadena + a + "-";
                    if (b==3)    
                        vCadena = vCadena + "E-";
                    else
                        vCadena =  vCadena + b + "-";
                    if (c==3)
                        vCadena = vCadena + "E";
                    else
                        vCadena = vCadena + ""+ b;
                    System.out.println(vCadena);
                    vCadena= " ";
                    }
                }
            }

        }
    
   /* 13. Crear un método que dibuje una escalera de números, donde cada línea de números comience
en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
Ejemplo: si se ingresa el número 3:
1
12
123 */
    public static void escaleraDeNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        int vNum = teclado.nextInt();
        for (int i = 1; i<=vNum; i++){
            for (int b=1; b<=i; b++){
                System.out.print(""+b);
            }
            System.out.println(" ");
        }
    }
    
    
    
} // fin del metodo
