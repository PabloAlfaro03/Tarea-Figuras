package Stacks_Queues;

import java.util.ArrayList;

public class MyStack {
    ArrayList<Character> elementos;


    public MyStack() {
        elementos = new ArrayList<>();
    }

    public void push(char newSize) {

        elementos.add(newSize);
    }

    public char pop() {
        if (elementos.isEmpty()) {
            System.out.println("la fila esta vacia");
            return '0';
        } else {
            char item = elementos.get(elementos.size() - 1);
            elementos.remove(elementos.size() - 1);
            return item;
        }
    }

    public char[] reverseArray(char[] entradaDeCadena) {
        for (int i = 0; i < entradaDeCadena.length; i++) {
            push(entradaDeCadena[i]);
        }
        char[] reversedArray = new char[entradaDeCadena.length];
        for (int i = entradaDeCadena.length - 1; i >= 0; i--) {
            reversedArray[i] = pop();
        }
        return reversedArray;
    }


    public boolean isPalindrome(String entrada) {
        char[] entradaDeCadena = entrada.toCharArray();
        for (int i = 0; i < entradaDeCadena.length; i++) {
            push(entradaDeCadena[i]);
        }
        int size = elementos.size();
        for (int i = 0; i < size / 2; i++) {
            char item = pop();
            if (entradaDeCadena[i] != item) {
                return false;
            }
        }
        return true;
    }
}