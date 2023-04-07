/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3k2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author USER
 */
public class MainQueue {
    
    public void queueExample(){

        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.add("PHP");
        queue.add("HTML");
        
        System.out.println("remove : " + queue.remove());
        System.out.println("element : " + queue.element());
        System.out.println("poll : " + queue.poll());
        System.out.println("peek : " + queue.peek());
    }
    
    public static void main(String[] args) {
        new MainQueue().queueExample(); 
    }
    
}