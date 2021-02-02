package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampSize;
    private boolean isStamped;

    public Stamp(String stampName, String stampSize, boolean isStamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return isStamped() == stamp.isStamped() && Objects.equals(getStampName(), stamp.getStampName()) && Objects.equals(getStampSize(), stamp.getStampSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getStampSize(), isStamped());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", isStamped=" + isStamped +
                '}';
    }
}
