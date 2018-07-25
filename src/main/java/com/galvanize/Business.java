package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srikant.pulugurtha on 7/24/18.
 */
public class Business implements Addressable {

    private String name;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Address> getAddresses() {
        return this.addresses;
    }

    @Override
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
}
