package com.example.waterualitymonitor.domain.backup;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class TWorker {
    private String id;
    private String name;
    private String type;
    private String phoneNum;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "phoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TWorker tWorker = (TWorker) o;
        return Objects.equals(id, tWorker.id) &&
                Objects.equals(name, tWorker.name) &&
                Objects.equals(type, tWorker.type) &&
                Objects.equals(phoneNum, tWorker.phoneNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, type, phoneNum);
    }
}
