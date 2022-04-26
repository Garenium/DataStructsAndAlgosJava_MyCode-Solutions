import java.util.Random;
// array.java
//demonstrate java arrays
//to run this program: C> java arrayApp
class ArrayApp{
    public static void main(String[] args)
    {
        // long arr[];             //reference to array
        // arr = new long[100];    //make array
        long arr[] = {77,99,44,55,22,88,11,0,66,33,10};
        int nElems= 0;          //number of items
        int j;                  //loop counter
        long searchKey;

        //---------------------------------------------

        // Random rand = new Random();
        // for(j = 0; j < 10; ++j){
        //     int n = rand.nextInt(100);
        //     arr[j] = n; 
        // }

        nElems = 10;            //now 10 items in array

        //---------------------------------------------

        for(j = 0; j < nElems; j++ ){
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        //----------------------------------------------

        searchKey = 66;         //find item with key 66
        for(j = 0; j < nElems; j++)
        {
            if(arr[j] == searchKey) //break if found
            break;
        }
        if(j == nElems) //at the end?
            System.out.println("Can't find " + searchKey); 
        else
            System.out.println("Found " + searchKey);

        //-----------------------------------------------

        searchKey = 55;
        for(j=0; j<nElems; j++){
           if(arr[j] == searchKey)     //look for it
               break;
        }

        for(int k=j; k < nElems-1;k++) //move higher ones down
            arr[k] = arr[k+1];  

        nElems--;                      //decrement size
        

        //-----------------------------------------------

        for(j = 0; j < nElems; ++j)
            System.out.print(arr[j] + " ");
        System.out.println("");

        // System.out.println(arr[arr.length-3]);
        // System.out.println(arr[arr.length-2]); same value
    }//end main()
}//end class ArrayApp
