package com.priniciples.dependency_inversion.after;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class KingstonMemory implements Memory {

    public void save() {
        System.out.println("使用金士顿作为内存条");
    }
}