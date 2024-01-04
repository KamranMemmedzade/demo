package org.example.model;

import java.math.BigDecimal;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE )
@Builder
public class Employee {

  String name;
  BigDecimal salary;

}
