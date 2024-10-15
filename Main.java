import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        /* For getting marks as user input */
        // int[] mark = new int[12]; 
        // for(int i=0; i<12; i++)
        // mark[i] = sc.nextInt();
        
        /* For entering the marks manually */
        int mark[] = {100, 100, 100, 89, 100, 75, 23, 0, 25, 0, 75, 98};
        
        /* Sorting the marks in descending order */
        int temp=0;
        for (int i=0; i<12;i++)
        {
            for(int j=i+1; j<12; j++)
            {
                if(mark[i]<mark[j])
                {
                    temp=mark[i];
                    mark[i]=mark[j];
                    mark[j]=temp;
                }
            }
        }
        
        /* For printing the sorted marks */
        // System.out.print("\nMarks scored : ");
        // for(int i=0; i<12; i++)
        // System.out.print(mark[i]+" ");
        // System.out.println();
        
        /* Sum of best 8 out of 12 assignment scores */ 
        double sum = 0;
        System.out.print("Best 8 Assignment scores: ");
        for(int i=0; i<8; i++)
        {
            System.out.print(mark[i]+" ");
            sum+=mark[i];
        }
        
        /* Average of best 8 Assignment scores*/
        double avg = sum/8;
        System.out.println("\nAverage : "+avg+"/100");
        
        /* Final Assignment score */
        double score = (double) Math.round(avg/4 * 100) / 100;
        System.out.println("\nScore : "+score+"/25");
    }
}
