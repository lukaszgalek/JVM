package SDA;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {


    private Queue<Client> queue= new LinkedList<>();

    public void addToShopQueue(Client client) {
        queue.add(client);

    }

    public void doShoping(Client client) {
        queue.remove(client);
    }

}
