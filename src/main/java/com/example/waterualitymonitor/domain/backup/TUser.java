package com.example.waterualitymonitor.domain.backup;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class TUser {
    private String useId;
    private String passwd;
    private String name;
    private String type;

    @Id
    @Column(name = "use_id")
    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }

    @Basic
    @Column(name = "passwd")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUser tUser = (TUser) o;
        return Objects.equals(useId, tUser.useId) &&
                Objects.equals(passwd, tUser.passwd) &&
                Objects.equals(name, tUser.name) &&
                Objects.equals(type, tUser.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(useId, passwd, name, type);
    }
}
