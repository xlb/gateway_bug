package com.example.server.entity;

/**
 * @Author: xulb
 * @Date: 2020/4/8 15:57
 */
public class ParamEntity {
 String a;
 String b;
 String c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ParamEntity{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
