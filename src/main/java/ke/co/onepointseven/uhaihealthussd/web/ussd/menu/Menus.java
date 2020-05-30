package ke.co.onepointseven.uhaihealthussd.web.ussd.menu;

import com.fasterxml.jackson.annotation.JsonProperty;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.accountmanagement.*;
import ke.co.onepointseven.uhaihealthussd.web.ussd.menu.usermanagement.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Menus {
  @JsonProperty("new_user_registration")
  private NewUserRegistrationMenu newUserRegistrationMenu;

  @JsonProperty("display_help")
  private DisplayHelp displayHelp;

  @JsonProperty("input_national_id")
  private InputNationalID inputNationalID;

  @JsonProperty("input_nhif_no")
  private InputNHIFID inputNHIFID;

  @JsonProperty("input_new_pin")
  private InputNewPINMenu inputNewPINMenu;

  @JsonProperty("input_confirm_pin")
  private ConfirmNewPINMenu confirmNewPINMenu;

  @JsonProperty("accept_terms_and_conditions")
  private AcceptTermsAndConditionsMenu acceptTermsAndConditionsMenu;

  @JsonProperty("active_user_login")
  private ActiveUserLoginMenu activeUserLoginMenu;

  @JsonProperty("current_pin")
  private CurrentPINMenu currentPINMenu;

  @JsonProperty("reset_pin_display")
  private ResetPINMessageDisplay resetPINMessageDisplay;

  @JsonProperty("main_menu")
  private MainMenu mainMenu;

  @JsonProperty("my_account")
  private MyAccount myAccount;

  @JsonProperty("contribution_phone_used")
  private ContributionPhoneUsedMenu contributionPhoneUsed;

  @JsonProperty("input_amount")
  private InputAmount inputAmount;

  @JsonProperty("input_other_phone")
  private InputOtherPhone inputOtherPhone;

  @JsonProperty("tnx_confirmation")
  private TransactionConfirmationMenu transactionConfirmation;

  @JsonProperty("exit")
  private ExitMenu exitMenu;
}
