package com.myapps.unitconverter;

public class ListViewDataModel {

   private Double  value = 0.0;
   private String unit;

    public ListViewDataModel(Double value, String unit ) {
        this.value = value;
        this.unit = unit;

    }

    public String getValue() {
        return Double.toString(value);
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }



}
