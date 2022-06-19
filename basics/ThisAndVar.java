/*
-----> This <-----
 - this is keyword
 - It refer to the  object which is performing task or on which we performing task
 - We use it for better understanding and clearifying code
 - In it we use dot(.) opertor to perform the opertion not arrow(->) like 
 c++ so keep it in mind.
 
--------> Var <----------
- var is not variable name in java
- It is the special data type compiler autometically define data type depend on value we enter in the var type variable.
- It is  not compulsory to use it but it is more more reliability of code
*/
public class ThisAndVar {
    int p;
    public static void main(String[] ar)
    {
       // var xc=5;    // here compiler autometic detect the data type of xc
        var A=new ThisAndVar(); 
        A.p=9;
        //Same here compiler autometic get that A is  object of ThisAnfVar class.
        System.out.println("xc");
        System.out.println("Thank You ....!!");
    }
    
}
