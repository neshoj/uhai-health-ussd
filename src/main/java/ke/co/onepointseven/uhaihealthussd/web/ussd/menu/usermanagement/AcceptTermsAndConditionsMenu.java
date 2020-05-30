package ke.co.onepointseven.uhaihealthussd.web.ussd.menu.usermanagement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.MenuContent;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Menus;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.accountmanagement.TransactionConfirmationMenu;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "type", "items"})
public class AcceptTermsAndConditionsMenu extends MenuContent {

  public static StringBuilder menuBuilder(Menus menus, boolean isRepeat, String message) {
    AcceptTermsAndConditionsMenu acceptTermsAndConditionsMenu =
        menus.getAcceptTermsAndConditionsMenu();
    return TransactionConfirmationMenu.getStringBuilder(
        isRepeat,
        message,
        acceptTermsAndConditionsMenu.getName(),
        acceptTermsAndConditionsMenu.getItems(),
            acceptTermsAndConditionsMenu);
  }
}
