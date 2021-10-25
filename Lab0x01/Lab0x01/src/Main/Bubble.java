package Main;

import java.util.Random;

public class Bubble
{
    public void BubSort(char list[][],int width, int size)
    {
        int changes=1;
        int z=0;
        char holder;
      /*  System.out.println("Before Bubble Sort");
        for(z=0;z<width;z++)
            {
            for(int y=0;y<size;y++)
            {
                System.out.print(" "+list[z][y]+" ");
            }
            System.out.println(" ");
        }*/

      while(changes!=0)
        {
            changes=1;
   for(z=0;z<width;z++)
    {
        for(int y=0;y<size;y++)
            {
                if(y<size-1)
                {
                if(list[z][y]>list[z][y+1])
                {
                  holder=list[z][y+1];
                  list[z][y+1]=list[z][y];
                  list[z][y]=holder;
                  changes++;  
                }    
                }
                else if(y==size-1&&changes==1)
                {
                    changes=0;
                }
                
            }
            
        }
        
    }
   /*     System.out.println("After BubbleSort");
        for(z=0;z<width;z++)
    {
            for(int y=0;y<size;y++)
            {
                System.out.print(" "+list[z][y]+" ");
            }
            System.out.println(" ");
        }*/
    }
}