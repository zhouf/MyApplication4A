package com.example.myapplication;

public class RateItem {
    private String cname;
    private float cval;

    public RateItem() {
    }

    public RateItem(String cname, float cval) {
        this.cname = cname;
        this.cval = cval;
    }

    public float getCval() {
        return cval;
    }

    public void setCval(float cval) {
        this.cval = cval;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
