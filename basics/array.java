
import java.util.Arrays; //to use arrays function

/*
  Note :-
          -->By default if no intialization of position it takes 0 for numbric type, false for the boolean type and empty char for char array or string array repsectively
                
              ----------For 1-D array-----------
                 -->we use Arrays is inbuilt funtion
                 -->to print  it we use tostring of arrays function and many more function
              
              -----------For 2-D array-----------
                 -->use deeptostring function of arrays to print
                 -->2-D array nothing but array of arrays
                 -->x[a][b] : here a is row and b is coloum
                 -->similarly for 3-d Array
*/

public class array {
    public static void main(String[] arg) {
        int[] x = new int[5];
        x[0] = 12;
        int[] y = { 5, 6, 3, 1, 9 };
        System.out.println(Arrays.toString(x)); // to prin the array
        System.out.println(Arrays.toString(y));
        System.out.println(x.length); // to print length
        Arrays.sort(y); // to sort an array
        System.out.println(Arrays.toString(y));

        // two dimension array
        int[][] xy = new int[2][3]; // declaration
        xy[0][0] = 31; // intialition
        int[][] yx = { { 1, 2, 3 }, { 4, 5, 6 } }; // declare with curly bracket
        System.out.println(Arrays.deepToString(xy)); // we use arrays.deeptostring to output the array
        System.out.println(Arrays.deepToString(yx));

        // System.arraycopy(src, srcPos, dest, destPos, length); //for copy arry but copying is only possible in 1-D array

        
        /*
        ************************Ragged Array ******************** 
        ->Two dimentional array with having  different size of 1-d array in it
        */
        int[][] xz;
        xz=new int[3][];
        xz[0]=new int[1]; //first row of 1 element array
        xz[1]=new int[2]; // second row of 2 element in array
        xz[2]=new int[3]; //third row of 3 elements

        

    }
}

