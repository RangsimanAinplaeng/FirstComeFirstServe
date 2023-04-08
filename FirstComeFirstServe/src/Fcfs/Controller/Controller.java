package Fcfs.Controller;

import Fcfs.Model.Model;

import java.util.ArrayList;

public class Controller {
    Model model = new Model();
    ArrayList<Model> jobQueue = new ArrayList<Model>();
    ArrayList<Model> readyQueue = new ArrayList<Model>();
    ArrayList<Model> terminateQueue = new ArrayList<Model>();
    ArrayList<Model> usbQueue = new ArrayList<Model>();
    int pId = 1;
    int burstTime = 0;
    int waitingTime = 0;
    int ioTime = 0;
    double avgWaitingTime = 0;
    double avgTurnaroundTime = 0;

    public Controller() {
    }

    public void addProcess(int clock) {
        model = new Model(pId, 0, clock);
        pId++;
        jobQueue.add(model);
        readyQueue.add(model);
    }

    public void firstComeFirstServed() {
        try {
            for (int i = 0; i < jobQueue.size(); i++) {
                if (readyQueue.get(0) == jobQueue.get(i)) {
                    jobQueue.get(i).setStatus(2);
                    burstTime = jobQueue.get(i).getBurstTime();
                    burstTime++;
                    jobQueue.get(i).setBurstTime(burstTime);
                } else if (jobQueue.get(i).getStatus() != "Waiting") {
                    jobQueue.get(i).setStatus(1);
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) {

        }
    }

    public void avgWaitingTime(int waitingTime) {
        this.avgWaitingTime = this.avgWaitingTime + waitingTime;
    }

    public String getAvgWaitingTime() {
        if (terminateQueue.isEmpty()) {
            return "0";
        } else
            return String.format("%.2f", avgWaitingTime / terminateQueue.size());
    }

    public void avgTurnaroundTime(int turnaroundTime) {
        this.avgTurnaroundTime = this.avgTurnaroundTime + turnaroundTime;
    }

    public String getAvgTurnaroundTime() {
        if (terminateQueue.isEmpty()) {
            return "0";
        } else
            return String.format("%.2f", avgTurnaroundTime / terminateQueue.size());
    }

    public void removeQueue(int clock) {
        try {
            for (int i = 0; i < jobQueue.size(); i++) {
                if (readyQueue.get(0).getStatus() == "Running") {
                    if (readyQueue.get(0) == jobQueue.get(i)) {
                        jobQueue.get(i).setStatus(4);
                        jobQueue.get(i).setTurnaroundTime(clock);
                        avgTurnaroundTime(jobQueue.get(i).getTurnaroundTime());
                        terminateQueue.add(jobQueue.get(i));
                        avgWaitingTime(jobQueue.get(i).getWaitingTime());
                        jobQueue.remove(i);
                        readyQueue.remove(0);
                        break;
                    }
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) { //

        }
    }

    public void waitingTime() {
        for (int i = 0; i < jobQueue.size(); i++) { //Loop ถ้า i = 0 เช็คว่า i < jobQueue.size ก็จะเพื่มค่า i ครั้งละ 1
            if (jobQueue.get(i).getStatus() == "Ready") {  // ถ้า jobQueue ตําแหน่งที่ i เท่ากับ "Ready"
                waitingTime = jobQueue.get(i).getWaitingTime();  //โดย get ค่า waitingTime มาใช้งาน
                waitingTime++; //เพิ่มค่า waitingTime ขึ้นทีละ 1
                jobQueue.get(i).setWaitingTime(waitingTime);//โดยนําค่า waitingTime มาเก็บยัง setBurstTime ของ Process นั้น

            }
        }
    }

    //Method set การทำงานของ USB
    public void usbQueue() {
        try {
            ioTime = usbQueue.get(0).getIoTime();
            ioTime++;
            usbQueue.get(0).setIoTime(ioTime);
        } catch (java.lang.IndexOutOfBoundsException e) {

        }
    }

    public void addUsbQueue() {
        try {
            for (int i = 0; i < readyQueue.size(); i++) {
                if (readyQueue.get(i).getStatus() == "Running") {
                    readyQueue.get(i).setStatus(3);
                    usbQueue.add(readyQueue.get(i));
                    readyQueue.remove(i);
                    break;
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) {

        }
    }

    public void endUsbQueue() {
        try {
            usbQueue.get(0).setStatus(1);
            readyQueue.add(usbQueue.get(0));
            usbQueue.remove(0);
        } catch (java.lang.IndexOutOfBoundsException e) {

        }
    }

    public void waitingTimeUsbQueue() {
        for (int i = 1; i < usbQueue.size(); i++) { //Loop ถ้า i = 1 เช็คว่า i < monitorQueue.size ก็จะเพื่มค่า i ครั้งละ 1
            if (usbQueue.get(i).getStatus() == "Waiting") {  // ถ้า monitorQueue ตําแหน่งที่ i เท่ากับ "Waiting"
                waitingTime = usbQueue.get(i).getWaitingTime();  //โดย get ค่า waitingTime มาใช้งาน
                waitingTime++; //เพิ่มค่า waitingTime ขึ้นทีละ 1
                usbQueue.get(i).setWaitingTime(waitingTime);//โดยนําค่า waitingTime มาเก็บยัง setBurstTime ของ Process นั้น
            }
        }
    }

    public String showJobQueue() {
        String text = "";
        for (int index = 0; index < jobQueue.size(); index++) {
            text = text + jobQueue.get(index).getProcessID() + " ";
            text = text + jobQueue.get(index).getBurstTime() + " ";
            text = text + jobQueue.get(index).getArrivalTime() + " ";
            text = text + jobQueue.get(index).getWaitingTime() + " ";
            text = text + jobQueue.get(index).getStatus() + " ";
            text = text + jobQueue.get(index).getIoTime() + " ";
            text = text + ",";
        }
        return text;
    }

    public String showReadyQueue() {
        String text = "";
        for (int index = 0; index < readyQueue.size(); index++) {
            text = text + readyQueue.get(index).getProcessID() + " ";
            text = text + readyQueue.get(index).getStatus() + " ";
            text = text + ",";
        }
        return text;
    }

    public String showTerminateQueue() {
        String text = "";
        for (int index = 0; index < terminateQueue.size(); index++) {
            text = text + terminateQueue.get(index).getProcessID() + " ";
            text = text + terminateQueue.get(index).getStatus() + " ";
            text = text + terminateQueue.get(index).getWaitingTime() + " ";
            text = text + terminateQueue.get(index).getTurnaroundTime() + " ";
            text = text + ",";
        }
        return text;
    }

    public String showCPU() {
        String text = "";
        for (int index = 0; index < jobQueue.size(); index++) {
            if (jobQueue.get(index).getStatus() == "Running") {
                text = text + jobQueue.get(index).getProcessID() + " ";
                text = text + jobQueue.get(index).getStatus() + " ";
                text = text + ",";
            }

        }
        return text;
    }

    public String showUsb() {
        String text = "";
        for (int index = 0; index < usbQueue.size(); index++) {
            text = text + usbQueue.get(index).getProcessID() + " ";
            text = text + usbQueue.get(index).getStatus() + " ";
            text = text + usbQueue.get(index).getIoTime() + " ";
            text = text + usbQueue.get(index).getWaitingTime() + " ";
            text = text + ",";
        }
        return text;
    }
}
