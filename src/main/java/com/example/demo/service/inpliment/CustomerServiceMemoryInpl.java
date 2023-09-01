package com.example.demo.service.inpliment;

import com.example.demo.model.CustomerDTO;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceMemoryInpl implements CustomerService{
    private Map<Integer, CustomerDTO> persist = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new CustomerDTO(id, name));

    }

    @Override
    public CustomerDTO getCustomer(int id, String name) {
        return persist.get(id);
    }
}
