import java.util.Scanner;

public class GradesAverage {

    private int numberOfSubjects;
    private int numberOfGrades;
    private int grades[][];

    public GradesAverage(int numberOfSubjects,int numberOfGrades){
        this.numberOfSubjects = numberOfSubjects;
        this.numberOfGrades = numberOfGrades;
        inputGrades();
    }

    private void inputGrades(){
        grades = new int[numberOfSubjects][];
        for(int subjectsList = 0; subjectsList < grades.length; subjectsList++){
            grades[subjectsList] = new int[numberOfGrades];
        }
    }
    public void getUserGrades(){
        Scanner input = new Scanner(System.in);
        for(int subjectsList = 0; subjectsList < numberOfSubjects; subjectsList++){
            for(int gradesList = 0; gradesList < numberOfGrades; gradesList++){
                System.out.println("Input grade number " + (gradesList + 1) + " of subject number " + (subjectsList + 1) + ":");
                grades[subjectsList][gradesList] = input.nextInt();
            }
        }
    }

    public void printGradesAverage(){
        double average = 0;
        for (int subjectList = 0; subjectList < numberOfSubjects; subjectList++){
            double classAverage = 0;
            for(int grades : grades[subjectList]){
                classAverage += grades;
            }
            classAverage /= numberOfGrades;
            System.out.println("Average grade for subject number " + (subjectList + 1) + " is equal: " + (classAverage));
            average += classAverage;
        }
            average /= numberOfSubjects;
            System.out.println("Total average is equal to: " + average);
    }

    public static void main(String[] args) {
        int numberOfSubjects = 2;
        int numberOfGrades = 2;

        GradesAverage userGradesAverage = new GradesAverage(numberOfSubjects, numberOfGrades);
        userGradesAverage.getUserGrades();
        userGradesAverage.printGradesAverage();

    }
}