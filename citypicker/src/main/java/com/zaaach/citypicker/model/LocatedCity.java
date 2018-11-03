package com.zaaach.citypicker.model;

public class LocatedCity extends City {

    public LocatedCity(String name, String province, String code) {
        super(name, province, "当前定位", code);
    }
}
