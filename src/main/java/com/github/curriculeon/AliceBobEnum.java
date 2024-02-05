package com.github.curriculeon;

public enum AliceBobEnum {
    BOB("BOB"),
    ALICE("ALICE"),
    NONAME(" ");

    private  String input;


    AliceBobEnum(String input){
        this.input = input;
    }

    String getCatchPhrase(){
        return String.format("Hey, my name is %s!", this.input.toString());
    }
    void setInput(String input){
        this.input = input;
    }
    boolean isAlice(){
        return this.input.equals(ALICE.toString());
    }

    boolean isBob(){
        return this.input.equals(BOB.toString());
    }
}
