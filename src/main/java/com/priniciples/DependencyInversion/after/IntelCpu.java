package com.priniciples.DependencyInversion.after;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class IntelCpu  implements Cpu {

    public void run() {
        System.out.println("使用Intel处理器");
    }

}
