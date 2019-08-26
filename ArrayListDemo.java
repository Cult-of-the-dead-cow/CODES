/*
ArrayList:
->built in dynamic collection class inside java.util package
->benefitial over arrays
->no size needs to be specified at the time ArrayList declaration
->ArrayLists can expand and shrink
->one ArrayList can contain differnt data type's data
*/

//import the ArrayList class
import java.util.ArrayList;
//import he Iterator interface
import java.util.Iterator;

class ArrayListDemo
{
    public static void main(String args[])
    {
        //ArrayList declaration - to store any data type's data
        //ArrayList arrlist = new ArrayList();

        //or

        //ArrayList declaration to store a single data type's data
        ArrayList<String> arrlist = new ArrayList<String>();
        //<Integer>
        //<Float>
        //<Double>  

        //append item into the arraylist - add at end
        //arrlist.add(item);
        arrlist.add("Chandigarh");
        arrlist.add("New Delhi");
        arrlist.add("Mumbai");

        //can display the entire ArrayList
        System.out.println(arrlist);

        //can access the length of the ArrayList
        System.out.println("No. of items: "+arrlist.size());
       
        //can access individual items using index
        //Object data = arraylist.get(index);
        String item = arrlist.get(0);
        System.out.println("Item at 0 index: "+item);
        String item2 = arrlist.get(2);
        System.out.println("Item at 2 index: "+item2);
        //String item3 = arrlist.get(20);             //java.lang.IndexOutOfBoundsException
        //System.out.println("Item at 20 index: "+item3);

        //inserting an item at an index - right shift
        //arrlist.add(index, item);
        arrlist.add(1, "Kolkatta");
        
        System.out.println(arrlist);

        //replace an item with a new item
        //arrlist.set(index, newitem);
        arrlist.set(1, "Amritsar");
        System.out.println(arrlist);

        //deletion using the index - left shift
        //Object deleteditem = arrlist.remove(index);
        //String deleteditem = arrlist.remove(1);
        //System.out.println("Deleted Item: "+deleteditem);
        //System.out.println(arrlist);

        //deletion using the item - left shift
        //boolean res = arrlist.remove(item_To_remove);
        String itemtobedeleted = "Amritsari";
        boolean chk = arrlist.remove(itemtobedeleted);
        if(chk == true) {
            System.out.println("Item "+itemtobedeleted+" deleted");
        }
        else {
            System.out.println("Item "+itemtobedeleted+" not deleted as not found");
        }

        //ArrayList traversal - method 1 - using regular for loop
        System.out.println("\nArrayList contents: ");
        for(int i=0 ; i<arrlist.size() ; i++) {
            String it = arrlist.get(i);
            System.out.println(it);
        }

        //ArrayList traversal - method 2 - using for-each loop
        /*
        for(Datatype tempvar : arraylistname)
        {
            use tempvar
        }

        Note:
        ->this for-each loop auto starts from the 0 index position
        ->this for-each loop auto increments by 1 index position
        ->this for-each loop auto stops on reaching the end
        */

        System.out.println("\nArrayList contents: ");
        for(String temp: arrlist) {
            System.out.println(temp);
        }

        //ArrayList traversal - method 3 - using Iterator
        System.out.println("\nArrayList contents: ");
        //Iterator is a built in interface that is used to tarverse a collection
        //declare an iterator for this arraylist
        Iterator iterator = arrlist.iterator();

        //iterate till the ArrayList has a records
        //hasNext() returns true if record exists in collection
        //hasNext() returns false if record does not exist in collection
        while(iterator.hasNext()) {
            //extract the current record
            Object data = iterator.next();
            System.out.println(data.toString());
        }

        //remove all items from the ArrayList
        arrlist.clear();
    }    

}