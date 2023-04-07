/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3t2;

/**
 *
 * @author USER
 */
class MainQueue {
    public void queueExample(){
        Queue queue = new Queue();
        queue.add("Java");
        queue.add("DotNet");
        queue.add("PHP");
        queue.add("HTML");
        System.out.println("remove  : " +queue.remove());
        System.out.println("element : " +queue.element());
        System.out.println("poll    : " +queue.poll());
        System.out.println("peek    : " +queue.peek());
    }
    
    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}
