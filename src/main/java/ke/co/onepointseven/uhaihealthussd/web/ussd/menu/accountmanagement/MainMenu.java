package ke.co.onepointseven.uhaihealthussd.web.ussd.menu.accountmanagement;

import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Item;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.MenuContent;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Menus;

import java.util.List;

public class MainMenu extends MenuContent {

    public static StringBuilder menuBuilder(Menus menus) {
        StringBuilder msg = new StringBuilder();
        MainMenu mainMenu = menus.getMainMenu();
        msg.append(mainMenu.getName());

        List<Item> items = mainMenu.getItems();
        for (Item item : items) {
            msg
                    .append("\n\r")
                    .append(item.getChoice()).append(" ")
                    .append(item.getName())
            ;
        }

        return msg;
    }
}