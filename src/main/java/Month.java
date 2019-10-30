/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class Month {
    
    private int monthNumber;
    private String monthName;
    
    public Month()
    {
      monthNumber = 1;  
    }
    
    public Month(int mNumber)
    {
      monthNumber = mNumber; 
      
      if (mNumber < 1 || mNumber > 12)
      {
          mNumber = 1;
      }
      else 
      {
          monthNumber = mNumber;
      }
    }
    
    public Month(String mName)
    {
      if (mName.equalsIgnoreCase("January")) 
      {
          monthNumber = 1;
      }  
      else if (mName.equalsIgnoreCase("February")) 
      {
          monthNumber = 2;
      }
      else if (mName.equalsIgnoreCase("March")) 
      {
          monthNumber = 3;
      }
      else if (mName.equalsIgnoreCase("April")) 
      {
          monthNumber = 4;
      }
      else if (mName.equalsIgnoreCase("May")) 
      {
          monthNumber = 5;
      }
      else if (mName.equalsIgnoreCase("June")) 
      {
          monthNumber = 6;
      }
      else if (mName.equalsIgnoreCase("July")) 
      {
          monthNumber = 7;
      }
      else if (mName.equalsIgnoreCase("August")) 
      {
          monthNumber = 8;
      }
      else if (mName.equalsIgnoreCase("September")) 
      {
          monthNumber = 9;
      }
      else if (mName.equalsIgnoreCase("October")) 
      {
          monthNumber = 10;
      }
      else if (mName.equalsIgnoreCase("November")) 
      {
          monthNumber = 11;
      }
      else if (mName.equalsIgnoreCase("December")) 
      {
          monthNumber = 12;
      }
    }
    
    public void setMonthNumber(int mNumber)
    {
       if (mNumber < 1 || mNumber > 12){
           monthNumber = mNumber;
       } 
    }
    
    public int getMonthNumber()
    {
        return monthNumber;
    }
    
    public String getMonthName()
    {
        if (monthNumber == 1)
        {
            return "January";
        }
        else if (monthNumber == 2)
        {
            return "February";
        }
        else if (monthNumber == 3)
        {
            return "March";
        }
        else if (monthNumber == 4)
        {
            return "April";
        }
        else if (monthNumber == 5)
        {
            return "May";
        }
        else if (monthNumber == 6)
        {
            return "June";
        }
        else if (monthNumber == 7)
        {
            return "July";
        }
        else if (monthNumber == 8)
        {
            return "August";
        }
        else if (monthNumber == 9)
        {
            return "September";
        }
        else if (monthNumber == 10)
        {
            return "October";
        }
        else if (monthNumber == 11)
        {
            return "November";
        }
        else if (monthNumber == 12)
        {
            return "December";
        }
        else 
        {
         return "January";   
        }
        
    }    
    
    @Override
    public String toString()
    {
        return getMonthName();
    }
    
    public boolean equals(Month m)
    {
        return monthNumber == m.monthNumber;
    }
    
    public boolean greaterThan(Month m)
    {
        return monthNumber > m.monthNumber;
    }
    
    public boolean lessThan(Month m)
    {
        return monthNumber < m.monthNumber;
    }
}
