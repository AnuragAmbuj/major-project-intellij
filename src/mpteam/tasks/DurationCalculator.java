package mpteam.tasks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by Anurag Ambuj on 3/20/2016.
 */

public class DurationCalculator {

    @SuppressWarnings("deprecation")
    public static int getDayDifference(String passedDate)
    {
        StringTokenizer stringTokenizer = new StringTokenizer(passedDate,"-");
        int year = Integer.parseInt(stringTokenizer.nextToken());
        int month = Integer.parseInt(stringTokenizer.nextToken());
        int date = Integer.parseInt(stringTokenizer.nextToken());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String currentDate = df.format(d);
        System.out.println("Current Date:"+currentDate);
        StringTokenizer tokenizer = new StringTokenizer(currentDate,"-");
        int cyear = Integer.parseInt(tokenizer.nextToken());
        int cmonth = Integer.parseInt(tokenizer.nextToken());
        int cdate = Integer.parseInt(tokenizer.nextToken());
        int diff = (cyear - year)*365;
        if(diff == 0)
        {
            if(cdate == date)
            {
                diff = (cmonth - month)*30;
            }
            else if( cdate < date && (cmonth-month)==1 )
            {
                diff = cdate+(30-date);
            }
            else if( cdate > date && (cmonth - month)>=1 )
            {
                diff = (cmonth - month)*30+(cdate-date);
            }
            else if( cdate < date && (cmonth-month)>1)
            {
                diff = cdate+(30-date)+(cmonth-month-1)*30;
            }


        }
        if(diff == 0)
        {
            diff = cdate - date;
        }
        System.out.println("Date Difference:"+diff);
        return diff;
    }
    public static String getGrowthStatus(String date)
    {

        int daydiff=getDayDifference(date);
        System.out.println(daydiff+"");
        if(daydiff < 20)
        {
            return "Germination";
        }
        else if(daydiff >=20 && daydiff <= 40)
        {
            return "Adult";
        }
        else if(daydiff > 40 && daydiff  < 70)
        {
            return "Flowering";
        }
        else if(daydiff < 120)
        {
            return "Fruit";
        }
        else
            return "Dead";
    }
}
