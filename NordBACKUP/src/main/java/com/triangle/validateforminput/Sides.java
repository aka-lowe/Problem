package com.triangle.validateforminput;

public class Sides {

    private Float sideA;
    private Float sideB;
    private Float sideC;

    public Sides(Float sideA, Float sideB, Float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Float getSideA() {
        return sideA;
    }

    public void setSideA(Float sideA) {
        this.sideA = sideA;
    }

    public Float getSideB() {
        return sideB;
    }

    public void setSideB(Float sideB) {
        this.sideB = sideB;
    }

    public Float getSideC() {
        return sideC;
    }

    public void setSideC(Float sideC) {
        this.sideC = sideC;
    }
}
