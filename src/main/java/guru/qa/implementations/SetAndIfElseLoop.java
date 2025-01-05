package guru.qa.implementations;

import guru.qa.Client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndIfElseLoop {
    public final Set<Client> clients = new HashSet<>();

    public void printClients() {
        System.out.println("set.printClients");
        Iterator<Client> iterator = clients.iterator();

        while (iterator.hasNext()) {
            Client clients = iterator.next();
            System.out.println("Client name: " + clients.getClientName() +
                    ", Client country: " + clients.getClientCountry() +
                    ", Requests quantity in December: " + clients.getRequestsQuantityInDec() +
                    ", Is the client satisfied: " + clients.isSatisfied());
        }
    }

    public void addClient(Client client) {
        clients.add(client);
        System.out.println("set.addClient(" + client + ")");
    }

    public void removeClient(Client client) {
        boolean removed = clients.remove(client);
        if (removed) {
            System.out.println("set.removeClient(" + client + ")");
        } else {
            System.out.println("Client is not found in set: " + client.getClientName());
        }
        System.out.println("Remain clients: " + clients);
    }

    public void findClient(Client client) {
        System.out.println("set.findClient(" + client + ")");
        if (clients.contains(client)) {
            System.out.println("Client found: " + client.getClientName());
        } else {
            System.out.println("Client is not found in set: " + client.getClientName());
        }
    }


}
