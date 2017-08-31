/*
Using two arrays, one to store the names of months and the other one to
store the days in each month, write a program to find the number of days in a
given month.

Using the same above arrays, write a program to find the number of days
from January 1 up to the given date, which is given as Month Day Year
combination.

 */
package arraydemo;

public class DayMonth {

    int i;
    int pointer;
    boolean isMonth = false;

    String[] month
            = {"january", "february", "march",
                "april", "may", "june",
                "july", "august", "september",
                "october", "november", "december"};
    int[] day
            = {31, 28, 31,
                30, 31, 30,
                31, 31, 30,
                31, 30, 31};

    public DayMonth() {
    }

    void getMonth(String month) {
        System.out.println("");
        for (i = 0; i < 13; i++) {
            if (this.month[i].equalsIgnoreCase(month)) {
                isMonth = true;
                pointer = i;
                break;

            }
        }
        if (isMonth) {
            System.out.println(this.month[pointer].toUpperCase() + " has " + this.day[pointer] + " days.");
        } else {
            System.out.println("Check Month spelling ");
        }

    }

}
