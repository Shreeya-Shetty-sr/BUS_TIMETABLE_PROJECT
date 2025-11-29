
// Jira Task: BTS-3 (Adding bus route data)



public class BusRoutes {
    public static void main(String[] args) {
      
        String[] route1 = {"Stop A", "Stop B", "Stop C"};

        System.out.println("Bus Route 1:");
        for (int i = 0; i < route1.length; i++) {
            System.out.println(" - " + route1[i]);
        }
    }
}