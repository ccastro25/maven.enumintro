package com.github.curriculeon;

public class  AliceBobEvaluator   {

    AliceBobEnum aliceBobEnum   ;

    AliceBobEvaluator(String input){
        if(input.equalsIgnoreCase("bob")) aliceBobEnum = AliceBobEnum.BOB;
        else if(input.equalsIgnoreCase("ALICE"))aliceBobEnum = AliceBobEnum.ALICE;
        else {aliceBobEnum = AliceBobEnum.NONAME;}
    }

    boolean isAlice(){
        return aliceBobEnum.isAlice();
    }

    boolean isBob(){
        return aliceBobEnum.isBob();
    }
}
