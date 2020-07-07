import java.util.*;
class Order
{
    String[] order_name=new String[100];
    String[] order_quantity=new String[100];
    String[] order_price=new String[100];
    int x,y,z=0;
    public void insert_order(String order,String qt,String pr)
    {
        order_name[x++]=order;
        order_quantity[y++]=qt;
        order_price[z++]=pr;
    }
    public void order_display()
    {   
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Order ID "+"Order name "+"Order Quantity "+"Ordered Price ");
        for(int dis=0;dis<x;dis++)
           System.out.println(dis+"\t\t"+order_name[dis]+"\t\t"+order_quantity[dis]+"\t\t"+order_price[dis]);
    }
}
class Customer extends Order
{
    String[] Customer_name=new String[100];
    String[] Customer_ad=new String[100];
    String[] Customer_no=new String[100];
    int i,j,k=0;
    public void insert_customer(String name,String ad,String no)
    {
        Customer_name[i++]=name;
        Customer_ad[j++]=ad;
        Customer_no[k++]=no;
    }
    public void customer_display()
    {   
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Customer ID "+"Customer name "+"Customer Address "+"Customer_Number ");
        for(int dis=0;dis<i;dis++)
           System.out.println(dis+"\t\t"+Customer_name[dis]+"\t\t"+Customer_ad[dis]+"\t\t"+Customer_no[dis]);
    }
}
public class Swiggy extends Customer
{
	public static void main(String[] args) 
	{
		Customer obj=new Customer();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		    System.out.println("1.Customer"+"\t"+"2.Order"+"\t"+"3.Product"+"\t"+"4.Exit");
		    int n=sc.nextInt();
		    switch(n)
		    {
		        case 1:
		            while(true)
		            {
		                System.out.println("1.Add Customer"+"\t"+"2.Display Customer"+"\t"+"3 Exit");
		                int x=sc.nextInt();
		                switch(x)
		                {
		                    case 1:
		                        System.out.println("Enter the Customer Name");
		                        String name=sc.next();
		                        System.out.println("Enter the Customer Address");
		                        String ad=sc.next();
		                        System.out.println("Enter Mobile NO");
		                        String no=sc.next();
		                        obj.insert_customer(name,ad,no);
		                        break;
		                        
		                   case 2:
		                       obj.customer_display();
		                       System.out.println("------------------------------------------------------------------------");
		                       break;
		                       
		                   case 3:
		                       System.exit(0);
		                        
		                }
		            }
		            case 2:
		                 while(true)
		            {
		                System.out.println("1.Add Order"+"\t"+"2.Display Order"+"\t"+"3 Exit");
		                int x=sc.nextInt();
		                switch(x)
		                {
		                    case 1:
		                        System.out.println("Enter the Order Name");
		                        String order=sc.next();
		                        System.out.println("Enter the Quantity");
		                        String qt=sc.next();
		                        System.out.println("Enter Price");
		                        String pr=sc.next();
		                        obj.insert_order(order,qt,pr);
		                        break;
		                        
		                   case 2:
		                       obj.order_display();
		                       System.out.println("------------------------------------------------------------------------");
		                       break;
		                       
		                   case 3:
		                       System.exit(0);
		                }
		            }
		                
		    }
		}
	}
}

