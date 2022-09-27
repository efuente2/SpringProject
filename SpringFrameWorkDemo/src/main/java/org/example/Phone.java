package org.example;

public class Phone {
    public Phone(){
    }

    public Phone(String mob) {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    private String mob;

    @Override
    public String toString(){
        return mob;
    }




    }
