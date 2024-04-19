package com.priniciples.InterfaceIsolation;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class ItcastSafetyDoor implements AntiTheft,Fireproof {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireproof() {
        System.out.println("防火");
    }
}