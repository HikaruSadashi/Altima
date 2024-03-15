package com.example.altima.model;

public class AltimaData {

    private double tempScore;
    private double humidityScore;
    private double windScore;
    private double solar;
    private double turbine;
    private double solarKWH;
    private double turbineKWH;

    // Getters and setters

    public double getTempScore() {
        return tempScore;
    }

    public void setTempScore(double tempScore) {
        this.tempScore = tempScore;
    }

    public double getHumidityScore() {
        return humidityScore;
    }

    public void setHumidityScore(double humidityScore) {
        this.humidityScore = humidityScore;
    }

    public double getWindScore() {
        return windScore;
    }

    public void setWindScore(double windScore) {
        this.windScore = windScore;
    }

    public double getSolar() {
        return solar;
    }

    public void setSolar(double solar) {
        this.solar = solar;
    }

    public double getTurbine() {
        return turbine;
    }

    public void setTurbine(double turbine) {
        this.turbine = turbine;
    }

    public double getSolarKWH() {
        return solarKWH;
    }

    public void setSolarKWH(double solarKWH) {
        this.solarKWH = solarKWH;
    }

    public double getTurbineKWH() {
        return turbineKWH;
    }

    public void setTurbineKWH(double turbineKWH) {
        this.turbineKWH = turbineKWH;
    }
}
