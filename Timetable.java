
// Jira Task: BTS-4 (Design timetable page)

public class Timetable {
    public static void main(String[] args) {
        String[] bus101 = {"Stop A - 8:00 AM", "Stop B - 8:30 AM"};
        String[] bus202 = {"Stop D - 9:15 AM", "Stop E - 9:45 AM"};

        System.out.println("Timetable for Bus 101:");
        for (int i = 0; i < bus101.length; i++) {
            System.out.println(" - " + bus101[i]);
        }

        System.out.println("\nTimetable for Bus 202:");
        for (int i = 0; i < bus202.length; i++) {
            System.out.println(" - " + bus202[i]);
        }
    }
}