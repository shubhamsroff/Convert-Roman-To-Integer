package leetcode;

public class RomanToInteger {
    public static void numberRomToInt(String number)
    {
        String romanArray[]={"I","V","X","L","C","D","M"};
      char array[]=number.toCharArray();
      int IntegerNumber=0;
      for(int i=0;i<array.length;i++)
      {
         if(array[i]=='I')
         {
             IntegerNumber=IntegerNumber+1;
          
            
            }
          if(array[i]=='V')
         {
             IntegerNumber=IntegerNumber+5;
              if(i>=1)
           {
               if(array[i-1]=='I')
               IntegerNumber=IntegerNumber-2;
           }
            }
          if(array[i]=='X')
         {
             IntegerNumber=IntegerNumber+10;
              if(i>=1)
           {
                if(array[i-1]=='I')
               IntegerNumber=IntegerNumber-2;
           
              if(array[i-1]=='V')
               IntegerNumber=IntegerNumber-10;
            }
         }
          if(array[i]=='L')
         {
             IntegerNumber=IntegerNumber+50;
                if(i>=1)
           {
                if(array[i-1]=='I')
               IntegerNumber=IntegerNumber-2;
           
              if(array[i-1]=='V')
               IntegerNumber=IntegerNumber-10;
                if(array[i-1]=='X')
               IntegerNumber=IntegerNumber-20;
           }
           } 
          if(array[i]=='C')
         {
             IntegerNumber=IntegerNumber+100;
                  if(i>=1)
           {
                if(array[i-1]=='I')
               IntegerNumber=IntegerNumber-2;
           
              if(array[i-1]=='V')
               IntegerNumber=IntegerNumber-10;
                if(array[i-1]=='X')
               IntegerNumber=IntegerNumber-20;
                if(array[i-1]=='L')
               IntegerNumber=IntegerNumber-100;
           }
                  
            } 
          if(array[i]=='D')
         {
             IntegerNumber=IntegerNumber+500;
                  if(i>=1)
           {
                if(array[i-1]=='I')
               IntegerNumber=IntegerNumber-2;
           
              if(array[i-1]=='V')
               IntegerNumber=IntegerNumber-10;
                if(array[i-1]=='X')
               IntegerNumber=IntegerNumber-20;
           
              if(array[i-1]=='L')
               IntegerNumber=IntegerNumber-100;
                if(array[i-1]=='C')
               IntegerNumber=IntegerNumber-200;
           }
            } 
          if(array[i]=='M')
         {
             IntegerNumber=IntegerNumber+1000;
                  if(i>=1)
           {
                if(array[i-1]=='I')
               IntegerNumber=IntegerNumber-2;
           
              if(array[i-1]=='V')
               IntegerNumber=IntegerNumber-10;
                if(array[i-1]=='X')
               IntegerNumber=IntegerNumber-20;
              if(array[i-1]=='L')
               IntegerNumber=IntegerNumber-100;
                if(array[i-1]=='C')
               IntegerNumber=IntegerNumber-200;
                if(array[i-1]=='D')
               IntegerNumber=IntegerNumber-1000;
           }
            } 
      }
        System.out.println(IntegerNumber);
    }
}
