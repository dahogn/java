package cn.sdu.edu.sc.java.chapt13;


/**
 * 归并排序，递归实现版本 
 * @author Dahogn
 * @version 1.01
 * @since 2008.11.25 
 Class for sorting an array of ints from smallest to largest
 using the merge sort algorithm.
*/
public class MergeSort
{
    /**
     Precondition: Every indexed variable of a has a value.
     Action: Sorts a so that: a[0] <= a[1] <= ... <= a[a.length - 1].
    */
    public static void sort(int[] a)
    {
        if (a.length >= 2)
        {
            int halfLength = a.length/2;
            int[] front = new int[halfLength];
            int[] tail = new int[a.length - halfLength];

            divide(a, front, tail);
            sort(front);
            sort(tail);
            merge(a, front, tail);
        }
        //else do nothing. a.length == 1, so a is sorted.
    }


    /**
     Precondition: a.length = front.length + tail.length
     Postcondition: All the elements of a are divided
     between the arrays front and tail.
    */
    private static void divide(int[] a, int[] front, int[] tail)
    {
        int i;
        for (i = 0; i < front.length; i++)
            front[i] = a[i];

        for (i = 0; i < tail.length; i++)
            tail[i] = a[front.length + i];
    }

    /**
     Precondition: Arrays front and tail are sorted from smallest
     to largest, and a.length = front.length + tail.length.
     Postcondition: a contains all the values from front and tail
     and a is sorted from smallest to largest.
    */
    private static void merge(int[] a, int[] front, int[] tail)
    {
        int frontIndex = 0, tailIndex = 0, aIndex = 0;
        while ((frontIndex < front.length)
                           && (tailIndex < tail.length))
        {
            if (front[frontIndex] < tail[tailIndex])
            {
                a[aIndex] = front[frontIndex];
                aIndex++;
                frontIndex++;
            }
            else
            {
                a[aIndex] = tail[tailIndex];
                aIndex++;
                tailIndex++;
            }
        }
        //At least one of front and tail have been 
        //completely copied to a.

        while (frontIndex < front.length)//Copy rest of front
                                         //if any.
        {
            a[aIndex] = front[frontIndex];
            aIndex++;
            frontIndex++;
        }

        while (tailIndex < tail.length)//Copy rest of tail, if any.
        {
            a[aIndex] = tail[tailIndex];
            aIndex++;
            tailIndex++;
        }
    }
    public static void main(String[] args)
    {
        int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};

        System.out.println("Array values before sorting:");
        int i;
        for (i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println( );
            
        MergeSort.sort(b);

        System.out.println("Array values after sorting:");
        for (i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println( );
    }
}

