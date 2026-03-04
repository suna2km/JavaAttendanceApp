public class Student {
    private int seat;
    private String name;
    private int onTime;
    private int late;
    private int excused;
    private int unexcused;

    private Student() {
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

    public String getName() {
        return name;
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

    public void setSeat(int seat) throws Exception {
        if (seat > 0)
            this.seat = seat;
        else
            throw new Exception("Invalid seat number #" + seat + " for name " + name + "!");
    }

    public void setName(String name) throws Exception {
        name = name.trim();

        if (name == null || name.isBlank())
            throw new Exception("Student name cannot be Blank");
        this.name = name.trim();
    }

    public void updateAttendance(int status) throws Exception {

        switch (status) {
            case 1:
                onTime++;
                break;
            case 2:
                late++;
                break;
            case 3:
                excused++;
                break;
            case 4:
                unexcused++;
                break;
            default:
                throw new Exception("Invalid attendance status = " + status);

        }
    }

    public void displayAttendance() {
        System.out.println("Seat #" + seat + " " + name);
        System.out.println("Ontime =" + onTime + " " + "Late +" + late + " " + "Execused =" + excused + " " + "Unexcused =" + unexcused);
    }
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Student other))
        return false;

        return this.seat == other.getSeat();
    }


    @Override
    public String toString(){
        return "Seat #" + seat + ", " + name;
    }
}
