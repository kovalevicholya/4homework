
public class Scolarship {
    private final int MAX_GRADE = 11;
    private final int level1 = 3;
    private final int level2 = 7;
    private int mathGrade;
    private int rusGrade;
    private int chemGrade;

    public Scolarship(int mathGrade, int rusGrade, int chemGrade) {
        setMathGrade(mathGrade);
        this.rusGrade = setGrade(rusGrade);
        this.chemGrade = setGrade(chemGrade);
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = 1;
        if (mathGrade >= 1 && mathGrade<MAX_GRADE) {
            this.mathGrade = mathGrade;
        }
    }

    public int setGrade(int grade) {
        if (grade >= 1 && grade<MAX_GRADE) {
            return grade;
        } else {
            return 1;
        }
    }

    public double average() {
        return (mathGrade+rusGrade+chemGrade) / 3;
    }

    public int money() {
        double avg = average();
        int payment;
        if (avg<=level1) {
            payment = 0;
        } else {
            if (avg >= level2) {
                payment = 100;
            } else {
                payment = 50;
            }
        }
        return payment;
    }

    public static void main(String[] args) {
        Scolarship student = new Scolarship(10, 9, 8);
        System.out.println(student.average());
        System.out.println(student.money());
    }
}
