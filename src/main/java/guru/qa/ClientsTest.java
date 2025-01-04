package guru.qa;

public class ClientsTest {
    private String clientName;
    private String clientCountry;
    private int requestsQuantityInDec;
    private boolean isSatisfied;

    public ClientsTest(String clientName, String clientCountry, int requestsQuantityInDec, boolean isSatisfied) {
        this.clientName = clientName;
        this.clientCountry = clientCountry;
        this.requestsQuantityInDec = requestsQuantityInDec;
        this.isSatisfied = isSatisfied;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientCountry() {
        return clientCountry;
    }

    public int getRequestsQuantityInDec() {
        return requestsQuantityInDec;
    }

    public boolean isSatisfied() {
        return isSatisfied;
    }

}
