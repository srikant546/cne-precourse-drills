package com.galvanize;

import java.util.List;

/**
 * Created by srikant.pulugurtha on 7/24/18.
 */
public interface Addressable {

    public List<Address> getAddresses();
    public void addAddress(Address address);

}
