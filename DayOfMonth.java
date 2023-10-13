import java.util.Scanner;

public class DayOfMonth {
    public static boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    public static int monthF(String m){
        if (m.equals("Jan.") || m.equals("Jan") || m.equals("January") || m.equals("1")) return 1;
        if (m.equals("Feb.") || m.equals("Feb") || m.equals("February") || m.equals("2")) return 2;
        if (m.equals("Mar.") || m.equals("Mar") || m.equals("March") || m.equals("3")) return 3;
        if (m.equals("Apr.") || m.equals("Apr") || m.equals("April") || m.equals("4")) return 4;
        if (m.equals("May")  || m.equals("May") || m.equals("5")) return 5;
        if (m.equals("Jun.") || m.equals("Jun") || m.equals("June") || m.equals("6")) return 6;
        if (m.equals("Jul.") || m.equals("Jul") || m.equals("July") || m.equals("7")) return 7;
        if (m.equals("Aug.") || m.equals("Aug") || m.equals("August") || m.equals("8")) return 8;
        if (m.equals("Sep.") || m.equals("Sep") || m.equals("September") || m.equals("9")) return 9;
        if (m.equals("Ocm.") || m.equals("Oct") || m.equals("October") || m.equals("10")) return 10;
        if (m.equals("Nov.") || m.equals("Nov") || m.equals("November") || m.equals("11")) return 11;
        if (m.equals("Dec.") || m.equals("Dec") || m.equals("December") || m.equals("12")) return 12;
        return 0;
    }
    public static void main(String[] args) {
        int year;
        String month;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Input month: ");
            month = input.nextLine();
        } while (monthF(month) > 12 || monthF(month) < 1);

        System.out.print("Input year: ");
        year = input.nextInt();
        

        switch (monthF(month)) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Month " + month +  "year" + year + " has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Month " + month + "year" + year + " has 30 days.");
                break;
            case 2:
                if (checkYear(year)) {
                    System.out.print("Month " + month + "year" + year + " has 29 days.");
                } else {
                    System.out.print("Month " + month + "year" + year +  " has 28 days.");
                }
                break;
            default:
                System.out.print("Invalid month.");
        }
    }
}