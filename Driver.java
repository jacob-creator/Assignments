public class Driver {

    public static void main(String[] args) {
        double gradeAvg = -20.0;
        char gradeLetter;

        if (gradeAvg < 0) {
            System.out.println("Error! That is not a grade!");
        } else if (gradeAvg >=0 && gradeAvg <= 59.9) {
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an F!");
        } else if (gradeAvg >= 60.0 && gradeAvg <= 69.9) {
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an D!");
        } else if (gradeAvg >=70 && gradeAvg <=75){
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an C!");
        } else if (gradeAvg >=75.1 && gradeAvg <=79.9){
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an C+!");
        } else if (gradeAvg >=80 && gradeAvg <=82.9) {
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an B-!");
        } else if (gradeAvg >=83 && gradeAvg <=85.9) {
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an B!");
        } else if (gradeAvg >=86 && gradeAvg <=89.9) {
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an B+!");
        } else if (gradeAvg >=90 && gradeAvg <=92.9) {
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an A-!");
        } else if (gradeAvg >=93 && gradeAvg <=100) {
            System.out.println("Your grade average is " + gradeAvg + "%!\n" + "Your grade is an A!");
        }
    }
}

