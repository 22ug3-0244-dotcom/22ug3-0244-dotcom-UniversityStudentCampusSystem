import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CampusGraph {

    private ArrayList<CampusLocation> locations;

    private ArrayList<ArrayList<Integer>> adjacencyList;

    public CampusGraph() {

        locations = new ArrayList<>();
        adjacencyList = new ArrayList<>();
    }

    // Find location index
    private int findLocation(String name) {

        for (int i = 0; i < locations.size(); i++) {

            if (locations.get(i).getName()
                    .equalsIgnoreCase(name)) {

                return i;
            }
        }

        return -1;
    }

    // Add location
    public boolean addLocation(String name) {

        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        if (findLocation(name) != -1) {
            return false;
        }

        locations.add(new CampusLocation(name));
        adjacencyList.add(new ArrayList<>());

        return true;
    }

    // Remove location
    public boolean removeLocation(String name) {

        int index = findLocation(name);

        if (index == -1) {
            return false;
        }

        // Remove the location
        locations.remove(index);
        adjacencyList.remove(index);

        // Remove connections to this location
        for (ArrayList<Integer> neighbours : adjacencyList) {

            for (int i = neighbours.size() - 1; i >= 0; i--) {

                int value = neighbours.get(i);

                if (value == index) {

                    neighbours.remove(i);

                } else if (value > index) {

                    neighbours.set(i, value - 1);
                }
            }
        }

        return true;
    }

    // Add connection
    public boolean addConnection(String location1, String location2) {

        int first = findLocation(location1);
        int second = findLocation(location2);

        if (first == -1 || second == -1) {
            return false;
        }

        if (first == second) {
            return false;
        }

        if (adjacencyList.get(first).contains(second)) {
            return false;
        }

        adjacencyList.get(first).add(second);
        adjacencyList.get(second).add(first);

        return true;
    }

    // Remove connection
    public boolean removeConnection(String location1,
                                     String location2) {

        int first = findLocation(location1);
        int second = findLocation(location2);

        if (first == -1 || second == -1) {
            return false;
        }

        if (!adjacencyList.get(first).contains(second)) {
            return false;
        }

        adjacencyList.get(first).remove(Integer.valueOf(second));
        adjacencyList.get(second).remove(Integer.valueOf(first));

        return true;
    }

    // Display graph
    public void displayConnections() {

        if (locations.isEmpty()) {
            System.out.println("No campus locations available.");
            return;
        }

        System.out.println("\n===== CAMPUS CONNECTIONS =====");

        for (int i = 0; i < locations.size(); i++) {

            System.out.print(
                    locations.get(i).getName() + " -> "
            );

            for (int neighbour : adjacencyList.get(i)) {

                System.out.print(
                        locations.get(neighbour).getName()
                        + " "
                );
            }

            System.out.println();
        }

        System.out.println("==============================\n");
    }

    // BFS traversal
    public void bfs(String startLocation) {

        int start = findLocation(startLocation);

        if (start == -1) {

            System.out.println("Starting location not found.");
            return;
        }

        boolean[] visited = new boolean[locations.size()];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.println("\n===== BFS TRAVERSAL =====");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(
                    locations.get(current).getName()
                    + " -> "
            );

            for (int neighbour : adjacencyList.get(current)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println("END");
        System.out.println("=========================\n");
    }
}