// package basics;

import java.awt.*;
                    
public class Types {

    public static void main(String[] arg) {

        /*
        -->there is many types in the java
        -->two types of java types
            -primitive data type 
            -refrence data type

        ************Primitive data type*****************
        Data type that are built in the computer called primitive data type
           __________________________________________________
             Name    |    Size       |     Function
           __________|_______________|________________________
           --Byte    |     1 byte    |     to store integer value     
           --Short   |     2 byte    |    to store integer value
           --int     |     4 byte    |    to store integer value
           --long    |     8 byte    |    to store integers of more rang
           --float   |     4 byte    |    to store decimal value
           --double  |     8 byte    |    to store decimal value
           --boolean |     1 byte    |    to store true or false
           --char    |     2 byte    |    to store charachter data type
           --string  |     40 byte   |    to store string value

           Note :-
              --> to store the string value use (" ") 
              --> to store the single character use (' ')
              -->we write F,L,D to tell compiler its float,long and double value respectively
              -->we can also write f,l,d  
              -->refrence data types have their function insted of it primitive data type have no function
              -->refrence  data type stores address o perticulat variable
              -->primitive data type copy call by value
              -->refrence data type copy call by refrence
        */

       int a;
       byte x;
       char SingleCharcter;
       String MultipleCharacter;
       long e;
       double f;float ff;
       boolean t;
       
       // ********************* Refrence Data Type *********************** //
       Point point1= new Point(1,2);
       Point point2=point1;   //refrence data type  
       point2.x=25;           //if we change in one we it reflect on another one also


       a=1009;
       x=124;
       SingleCharcter='l';
       e=5623478L;
       MultipleCharacter="yut";
       f=123.889364D;
       ff=12.1F;
       t=false;


       System.out.println("Hello world !!");
       System.out.println(a);
       System.out.println(x);
       System.out.println(SingleCharcter);
       System.out.println(e);
       System.out.println(MultipleCharacter);
       System.out.println(f);
       System.out.println(ff);
       System.out.println(t);
       System.out.println(point1.x);

    }
}
