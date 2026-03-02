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

    public Student(int seat){
        this();
        this.seat = seat;
    }
    public Student (int seat, String name){
        this.seat = seat;
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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


    @Override
    public String toString(){
        return seat + " " + name;
    }
}
