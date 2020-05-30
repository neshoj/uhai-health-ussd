package ke.co.onepointseven.uhaihealthussd.web.ussd.menu.accountmanagement;

import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.MenuContent;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.Menus;

public class ContributionPhoneUsedMenu extends MenuContent {

  public static StringBuilder menuBuilder(Menus menus, boolean isRepeat, String message) {
    ContributionPhoneUsedMenu contributionPhoneUsed = menus.getContributionPhoneUsed();
    return TransactionConfirmationMenu.getStringBuilder(
        isRepeat,
        message,
        contributionPhoneUsed.getName(),
        contributionPhoneUsed.getItems(),
        contributionPhoneUsed);
  }
}
