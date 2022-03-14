# jUnit-exercises
Exercises
Part One: The Test Driven Development Cycle (Red, Green, Refactor)
We will follow the best practices of TDD, and we will create our tests first and write production code once we see the test fail. We will create a Student and a StudentTest class for a grades application, before you start let's analyse the requirements for the Student class:

id should be a long number used to represent a "unique user" in our application.
name is a String that holds the name of the student.
grades is an ArrayList that contains a list of Integer numbers.
Create a new branch called students-tests and read carefully the next instructions.

Create a StudentTest.java class file inside of src/test/java (you might have to create these folders yourself) and remember to write the test before the actual production code. We will simulate the C(reate) R(ead) from the CRUD functionality in our grades application, you should be able to test and create the following requirements:

The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
The Student class should have the following methods:
// returns the student's id
public long getId(){...}

    // returns the student's name
    public String getName(){...}

    // adds the given grade to the grades list
    public void addGrade(int grade){...}
  
    // returns the list of grades
    public ArrayList<Integer> getGrades(){...}

    // returns the average of the students grades
    public double getGradeAverage(){...}
As always, commit and push all your changes once you're done.
At the end of the exercise you will end up with a Student.java and a StudentTest.java class.
Bonus
Go ahead and try to add the rest of the CRUD tests and functionality, write the methods for updateGrade() and deleteGrade() in the Student class.
Part Two: Testing Legacy Code
Once you are done with the Student.java class.

Checkout to the cohorts-feature branch, there you will find a Cohort.java class inside the src/main/java folder, this class has already a lot of methods to calculate the cohort average grade and add a student. Let's go ahead and make sure there's sufficient tests for this class to be deployed to production:

Start by creating a new branch called: cohorts-tests.

Then create a CohortTest class and build a test for each of the following requirements:

A Cohort instance can add a Student to the List of students.
A Cohort instance can get the current List of students.
A Cohort instance can get the average, and it's being calculated correctly.
Go back to the StudentTest class and refactor the code to avoid any repetition in the test cases, the use of the @Before annotation will be useful to achieve this, do the same with this new CohortTest class if you find any code repetition as well.

Bonus
Follow the TDD cycle and create a new feature to find students by their ID like: findStudentById(long id) in the Cohort class, remember to create the tests first before any production code.
