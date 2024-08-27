public class Park {
    private final Attraction[] attractions;
    private int count;

    public Park(int size) {
        attractions = new Attraction[size];
        count = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (count < attractions.length) {
            attractions[count] = new Attraction(name, workingHours, price);
            count++;
        }
    }

    public void printAttractions() {
        for (int i = 0; i < count; i++) {
            attractions[i].printInfo();
            System.out.println();
        }
    }

    // Вложенный класс Attraction
    static class Attraction {
        private final String name;
        private final String workHours;
        private final double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workHours);
            System.out.println("Стоимость: " + price);
        }
    }

    // Метод для создания парка и вывода информации об аттракционах
    public static void createAndPrintPark() {
        Park park = new Park(3);
        park.addAttraction("Колесо обозрения", "10:00 - 21:00", 200);
        park.addAttraction("Американские горки", "10:00 - 22:00", 300);
        park.addAttraction("Комната кривых зеркал", "10:00 - 22:00", 250);

        park.printAttractions();
    }
    //Проверка вывода в консоль
    public static void main(String[] args) {

        // Создание парка и вывод информации об аттракционах
        Park.createAndPrintPark();
    }
}