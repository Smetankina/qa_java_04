package Lesson_7_Staet_OOP_HW_Part2;

public class MonthUtils {



     private static Month[] monthArray = {
            new Month("Jan", 31, 21),
            new Month("Feb", 28, 20),
            new Month("Mar", 31, 23),
            new Month("Apr", 30, 22),
            new Month("May", 31, 21),
            new Month("Jun", 30, 22),
             new Month("Jul", 31, 22),
             new Month("Aug", 31, 22),
             new Month("Sep", 30, 22),
             new Month("Oct", 31, 21),
             new Month("Nov", 30, 22),
             new Month("Dec", 31, 23)
    };

   public static Month[] getMonthArray()
   {
       return monthArray;

   }

   public static Month[] getMonth_(){
       return  new Month[]{
               new Month("Jan", 31, 21),
               new Month("Feb", 28, 20),
               new Month("Mar", 31, 23),
               new Month("Apr", 30, 22),
               new Month("May", 31, 21),
               new Month("Jun", 30, 22),
               new Month("Jul", 31, 22),
               new Month("Aug", 31, 22),
               new Month("Sep", 30, 22),
               new Month("Oct", 31, 21),
               new Month("Nov", 30, 22),
               new Month("Dec", 31, 23)
       };
   }


}
