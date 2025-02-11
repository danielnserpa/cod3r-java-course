package classesAndMethods;

public class Date {

    int day;
    int month;
    int year;

    public Date() {

    }
    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String formattedDate(int day, int month, int year) {

            return String.format("\n%d, %d, %d",day, month, year);
    }

    String formattedDate(){
        return String.format("\n%d/%d/%d",day, month, year);
    }

    // This method only works on the terminal. Doesn't work on web app, or desktop app or anything
    void printDate() {
        System.out.println(formattedDate());
    }

}
