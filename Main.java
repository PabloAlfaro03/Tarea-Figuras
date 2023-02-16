package Stacks_Queues;

public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        String inputString2= "hola";
        char[] inputArray = {'h', 'o', 'l', 'a'};
        System.out.println("inviertiendo la cadena: " + new String(stack.reverseArray(inputArray)));

        String inputString = "Anita Lava la tina";
        System.out.println("analizando si '" + inputString + "' es un palindrome: " + stack.isPalindrome(inputString));
        System.out.println("analizando si '" + inputString2 + "' es un palindrome: " + stack.isPalindrome(inputString2));

        stack.push('h');
        stack.push('e');
        stack.push('l');
        stack.push('l');
        stack.push('0');

        System.out.println("sacando elementos: " + stack.pop() + ", " + stack.pop() + ", " + stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queues queue = new Queues(3);

        queue.enqueue('o');
        queue.enqueue('l');
        queue.enqueue('l');
        queue.enqueue('0');

        System.out.println("elimando elementos " + queue.dequeue() + ", " + queue.dequeue() + ", " + queue.dequeue());

    }
}

