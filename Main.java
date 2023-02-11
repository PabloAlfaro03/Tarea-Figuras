import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int i;
        int j;
        int posición = 0;


        //-------------------------------------------------------------------------------------------
        int[] enteros = new int[20];
        System.out.println("ingrese los numeros");
        for (i = 0; i < enteros.length; i++) {
            enteros[i] = input.nextInt();
            enteros[9] = 5;
            System.out.println(" " + i);
        }
        System.out.println("ingrese el numero a buscar");
        int n = input.nextInt();
        if (circulo.bucarNumero(n,enteros)){
            System.out.println("el numero esta en el arreglo");
        }else{
            System.out.println("el numero no esta en el arreglo");
        }
        //System.out.println("Elija la pisicion del valor que se va a eliminar");
        //posición = input.nextInt();
        //if (circulo.eliminarArray(valor,enteros)){
           // System.out.println("el numero se elimino con exito" + n);
        //}else{
          //  System.out.println("el numero no esta en el arreglo");
        //}
        //-------------------------------------------------------------------------------------------
        String[] nombres = new String[15];
        System.out.println("ingrese los nombres tiene: " + nombres.length + " espacios");
        for (j = 0; j < nombres.length; j++)
            nombres[j] = input.nextLine();
        nombres[0] = "francisco";
        System.out.println(Arrays.toString(nombres));
        //------------------------------------------------------------------------------------------
        circulo variables = new circulo();
        circulo[] figura = new circulo[100];

        //-------------------------------------------------------------------------------------------











    }
}