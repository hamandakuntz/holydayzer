public class App {
    public static void main(String[] args) throws Exception {
        Holidays holidays = new Holidays();

        holidays.getHoliday("17/04/2023");

        holidays.getHoliday("21/02/2023");

        holidays.getHoliday("16/06/2023");

        holidays.getHoliday("35/13/2023");

        holidays.getAllHolidays();
    }

}
