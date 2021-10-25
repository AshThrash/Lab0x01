package Main;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class Main {
    public static void main(String[] args) throws Exception {
        int width=3;
        double BubTime1;
        double BubTime2;
        double BTotal=0;
        double MergeTime1;
        double MergeTime2;
        double MTotal=0;
        double QuickTime1;
        double QuickTime2;
        double QTotal=0;
        double RadixTime1;
        double RadixTime2;
        double RTotal=0;
        int a=0;
        int length=10+(10^a);
        int i=0;

        int trial=1000;
        char[][] list= new char[width][length];
        Quick s= new Quick();
        Merge y= new Merge();
        Bubble x= new Bubble();
        Radix h = new Radix();
    while(a<trial)
    {


        while(i<width)
        {
            
            for(int j=0;j<length;j++)
            { 
               Random m= new Random();

        list[i][j]=(char)(m.nextInt(58)+'A');
                if(list[i][j]>90&&list[i][j]<97)
                while(list[i][j]>90&&list[i][j]<97)
                {
           list[i][j]=(char)(m.nextInt(58)+'A');
                }

            }
            i++;
        }
        i=0;
        QuickTime1=System.nanoTime();
        s.QuickSort(list,width,length);
        QuickTime2=System.nanoTime()-QuickTime1;
        while(i<width)
        {
            
            for(int j=0;j<length;j++)
            { 
               Random m= new Random();

        list[i][j]=(char)(m.nextInt(58)+'A');
                if(list[i][j]>90&&list[i][j]<97)
                while(list[i][j]>90&&list[i][j]<97)
                {
           list[i][j]=(char)(m.nextInt(58)+'A');
                }

            }
            i++;
        }
        i=0;
        MergeTime1=System.nanoTime();
        y.initial(list, width, length);
        MergeTime2=System.nanoTime()-MergeTime1;
        while(i<width)
        {
            
            for(int j=0;j<length;j++)
            { 
               Random m= new Random();

        list[i][j]=(char)(m.nextInt(58)+'A');
                if(list[i][j]>90&&list[i][j]<97)
                while(list[i][j]>90&&list[i][j]<97)
                {
           list[i][j]=(char)(m.nextInt(58)+'A');
                }

            }
            i++;
        }
        i=0;
        BubTime1=System.nanoTime();
        x.BubSort(list, width, length);
        BubTime2=System.nanoTime()-BubTime1;
        while(i<width)
        {
            
            for(int j=0;j<length;j++)
            { 
               Random m= new Random();

        list[i][j]=(char)(m.nextInt(58)+'A');
                if(list[i][j]>90&&list[i][j]<97)
                while(list[i][j]>90&&list[i][j]<97)
                {
           list[i][j]=(char)(m.nextInt(58)+'A');
                }

            }
            i++;
        }
        i=0;
        RadixTime1=System.nanoTime();
        h.RadSort(list,width,length);
        RadixTime2=System.nanoTime()-RadixTime1;
    a++;
    BTotal=BTotal+BubTime2;
    QTotal=QTotal+QuickTime2;
    RTotal=RTotal+RadixTime2;
    MTotal=MTotal+MergeTime2;      
    }



    BTotal=BTotal/trial;
    QTotal=QTotal/trial;
    RTotal=RTotal/trial;
    MTotal=MTotal/trial;
    System.out.println("Time averages");
    System.out.println("*****************************");
    System.out.println("Bubble Sort average Time "+BTotal);
    System.out.println("Quick Sort average Time "+QTotal);
    System.out.println("Merge Sort average Time "+MTotal);
    System.out.println("Radix Sort average Time "+RTotal);
}
}
