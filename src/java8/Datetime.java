package java8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;



public class Datetime
{



   public static void main(String[] args) 
   {
        
        
        LocalTime currentDate = LocalTime.now();
        
        System.out.println("Current time from LocalTime in IST (+05:30): "+currentDate);
        
        
        LocalTime gmtPlus5 = LocalTime.now(ZoneId.of("GMT+06:30"));
        
        System.out.println("Current time in GMT +05:00 : "+gmtPlus5);
        
    
        LocalDateTime LocalTimeTime = LocalDateTime.now();
        LocalTime fromLocalTimeTime = LocalTimeTime.toLocalTime();
        System.out.println("From LocalDateTime : "+fromLocalTimeTime);
    }
}
