// package basics;

public class string {
 
    public static void main(String[] arg)
    {
        /*
               -------- Strings --------
            --->It is refrence data type 
            --->It store in the java.lang package but its package imported automatic
            --->It has many function 
                like ,....
                     tolowercase()
                     touppercase()
                     length()
                     and many more  .....
            --->We can use all function of the String by the object name that  we declare

        */

        // All below are equivalent
        String a=new String("jay");
        String b="  raj";
        // char d[]={'z','a','l','a'};       //string can be declare like this also
        
        System.out.println(a+b);   //we use + to combine string or output
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.replace("a", "k"));
        System.out.println(b.trim());   //it trim white space
        System.out.println(b);          //white space remain
        System.out.println("Thank you ...!");
    }

}
