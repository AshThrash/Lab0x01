package Main;

public class Radix
{
    public void RadSort(char List[][], int width, int size)
    {
  
        int[] counter= new int[10]; 
       /* for(int k=0;k<width;k++)
        {
            for(int i=0;i<size;i++)
            System.out.print(List[k][i]);
            System.out.println(" ");
        }*/
        for(int j=0; j<width;j++)
        {
            countsort(List,counter,j,width,size);
        }
       /* for(int k=0;k<width;k++)
        {
            for(int i=0;i<size;i++)
            System.out.print(List[k][i]);
            System.out.println(" ");
        }*/
    }
        public void countsort(char list[][],int count[],int index,int Width, int Size)
        {   
            int out=1;
            int I=0;
            int expo=10^I;
            char[] temp=new char[Size];
            for(I=0;I<3;I++)
            {
                for(int j=0;j<Size;j++)
                {
                    count[(list[index][j]/expo)%10]++;
    
                }

                for(int j=0;j<10;j++)
                {
                    if(j-1>=0)
                    count[j]=count[j]+count[j-1];

                }

                for(int j=Size-1;j>=0;j--)
                { 
                    
                  temp[count[(list[index][j]/expo)%10]-1]=list[index][j];
                    count[(list[index][j]/expo)%10]--;
                }

                for(int j=0;j<Size;j++)
                {

                    list[index][j]=temp[j];
                    temp[j]=0;
                    out++;
                }

                for(int j=0;j<10;j++)
                {
                    count[j]=0;
                }

            }
            out=0;
            //Figure out how to add values to put values in correct spots.
        }
 }
