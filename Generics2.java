/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

public class Generics2 {
    
    public static <T> void printArray(T[] array) {
        
        for(T item: array) {
            System.out.println(item.toString());
        }
    }
    
    public static void main(String args[]) {
        Integer [] a = {1,2,3} ;
        Float [] b={ 1.2f, 3.2f, 2.2f};
        String[] c ={"ABC","abc","def"};
        
        System.out.println("\nInteger Array Items:");
        printArray(a);
        
        System.out.println("\nFloat Array Items:");
        printArray(b);
        
        System.out.println("\nString Array Items:");
        printArray(c);
        
        
    }
}
