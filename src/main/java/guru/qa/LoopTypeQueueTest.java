package guru.qa;

import java.util.LinkedList;
import java.util.Queue;

public class LoopTypeQueueTest {

    private final Queue<ClientsTest> clientsTestQueue = new LinkedList<>();

    public void printClients() {
        System.out.println("queue.printClients");

        if (!clientsTestQueue.isEmpty()) {
            var iterator = clientsTestQueue.iterator();
            do {
                ClientsTest client = iterator.next();
                System.out.println("Client name: " + client.getClientName() +
                        ", Client country: " + client.getClientCountry() +
                        ", Requests quantity in December: " + client.getRequestsQuantityInDec() +
                        ", Is the client satisfied: " + client.isSatisfied());
            } while (iterator.hasNext());
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void addClient(ClientsTest client) {
        clientsTestQueue.offer(client);
        System.out.println("queue.addClient(" + client + ")");
    }

    public void removeClient() {
        ClientsTest removedClient = clientsTestQueue.poll();
        if (removedClient != null) {
            System.out.println("queue.removeGame(" + removedClient + ")");
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void findClient(ClientsTest client) {
        System.out.println("queue.findClient(" + client + ")");
        if (clientsTestQueue.contains(client)) {
            System.out.println("Game found: " + client.getClientName());
        } else {
            System.out.println("Game not found: " + client.getClientName());
        }
    }
}
