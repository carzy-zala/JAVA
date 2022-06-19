// package basics;
//it include in java.lang  package

public class math_function {

    public static void main(String[] a) {

        // There are various function in math package we use directly like below

        // ---------> Round Off <----------
        int x = Math.round(1.1F); // float round off to int and double to long
        System.out.println("Rond off :" + x);

        // ------>Ceil and Floor<-------
        float A = (float) 1.1;
        int y = (int) Math.ceil(A);// we use explicite conversion because it return the float value
        int z = (int) Math.floor(A); // we use explicite conversion because it return the float value
        System.out.println("ceil :" + y); // greater than given minimum
        System.out.println("floor :" + z); // smaller than given and maximum

        // ----------->Random<-------------------
        //it return double so we can convert it another by the explicite conversion
        // Random method of math return number in 0 to 1 only
        double r = Math.random(); // we use explicite conversion because it return the double value
        System.out.println("Random :" + r);
        // to print random number from 0 to n we do as below
        double rr = Math.random() * 100; // to prin random variable from 0 to 100
        System.out.println("random * n :" + rr);
    }

}
