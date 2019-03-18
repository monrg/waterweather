package com.example.waterualitymonitor.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class TAmonitoring {
    private int taId;
    private double ta00;
    private double ta01;
    private double ta02;
    private double ta03;
    private double ta04;
    private double ta05;
    private double ta06;
    private double ta07;
    private double ta08;
    private double ta09;
    private double ta10;
    private double ta11;
    private double ta12;
    private double ta13;
    private double ta14;
    private double ta15;
    private Timestamp time;
    private Byte isWrong;

    @Id
    @Column(name = "TA_id")
    public int getTaId() {
        return taId;
    }

    public void setTaId(int taId) {
        this.taId = taId;
    }

    @Basic
    @Column(name = "TA00")
    public double getTa00() {
        return ta00;
    }

    public void setTa00(double ta00) {
        this.ta00 = ta00;
    }

    @Basic
    @Column(name = "TA01")
    public double getTa01() {
        return ta01;
    }

    public void setTa01(double ta01) {
        this.ta01 = ta01;
    }

    @Basic
    @Column(name = "TA02")
    public double getTa02() {
        return ta02;
    }

    public void setTa02(double ta02) {
        this.ta02 = ta02;
    }

    @Basic
    @Column(name = "TA03")
    public double getTa03() {
        return ta03;
    }

    public void setTa03(double ta03) {
        this.ta03 = ta03;
    }

    @Basic
    @Column(name = "TA04")
    public double getTa04() {
        return ta04;
    }

    public void setTa04(double ta04) {
        this.ta04 = ta04;
    }

    @Basic
    @Column(name = "TA05")
    public double getTa05() {
        return ta05;
    }

    public void setTa05(double ta05) {
        this.ta05 = ta05;
    }

    @Basic
    @Column(name = "TA06")
    public double getTa06() {
        return ta06;
    }

    public void setTa06(double ta06) {
        this.ta06 = ta06;
    }

    @Basic
    @Column(name = "TA07")
    public double getTa07() {
        return ta07;
    }

    public void setTa07(double ta07) {
        this.ta07 = ta07;
    }

    @Basic
    @Column(name = "TA08")
    public double getTa08() {
        return ta08;
    }

    public void setTa08(double ta08) {
        this.ta08 = ta08;
    }

    @Basic
    @Column(name = "TA09")
    public double getTa09() {
        return ta09;
    }

    public void setTa09(double ta09) {
        this.ta09 = ta09;
    }

    @Basic
    @Column(name = "TA10")
    public double getTa10() {
        return ta10;
    }

    public void setTa10(double ta10) {
        this.ta10 = ta10;
    }

    @Basic
    @Column(name = "TA11")
    public double getTa11() {
        return ta11;
    }

    public void setTa11(double ta11) {
        this.ta11 = ta11;
    }

    @Basic
    @Column(name = "TA12")
    public double getTa12() {
        return ta12;
    }

    public void setTa12(double ta12) {
        this.ta12 = ta12;
    }

    @Basic
    @Column(name = "TA13")
    public double getTa13() {
        return ta13;
    }

    public void setTa13(double ta13) {
        this.ta13 = ta13;
    }

    @Basic
    @Column(name = "TA14")
    public double getTa14() {
        return ta14;
    }

    public void setTa14(double ta14) {
        this.ta14 = ta14;
    }

    @Basic
    @Column(name = "TA15")
    public double getTa15() {
        return ta15;
    }

    public void setTa15(double ta15) {
        this.ta15 = ta15;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "isWrong")
    public Byte getIsWrong() {
        return isWrong;
    }

    public void setIsWrong(Byte isWrong) {
        this.isWrong = isWrong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAmonitoring that = (TAmonitoring) o;
        return taId == that.taId &&
                Double.compare(that.ta00, ta00) == 0 &&
                Double.compare(that.ta01, ta01) == 0 &&
                Double.compare(that.ta02, ta02) == 0 &&
                Double.compare(that.ta03, ta03) == 0 &&
                Double.compare(that.ta04, ta04) == 0 &&
                Double.compare(that.ta05, ta05) == 0 &&
                Double.compare(that.ta06, ta06) == 0 &&
                Double.compare(that.ta07, ta07) == 0 &&
                Double.compare(that.ta08, ta08) == 0 &&
                Double.compare(that.ta09, ta09) == 0 &&
                Double.compare(that.ta10, ta10) == 0 &&
                Double.compare(that.ta11, ta11) == 0 &&
                Double.compare(that.ta12, ta12) == 0 &&
                Double.compare(that.ta13, ta13) == 0 &&
                Double.compare(that.ta14, ta14) == 0 &&
                Double.compare(that.ta15, ta15) == 0 &&
                Objects.equals(time, that.time) &&
                Objects.equals(isWrong, that.isWrong);
    }

    @Override
    public int hashCode() {

        return Objects.hash(taId, ta00, ta01, ta02, ta03, ta04, ta05, ta06, ta07, ta08, ta09, ta10, ta11, ta12, ta13, ta14, ta15, time, isWrong);
    }
}
