
import java.util.Scanner; 
 class LargestNumber 
  {
 static int getLLessThanN(int number, int digit) 
    { 
      char c = Integer.toString(digit).charAt(0); 
 
   
       for (int i = number; i > 0; --i) 
        { 
            if(Integer.toString(i).indexOf(c) == -1) 
          { 
              return i; 
            } 
     } 
 
   
      return -1; 
    }
 public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        int num=sc.nextInt(); 
       int dig=sc.nextInt(); 
        System.out.println(getLLessThanN(num, dig)); 
 
   
    } 
 } 