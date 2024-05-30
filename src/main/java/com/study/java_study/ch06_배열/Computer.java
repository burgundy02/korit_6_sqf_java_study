package com.study.java_study.ch06_배열;

public class Computer {             // allatgs, getter setter, toString
    private String cpu;
    private String ram;

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
