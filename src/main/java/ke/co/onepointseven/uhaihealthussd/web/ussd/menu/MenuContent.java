package ke.co.onepointseven.uhaihealthussd.web.ussd.menu;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuContent {

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("choice")
  private String choice;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("end")
  private boolean end = false;

  @JsonProperty("items")
  private List<Item> items = new ArrayList<>();

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("choice")
  public String getChoice() {
    return choice;
  }

  @JsonProperty("choice")
  public void setChoice(String choice) {
    this.choice = choice;
  }

  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  @JsonProperty("next")
  public void setNext(String next) {
    this.next = next;
  }

  @JsonProperty("end")
  public boolean getEnd() {
    return end;
  }

  @JsonProperty("end")
  public void setEnd(boolean end) {
    this.end = end;
  }

  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<Item> items) {
    this.items = items;
  }
}
