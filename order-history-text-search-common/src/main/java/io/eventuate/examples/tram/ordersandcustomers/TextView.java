package io.eventuate.examples.tram.ordersandcustomers;


import io.eventuate.examples.tram.ordersandcustomers.commondomain.CustomerSnapshotEvent;

public abstract class TextView {

  private String id;

  public TextView() {
  }

  public TextView(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
