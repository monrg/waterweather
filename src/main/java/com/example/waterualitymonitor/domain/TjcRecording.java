package com.example.waterualitymonitor.domain;

import java.sql.Timestamp;
import java.util.Objects;


public class TjcRecording {
    private int jcId;
    private double a1;
    private double a3;
    private double aa10;
    private double aa11;
    private double aa15;
    private double a60;
    private double a00;
    private double a07;
    private double a08;
    private double a09;
    private double a10;
    private double a11;
    private double a12;
    private double a13;
    private double a14;
    private double a15;
    private Timestamp jcTime;
    private byte ifWrong;


    public int getJcId() {
        return jcId;
    }

    public void setJcId(int jcId) {
        this.jcId = jcId;
    }


    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    public double getAa10() {
        return aa10;
    }

    public void setAa10(double aa10) {
        this.aa10 = aa10;
    }


    public double getAa11() {
        return aa11;
    }

    public void setAa11(double aa11) {
        this.aa11 = aa11;
    }


    public double getAa15() {
        return aa15;
    }

    public void setAa15(double aa15) {
        this.aa15 = aa15;
    }


    public double getA60() {
        return a60;
    }

    public void setA60(double a60) {
        this.a60 = a60;
    }


    public double getA00() {
        return a00;
    }

    public void setA00(double a00) {
        this.a00 = a00;
    }

    public double getA07() {
        return a07;
    }

    public void setA07(double a07) {
        this.a07 = a07;
    }


    public double getA08() {
        return a08;
    }

    public void setA08(double a08) {
        this.a08 = a08;
    }


    public double getA09() {
        return a09;
    }

    public void setA09(double a09) {
        this.a09 = a09;
    }


    public double getA10() {
        return a10;
    }

    public void setA10(double a10) {
        this.a10 = a10;
    }


    public double getA11() {
        return a11;
    }

    public void setA11(double a11) {
        this.a11 = a11;
    }


    public double getA12() {
        return a12;
    }

    public void setA12(double a12) {
        this.a12 = a12;
    }


    public double getA13() {
        return a13;
    }

    public void setA13(double a13) {
        this.a13 = a13;
    }


    public double getA14() {
        return a14;
    }

    public void setA14(double a14) {
        this.a14 = a14;
    }

    public double getA15() {
        return a15;
    }

    public void setA15(double a15) {
        this.a15 = a15;
    }


    public Timestamp getJcTime() {
        return jcTime;
    }

    public void setJcTime(Timestamp jcTime) {
        this.jcTime = jcTime;
    }


    public byte getIfWrong() {
        return ifWrong;
    }

    public void setIfWrong(byte ifWrong) {
        this.ifWrong = ifWrong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TjcRecording that = (TjcRecording) o;
        return jcId == that.jcId &&
                Double.compare(that.a1, a1) == 0 &&
                Double.compare(that.a3, a3) == 0 &&
                Double.compare(that.aa10, aa10) == 0 &&
                Double.compare(that.aa11, aa11) == 0 &&
                Double.compare(that.aa15, aa15) == 0 &&
                Double.compare(that.a60, a60) == 0 &&
                Double.compare(that.a00, a00) == 0 &&
                Double.compare(that.a07, a07) == 0 &&
                Double.compare(that.a08, a08) == 0 &&
                Double.compare(that.a09, a09) == 0 &&
                Double.compare(that.a10, a10) == 0 &&
                Double.compare(that.a11, a11) == 0 &&
                Double.compare(that.a12, a12) == 0 &&
                Double.compare(that.a13, a13) == 0 &&
                Double.compare(that.a14, a14) == 0 &&
                Double.compare(that.a15, a15) == 0 &&
                ifWrong == that.ifWrong &&
                Objects.equals(jcTime, that.jcTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(jcId, a1, a3, aa10, aa11, aa15, a60, a00, a07, a08, a09, a10, a11, a12, a13, a14, a15, jcTime, ifWrong);
    }
}
