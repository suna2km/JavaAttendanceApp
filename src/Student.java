/**
 * * @author Sanyam Sood
 * @version 1.0
 */
public class Student {
    private String name;
    private int seatNumber;
    private int onTimeCount;
    private int lateCount;
    private int excusedCount;
    private int unexcusedCount;

    /**
     * Constructor for the Student class.
     */
    public Student(String name, int seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
        this.onTimeCount = 0;
        this.lateCount = 0;
        this.excusedCount = 0;
        this.unexcusedCount = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getOnTimeCount() {
        return onTimeCount;
    }

    public int getLateCount() {
        return lateCount;
    }

    public int getExcusedCount() {
        return excusedCount;
    }

    public int getUnexcusedCount() {
        return unexcusedCount;
    }

    public void markAttendance(int status) {
        switch (status) {
            case 1:
                onTimeCount++;
                break;
            case 2:
                lateCount++;
                break;
            case 3:
                excusedCount++;
                break;
            case 4:
                unexcusedCount++;
                break;
            default:
                // Handle invalid status if necessary
                break;
        }
    }

    @Override
    public String toString() {
        return String.format("%-4d %-15s %6d %4d %7d %9d",
                seatNumber, name, onTimeCount, lateCount, excusedCount, unexcusedCount);
    }
}