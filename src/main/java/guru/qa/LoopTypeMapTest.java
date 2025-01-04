package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class LoopTypeMapTest {
    private final Map<Integer, ClientsTest> clients = new HashMap<>();
    private int nextKey = 1;

    public void printClients() {
        for (var entry : clients.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Client name: " + entry.getValue().getClientName() +
                    ", Client country: " + entry.getValue().getClientCountry() +
                    ", Requests quantity in December: " + entry.getValue().getRequestsQuantityInDec() +
                    ", Is the client satisfied: " + entry.getValue().isSatisfied());
        }
    }

    public void addClient(ClientsTest client) {
        clients.put(nextKey++, client);
        System.out.println("map.addClient(" + client + ")");
    }

    public void removeClient(ClientsTest client) {
        System.out.println("map.remove(" + client + ")");
        clients.entrySet().removeIf(entry -> entry.getValue().equals(client));
    }

    public void findClient(ClientsTest client) {
        if (clients.containsValue(client)) {
            System.out.println("Client found: " + client.getClientName());
        } else {
            System.out.println("Client is not found: " + client.getClientName());
        }
        System.out.println("map.findClient(" + client + ")");
    }

}
