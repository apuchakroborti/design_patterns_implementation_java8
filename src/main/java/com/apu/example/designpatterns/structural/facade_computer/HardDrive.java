package com.apu.example.designpatterns.structural.facade_computer;

public class HardDrive {
    public byte[] read(long lba, int size) {
        byte lba_byte = (byte)lba;
        return new byte[]{lba_byte, (byte) size};
    }
}
