package com.example.newcode;


public class Option {
    protected RealVector w;
    protected double b;

    public Option(RealVector w, double b) {
        this.w = w;
        this.b = b;
    }

    public RealVector getW() {
        return this.w;
    }

    public double getB(){
        return this.b;
    }
}