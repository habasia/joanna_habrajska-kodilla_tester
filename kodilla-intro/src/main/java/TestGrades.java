public class TestGrades {
    public static void main(String[] args) {
        Grades asiaGrades = new Grades();
        asiaGrades.add(1);
        asiaGrades.add(2);
        asiaGrades.add(3);
        asiaGrades.add(4);
        asiaGrades.add(5);
        asiaGrades.add(6);
        asiaGrades.add(7);
        asiaGrades.add(8);
        asiaGrades.add(9);
        asiaGrades.add(10);
        //asiaGrades.add(11);
        System.out.println(asiaGrades.returnLastAddedGrade());
        System.out.println(asiaGrades.returnAverage());
    }
}
