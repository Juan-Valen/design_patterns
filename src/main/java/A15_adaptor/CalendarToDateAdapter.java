package A15_adaptor;

import java.util.Calendar;

public class CalendarToDateAdapter implements DateInterface {

    private Calendar calendar;

    public CalendarToDateAdapter() {
        calendar = Calendar.getInstance();
    }

    public CalendarToDateAdapter(int day, int month, int year) {
        calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, day);
    }

    @Override
    public void setDay(int day) {
        calendar.set(Calendar.DATE, day);
    }

    @Override
    public void setMonth(int month) {
        calendar.set(Calendar.MONTH, month);

    }

    @Override
    public void setYear(int year) {
        calendar.set(Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return calendar.get(Calendar.DATE);
    }

    @Override
    public int getMonth() {
        return calendar.get(Calendar.MONTH);
    }

    @Override
    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public void advanceDays(int days) {
        calendar.add(Calendar.DATE, days);
    }

    public String toString() {
        return calendar.getTime().toString();
    }
}
