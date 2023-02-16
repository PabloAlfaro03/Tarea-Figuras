package Stacks_Queues;

public class Queues {

    int Max;
    char[] queue;
    int tail;

    public Queues(int Max) {
        this.Max = Max;
        queue = new char[Max];
        tail = 0;
    }


    public void enqueue(char item) {
        if (tail < Max) {
            queue[tail++] = item;
        }
    }

    public char dequeue() {
        if (tail == 0) {
            return '0';
        } else {
            char item = queue[0];
            for (int i = 0; i < tail - 1; i++) {
                queue[i] = queue[i + 1];
            }
            tail--;
            return item;
        }
    }
}
