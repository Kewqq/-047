import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your score");
            int score = scanner.nextInt();
            String grade;
            if (score >= 80 && score <=100) {
                grade = "A";
            }else if (score >= 79 && score <= 75) {
                grade = "B+";
            }else if (score >=74 && score <=70) {
                grade = "B";
            }else if (score >=69 && score <=65) {
                grade = "c+";
            }else if (score >=64 && score <=60) {
                grade = "C";
            }else if (score >=59 && score <=55) {
                grade = "D+";
            }else if (score >=54 && score <=50) {
                grade = "D";
            }else if (score >=49 && score <=0) {
                grade = "E";
            }else {
                System.out.println("This score is not true");
                return;
            }        
            System.out.println(grade);
        }

    }
}
