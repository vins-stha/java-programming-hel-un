
public class Main {

    public static void main(String[] args) {
        // test your program here!

//        SimpleDate date = new SimpleDate(13, 2, 2015);
//        System.out.println("Friday of the examined week is " + date);
//
//        SimpleDate newDate = date.afterNumberOfDays(7);
//        int week = 1;
//        while (week <= 7) {
//            System.out.println("Friday after " + week + " weeks is " + newDate);
//            newDate = newDate.afterNumberOfDays(7);
//
//            week = week + 1;
//        }
//
//
//        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");

        SimpleDate now = new SimpleDate(30, 12, 2011);
        System.out.println(now);
        now.advance();
        System.out.println(now);

//        SimpleDate afterOneWeek = now;
//        afterOneWeek.advance(7);
//
//        System.out.println("Now: " + now);
//        System.out.println("After one week: " + afterOneWeek);
    }
}
