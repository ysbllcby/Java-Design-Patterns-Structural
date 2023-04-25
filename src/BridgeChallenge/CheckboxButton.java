package BridgeChallenge;

import java.awt.*;

public class CheckboxButton extends Button {

  ButtonSize buttonSize;

  public CheckboxButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.setSize();
    System.out.println("Drawing a checkbox button.\n");
  }

}
