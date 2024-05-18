package org.example;

import springfox.documentation.service.VendorExtension;

class MyVendorExtension implements VendorExtension<String> {
    private String key;
    private String value;

    public MyVendorExtension(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getValue() {
        return this.value;
    }
}