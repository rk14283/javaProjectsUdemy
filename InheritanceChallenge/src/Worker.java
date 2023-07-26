import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.Period;
import java.util.Date;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;

    //enddate will be set by a subclass and protected would allow access
    protected String endDate;

    //no args constructor give classes a little flexibility
    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge(){
        int age = 0;

       // SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        try {
            LocalDate dob = LocalDate.parse(birthDate);
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(dob, currentDate);
            age = period.getYears();

        } catch (DateTimeParseException e) {
            age = 0;
        }
        return age;


    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthDate + '\'' +
                ", endDate=" + endDate +
                '}';
    }

}
