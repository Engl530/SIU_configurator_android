package com.example.siuandroidconfigurator;

public class SiuDevice {

    enum Connection{
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        DISCONNECTING
    }

    private Connection connection_state;
    private boolean bus_busy;
    private int serial_num;
    private static final int[] baud_rates_list = new int[]{9600, 19200,4800,2400}; //поддерживаемые скорости
    private static final int[] parity_list = new int[]{0, 2,1}; // 0 - NONE; 1 - ODD; 2 - EVEN
    private static final int[] stop_bits_list = new int[]{0, 1,2};// 0 - 1stop; 1 - 1.5stop; 2 - 2stop
    //константы
    private static final String MAGIC_WORD = "SIU_LED_V2_START_PROGRAMMING";
    private final int RS_LINK_VERSION = 3140;
    private final int COMMAND_CONNECTION = 0x19;
    private final int COMMAND_READ_ALL_SETTINGS = 0x28;
    private final int COMMAND_WRITE_WORK_SETTINGS = 0x37;
    private final int COMMAND_WRITE_UART_SETTINGS = 0x46;
    private final int COMMAND_WRITE_SERIAL_NUMBER = 0x55;
    private final int COMMAND_RESET_MCU = 0x91;
    private final int COMMAND_READ_RSLINK_SETTINGS = 0xAC;
    private final int COMMAND_WRITE_RSLINK_SETTINGS = 0xD3;
    //индексы буфера
    private final int INDEX_COMMAND = 0;
    private final int INDEX_COMMAND_NEG = 1;
    private final int INDEX_SERIALNUMBER_H = 2;
    private final int INDEX_SERIALNUMBER_L = 3;

    private int crc16(int[] buf, int lenth){
        int crc16 = 0xFFFF;
        int ui16 = 0xA001;
        int flag = 0;
        int i = 0;
        int k = 1;
        while(lenth != 0){
            ui16 = buf[i];
            i += 1;
            k = 0;
            crc16 ^= ui16;

            while(k < 8) {
                flag = (crc16 & 1);
                crc16 >>= 1;
                if (flag == 1) crc16 ^= 0xA001;
                k += 1;
            }
            lenth -= 1;
        }
        return crc16;
    }
}
