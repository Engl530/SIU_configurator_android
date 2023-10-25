package com.example.siuandroidconfigurator;

public class SiuDevice {

    enum Connection{
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        DISCONNECTING

    }
    private Connection connection_state;

    private int serial_num;

}
