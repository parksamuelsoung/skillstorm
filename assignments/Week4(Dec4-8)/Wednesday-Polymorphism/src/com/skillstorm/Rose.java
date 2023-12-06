package com.skillstorm;

class Rose extends Flower {
    boolean thorny;

    public Rose(String color, String name, boolean thorny) { 
        super(color, name); 
        this.thorny = thorny; 
    }

    public void smell() { 
        System.out.printf("This %s %s rose smells good!\n", super.getColor(), super.getName());
    }

}