package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class LoopTypeListTest {
    private final List<ClientsTest> clientsTestList = new ArrayList<>();

    // Loop - for: example - print list of clients (descending order)
    public void printClientsDesc() {
        for (int i = 0; i < clientsTestList.size(); i++) {
            ClientsTest clientsTest = clientsTestList.get(i);
            System.out.println("Client name: " + clientsTest.getClientName() +
                    ", Client country: " + clientsTest.getClientCountry() +
                    ", Requests quantity in December:" + clientsTest.getRequestsQuantityInDec() +
                    ", Is the client satisfied: " + clientsTest.isSatisfied());
        }
    }

    // Loop - for: example - print list of clients (ascending order)
    public void printClientsAsc() {
        for (int i = clientsTestList.size() - 1; i >= 0; i--) {
            ClientsTest clientsTest = clientsTestList.get(i);
            System.out.println("Client name: " + clientsTest.getClientName() +
                    ", Client country: " + clientsTest.getClientCountry() +
                    ", Requests quantity in December:" + clientsTest.getRequestsQuantityInDec() +
                    ", Is the client satisfied: " + clientsTest.isSatisfied());
        }
    }

    public void addClient(ClientsTest clientsTest) {
        clientsTestList.add(clientsTest);
        System.out.println("list.addClient(" + clientsTestList + ")");
    }

    public void removeClient(ClientsTest clientsTest) {
        clientsTestList.remove(clientsTest);
        System.out.println("list.removeClient(" + clientsTestList + ")");
    }

    public void clientIsInList(ClientsTest value) {
        System.out.println("list.clientIsInList(" + value + ")");
        System.out.println("Client " + value + "is in the list: " + clientsTestList.contains(value));
    }

}
