package com.ldy.pojo;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Address {

    private String city;
    private String sign;

    @Override
    public String toString() {
        return "address{" +
                "city='" + city + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
