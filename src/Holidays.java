import java.util.HashMap;
import java.util.Map;

public class Holidays {

    Map<String, String> holidays = new HashMap<>();

    public Holidays() {
        buildHolidaysCalendar();
    }

    public void getHoliday(String holiday) {
        if (!holiday.matches("((0[1-9])?([1-2][0-9])?(3[0-1])?){1}/((0[1-9])?(1[0-2])?){1}/(2023)")) {
            System.out.println("Insira uma data no formato dd/mm/2023");
            return;
        }

        if (holiday == null) {
            System.out.println("Data inválida.");
        }

        if (holidays.containsKey(holiday)) {
            System.out.println("Feriado: " + holidays.get(holiday));
        } else {
            System.out.println("Não existe feriado nessa data.");
        }
    }

    public void listAllHolidays() {
        holidays.forEach((key, value) -> System.out.println("Data: " + key + " Feriado: " + value));
    }

    public void buildHolidaysCalendar() {
        holidays.put("01/01/2023", "Confraternização mundial");
        holidays.put("21/02/2023", "Carnaval");
        holidays.put("17/04/2023", "Páscoa");
        holidays.put("21/04/2023", "Tiradentes");
        holidays.put("01/05/2023", "Dia do trabalho");
        holidays.put("08/06/2023", "Corpus Christi");
        holidays.put("07/09/2023", "Independência do Brasil");
        holidays.put("12/10/2023", "Nossa Senhora Aparecida");
        holidays.put("02/11/2023", "Finados");
        holidays.put("15/11/2023", "Proclamação da República");
        holidays.put("25/12/2023", "Natal");
    }
}
