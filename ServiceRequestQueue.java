public class ServiceRequestQueue {

    private static class QueueNode {

        String request;
        QueueNode next;

        QueueNode(String request) {
            this.request = request;
            this.next = null;
        }
    }

    private QueueNode front;
    private QueueNode rear;

    public ServiceRequestQueue() {
        front = null;
        rear = null;
    }

    // Add request to queue
    public void enqueue(String request) {

        QueueNode newNode = new QueueNode(request);

        if (rear == null) {

            front = newNode;
            rear = newNode;

            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Process next request
    public String dequeue() {

        if (front == null) {
            return null;
        }

        String request = front.request;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return request;
    }

    // View next request
    public String peek() {

        if (front == null) {
            return null;
        }

        return front.request;
    }

    // Display queue
    public void display() {

        if (front == null) {
            System.out.println("No service requests.");
            return;
        }

        System.out.println("\n===== SERVICE REQUEST QUEUE =====");

        QueueNode current = front;

        while (current != null) {

            System.out.println("- " + current.request);

            current = current.next;
        }

        System.out.println("=================================\n");
    }
}