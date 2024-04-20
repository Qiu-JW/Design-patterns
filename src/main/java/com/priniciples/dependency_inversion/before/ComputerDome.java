package com.priniciples.dependency_inversion.before;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class ComputerDome {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        //组装电脑
        computer.setHardDisk(new XiJieHardDisk());
        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());

        computer.run();
    }
}
