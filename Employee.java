
package employee;

import java.util.*;

class Count
{
    static int countOfObj = 0;
    String name;
    int id;
    
    public Count()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :- ");
        this.name = sc.next();
        System.out.println("Enter Id :- ");
        this.id = sc.nextInt();
        countOfObj++;
    }
    public static int getCount()
    {
        return countOfObj;
    }
}

public class Employee 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :- ");
        int size = sc.nextInt();
        Count e[] = new Count[size];
        for(int i=0;i<e.length;i++)
        {
            e[i]=new Count();
        }
        
        System.out.println("Count of number of employee is = "+Count.getCount());
    }
    
}
