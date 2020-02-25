/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mo04gw
 */
public class ArrayOfNumbers 
{
    private int[] arrayofints;

    public int[] ArrayOfNumbers(int[] inputints) 
    {
        int size = inputints.length;
        this.arrayofints = new int[size];
        
        for(int x = 0; x < inputints.length; x++)
        {
            this.arrayofints[x] = inputints[x];  
        }
        return this.arrayofints;
    }
    
    public ArrayOfNumbers(int size) 
    {
        this.arrayofints= new int[size];
        for(int x = 0; x < size; x++)
        {
            this.arrayofints[x] = 0;
        }
    }
    
    public int item(int itempos)
    {     
        int thisval = this.arrayofints[itempos];
        return thisval;
    }
    
    public void setItem(int a, int b)
    {
        this.arrayofints[a] = b;
    }
    
    public int max()
    {
        int max = this.arrayofints[0];
        for(int x = 0; x<this.arrayofints.length; x++)
        {
            if(this.arrayofints[x] > max)
            {
                max = this.arrayofints[x];
            }
        }
        return max;
    }
    
    public boolean equal(int a, int b)
    {
        if(this.arrayofints[a] == this.arrayofints[b])
        {
            return true;
        }
        else
        {
            return false;       
        }
    }
    
    public int gcd(int x, int y)
    {
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
    
    public int count()
    {
        int count = 0;
        
        for(int x = 0; x < this.arrayofints.length; x++)
        {
            count++;
        }
        return count;
    }
        
    public int sum()
    {
        int total = 0;
        
        for(int x = 0; x < this.arrayofints.length; x++)
        {
            total += this.arrayofints[x];
        }
        return total;
    }
            
    public int average()
    {
        int total = 0;
        int average = 0;
        
        for(int x = 0; x < this.arrayofints.length; x++)
        {
            total += this.arrayofints[x];
        }
        average = total/this.arrayofints.length;
        return average;
    }
    
    public void scalarMultiply(int z)
    {  
        for(int x = 0; x < this.arrayofints.length; x++)
        {
            this.arrayofints[x] = this.arrayofints[x*z];
        }
    }    
    
    public void addConstant(int z)
    {
        for(int x = 0; x < this.arrayofints.length; x++)
        {
            this.arrayofints[x] = this.arrayofints[x+z];
        }
    }
    
//    public void addObject(int[] starter)
//    {
//        System.out.println(this.first());
//        System.out.println(this.second());
//        System.out.println(b.first());
//        System.out.println(b.second());
//        // 12 + 17
//        
//        this.NumberA = this.first() + b.first();
//        // 18 + 17
//
//        this.NumberB = this.second() + b.second(); 
//    }
}
