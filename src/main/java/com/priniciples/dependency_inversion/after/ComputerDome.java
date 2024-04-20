package com.priniciples.dependency_inversion.after;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class ComputerDome {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // HardDisk hardDisk = new XiJieHardDisk();
        //组装电脑 我这里是使用强制转换 因为 也可像上面这样向上转型创建对象
        computer.setHardDisk((HardDisk) new XiJieHardDisk());
        computer.setCpu((Cpu) new IntelCpu());
        computer.setMemory((Memory) new KingstonMemory());

        computer.run();
    }
}
