//generic interface definition
interface GenericInterface<T> {
    //declare a method with the generics
    void setData(T data);
    T getData();
}

//define a class and implement the interface
class MyClass1 implements GenericInterface<Integer> {
    private int data;
    //overrid ethe interface methods
    public void setData(Integer data) {
        this.data = data;
    }
    public Integer getData() {
        return this.data;
    }
}

class MyClass2 implements GenericInterface<String> {
    private String data;
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return this.data;
    }
}

public class GenericsInterface {
    public static void main(String args[])
    {
        
    }
}
