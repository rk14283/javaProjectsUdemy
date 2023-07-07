public class Main {

    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            //we did not call the string method on the student
            LPAStudent s = new LPAStudent("592300" +i,
                    switch(i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4-> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
                    },

                    "05/11/1985",
                    "Java MasterClass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("5923006","Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("5923007", "Bill","05/11/1985","Java Master class");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", JAVA OCP Exam 829");
        //there is no setter, because record is immutable
        //recordStudent.setClassList(recordStudent.classList() + " JAVA OCP Exam 829");



        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());


    }

}




