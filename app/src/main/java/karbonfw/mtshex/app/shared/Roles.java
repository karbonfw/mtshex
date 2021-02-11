package karbonfw.mtshex.app.shared;

public enum Roles implements Role {
  DISHES("dish"),
  DISHES_WRITER("dish/write");

  private final String name;

  private Roles(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
