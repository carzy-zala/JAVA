/*
------------->Methode Chaining<------------------
-it use method of method in one line like below
--->NumberFormae.getCurrencyInstance().fornate(Value);
*/

// package basics;

import java.text.NumberFormat;


public class number_formatting {
    
    public static void main(String[] arg)
    {
        // To present number in percentage or currency or in coma formate we use the some class of number 
        /*
           --------------->Abstract Class<----------------
           it mean we can not use the new opertor to create object 
           we have to must use the methods of  it to use it
           we have to use string variable to print it
        */

        NumberFormat curency=NumberFormat.getCurrencyInstance();  //creating class instance (object)
        String a=curency.format(1234596.85);  //formatting done in string so we use it
        System.out.println(a);

        NumberFormat per=NumberFormat.getPercentInstance();
        String b=per.format(0.9);
        System.out.println(b);

        System.out.println(NumberFormat.getCurrencyInstance().format(12345.6)); //called method chaining
    }
}
