package org.example;

import springfox.documentation.service.VendorExtension;

class MyVendorExtension implements VendorExtension {
    public MyVendorExtension(String key, String value) {
        super();
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public Object getValue() {
        return null;
    }
}