package com;

public class Employee {
    int eid;

    String eName;

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
}
