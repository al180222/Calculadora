package calculadora3;
import java.util.Scanner;
public class Calculadora3 {
    //metodo para leer numeros
    public static float leerNumeros(String mensaje){
            Scanner entrada = new Scanner(System.in);
            System.out.println(mensaje);
            return entrada.nextFloat();
        }
    //metodo para mostrar el menu
    public static void menu(){
        System.out.println("-Ingrese el número correspondiente-");
        System.out.println("------------ Opciones -------------");
        System.out.println("------------ 1. Sumar -------------");
        System.out.println("------------ 2. Restar ------------");
        System.out.println("------------ 3. Multiplicar -------");
        System.out.println("------------ 4. Dividir -----------");
    }
    //metodo para invocar el switch
    public static void casos(int i, Operaciones cal){
        String mensaje2 = "El resultado es: ";
        switch (i) {
                case 1:
                    System.out.println(mensaje2);
                    System.out.println(cal.suma());
                     break;
                case 2:
                    System.out.println(mensaje2);
                    System.out.println(cal.resta());
                    break;
                case 3:
                    System.out.println(mensaje2);
                   System.out.println(cal.mult());
                    break;
                case 4: 
                    System.out.println(mensaje2);
                    System.out.println(cal.div());
                    break;
                default:
                    System.out.println("Ingresar valor valido");
                }  
    }
    public static void todo (Operaciones calc){
        do{
            calc.setNum1(leerNumeros("Ingrese el numero 1"));
            calc.setNum2(leerNumeros("Ingrese el numero 2"));
            menu();
            casos((int)leerNumeros("Ingrese una opcion"), calc);
        } while((int) leerNumeros("Si desea salir ingrese un 0 y si desea continuar un 1") == 1);
    }
    public static void main(String[] args) {
        Operaciones objeto1 = new Operaciones();
        todo(objeto1);
    }
}       