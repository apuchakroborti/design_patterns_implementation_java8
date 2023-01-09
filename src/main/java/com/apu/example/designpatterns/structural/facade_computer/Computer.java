package com.apu.example.designpatterns.structural.facade_computer;

public class Computer {
    private long BOOT_ADDRESS=12345;
    private long BOOT_SECTOR=54321;
    private int SECTOR_SIZE=10;

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}