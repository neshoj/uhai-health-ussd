package ke.co.onepointseven.uhaihealthussd.web.ussd.menu.accountmanagement;

import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Item;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.MenuContent;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Menus;

import java.util.List;

public class TransactionConfirmationMenu extends MenuContent {

    public static StringBuilder menuBuilder(Menus menus, boolean isRepeat, String message) {
        TransactionConfirmationMenu contributionPhoneUsed = menus.getTransactionConfirmation();
        return getStringBuilder(isRepeat, message, contributionPhoneUsed.getName(), contributionPhoneUsed.getItems(), contributionPhoneUsed);
    }

    public static StringBuilder getStringBuilder(boolean isRepeat, String message, String name, List<Item> items2, MenuContent contributionPhoneUsed) {
        StringBuilder msg =
                new StringBuilder()
                        .append(name)
                        .append("\n\r")
                        .append(isRepeat ? message + "\n\r" : "");

        List<Item> items = items2;
        for (Item item : items) {
            msg.append("\n\r").append(item.getChoice()).append(" ").append(item.getName());
        }
        return msg;
    }
}