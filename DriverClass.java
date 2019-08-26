import java.util.*; 
 class String_operation 
  {
    public String string; 
 void get() 
      { 
          Scanner sc=new Scanner(System.in); 
         int t; 
         t=sc.nextInt(); 
       sc.nextLine(); 
          for(int i=0;i<t;i++) 
         { 
         string=sc.nextLine(); 
         string=change(); 
            System.out.println(string);   
      } 
      } 
    String change() 
     { 
         int len=string.length(); 
       if (len < 6) 
       { 
              for (int i = 0; i <len; i++)  
             { 
               char c = string.charAt(i); 
   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'E' || c == 'I' || c == 'O'|| c == 'U')
   {
                       string=string.replace(c,'$'); 
                } 
           else 
         { 
                String reverse = ""; 
            for(int i = string.length() - 1; i >= 0; i--) 
           { 
              reverse = reverse + string.charAt(i); 
            } 
        string=reverse;    } 
       return string; 
  }
 class DriverClass
 { 
    public static void main (String[] args) 
    { 
                  
        String_operation s=new String_operation(); 
        s.get(); 
 }} 