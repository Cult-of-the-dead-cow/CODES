
package Generics;

//generic class
class TestClass<T> {
    private T data;
    public void setData(T d) {
        data = d;
    }
    public T getData() {
        return data;
    }
}

public class Generics {
    public static void main(String args[]) {
    
        //object declaration of generic class
        TestClass<Integer> t1 = new TestClass<Integer>();
        t1.setData(100);
        System.out.println("t1's data: "+t1.getData());
        
        TestClass<String> t2 = new TestClass<String>();
        t2.setData("Hello");
        System.out.println("t2's data: "+t2.getData());
    }
}
