import java.util.Scanner; 
  import java.util.Arrays; 
 
   
  class ArrayRotationProgram  
 {
 private static void rightRotate(int[] inputArray, int n) 
   { 
      System.out.println(Arrays.toString(inputArray)); 
                    
      int temp; 
 
     for (int i = 1; i <= n; i++)  
       {  
         temp = inputArray[inputArray.length-1];  
                           
           for (int j = inputArray.length-1; j > 0; j--)  
          { 
                inputArray[j] = inputArray[j-1]; 
           } 
                           
            inputArray[0] = temp; 
        } 
                    
       System.out.println(Arrays.toString(inputArray)); 
   } 
          
    private static void leftRotate(int[] inputArray, int n)  
   { 
      System.out.println(Arrays.toString(inputArray)); 
                    
        int temp; 
                    
      for (int i = 0; i < n; i++) 
        { 
           temp = inputArray[0]; 
                            
             for (int j = 0; j < inputArray.length-1; j++)  
        { 
              inputArray[j] = inputArray[j+1]; 
         } 
                            
           inputArray[inputArray.length - 1] = temp; 
       } 
                  
        System.out.println(Arrays.toString(inputArray)); 
    }
 public static void main(String[] args)  
    { 
       Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
       int[] arr=new int[n]; 
       for(int i=0;i<n;i++) 
    { 
           arr[i]=sc.nextInt(); 
       } 
       int rot=sc.nextInt(); 
      int ch=sc.nextInt(); 
        if(ch==1) 
         { 
          leftRotate(arr,rot); 
     } 
       else 
            { 
         rightRotate(arr,rot); 
        } 
 } 
 }