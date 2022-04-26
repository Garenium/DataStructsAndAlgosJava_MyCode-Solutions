import java.util.*;
//lowArray.java
//demonstrates array class with low-level interface
//to run this program

//////////////////////////////////////////////////////
class LowArray{
    private long[] a;                               //ref to array a
    //------------------------------------------
    public LowArray(int size)                       //constructor
    {
        a = new long[size]; 
    }
    //------------------------------------------
    public void setElem(int index, long value){     //set value
        a[index] = value;
    }
    //------------------------------------------
    public long getElem(int index){                 //get value
        return a[index];
    }
    //------------------------------------------
}//end class lowArray

class LowArrayApp{
    public static void main(String[] args)
    {
        LowArray arr;                               //reference
        arr = new LowArray(100);                    //create a LowArray object
        int nElems = 0;                             //number of items in array
        int j;                                      //loop variable
        
        Random rand = new Random();

        for(j = 0; j < 10; ++j){
           arr.setElem(j, rand.nextInt(100));
        }

        nElems = 10;                                //now 10 items in array

        for(j = 0; j < nElems; j++)                 //display items
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");

        int searchKey = 26;                         //search for data item
        for(j=0; j<nElems; ++j){                    //for each element,
            if(arr.getElem(j)==searchKey)           //found item?
                break;
        }
        if(j == nElems)                             //no
            System.out.println("Can't find "  + searchKey);
        else
            System.out.println("Found " + searchKey);


                                                    //delete value 55 
        for(j=0; j<nElems; j++){
            if(arr.getElem(j) == 55)
                break;
        }
        for(int k=j; k<nElems; k++)                 //higher ones down
            arr.setElem(k, arr.getElem(k+1));
        nElems--;                                   //decrement size


        for(j=0; j<nElems; j++)                     //display items
            System.out.print(arr.getElem(j) + " ");

        System.out.println("");
        
    }//end main()
}//end class LowArrayApp
