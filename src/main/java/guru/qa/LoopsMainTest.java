package guru.qa;

import java.util.*;

public class LoopsMainTest {
    public static void main(String[] args) {

        ClientsTest swissport = new ClientsTest("Swissport", "Belgium", 23, true);
        ClientsTest aviator = new ClientsTest("Aviator", "Sweden", 17, true);
        ClientsTest dnata = new ClientsTest("dnata", "OAE", 39, true);
        ClientsTest celebi = new ClientsTest("Celebi", "India", 24, false);

        LoopTypeListTest listOfClients = new LoopTypeListTest();
        // add objects in list
        listOfClients.addClient(swissport);
        listOfClients.addClient(aviator);
        listOfClients.addClient(dnata);
        listOfClients.addClient(celebi);
        // print clients' list
        listOfClients.printClientsDesc();
        // check if client "Swissport" in the clients' list
        listOfClients.clientIsInList(swissport);
        // remove client from list
        listOfClients.removeClient(dnata);
        // print clients' list after removing client
        listOfClients.printClientsAsc();

        LoopTypeSetTest setOfClients = new LoopTypeSetTest();
        // add objects in set
        setOfClients.addClient(swissport);
        setOfClients.addClient(aviator);
        setOfClients.addClient(dnata);
        setOfClients.addClient(celebi);
        // print clients' set
        setOfClients.printClients();
        // remove client from set
        setOfClients.removeClient(celebi);
        // check if client "Celebi" in the clients' set
        setOfClients.findClient(celebi);

        LoopTypeMapTest clientsMap = new LoopTypeMapTest();
        // add objects in map
        clientsMap.addClient(swissport);
        clientsMap.addClient(aviator);
        clientsMap.addClient(dnata);
        clientsMap.addClient(celebi);
        // print clients' map
        clientsMap.printClients();
        // remove client from map
        clientsMap.removeClient(aviator);
        // check if client "Celebi" in the clients' map
        clientsMap.findClient(celebi);

        LoopTypeQueueTest clientsQueue = new LoopTypeQueueTest();
        // add objects in queue
        clientsQueue.addClient(swissport);
        clientsQueue.addClient(aviator);
        clientsQueue.addClient(dnata);
        clientsQueue.addClient(celebi);
        // print clients' queue
        clientsQueue.printClients();
        // remove client from queue
        clientsQueue.removeClient();
        // check if client "dnata" in the clients' queue
        clientsQueue.findClient(dnata);
    }
}
