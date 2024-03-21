package org.ies.tierno.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
    private String name;

    private List<Customer> customers;

    private Map<String, Account> accountsByIban;

}
