
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mo04gw
 */
public class TwoNumbers 
{
    private int NumberA;
    private int NumberB;

    public TwoNumbers(int NumberA, int NumberB) 
    {
        this.NumberA = NumberA;
        this.NumberB = NumberB;
    }
    
    public int first()
    {
        this.NumberA = NumberA;
        return NumberA;
    }
    
    public int second()
    {
        this.NumberB = NumberB;
        return NumberB;
    }
    
    public int max()
    {
        if(first() > second())
        {
            return NumberA;
        }
        else
        {
            return NumberB;       
        }
    }
    
    public boolean equal()
    {
        if(first() == second())
        {
            return true;
        }
        else
        {
            return false;       
        }
    }
    
    public int gcd()
    {
        int x = this.first();
        int y = this.second();
        
        while (x != y) 
        {
            if (x > y) 
            {
                x = x - y;
            } 
            else 
            {
                y = y - x;
            }
        } 
        return x;
    }
    
    public void addNumbers()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        
        System.out.println("Enter another number: ");
        int b = s.nextInt();
        
        this.NumberA = this.NumberA + a;
        this.NumberB = this.NumberB + b;
        
        System.out.println(a + " , " + b);
    }
    
    
    public TwoNumbers addSum(TwoNumbers a)
    {
        // 8 + 2
        System.out.println(this.first());
        System.out.println(this.second());
        int x = this.first() + a.first();
        System.out.println("X: " + x);
        System.out.println(a.first());
        // 12 + 8
        int y = this.second() + a.second(); 
        System.out.println(a.second());
        
        TwoNumbers b = new TwoNumbers(x,y);
        System.out.println(b.toString());
        
        return b;
        
    }
    
    
    public void addObject(TwoNumbers b)
    {
        System.out.println(this.first());
        System.out.println(this.second());
        System.out.println(b.first());
        System.out.println(b.second());
        // 12 + 17
        
        this.NumberA = this.first() + b.first();
        // 18 + 17

        this.NumberB = this.second() + b.second(); 
    }
        

    @Override
    public String toString()
    {
        String str = "";
        str += "\nFirst Number: " + this.first()
        + "\nSecond Number: " + this.second()
        + "\nMax: " + this.max()
        + "\nEqual: " + this.equal()
        + "\nGCD: " + this.gcd();
        
        
        return str;
    }
}
