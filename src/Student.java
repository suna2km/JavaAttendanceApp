/**
 * A Basketball Player and the player's stats.
 * @author Suna Aregay + Sanyam Sood
 * @since 2026.03.06
 * @version 1.0 beta
 * @see <a href="https://github.com/suna2km/JavaAttendanceApp">GitHub Repository</a>
 */
public class Student {

    /** The Student's seat. */
    private int seat;

    /** The Student's name. */
    private String name;

    /** The Student's number of ontime days. */
    private int onTime;

    /** The Student's number of late days. */
    private int late;

    /** The Student's number of excused days. */
    private int excused;

    /** The Student's number of unexcused days. */
    private int unexcused;

    /**
     * Set the Student's fields to default values null and zeroes.
     * Set name to unknown
     * The default constructor is PRIVATE, so it is ONLY called by the overload constructor.
     */
    private Student() {
        seat = 0;
        name = "unknown";
        onTime = 0;
        late = 0;
        excused = 0;
        unexcused = 0;
    }

    /**
     * This overload constructor should only be used by the ArrayList indexOf method
     * to detect if a seat number is already taken by overriding the equals method to test
     * if two students are equal based on their seat number.
     * @param seat The Student's seat number.
     * @throws Exception if the setSeat method throws a data validation error.<br>
     */
    public Student(int seat) throws Exception {
        this();
        setSeat(seat);
    }

    /**
     * Allow creating a Student plus setting their name and seat number.
     * The constructor first calls the default constructor and then
     * calls both the setName and setSeat methods for data validation.
     * @param name The Student's name
     * @param seat The Student's seat #
     * @throws Exception if the name or seat setters throws an error
     */
    public Student (int seat, String name) throws Exception {
        setSeat(seat);
        setName(name);
    }

    /**
     * Get the Student's name.
     * @return The Student's name.
     */
    public int getSeat() {
        return seat;
    }

    /**
     * Get the Student seat number.
     * @return The Student's seat number
     */
    public String getName() {
        return name;
    }

    /**
     * Get the Student's number of ontime days.
     * @return the number of days the Student was ontime.
     */
    public int getOntime() {
        return onTime;
    }

    /**
     * Get the Student's number of late days.
     * @return the number of days the Student was late.
     */
    public int getLate() {
        return late;
    }

    /**
     * Get the Student's number of excused days.
     * @return the number of days the Student was excused.
     */
    public int getExcused() {
        return excused;
    }

    /**
     * Get the Student's number of unexcused days.
     * @return the number of days the Student was unexcused.
     */
    public int getUnexcused() {
        return unexcused;
    }

    /**
     * Set the Student's seat number if it's a positive number
     * otherwise it throws an error.
     * @param seat the student's seat number
     * @throws Exception if the seat number isn't greater than 0.<br>
     * <u>Example</u>
     * <pre>Invalid seat number #-1 for name Ben!</pre>
     */
    public void setSeat(int seat) throws Exception {
        if (seat > 0)
            this.seat = seat;
        else
            throw new Exception("Invalid seat number #" + seat + " for name " + name + "!");
    }

    /**
     * Set the Student's name. Uses the trim method to remove leading and trailing spaces
     * and then if the name is an empty string, it will throw an error
     * if not then it will set the student's name.
     * @param name The Student's name
     * @throw Exception if the student's name is blank (whitespace or empty)<br>
     * <u>Example</u>
     * <pre>Student name cannot be blank </pre>
     */
    public void setName(String name) throws Exception {

        if (name == null || name.isBlank())
            throw new Exception("Student name cannot be blank.");
        this.name = name.trim();
    }

    /**
     * Increment the appropriate attendance type, using a switch that also handles for invalid data.<br>
     * case 1 is received then increment ontime by 1<br>
     * case 2 is received then increment late by 1<br>
     * case 3 is received then increment excused by 1<br>
     * case 4 is received then increment unexcused by 1<br>
     * default throw an exception displaying the invalid value that was received
     * @param status The status type 1= Ontime, 2= Late, 3= Excused, 4= Unexcused
     * @throws Exception if an invalid status is received (valid 1-4)<br>
     * <u>Example</u>
     * <pre>Invalid status = 5</pre>
     */
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

    /**
     * Display the Student's seat number, name, # of ontime, late, excused and unexcused<br>
     * <u>Example</u>
     * <pre>#1 Ben ontime = 1 late = 0 excused = 1 unexcused = 0</pre>
     */
    public void displayAttendance() {
        System.out.println(this);
        System.out.print("Ontime = " + onTime + " ");
        System.out.print("Late = " + late + " ");
        System.out.print("Excused = " + excused + " ");
        System.out.println("Unexcused = " + unexcused);
    }

    /**
     * Instead of verifying two students are identical by equal identities.<br>
     * This method will verify two students are the same by ONLY their seat number.<br>
     * This allows the ArrayList.getIndex() method to return a student's by only checking their seat number.
     * @param object a student object to check equality of ONLY the seat number
     * @return true if the two student's seat are equal otherwise false
     */
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Student other))
            return false;

        return this.seat == other.getSeat();
    }

    /**
     * Returns the seat number and student name. Example:<br>
     * #1 Ben
     * @return The student's seat and name
     */
    @Override
    public String toString(){
        return "Seat #" + seat + " " + name;
    }
}
