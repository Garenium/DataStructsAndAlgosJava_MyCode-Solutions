//orderedArray.java
//demonstrates ordered array class
//to run this program: C>java OrderedApp
///////////////////////////////////////////////////////
import java.util.*;
class OrdArray{
    private long[] a;                   //ref to array a
    private int nElems;                 //number of data items
    //------------------------------------------------
    public OrdArray(int max){
        a = new long[max];               //create array
        nElems = 0;
    }
    //------------------------------------------------
    public int size(){
        return nElems;
    }
    //------------------------------------------------   
    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while(true){
            curIn = (upperBound + lowerBound) / 2;

            if(a[curIn] == searchKey)
                return curIn;           //found the element (in the middle)
            else if(lowerBound > upperBound)
                return nElems;
            else{
                if(a[curIn] < searchKey)
                    lowerBound = curIn + 1; //It's in upper half
                else
                    upperBound = curIn - 1; //It's in lower half
            }//end else divide range
        }//end while
    }//end find()
    //------------------------------------------------
    public void insert(long  value)         //put element into array
    {
        int j;
        for(j = 0; j < nElems; j++){        //find where it goes
            if(a[j] > value)                //(linear search)
                break;
        }
        for(int k = nElems; k>j; k--){      //move bigger ones UP 
            a[k] = a[k-1];
        }
        a[j] = value;                       //inser it
        nElems++;                           //increment size
    }//end insert()
    //------------------------------------------------
    public boolean delete(long value)
    {
        int j = find(value);
        if(j==nElems)                       //Can't find it
            return false;
        else{                               //found it
            for(int k = j; k < nElems; k++){
                a[k] = a[k+1];              //move bigger ones DOWN
            }
            nElems--;                       //decrement size
            return true;
        }
    }
    //------------------------------------------------
    public void display(){
        for(int j = 0; j < nElems; j++)
        {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    } 
}//end class OrdArray
//////////////////////////////////////////////////////
class OrderedApp
{
    public static void main(String[] args){
        int maxSize = 100;                  //array size
        OrdArray arr;
        arr = new OrdArray(100);

        Random rand = new Random();

        for(int i = 0; i < 10; ++i)
            arr.insert(rand.nextInt(100));

        int searchKey = 55;                //search for item
        if(arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.display();                    //display items

        arr.delete(0);
        arr.delete(55);
        arr.delete(99);

        arr.display();                    //display items again
    }
}

