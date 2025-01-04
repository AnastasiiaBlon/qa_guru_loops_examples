package guru.qa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopTypeSetTest {
    public final Set<ClientsTest> clients = new HashSet<>();

    public void printClients() {
        System.out.println("set.printClients");
        Iterator<ClientsTest> iterator = clients.iterator();

        while (iterator.hasNext()) {
            ClientsTest clients = iterator.next();
            System.out.println("Client name: " + clients.getClientName() +
                    ", Client country: " + clients.getClientCountry() +
                    ", Requests quantity in December: " + clients.getRequestsQuantityInDec() +
                    ", Is the client satisfied: " + clients.isSatisfied());
        }
    }

    public void addClient(ClientsTest client) {
        clients.add(client);
        System.out.println("set.addClient(" + client + ")");
    }

    public void removeClient(ClientsTest client) {
        boolean removed = clients.remove(client);
        if (removed) {
            System.out.println("set.removeClient(" + client + ")");
        } else {
            System.out.println("Client is not found in set: " + client.getClientName());
        }
    }

    public void findClient(ClientsTest client) {
        System.out.println("set.findClient(" + client + ")");
        if (clients.contains(client)) {
            System.out.println("Client found: " + client.getClientName());
        } else {
            System.out.println("Client is not found in set: " + client.getClientName());
        }
    }


}
