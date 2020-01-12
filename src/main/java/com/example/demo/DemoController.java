package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class DemoController {

  @GetMapping("/principal")
  public Principal getPrincipal(Principal principal) {
    return principal;
  }

  @PreAuthorize("hasAuthority(T(com.example.demo.Scope).READ.toString())")
  @GetMapping("/withScope")
  public List<Object> scoped(Principal principal) {
    return List.of("SCOPE!", principal);
  }
}
