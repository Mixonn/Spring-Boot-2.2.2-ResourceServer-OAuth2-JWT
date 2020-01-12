package com.example.demo;

public enum Scope {
  READ("SCOPE_app-read"),
  EDIT("SCOPE_app-edit");

  private final String name;

  Scope(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
