import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id,roll;
        String name;
        Scanner sc=new Scanner(System.in);
       System.out.println("\n Enter your id:");
       id=sc.nextInt();
       System.out.println("\n enter your roll no :");
       roll= sc.nextInt();
       System.out.println("\n enter your Name :");
       name= sc.next();
       bean bean=new bean();
       bean.setId(id);
       bean.setRoll(roll);
       bean.setName(name);
       String s="\n Name of student: "+bean.getName()+"\n Id of student: "+ bean.getId()+"\n Roll No. of student: "+ bean.getRoll();
       System.out.println(s);
    }
}