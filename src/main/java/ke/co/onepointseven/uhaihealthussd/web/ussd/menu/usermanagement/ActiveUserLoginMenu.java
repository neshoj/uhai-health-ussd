package ke.co.onepointseven.uhaihealthussd.web.ussd.menu.usermanagement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Item;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.MenuContent;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Menus;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "type",
        "items"
})
public class ActiveUserLoginMenu extends MenuContent {
    public static StringBuilder menuBuilder(Menus menus, boolean isRepeat, String message) {
        StringBuilder msg = new StringBuilder();
        ActiveUserLoginMenu activeUserLoginMenu = menus.getActiveUserLoginMenu();
        msg
                .append(activeUserLoginMenu.getName()).append("\n\r")
                .append(isRepeat ? message + "\n\r" : "");

        List<Item> items = activeUserLoginMenu.getItems();
        for (Item item : items) {
            msg
                    .append("\n\r")
                    .append(item.getChoice()).append(" ")
                    .append(item.getName());
        }
        return msg;
    }
}
