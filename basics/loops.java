// package basics;

public class loops {

    public static void main(String[] s)
    {
        // To do same opertor multiple time we use loops
        /*
         ---------->For Loops<---------
               Declaration :
                             for(data_type variable_name=value;condition;opertion on varible(terminating condition))
                                   ex//
                                        for(int i=0;i<9;i++)                 // i also called as loop counter or variable
                We generally use it when we know how many time code run
        
         ----------->While loop<-----------
                Declaration :
                                 while(condtion)
                                 {

                                 }

                                 ex // 
                                            int x=5;
                                            while(x<9)
                                            {

                                            }

                                            String s="";
                                            while(s.equal("s"))  //because string is refrence type variable
                                            {

                                            }
                We generally use it when we don't know how many time code run
                If we use True in condition of while we must have to break statement in it

         ----------------->Do-While loop<------------------
         
         when loop execute at least once so we use it
         Declaration :
         do
         {
             
        }while(condition);

        ----------------->for each loop<------------------
           Declaration :
                          for(data_type variabel_name2:Variable_name)
                            ex// 
                                 for(String fp : f)  //fp and f must be different
             
           Limitation:
                      -->we can't do reverse in it
                           it mean from end to begning
                      -->we can't access to variable index                      
        */ 

        //for-each loop
        int[] a={1,2,3};
        for(int ap : a)
        {
             System.out.print(ap+"\t");  //print ap then \t
        }

        System.out.println("\nThank You .. :)");  //print and then new line
    }
    
}
