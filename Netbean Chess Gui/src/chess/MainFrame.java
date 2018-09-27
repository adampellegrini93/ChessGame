package chess;
import java.awt.*;
import javax.swing.*;
public class MainFrame extends javax.swing.JFrame {
    
    


    public MainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPanel = new javax.swing.JPanel();
        PVPButton = new javax.swing.JButton();
        PVAIButton = new javax.swing.JButton();
        HTPButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        CapBlackPieces = new javax.swing.JPanel();
        CapWhitePiece = new javax.swing.JPanel();
        CapWhiteLab = new javax.swing.JLabel();
        CapBlackLabel = new javax.swing.JLabel();
        Chessboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        WhiteRock = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(860, 860));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonPanel.setBackground(new java.awt.Color(153, 51, 0));
        ButtonPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        PVPButton.setText("Player Vs Player");
        PVPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PVPButtonActionPerformed(evt);
            }
        });

        PVAIButton.setText("Player Vs Computer");

        HTPButton.setText("How to play");

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        CapBlackPieces.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CapBlackPiecesLayout = new javax.swing.GroupLayout(CapBlackPieces);
        CapBlackPieces.setLayout(CapBlackPiecesLayout);
        CapBlackPiecesLayout.setHorizontalGroup(
            CapBlackPiecesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CapBlackPiecesLayout.setVerticalGroup(
            CapBlackPiecesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        CapWhitePiece.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CapWhitePieceLayout = new javax.swing.GroupLayout(CapWhitePiece);
        CapWhitePiece.setLayout(CapWhitePieceLayout);
        CapWhitePieceLayout.setHorizontalGroup(
            CapWhitePieceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CapWhitePieceLayout.setVerticalGroup(
            CapWhitePieceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        CapWhiteLab.setText("White Pieces");

        CapBlackLabel.setText("Black Pieces");

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CapBlackPieces, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CapWhitePiece, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PVPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PVAIButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HTPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(CapWhiteLab))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(CapBlackLabel))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addComponent(CapWhiteLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CapWhitePiece, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CapBlackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CapBlackPieces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PVPButton)
                .addGap(11, 11, 11)
                .addComponent(PVAIButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HTPButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        getContentPane().add(ButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        Chessboard.setBackground(new java.awt.Color(153, 51, 0));
        Chessboard.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        Chessboard.setForeground(new java.awt.Color(255, 255, 255));
        Chessboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackRook.png"))); // NOI18N
        jLabel17.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 922, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 3, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackPawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(0, 920, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 89, 80, -1));

        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel3.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 175, 80, -1));

        jPanel4.setBackground(new java.awt.Color(153, 51, 0));
        jPanel4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel4.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel4.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 261, -1, -1));

        jPanel67.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel67.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel67.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 347, 80, -1));

        jPanel6.setBackground(new java.awt.Color(153, 51, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel6.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel6.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 433, -1, -1));

        jPanel7.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel7.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel7.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhitePawn.png"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 915, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 519, 80, -1));

        jPanel8.setBackground(new java.awt.Color(153, 51, 0));
        jPanel8.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel8.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel8.setPreferredSize(new java.awt.Dimension(85, 85));

        WhiteRock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhiteRook.png"))); // NOI18N
        WhiteRock.setText("jLabel3");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(WhiteRock, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 922, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(WhiteRock)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 605, 80, -1));

        jPanel9.setBackground(new java.awt.Color(153, 51, 0));
        jPanel9.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel9.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel9.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackKnight.png"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 3, 90, -1));

        jPanel10.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel10.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel10.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackPawn.png"))); // NOI18N
        jLabel26.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 909, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 89, 90, -1));

        jPanel11.setBackground(new java.awt.Color(153, 51, 0));
        jPanel11.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel11.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel11.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 175, 90, -1));

        jPanel12.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel12.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel12.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 261, 90, -1));

        jPanel13.setBackground(new java.awt.Color(153, 51, 0));
        jPanel13.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel13.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel13.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 347, 90, -1));

        jPanel14.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel14.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel14.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 433, -1, -1));

        jPanel15.setBackground(new java.awt.Color(153, 51, 0));
        jPanel15.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel15.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel15.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhitePawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 920, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 519, 90, -1));

        jPanel16.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel16.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel16.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhiteKnight.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 911, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 605, 90, -1));

        jPanel17.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel17.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel17.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackBishop.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 3, 90, -1));

        jPanel18.setBackground(new java.awt.Color(153, 51, 0));
        jPanel18.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel18.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel18.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackPawn.png"))); // NOI18N
        jLabel27.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 915, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 89, 90, -1));

        jPanel19.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel19.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel19.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 175, 90, -1));

        jPanel20.setBackground(new java.awt.Color(153, 51, 0));
        jPanel20.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel20.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel20.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 261, 90, -1));

        jPanel21.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel21.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel21.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 347, 90, -1));

        jPanel22.setBackground(new java.awt.Color(153, 51, 0));
        jPanel22.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel22.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel22.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 433, 90, -1));

        jPanel23.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel23.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel23.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhitePawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 519, 90, -1));

        jPanel24.setBackground(new java.awt.Color(153, 51, 0));
        jPanel24.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel24.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel24.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhiteBishop.png"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 605, 90, -1));

        jPanel25.setBackground(new java.awt.Color(153, 51, 0));
        jPanel25.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel25.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel25.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackKing.png"))); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(0, 920, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 3, 90, -1));

        jPanel26.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel26.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel26.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackPawn.png"))); // NOI18N
        jLabel28.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 915, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 89, 90, -1));

        jPanel27.setBackground(new java.awt.Color(153, 51, 0));
        jPanel27.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel27.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel27.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 175, 90, -1));

        jPanel28.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel28.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel28.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 261, 90, -1));

        jPanel29.setBackground(new java.awt.Color(153, 51, 0));
        jPanel29.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel29.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel29.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 347, 90, -1));

        jPanel30.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel30.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel30.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 433, 90, -1));

        jPanel31.setBackground(new java.awt.Color(153, 51, 0));
        jPanel31.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel31.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel31.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhitePawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(910, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 519, 90, -1));

        jPanel32.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel32.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel32.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhiteKing.png"))); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 913, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 605, 90, -1));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel33.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel33.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackQueen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 3, 90, -1));

        jPanel34.setBackground(new java.awt.Color(153, 51, 0));
        jPanel34.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel34.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel34.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackPawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 909, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 89, 90, -1));

        jPanel35.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel35.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel35.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 175, 90, -1));

        jPanel36.setBackground(new java.awt.Color(153, 51, 0));
        jPanel36.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel36.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel36.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 261, 90, -1));

        jPanel37.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel37.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel37.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 347, 90, -1));

        jPanel38.setBackground(new java.awt.Color(153, 51, 0));
        jPanel38.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel38.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel38.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 433, 90, -1));

        jPanel39.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel39.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel39.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhitePawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 519, 90, -1));

        jPanel40.setBackground(new java.awt.Color(153, 51, 0));
        jPanel40.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel40.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel40.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhiteQueen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(910, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 605, 90, -1));

        jPanel41.setBackground(new java.awt.Color(153, 51, 0));
        jPanel41.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel41.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel41.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackBishop.png"))); // NOI18N

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 3, 90, -1));

        jPanel42.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel42.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel42.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackPawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 909, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 89, 90, -1));

        jPanel43.setBackground(new java.awt.Color(153, 51, 0));
        jPanel43.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel43.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel43.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 175, 90, -1));

        jPanel44.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel44.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel44.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 261, 90, -1));

        jPanel45.setBackground(new java.awt.Color(153, 51, 0));
        jPanel45.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel45.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel45.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 347, 90, -1));

        jPanel46.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel46.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel46.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 433, 90, -1));

        jPanel47.setBackground(new java.awt.Color(153, 51, 0));
        jPanel47.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel47.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel47.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhitePawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 519, 90, -1));

        jPanel48.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel48.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel48.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhiteBishop.png"))); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(919, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 605, 90, -1));

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel49.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel49.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackKnight.png"))); // NOI18N

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 3, 90, -1));

        jPanel50.setBackground(new java.awt.Color(153, 51, 0));
        jPanel50.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel50.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel50.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackPawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 909, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jLabel31)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 89, 90, -1));

        jPanel51.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel51.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel51.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 175, 90, -1));

        jPanel52.setBackground(new java.awt.Color(153, 51, 0));
        jPanel52.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel52.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel52.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 261, 90, -1));

        jPanel53.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel53.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel53.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 347, 90, -1));

        jPanel54.setBackground(new java.awt.Color(153, 51, 0));
        jPanel54.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel54.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel54.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 433, 90, -1));

        jPanel55.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel55.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel55.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhitePawn.png"))); // NOI18N
        jLabel15.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 519, 90, -1));

        jPanel56.setBackground(new java.awt.Color(153, 51, 0));
        jPanel56.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel56.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel56.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhiteKnight.png"))); // NOI18N

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(910, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 605, 90, -1));

        jPanel57.setBackground(new java.awt.Color(153, 51, 0));
        jPanel57.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel57.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel57.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackRook.png"))); // NOI18N

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 922, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 3, 90, -1));

        jPanel58.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel58.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel58.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/BlackPawn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 909, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 89, 90, -1));

        jPanel59.setBackground(new java.awt.Color(153, 51, 0));
        jPanel59.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel59.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel59.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 175, 90, -1));

        jPanel60.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel60.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel60.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 261, 90, -1));

        jPanel61.setBackground(new java.awt.Color(153, 51, 0));
        jPanel61.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel61.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel61.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 347, 90, -1));

        jPanel62.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel62.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel62.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Chessboard.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 433, 90, -1));

        jPanel63.setBackground(new java.awt.Color(153, 51, 0));
        jPanel63.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel63.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel63.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhitePawn.png"))); // NOI18N
        jLabel16.setPreferredSize(new java.awt.Dimension(85, 85));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 910, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 519, 90, -1));

        jPanel64.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel64.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel64.setPreferredSize(new java.awt.Dimension(85, 85));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/leipzig/80/WhiteRook.png"))); // NOI18N

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 907, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Chessboard.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 605, 90, -1));

        getContentPane().add(Chessboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 0, 700, 690));

        jPanel65.setBackground(new java.awt.Color(153, 51, 0));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("                Dice");

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 120, 260));
        getContentPane().add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 120, 230));
        getContentPane().add(textArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 120, 200));

        jMenu1.setText("Chess A.I. Game ");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void PVPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PVPButtonActionPerformed
     Dice showdice = new Dice();
    showdice.setVisible(true);
    }//GEN-LAST:event_PVPButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
     
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                  
        
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel CapBlackLabel;
    private javax.swing.JPanel CapBlackPieces;
    private javax.swing.JLabel CapWhiteLab;
    private javax.swing.JPanel CapWhitePiece;
    private javax.swing.JPanel Chessboard;
    private javax.swing.JButton HTPButton;
    private javax.swing.JButton PVAIButton;
    private javax.swing.JButton PVPButton;
    private javax.swing.JLabel WhiteRock;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
