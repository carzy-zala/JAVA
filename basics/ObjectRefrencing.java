/*
----------- Object Refrencing --------------
->When we equalise the two object of same class refrence variable is created it mean that change in another object variable is reflect on the first one 
*/

public class ObjectRefrencing {
    public static void main(String[] args) {
        
        Main A=new Main();
        Main B=A;
        A.x=10;
        int t=10;
        System.out.println(t);
        int y=t;
        y=90;
        System.out.println(t);
        System.out.println("Before B.x modification A.x="+A.x);
        B.x=11;
        System.out.println("After B.x modification A.x="+A.x);
    }
    }
