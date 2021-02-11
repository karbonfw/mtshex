package karbonfw.mtshex.web;

import karbonfw.mtshex.app.shared.Role;
import karbonfw.mtshex.app.shared.SecurityGuard;

public class DummySecurityGuard implements SecurityGuard {
  @Override
  public boolean hasRole(Role role) {
    return true;
  }
}
