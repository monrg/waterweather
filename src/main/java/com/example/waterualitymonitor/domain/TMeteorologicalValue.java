package com.example.waterualitymonitor.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class TMeteorologicalValue {
    private int meteorologicalId;
    private double a16;
    private double a04;
    private double a05;
    private double a06;
    private double a01;
    private double a02;
    private double a03;
    private Timestamp time;

    @Id
    @Column(name = "meteorological_id")
    public int getMeteorologicalId() {
        return meteorologicalId;
    }

    public void setMeteorologicalId(int meteorologicalId) {
        this.meteorologicalId = meteorologicalId;
    }

    @Basic
    @Column(name = "A16")
    public double getA16() {
        return a16;
    }

    public void setA16(double a16) {
        this.a16 = a16;
    }

    @Basic
    @Column(name = "A04")
    public double getA04() {
        return a04;
    }

    public void setA04(double a04) {
        this.a04 = a04;
    }

    @Basic
    @Column(name = "A05")
    public double getA05() {
        return a05;
    }

    public void setA05(double a05) {
        this.a05 = a05;
    }

    @Basic
    @Column(name = "A06")
    public double getA06() {
        return a06;
    }

    public void setA06(double a06) {
        this.a06 = a06;
    }

    @Basic
    @Column(name = "A01")
    public double getA01() {
        return a01;
    }

    public void setA01(double a01) {
        this.a01 = a01;
    }

    @Basic
    @Column(name = "A02")
    public double getA02() {
        return a02;
    }

    public void setA02(double a02) {
        this.a02 = a02;
    }

    @Basic
    @Column(name = "A03")
    public double getA03() {
        return a03;
    }

    public void setA03(double a03) {
        this.a03 = a03;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMeteorologicalValue that = (TMeteorologicalValue) o;
        return meteorologicalId == that.meteorologicalId &&
                Double.compare(that.a16, a16) == 0 &&
                Double.compare(that.a04, a04) == 0 &&
                Double.compare(that.a05, a05) == 0 &&
                Double.compare(that.a06, a06) == 0 &&
                Double.compare(that.a01, a01) == 0 &&
                Double.compare(that.a02, a02) == 0 &&
                Double.compare(that.a03, a03) == 0 &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {

        return Objects.hash(meteorologicalId, a16, a04, a05, a06, a01, a02, a03, time);
    }
}
