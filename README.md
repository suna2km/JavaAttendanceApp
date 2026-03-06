# Java Attendance App

A command-line Java application for tracking student attendance across two course sections. This app is designed similarly to a basketball scoreboard, capturing daily attendance status (On Time, Late, Excused, Unexcused) and generating comprehensive attendance reports.

---

## 🚀 Features

- **Course Management:** Create and track attendance for exactly two course sections.
- **Seat Assignments:** Enroll students dynamically by assigning them a valid seat number (1-55).
- **Attendance Tracking:** Record multiple types of attendance statuses:
  - `1` = On Time
  - `2` = Late
  - `3` = Excused
  - `4` = Unexcused
- **Detailed Reporting:** View attendance summaries for each course and detailed, per-student attendance reports.
- **Built-In Data Validation:** Prevents invalid inputs, out-of-bounds seat numbers, duplicate seat assignments, and blank names.

---

## 🛠️ Usage

To compile and run the application from the terminal:

```bash
# Compile all Java source files into the 'out' directory
javac -d out src/*.java

# Run the compiled application
java -cp out AttendanceApp
```

---

## 📸 Application Screenshots (Terminal Flows)

### 1. Successful Setup & Attendance Flow

Below is an example of creating courses, adding students, and viewing an attendance report:

```text
==================================================
Welcome to the Attendance App
==================================================

Enter Section 1's course name: Java 101
Enter Java 101 student's name or 'q' to quit: Alice
Enter Alice seat number: 1

Enter Java 101 student's name or 'q' to quit: Bob
Enter Bob seat number: 2

Enter Java 101 student's name or 'q' to quit: q

Enter Section 2's course name: Web 101
Enter Web 101 student's name or 'q' to quit: Charlie
Enter Charlie seat number: 1

Enter Web 101 student's name or 'q' to quit: David
Enter David seat number: 2

Enter Web 101 student's name or 'q' to quit: q
==================================================
Recording Attendance!
==================================================

--------------------------------------------------
Main Menu
--------------------------------------------------
0 = End Attendance App
1 = Take Java 101 Attendance
2 = Take Web 101 Attendance
3 = Display All Attendance Report
--------------------------------------------------
Menu Choice: 3
--------------------------------------------------

Java 101 Ontime=0 Late=0 Excused=0 Unexcused=0
Seat   Name            OnTime Late Excused Unexcused
==== =============== ====== ==== ======= =========
   1 Alice                0    0       0         0
   2 Bob                  0    0       0         0

Web 101 Ontime=0 Late=0 Excused=0 Unexcused=0
Seat   Name            OnTime Late Excused Unexcused
==== =============== ====== ==== ======= =========
   1 Charlie              0    0       0         0
   2 David                0    0       0         0
```

Taking attendance for students updates their records dynamically:

```text
--------------------------------------------------
Main Menu
--------------------------------------------------
0 = End Attendance App
1 = Take Java 101 Attendance
2 = Take Web 101 Attendance
3 = Display All Attendance Report
--------------------------------------------------
Menu Choice: 1
--------------------------------------------------

Enter Java 101's Student Seat or 0 to quit: 1
--------------------------------------------------
Enter #1 Alice Attendance
--------------------------------------------------
1 = On Time
2 = Late
3 = Excused
4 = Unexcused
--------------------------------------------------
Enter Status: 1
--------------------------------------------------
Seat #1 Alice
Ontime = 1 Late = 0 Excused = 0 Unexcused = 0

Enter Java 101's Student Seat or 0 to quit: 0
--------------------------------------------------
Java 101 Ontime=1 Late=0 Excused=0 Unexcused=0
--------------------------------------------------
```

### 2. Error Handling & Validation Flows

The app is built to handle invalid input gracefully without crashing.

**Invalid String/Integer Inputs & Duplicates:**
```text
Enter Java 101 student's name or 'q' to quit: Alice
Enter Alice seat number: abc
Invalid input! Please enter a number between (1 - 55): -1
Invalid input! Please enter a number between (1 - 55): 1

Enter Java 101 student's name or 'q' to quit: Bob
Enter Bob seat number: 1
Seat #1 already assigned to Alice!
Unable to add student!
```

**Blank Name Validation:**
```text
Enter Java 101 student's name or 'q' to quit:    
Enter     seat number: 2
Student name cannot be blank.
Unable to add student!
```

**Invalid Menu/Status Options:**
```text
Enter Java 101's Student Seat or 0 to quit: 100
Invalid input! Please enter a number between (0 - 55): 2
Invalid seat, please try again!

Enter Java 101's Student Seat or 0 to quit: 1
--------------------------------------------------
Enter #1 Alice Attendance
--------------------------------------------------
1 = On Time
2 = Late
3 = Excused
4 = Unexcused
--------------------------------------------------
Enter Status: 5
Invalid input! Please enter a number between (1 - 4): 1
```

---

## 📂 Project Structure

- `AttendanceApp.java`: Main entry point containing menu logic, course setup, and flow.
- `Course.java`: Manages the list of students for a particular course section and computes aggregate attendance.
- `Student.java`: Represents a student's seat assignment, name, and their individual attendance counters.
- `Input.java`: Utility class containing validation logic for user input via standard `Scanner`.

  **Authors:**
  Suna2km
  Sanyam
