package com.example.siuandroidconfigurator;

import java.io.Serializable;

public class WorkSettings implements Serializable {
    private int control_source;
    private int led_work_count;
    private int brightness;
    private int led_speed;
    private int buzzer_on_time;
    private int buzzer_off_time;
    private int priority_input_1;
    private int priority_input_2;
    private int priority_input_3;
    private int invert_input_1;
    private int invert_input_2;
    private int invert_input_3;
    private int input_1_buzz;
    private int input_2_buzz;
    private int input_3_buzz;
    private int input_1_relay;
    private int input_2_relay;
    private int input_3_relay;
    private int work_mode_reg;
    private int volume;
    private int rs_link;
    private int rs_link_time;
    private int rs_link_work_mode;


    public WorkSettings(int controlSource, int ledWorkCount, int brightness, int ledSpeed, int buzzerOnTime, int buzzerOffTime, int priorityInput1, int priorityInput2, int priorityInput3, int invertInput1, int invertInput2, int invertInput3, int input1Buzz, int input2Buzz, int input3Buzz, int input1Relay, int input2Relay, int input3Relay, int workModeReg, int volume, int rsLink, int rsLinkTime, int rsLinkWorkMode) {
        this.control_source = controlSource;
        this.led_work_count = ledWorkCount;
        this.brightness = brightness;
        this.led_speed = ledSpeed;
        this.buzzer_on_time = buzzerOnTime;
        this.buzzer_off_time = buzzerOffTime;
        this.priority_input_1 = priorityInput1;
        this.priority_input_2 = priorityInput2;
        this.priority_input_3 = priorityInput3;
        this.invert_input_1 = invertInput1;
        this.invert_input_2 = invertInput2;
        this.invert_input_3 = invertInput3;
        this.input_1_buzz = input1Buzz;
        this.input_2_buzz = input2Buzz;
        this.input_3_buzz = input3Buzz;
        this.input_1_relay = input1Relay;
        this.input_2_relay = input2Relay;
        this.input_3_relay = input3Relay;
        this.work_mode_reg = workModeReg;
        this.volume = volume;
        this.rs_link = rsLink;
        this.rs_link_time = rsLinkTime;
        this.rs_link_work_mode = rsLinkWorkMode;
    }

    public int getControl_source() {
        return control_source;
    }

    public void setControl_source(int control_source) {
        this.control_source = control_source;
    }

    public int getLed_work_count() {
        return led_work_count;
    }

    public void setLed_work_count(int led_work_count) {
        this.led_work_count = led_work_count;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getLed_speed() {
        return led_speed;
    }

    public void setLed_speed(int led_speed) {
        this.led_speed = led_speed;
    }

    public int getBuzzer_on_time() {
        return buzzer_on_time;
    }

    public void setBuzzer_on_time(int buzzer_on_time) {
        this.buzzer_on_time = buzzer_on_time;
    }

    public int getBuzzer_off_time() {
        return buzzer_off_time;
    }

    public void setBuzzer_off_time(int buzzer_off_time) {
        this.buzzer_off_time = buzzer_off_time;
    }

    public int getPriority_input_1() {
        return priority_input_1;
    }

    public void setPriority_input_1(int priority_input_1) {
        this.priority_input_1 = priority_input_1;
    }

    public int getPriority_input_2() {
        return priority_input_2;
    }

    public void setPriority_input_2(int priority_input_2) {
        this.priority_input_2 = priority_input_2;
    }

    public int getPriority_input_3() {
        return priority_input_3;
    }

    public void setPriority_input_3(int priority_input_3) {
        this.priority_input_3 = priority_input_3;
    }

    public int getInvert_input_1() {
        return invert_input_1;
    }

    public void setInvert_input_1(int invert_input_1) {
        this.invert_input_1 = invert_input_1;
    }

    public int getInvert_input_2() {
        return invert_input_2;
    }

    public void setInvert_input_2(int invert_input_2) {
        this.invert_input_2 = invert_input_2;
    }

    public int getInvert_input_3() {
        return invert_input_3;
    }

    public void setInvert_input_3(int invert_input_3) {
        this.invert_input_3 = invert_input_3;
    }

    public int getInput_1_buzz() {
        return input_1_buzz;
    }

    public void setInput_1_buzz(int input_1_buzz) {
        this.input_1_buzz = input_1_buzz;
    }

    public int getInput_2_buzz() {
        return input_2_buzz;
    }

    public void setInput_2_buzz(int input_2_buzz) {
        this.input_2_buzz = input_2_buzz;
    }

    public int getInput_3_buzz() {
        return input_3_buzz;
    }

    public void setInput_3_buzz(int input_3_buzz) {
        this.input_3_buzz = input_3_buzz;
    }

    public int getInput_1_relay() {
        return input_1_relay;
    }

    public void setInput_1_relay(int input_1_relay) {
        this.input_1_relay = input_1_relay;
    }

    public int getInput_2_relay() {
        return input_2_relay;
    }

    public void setInput_2_relay(int input_2_relay) {
        this.input_2_relay = input_2_relay;
    }

    public int getInput_3_relay() {
        return input_3_relay;
    }

    public void setInput_3_relay(int input_3_relay) {
        this.input_3_relay = input_3_relay;
    }

    public int getWork_mode_reg() {
        return work_mode_reg;
    }

    public void setWork_mode_reg(int work_mode_reg) {
        this.work_mode_reg = work_mode_reg;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getRs_link() {
        return rs_link;
    }

    public void setRs_link(int rs_link) {
        this.rs_link = rs_link;
    }

    public int getRs_link_time() {
        return rs_link_time;
    }

    public void setRs_link_time(int rs_link_time) {
        this.rs_link_time = rs_link_time;
    }

    public int getRs_link_work_mode() {
        return rs_link_work_mode;
    }

    public void setRs_link_work_mode(int rs_link_work_mode) {
        this.rs_link_work_mode = rs_link_work_mode;
    }
}
