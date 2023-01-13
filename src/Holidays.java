import java.util.ArrayList;
import java.util.List;

public class Holidays {
    public boolean isAValidDate(String date) {
        if (!date.matches("((0[1-9])?([1-2][0-9])?(3[0-1])?){1}/((0[1-9])?(1[0-2])?){1}/(2023)")) {
            System.out.println("Insira uma data no formato dd/mm/2023");
            return false;
        } else {
            return true;
        }
    }

    public void getHoliday(String date) {

        if (isAValidDate(date)) {
            switch (date) {

                case "01/01/2023":
                    System.out.println("Confraternização mundial");
                    break;
                case "21/02/2023":
                    System.out.println("Carnaval");
                    break;
                case "17/04/2023":
                    System.out.println("Páscoa");
                    break;
                case "21/04/2023":
                    System.out.println("Tiradentes");
                    break;
                case "01/05/2023":
                    System.out.println("Dia do trabalho");
                    break;
                case "08/06/2023":
                    System.out.println("Corpus Christi");
                    break;
                case "07/09/2023":
                    System.out.println("Independência do Brasil");
                    break;
                case "12/10/2023":
                    System.out.println("Nossa Senhora Aparecida");
                    break;
                case "02/11/2023":
                    System.out.println("Finados");
                    break;
                case "15/11/2023":
                    System.out.println("Proclamação da República");
                    break;
                case "25/12/2023":
                    System.out.println("Natal");
                    break;
                default:
                    System.out.println("Não existe feriado nessa data.");
            }
        }
    }

    public List<String> getAllHolidays() {
        List<String> holidays = new ArrayList<>();
        holidays.add("01/01/2023 -> Confraternização mundial");
        holidays.add("21/02/2023 -> Carnaval");
        holidays.add("17/04/2023 -> Páscoa");
        holidays.add("21/02/2023 -> Tiradentes");
        holidays.add("01/05/2023 -> Dia do trabalho");
        holidays.add("08/06/2023 -> Corpus Christi");
        holidays.add("07/09/2023 -> Independência do Brasil");
        holidays.add("12/10/2023 -> Nossa Senhora Aparecida");
        holidays.add("02/11/2023 -> Finados");
        holidays.add("15/11/2023 -> Proclamação da República");
        holidays.add("25/12/2023 -> Natal");

        System.out.println(holidays);

        return holidays;
    }

}
