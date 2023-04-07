/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3t1;

/**
 *
 * @author USER
 */
public class ExampleStack {
    private int top;
    private String[] stackArr;
    private int maxSize;

    public ExampleStack(int size) {
        this.maxSize = size;
        this.stackArr = new String[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return stackArr[top];
    }

    public void push(String value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        stackArr[top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        String value = stackArr[top];
        top--;
        return value;
    }

    public int search(String value) {
        int index = -1;
        for (int i = 0; i <= top; i++) {
            if (stackArr[i].equals(value)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return -1;
        }
        return top - index + 1;
    }

    public static void main(String[] args) {
        ExampleStack st = new ExampleStack(5);

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next :" + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}

