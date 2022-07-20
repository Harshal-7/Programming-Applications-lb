//  Sorting (efficient bubble sort)

import java.lang.*;
import java.util.*;

interface MarvellousSort
{
    public void Accept();
    public void Display();
    public void BubbleSort();
    public void InsertionSort();
    public void SelectionSort();
}

class Array implements MarvellousSort
{
    public int Arr[];

    public Array(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Elementes in Array:");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements from Array are:");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + "\t");
        }
        System.out.println("\n");
    }

    public void BubbleSort()
    {
        int i = 0, j = 0, temp = 0;
        boolean Swap = false;

        for(i = 0; i < Arr.length-1; i++)
        {
            Swap = false;

            for(j = 0; j < Arr.length-i-1; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                    Swap = true;
                }
            }
            
            if(Swap == false)
            {
                break;
            }

            System.out.println("Pass: " + (i+1));
            Display();
        }

    }

    public void InsertionSort()
    {}

    public void SelectionSort()
    {}



}

class program329
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of Array:");
        int size = sobj.nextInt();

        Array aobj = new Array(size);
        aobj.Accept();
        aobj.Display();
        
        aobj.BubbleSort();
        System.out.println("Data After Sorting:\n");
        aobj.Display();
    }
}