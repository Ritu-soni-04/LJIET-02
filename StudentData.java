
package studentdata;

import java.util.*;

class Stu_details
{
    int roll_no,marks;
    String name;
    
    public void setDetail()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Roll No. :- ");
       this.roll_no = sc.nextInt();
       System.out.println("Enter Name :- ");
       this.name = sc.next();
       System.out.println("Enter Marks :- ");
       this.marks = sc.nextInt();
    }
    
    public void getDetail()
   {
       System.out.println("Roll No :- "+roll_no);
       System.out.println("Name :- "+name);
       System.out.println("Marks :- "+marks);
   }
}

public class StudentData 
{
    public static void main(String[] args) 
    {
        Stu_details s1[] = new Stu_details[10];
        int n ;     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of studetn you want to add :- ");

        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s1[i] = new Stu_details();
            s1[i].setDetail();
            s1[i].getDetail();
        }
    }
}
