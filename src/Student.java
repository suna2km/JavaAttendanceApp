public class Student {
    private int seat;
    private String name;
    private int onTime;
    private int late;
    private int excused;
    private int unexcused;

    public Student() {
        seat = 0;
        name = "unknown";
        onTime = 0;
        late = 0;
        excused = 0;
        unexcused = 0;
    }

    public Student(int seat) throws Exception {
        this();
        setSeat(seat);
    }
    public Student (int seat, String name) throws Exception {
        setSeat(seat);
        setName(name);
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) throws Exception {
        if (seat > 1)
            this.seat = seat;
        else
            throw new Exception("Invalid seat number #" + seat + " for name " + name + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        name = name.trim();

        if (name.isBlank())
            throw new Exception("Name cannot be blank for seat number #" + seat + "!");
        else
            this.name = name;
        this.name = name;
    }

    public int getOnTime() {
        return onTime;
    }

    public int getLate() {
        return late;
    }

    public int getExcused() {
        return excused;
    }

    public int getUnexcused() {
        return unexcused;
    }

    public void updateAttendance(int status) throws Exception {

        switch (status) {
            case 1:
        }
        if (status == 1)
            onTime++;
        else if (status == 2)
            late++;
        else if (status == 3)
            excused++;
        else if (status == 4)
            unexcused++;
        else throw new IllegalArgumentException("Invalid status for status #" + status + "!");
    }

    public void displayAttendance() {

    }

    @Override
    public String toString(){
        return seat + ", " + name;
    }
}
