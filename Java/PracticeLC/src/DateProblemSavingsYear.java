import java.time.*;
public class DateProblemSavingsYear {
    
    public static void main(String[] args) {
        String s = "23/04/2024";
        String[] split = s.split("/");
        for(String ss : split){

            System.out.println(ss);
        }
        Year y = Year.of(Integer.parseInt(split[2]));
        System.out.println(y.isLeap());

    }
}
