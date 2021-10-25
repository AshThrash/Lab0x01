package Main;

import java.util.Random;

public class Merge
{
    public void initial(char list[][], int width,int length)
    {
        int count=0;
        int mid=length/2;
        //System.out.println("Pre-Sort");
       /* for(int j=0;j<width;j++)
            {
            for(int k=0;k<length;k++)
            System.out.print(" "+list[j][k]+" ");
            System.out.println(" ");
          }*/

        while(count<width)
        {
        Split(list,mid,count, length);
        count++;
        }
       // System.out.println("Post-Sort");
       /* for(int j=0;j<width;j++)
        {
            for(int k=0;k<length;k++)
            System.out.print(" "+list[j][k]+" ");
            System.out.println(" ");
        }*/
      


    }
    public void Split(char primary[][], int mid, int width, int size)
    {
        int j=0;
        int count=0;
        mid=size/2;
        if(size==1)
        mid=0;
        char[][] HoldArray1= new char[1][size];
        char[][] HoldArray2= new char[1][size];
        
        while(count<mid)
        {
            HoldArray1[0][count]=primary[width][count];
            count++;
        }
        int array1size=count;
           
        while(count>=mid && count<size)
        {
            
            HoldArray2[0][j]=primary[width][count];
            j++;
            count++;
        }
        int array2size=j;
        if(array1size>=1)
        {
       Split(HoldArray1, mid,0,array1size );
       Merg(primary,HoldArray1,HoldArray2,width,array1size,array2size);
            if(array2size>=1)
            { 
       Split(HoldArray2,mid,0,array2size);
       Merg(primary,HoldArray1,HoldArray2,width,array1size,array2size);
            }
        }
    }
    public void Merg(char primary[][],char list1[][], char list2[][],int index, int size1, int size2)
    {

        int left=0;
        int Right=0;
        int count=0;
        char holder;

        while(left<size1)
        {
            if(list1[0][left]>list1[0][left+1]&&(left+1)<size1)
            {
            holder= list1[0][left];
            list1[0][left]=list1[0][left+1];
            list1[0][left+1]=holder;
            left++;
            }
            else
            left++;
        }
        while(Right<size2)
        {
            if(list2[0][Right]>list2[0][Right+1]&&(Right+1)<size2)
            {
            holder= list2[0][Right];
            list2[0][Right]=list2[0][Right+1];
            list2[0][Right+1]=holder;
            Right++;
            }
            else
            Right++;
        }
        left=0;
        Right=0;
        while(left<size1&&Right<size2)
        {
            if(list1[0][left]>list2[0][Right]&&list2[0][Right]!=0)
            {
                primary[index][count]=list2[0][Right];
            Right++;
            count++;
            }
            else if(list1[0][left]<=list2[0][Right]&&list1[0][left]!=0)
            {
                primary[index][count]=list1[0][left];
                left++;
                count++;
            }

        }
        //Coming section inspired by https://www.geeksforgeeks.org/merge-sort/
        if(left<size1)
        {
            while(left<size1)
            {
                primary[index][count]=list1[0][left];
                count++;
                left++;
            }
        }
        else if(Right<size2)
        {
            while(Right<size2)
            {
                primary[index][count]=list2[0][Right];
                count++;
                Right++;
            }
        }

    }
}