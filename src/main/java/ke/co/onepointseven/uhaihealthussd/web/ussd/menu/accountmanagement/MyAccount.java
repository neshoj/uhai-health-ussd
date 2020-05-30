package ke.co.onepointseven.uhaihealthussd.web.ussd.menu.accountmanagement;

import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Item;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.MenuContent;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Menus;

import java.util.List;

public class MyAccount extends MenuContent {

    public static StringBuilder menuBuilder(Menus menus) {
        StringBuilder msg = new StringBuilder();
        MyAccount myAccount = menus.getMyAccount();
        msg.append(myAccount.getName());

        List<Item> items = myAccount.getItems();
        for (Item item : items) {
            msg
                    .append("\n\r")
                    .append(item.getChoice()).append(" ")
                    .append(item.getName());
        }

        return msg;
    }
}
