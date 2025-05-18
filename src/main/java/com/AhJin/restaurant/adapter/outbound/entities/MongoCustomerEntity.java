package com.AhJin.restaurant.adapter.outbound.entities;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.AhJin.restaurant.domain.customer.Customer;
import com.AhJin.restaurant.domain.role.Roles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collation = "Customer")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MongoCustomerEntity implements UserDetails {

  @Id
  public String id;

  public String name;

  public String email;

  public String password;

  public Roles role;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    if (this.role == role.ADMIN)
      return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
    else
      return List.of(new SimpleGrantedAuthority("ROLE_USER"));
  }

  @Override
  public String getUsername() {
    return this.name;
  }

  public MongoCustomerEntity(Customer customer) {
    this.id = customer.getId();
    this.name = customer.getName();
    this.email = customer.getEmail();
    this.password = customer.getPassword();
    this.role = customer.getRole();
  }
}
