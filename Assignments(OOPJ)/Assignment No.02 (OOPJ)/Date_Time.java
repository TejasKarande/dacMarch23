import java.util.*;
class Date_Time{
    int dd;
    int mm;
    int yyyy;
    int hrs;
    int min;
    int sec;

    void format1(int dd,int mm,int yyyy)
    {
        this.dd =dd;
        this.mm=mm;
        this.yyyy=yyyy;
        if((dd<30 && dd<31 )&& mm<12 )
        System.out.println(dd+"/"+mm+"/"+yyyy);
        else
        System.out.println("Invalid Input");
        
    }

    void format2(int mm ,int dd ,int yyyy )
    {
        this.mm =mm;
        this.dd=dd;
        this.yyyy=yyyy;
        if((dd<30 && dd<31 )&& mm<12 )
        System.out.println(mm+"/"+dd+"/"+yyyy);
        else
        System.out.println("Invalid Input");
    }
    
    void format3(int yyyy ,int mm ,int dd )
    {
        this.mm =mm;
        this.dd=dd;
        this.yyyy=yyyy;
         if((dd<30 && dd<31 )&& mm<12 )
        System.out.println(yyyy+"/"+mm+"/"+dd);
        else
        System.out.println("Invalid Input");
   }

    void format4(int hrs ,int min ,int sec )
    {
        this.hrs =hrs;
        this.min=min;
        this.sec=sec;
        if((hrs<=24&& hrs>=0) && min<=60 && sec<=60)
        System.out.println(hrs+":"+min+":"+sec);
        else
        System.out.println("Invalid Input");
    }

    void format5(int hrs ,int min ,int sec )
    {
        this.hrs =hrs;
        this.min=min;
        this.sec=sec;
        if(this.hrs<12 && this.hrs>=0)
        { 
            String A = "AM";
            System.out.println(hrs+":"+min+":"+sec+" "+A);
        }
        else if(hrs<24)
        {
            String B = "PM";
            System.out.println(hrs+":"+min+":"+sec+" "+B);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

    void format6(int hrs ,int min)
    {
        this.hrs =hrs;
        this.min=min;
        if((hrs<=24 && hrs>=0) && min<=60 && sec<=60)
        System.out.println(hrs+":"+min);
        else
        System.out.println("Invalid Input");
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date = ");
        int dd = sc.nextInt();
        System.out.print("Enter Month = ");
        int mm = sc.nextInt();
        System.out.print("Enter Year = ");
        int yyyy = sc.nextInt();
        System.out.print("Enter the Hours in 24 Hrs Format =");
        int hrs = sc.nextInt();
        System.out.print("Enter the Minutes in 24 Hrs Format =");
        int min = sc.nextInt();
        System.out.print("Enter the Seconds in 24 Hrs Format =");
        int sec = sc.nextInt();
        Date_Time dt = new Date_Time();
        dt.format1(dd,mm,yyyy);
        dt.format2(mm,dd,yyyy);
        dt.format3(yyyy,mm,dd);
        dt.format4(hrs,min,sec);
        dt.format5(hrs,min,sec);
        dt.format6(hrs,min);
    }

}