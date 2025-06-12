import java.util.Scanner;

class Exname extends Exception{
    Exname(String s)
    {
        super(s);
    }
}
class Expass extends Exception
{
    Expass(String p)
    {
        super(p);
    }
}

class user{
    String s;
    String pass;
    user(String name,String passw)
    {
        s=name;
        pass=passw;
    }
    void login(String n,String p)
    {
        try{
            if(s.equals(n)&&pass.equals(p))
            {
                System.out.println("login success");
            }
            else{
                throw new Expass("invalid password or username");
            }
        }
        catch(Expass e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
public class defined {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String s=sc.nextLine();
        try{
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(!Character.isLetter(c))
                throw new Exname("invalid");
            }
        }
        catch(Exname m)
        {
            System.out.println(m.getMessage());
            System.exit(0);
        }
        System.out.println("enter passsword");
        String g=sc.nextLine();
        try{
            
            if(g.length()<8)
            {
            throw new Expass("must 8");
            }
            boolean digi=false;
            for(int i=0;i<g.length();i++)
            {
                
                if(Character.isDigit(g.charAt(i)))
                {
                    digi=true;
                    break;
                }

            }
            if(!digi)
            {
                System.out.println("must conatin atleast onr letter");
            }
        }
        catch(Expass k)
        {
            System.out.println(k.getMessage());
        }
        user u=new user(s,g);
        System.out.println("login");
        System.out.println("username:");
        String ss=sc.nextLine();
        System.out.println("password");
        String p1=sc.nextLine();
        u.login(ss, p1);


    }
    
}
