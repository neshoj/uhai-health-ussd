package ke.co.onepointseven.uhaihealthussd.web.ussd.menu.usermanagement;

import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.MenuContent;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Menus;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.accountmanagement.TransactionConfirmationMenu;

public class NewUserRegistrationMenu extends MenuContent {
  public static StringBuilder menuBuilder(Menus menus, boolean isRepeat, String message) {
    NewUserRegistrationMenu newUserRegistration = menus.getNewUserRegistrationMenu();
    return TransactionConfirmationMenu.getStringBuilder(
        isRepeat,
        message,
        newUserRegistration.getName(),
        newUserRegistration.getItems(),
            newUserRegistration);
  }
}
