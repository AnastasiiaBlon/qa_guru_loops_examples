package guru.qa.implementations;

import guru.qa.Client;

import java.util.ArrayList;
import java.util.List;

public class ListAndForLoop {
    private final List<Client> clientsList = new ArrayList<>();

    public void printClients() {
        for (int i = 0; i < clientsList.size(); i++) {
            Client clients = clientsList.get(i);
            System.out.println(clients.toString());
        }
    }

    public void addClient(Client client) {
        clientsList.add(client);
        System.out.println("list.addClient(" + client + ")");
    }

    public void removeClient(Client client) {
        clientsList.remove(client);
        System.out.println("list.removeClient(" + client + ")");
        System.out.println("Remain clients: " + clientsList);
    }

    public void clientIsInList(Client client) {
        System.out.println("list.clientIsInList(" + client + ")");
        System.out.println("Client " + client + "is in the list: " + clientsList.contains(client));
    }

}
