package com.mahedi.shopmongodb.enums;

public enum ActiveStatus {
  ACTIVE(1),
  INACTIVE(2);

  private final int value;

  ActiveStatus(int value) {
    this.value=value;
  }

  public int getValue() {
    return value;
  }
}
