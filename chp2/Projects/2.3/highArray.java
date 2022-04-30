//highArray.java
//demonstrates array class with high-level interface
//to run this program: C:>java HighArrayApp

/*Note: Interfaces are meant to be abstract. Instead of having getElem() and setElem() requiring
the user to be know the index to proceed their operation (not abstract enough of an interface), 
we can instead have insert(), delete() and find() (without specifying indexes) which are a lot more convenient for the user.

Managing indexes must not be done by the user. It must be done by the object*/
//////////////////////////////////////////////////////

import java.util.*;

class HighArray{
    private long[] a;                           //ref to array a
    private int nElems;                         //num of data items (used to manage no of items)
    //-----------------------------------------------------------
    public HighArray(int max){                  //constructor
        a = new long[max+1];                      //create the array
        nElems = 0;                             //no items yet
    }
    //-----------------------------------------------------------
    public boolean find(int searchKey){
        int j;
        for(j = 0; j < nElems; j++){            //for each element,
            if(a[j] == searchKey)               //found item?
                break;
        }
        if(j == nElems)                        //gone to end?
            return false;
        else
            return true;
    }//end find()
    //-----------------------------------------------------------
    public void insert(long value)              //put element into array
    {
        a[nElems] = value;                      //insert it
        nElems++;                               //increment size
    }
    //-----------------------------------------------------------
    public boolean delete(int value){
        int j;
        for(j = 0; j < nElems; j++)
            if(value == a[j])
                break;
        if(j == nElems)
            return false;
        else
        {
            for(int k=j; k < nElems; k++)
                a[k] = a[k+1];

            nElems--;
            return true;
        }
    }//end delete()
    //-----------------------------------------------------------
    public void display(){
        for(int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");

        System.out.println("");
    }
    //-----------------------------------------------------------
}//end class HighArray

class HighArrayApp{
    public static void main(String[] args){

        int maxSize = 100;                              //array size
        HighArray arr;                                  //reference to array
        arr = new HighArray(maxSize);                   //create the array

        Random rand = new Random();

        for(int i = 0; i < maxSize; ++i)
            arr.insert(rand.nextInt(100));

        arr.display();

        int searchKey = 35;                             //search for item
        if(arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(0);                                  //delete 3 items
        arr.delete(55);
        arr.delete(99); 


        arr.display();                                  //display items again
      
    }//end main()
}//end class HighArrayApp
