package com.priniciples.openingAndClosing;


// 这个是和AbstractSkin是聚合关系
//
public class SougouInput {
    private  AbstractSkin skin;

    public void setSkin(AbstractSkin skin){
        this.skin=skin;
    }

    public void display() {
        skin.display();
    }
}
