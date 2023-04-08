package Fcfs.Model;

public class Model {
    String status[] = {"New", "Ready", "Running", "Waiting", "Terminate"};
    private int processID;
    private int arrivalTime;
    private int waitingTime;
    private int ioTime;
    private int burstTime;
    private int index;
    private int turnaroundTime;

    public Model() {
    }

    public Model(int processID, int index, int arrivalTime) {
        this.processID = processID;
        this.arrivalTime = arrivalTime;
        this.index = index;
    }

    public String getStatus() {
        return status[index];
    }

    public void setStatus(int index) {
        this.index = index;
    }

    public int getProcessID() {
        return processID;
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getIoTime() {
        return ioTime;
    }

    public void setIoTime(int ioTime) {
        this.ioTime = ioTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }
}
