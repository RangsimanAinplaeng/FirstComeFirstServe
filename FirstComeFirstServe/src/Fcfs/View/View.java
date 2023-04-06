package Fcfs.View;
public class View extends javax.swing.JFrame {
    public View() {
        initComponents();
    }
    // Variables declaration - do not modify
    private javax.swing.JTable TableFCFSQueue;
    private javax.swing.JTable TableTerminaate;
    private javax.swing.JLabel TextTerminate;
    private javax.swing.JLabel TitleText;
    private javax.swing.JButton jButtonAddIOUSB;
    private javax.swing.JButton jButtonAddProcess;
    private javax.swing.JButton jButtonAddTerminate;
    private javax.swing.JButton jButtonEndIO;
    private javax.swing.JLabel jLabelAVGTurnaroundTime;
    private javax.swing.JLabel jLabelCPU;
    private javax.swing.JLabel jLabelCockTime;
    private javax.swing.JLabel jLabelFCFSQueue;
    private javax.swing.JLabel jLabelJobQueueText;
    private javax.swing.JLabel jLabelNumberAVGTurnaroundTime;
    private javax.swing.JLabel jLabelNumberAVGWatingTime;
    private javax.swing.JLabel jLabelNumberCock;
    private javax.swing.JLabel jLabelUSB;
    private javax.swing.JLabel jLabelavgWaitingTime;
    private javax.swing.JPanel jPanelAddAndTerminate;
    private javax.swing.JPanel jPanelCPU;
    private javax.swing.JPanel jPanelFCFSQueue;
    private javax.swing.JPanel jPanelJobQueue;
    private javax.swing.JPanel jPanelTerminate;
    private javax.swing.JPanel jPanelUSB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneCPU;
    private javax.swing.JScrollPane jScrollPaneJobQueue;
    private javax.swing.JScrollPane jScrollPaneTerminate;
    private javax.swing.JScrollPane jScrollPaneTerminate1;
    private javax.swing.JScrollPane jScrollPaneUSB;
    private javax.swing.JTable jTableCPU;
    private javax.swing.JTable jTableJobQueue;
    private javax.swing.JTable jTableUSB;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        TitleText = new javax.swing.JLabel();
        jPanelTerminate = new javax.swing.JPanel();
        jScrollPaneTerminate = new javax.swing.JScrollPane();
        TableTerminaate = new javax.swing.JTable();
        TextTerminate = new javax.swing.JLabel();
        jPanelFCFSQueue = new javax.swing.JPanel();
        jLabelFCFSQueue = new javax.swing.JLabel();
        jScrollPaneTerminate1 = new javax.swing.JScrollPane();
        TableFCFSQueue = new javax.swing.JTable();
        jPanelAddAndTerminate = new javax.swing.JPanel();
        jButtonAddProcess = new javax.swing.JButton();
        jButtonAddTerminate = new javax.swing.JButton();
        jLabelCockTime = new javax.swing.JLabel();
        jLabelNumberCock = new javax.swing.JLabel();
        jPanelCPU = new javax.swing.JPanel();
        jScrollPaneCPU = new javax.swing.JScrollPane();
        jTableCPU = new javax.swing.JTable();
        jLabelCPU = new javax.swing.JLabel();
        jLabelavgWaitingTime = new javax.swing.JLabel();
        jLabelAVGTurnaroundTime = new javax.swing.JLabel();
        jLabelNumberAVGWatingTime = new javax.swing.JLabel();
        jLabelNumberAVGTurnaroundTime = new javax.swing.JLabel();
        jPanelUSB = new javax.swing.JPanel();
        jScrollPaneUSB = new javax.swing.JScrollPane();
        jTableUSB = new javax.swing.JTable();
        jLabelUSB = new javax.swing.JLabel();
        jButtonAddIOUSB = new javax.swing.JButton();
        jButtonEndIO = new javax.swing.JButton();
        jPanelJobQueue = new javax.swing.JPanel();
        jScrollPaneJobQueue = new javax.swing.JScrollPane();
        jTableJobQueue = new javax.swing.JTable();
        jLabelJobQueueText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        mainPanel.setBackground(new java.awt.Color(0, 204, 204));
        mainPanel.setBorder(new javax.swing.border.MatteBorder(null));

        TitleText.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        TitleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleText.setText("First Come First Serve");

        jPanelTerminate.setBackground(new java.awt.Color(0, 153, 153));

        TableTerminaate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TableTerminaate.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "ProcessID", "Status"
                }
        ));
        jScrollPaneTerminate.setViewportView(TableTerminaate);

        TextTerminate.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        TextTerminate.setText("Terminate");

        javax.swing.GroupLayout jPanelTerminateLayout = new javax.swing.GroupLayout(jPanelTerminate);
        jPanelTerminate.setLayout(jPanelTerminateLayout);
        jPanelTerminateLayout.setHorizontalGroup(
                jPanelTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTerminateLayout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(TextTerminate)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTerminateLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPaneTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanelTerminateLayout.setVerticalGroup(
                jPanelTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTerminateLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(TextTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanelFCFSQueue.setBackground(new java.awt.Color(0, 153, 153));

        jLabelFCFSQueue.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabelFCFSQueue.setText("FCFS Queue");

        TableFCFSQueue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TableFCFSQueue.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "ProcessID", "Status"
                }
        ));
        jScrollPaneTerminate1.setViewportView(TableFCFSQueue);

        javax.swing.GroupLayout jPanelFCFSQueueLayout = new javax.swing.GroupLayout(jPanelFCFSQueue);
        jPanelFCFSQueue.setLayout(jPanelFCFSQueueLayout);
        jPanelFCFSQueueLayout.setHorizontalGroup(
                jPanelFCFSQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFCFSQueueLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelFCFSQueue)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelFCFSQueueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneTerminate1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFCFSQueueLayout.setVerticalGroup(
                jPanelFCFSQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFCFSQueueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelFCFSQueue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPaneTerminate1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jPanelAddAndTerminate.setBackground(new java.awt.Color(0, 153, 153));
        jPanelAddAndTerminate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButtonAddProcess.setBackground(new java.awt.Color(102, 255, 0));
        jButtonAddProcess.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAddProcess.setText("Add Process");
        jButtonAddProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProcessActionPerformed(evt);
            }
        });

        jButtonAddTerminate.setBackground(new java.awt.Color(255, 0, 0));
        jButtonAddTerminate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAddTerminate.setText("Terminate");
        jButtonAddTerminate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTerminateActionPerformed(evt);
            }
        });

        jLabelCockTime.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelCockTime.setText("Cock:");

        jLabelNumberCock.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNumberCock.setText("__________");

        jPanelCPU.setBackground(new java.awt.Color(0, 102, 102));
        jPanelCPU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableCPU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTableCPU.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null}
                },
                new String [] {
                        "Status", "ProcessID"
                }
        ));
        jScrollPaneCPU.setViewportView(jTableCPU);

        jLabelCPU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelCPU.setForeground(new java.awt.Color(0, 204, 204));
        jLabelCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCPU.setText("CPU");

        javax.swing.GroupLayout jPanelCPULayout = new javax.swing.GroupLayout(jPanelCPU);
        jPanelCPU.setLayout(jPanelCPULayout);
        jPanelCPULayout.setHorizontalGroup(
                jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabelCPU)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanelCPULayout.setVerticalGroup(
                jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCPULayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelCPU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelavgWaitingTime.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelavgWaitingTime.setText("AVG WatingTime:");

        jLabelAVGTurnaroundTime.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelAVGTurnaroundTime.setText("AVG TurnaroudTime:");

        jLabelNumberAVGWatingTime.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNumberAVGWatingTime.setText("______");

        jLabelNumberAVGTurnaroundTime.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNumberAVGTurnaroundTime.setText("______");

        javax.swing.GroupLayout jPanelAddAndTerminateLayout = new javax.swing.GroupLayout(jPanelAddAndTerminate);
        jPanelAddAndTerminate.setLayout(jPanelAddAndTerminateLayout);
        jPanelAddAndTerminateLayout.setHorizontalGroup(
                jPanelAddAndTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelAddAndTerminateLayout.createSequentialGroup()
                                .addGroup(jPanelAddAndTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelAddAndTerminateLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanelAddAndTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanelCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanelAddAndTerminateLayout.createSequentialGroup()
                                                                .addComponent(jLabelAVGTurnaroundTime, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelNumberAVGTurnaroundTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanelAddAndTerminateLayout.createSequentialGroup()
                                                                .addComponent(jLabelavgWaitingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelNumberAVGWatingTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanelAddAndTerminateLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabelCockTime)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelNumberCock, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddAndTerminateLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelAddAndTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonAddTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonAddProcess))
                                .addGap(63, 63, 63))
        );
        jPanelAddAndTerminateLayout.setVerticalGroup(
                jPanelAddAndTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelAddAndTerminateLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonAddProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jButtonAddTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanelAddAndTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCockTime)
                                        .addComponent(jLabelNumberCock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanelAddAndTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelavgWaitingTime)
                                        .addComponent(jLabelNumberAVGWatingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelAddAndTerminateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelAVGTurnaroundTime)
                                        .addComponent(jLabelNumberAVGTurnaroundTime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        jPanelUSB.setBackground(new java.awt.Color(0, 153, 153));
        jPanelUSB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTableUSB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableUSB.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null}
                },
                new String [] {
                        "Status", "ProcessID"
                }
        ));
        jScrollPaneUSB.setViewportView(jTableUSB);

        jLabelUSB.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabelUSB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUSB.setText("USB IO");

        jButtonAddIOUSB.setBackground(new java.awt.Color(102, 255, 0));
        jButtonAddIOUSB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAddIOUSB.setText("ADD IO");
        jButtonAddIOUSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddIOUSBActionPerformed(evt);
            }
        });

        jButtonEndIO.setBackground(new java.awt.Color(255, 0, 0));
        jButtonEndIO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonEndIO.setText("END IO");
        jButtonEndIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEndIOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUSBLayout = new javax.swing.GroupLayout(jPanelUSB);
        jPanelUSB.setLayout(jPanelUSBLayout);
        jPanelUSBLayout.setHorizontalGroup(
                jPanelUSBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelUSBLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelUSBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPaneUSB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanelUSBLayout.createSequentialGroup()
                                                .addComponent(jLabelUSB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonAddIOUSB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonEndIO)
                                                .addGap(0, 5, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanelUSBLayout.setVerticalGroup(
                jPanelUSBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUSBLayout.createSequentialGroup()
                                .addGroup(jPanelUSBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelUSBLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabelUSB))
                                        .addComponent(jButtonEndIO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonAddIOUSB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneUSB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanelJobQueue.setBackground(new java.awt.Color(0, 153, 153));

        jTableJobQueue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableJobQueue.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ProcessID", "BurstTime", "ArrivalTime", "WaitingTime", "TurnaroudTime", "Status"
                }
        ));
        jScrollPaneJobQueue.setViewportView(jTableJobQueue);

        jLabelJobQueueText.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabelJobQueueText.setText("Job Queue");

        javax.swing.GroupLayout jPanelJobQueueLayout = new javax.swing.GroupLayout(jPanelJobQueue);
        jPanelJobQueue.setLayout(jPanelJobQueueLayout);
        jPanelJobQueueLayout.setHorizontalGroup(
                jPanelJobQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelJobQueueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneJobQueue)
                                .addContainerGap())
                        .addGroup(jPanelJobQueueLayout.createSequentialGroup()
                                .addContainerGap(382, Short.MAX_VALUE)
                                .addComponent(jLabelJobQueueText)
                                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanelJobQueueLayout.setVerticalGroup(
                jPanelJobQueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJobQueueLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelJobQueueText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jScrollPaneJobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(0, 394, Short.MAX_VALUE)
                                .addComponent(TitleText)
                                .addContainerGap(366, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(jPanelTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanelFCFSQueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanelUSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(jPanelJobQueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanelAddAndTerminate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanelAddAndTerminate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanelJobQueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanelTerminate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelFCFSQueue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelUSB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    //TODO ActionPerformed
    private void jButtonAddProcessActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void jButtonAddTerminateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void jButtonAddIOUSBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void jButtonEndIOActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }


}

