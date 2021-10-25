package Main;

import java.util.List;
import java.util.Random;

public class Quick{
    public void QuickSort(char list[][], int width, int length)
    {

        int low=0;
        int i =0;
        int high=length-1;

       /* while(i<width)
        {
            for(low=0;low<=high;low++)
            System.out.print(list[i][low]);
            i++;
            System.out.println(' ');
        }*/
        i=0;
        low=0;

       while(i<width)
        {
    
             hinge(list,i,low,high,length);
    
            i++;
        }
        i=0;
       /* while(i<width)
        {
            for(int j=0;j<length;j++)
            System.out.print(list[i][j]);
            i++;
            System.out.println(' ');
        }*/
        
    }
    public void hinge(char[][] list, int index, int l, int r, int length)
    {
        int i=(l-1);
        int k=l;
        int difference2=(r)-(l);
        char  pillor=list[index][r];
        char temp;
    
        if(l<r)
        while(k!=r)
        {
           if(list[index][k]<pillor)
           {
            i++;
                if(i!=k&&i>=0)
                {
                    temp=list[index][k];
                    list[index][k]=list[index][i];
                    list[index][i]=temp;

                }

           }
    
           k++;
        }
        i++;

        temp=list[index][i];
        list[index][i]=list[index][r];
        list[index][r]=temp;
        if(difference2>=1)   
             {
             if(i-1>=0)    
            side(list,index,(i-1),l,length);
            if(i+1<length-1)
            {  

                side(list, index ,length-1,(i+1),length);
            }
        }


    }

    public void side(char list[][],int index,int high,int low,int length)
    {
        char i='a';
        hinge(list,index,low,high,length);

    }

    
    
}