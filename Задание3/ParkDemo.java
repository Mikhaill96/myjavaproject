package Задание3;

public class ParkDemo {
    public static void main(String[] args) {

        Park disneyLand = new Park("DisneyLand");

        disneyLand.addAttraction("Space Mountain", "10:00 - 22:00", 5);
        disneyLand.addAttraction("Pirates of the Caribbean", "09:00 - 20:00", 4);

        for (Park.Attraction attraction : disneyLand.getAttractions()) {
            System.out.println(attraction.toString());
        }
    }
}