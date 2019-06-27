package com.xian.culturaland.entity;

public class BaseInfo {
    public int getCulturalId() {
        return CulturalId;
    }

    public void setCulturalId(int culturalId) {
        CulturalId = culturalId;
    }

    public String getCulturalName() {
        return CulturalName;
    }

    public void setCulturalName(String culturalName) {
        CulturalName = culturalName;
    }

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public String getCulturalRegion() {
        return CulturalRegion;
    }

    public void setCulturalRegion(String culturalRegion) {
        CulturalRegion = culturalRegion;
    }

    public String getCulturalCoordinate() {
        return CulturalCoordinate;
    }

    public void setCulturalCoordinate(String culturalCoordinate) {
        CulturalCoordinate = culturalCoordinate;
    }

    private int CulturalId;
    private String CulturalName;
    private int TypeId;
    private String CulturalRegion;
    private String CulturalCoordinate;
}
