class MyClass {
    //generic constructor definition
    public <T> MyClass(T item) {
        System.out.println("Generic Constructor called!");
        System.out.println("Item: "+item);
        System.out.println("Type of item: "+item.getClass().getName());
    }
}

public class GenericsConstructor {
    public static void main(String args[]) {
        //declaring an obejct of the class that has a generic constructor
        MyClass obj1 = new MyClass("Hello World!");
        
        //declaring an obejct of the class that has a generic constructor
        MyClass obj2 = new MyClass(998.4);
        
    }
}
