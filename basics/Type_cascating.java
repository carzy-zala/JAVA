// package basics;

//java.lang package automatically imported

public class Type_cascating {

    public static void main(String[] s)
    {
        //--------------> Implicite Type cascating  <----------------
        //implicite casacating mean automatic cascating it work like below formate
        //byte<short<int<long<float<double
        // cascating done in compatible form only 
        // string can't convert into int directly we use some function

        double y=1.1;
        double res=y+1;
        System.out.println("Implicite type conversion :"+res);

        //--------------> Explicite Type Cascating <------------------- 
        //it done manually by user like this (int )p

        double x=1.1;
        int result=(int)x+1;
        System.out.println("Explicite type conversion :"+result);

        //all primitive have wraper class to make compatiable we use it 
        // we have Short,Double various wraper class and in it various types of methods are available 
        String S="1";
        int xx= Integer.parseInt(S)+2;  //use of wraper class integer and parseint function to convert string in int
        System.out.println("Parse conversion of string in int :"+xx);

        
    }
    
}

