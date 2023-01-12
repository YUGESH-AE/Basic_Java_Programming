package Java_Fundamentals.Enum.eg2;

public enum Day {
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);

    private int day;

    Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public static void main(String[] args) {
        for (Day day:Day.values()
             ) {
            System.out.println("day:"+day.name()+","+day.getDay());
        }
    }
}
