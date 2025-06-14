import java.util.*;
public class GradeCalculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects...");
        int n=sc.nextInt();
        int sub[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter subject no. %d...\n",(i+1));
            sub[i]=sc.nextInt();
            sum=sum+sub[i];
        }
        double avg=sum/n;
        String str;
        if(avg>=90)
            str="Grade A";
        else if(avg>=80)
            str="Grade B";
        else if(avg>=70)
            str="Grade C";
        else if(avg>=60)
            str="Grade D";
        else if(avg>=50)
            str="Grade E";
        else
            str="Fail";
        System.out.println("Total marks obtained..."+sum);
        System.out.println("Average percentage..."+avg);
        System.out.println(str);
        sc.close();
    }
}
