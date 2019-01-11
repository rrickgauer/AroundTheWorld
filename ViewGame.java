/**
 * This is the View portion of the MVC application
 * 
 * It is responsible for displaying the interface for playig the game
 */

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ViewGame extends javax.swing.JFrame
{

    public ViewGame()
    {
	initComponents();

	setVisible(true);
	
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        RankMenu = new javax.swing.JComboBox<>();
        SuitMenu = new javax.swing.JComboBox<>();
        AnswerLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        suitRankButtonsPanel = new javax.swing.JPanel();
        sevenRankButton = new javax.swing.JButton();
        fourRankButton = new javax.swing.JButton();
        fiveRankButton = new javax.swing.JButton();
        diamondSuitButton = new javax.swing.JButton();
        sixRankButton = new javax.swing.JButton();
        clubSuitButton = new javax.swing.JButton();
        aceRankButton = new javax.swing.JButton();
        twoRankButton = new javax.swing.JButton();
        tenRankButton = new javax.swing.JButton();
        jackRankButton = new javax.swing.JButton();
        queenRankButton = new javax.swing.JButton();
        threeRankButton = new javax.swing.JButton();
        kingRankButton = new javax.swing.JButton();
        heartSuitButton = new javax.swing.JButton();
        eightRankButton = new javax.swing.JButton();
        spadeSuitButton = new javax.swing.JButton();
        nineRankButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CorrectButton = new javax.swing.JButton();
        RestartButton = new javax.swing.JButton();
        LevelLabel = new javax.swing.JLabel();
        LevelMenu = new javax.swing.JComboBox<>();
        WrongButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ResultLabel = new javax.swing.JLabel();
        CalculateButton = new javax.swing.JButton();
        dataPanel = new DataPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ride the Bus");

        RankMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE", " " }));
        RankMenu.setToolTipText("Select rank\n");
        RankMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RankMenuActionPerformed(evt);
            }
        });

        SuitMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLUB", "DIAMOND", "HEART", "SPADE" }));
        SuitMenu.setToolTipText("Select suit");

        sevenRankButton.setText("7");
        sevenRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        sevenRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        sevenRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        fourRankButton.setText("4");
        fourRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        fourRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        fourRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        fiveRankButton.setText("5");
        fiveRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        fiveRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        fiveRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        diamondSuitButton.setText("Diamond");

        sixRankButton.setText("6");
        sixRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        sixRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        sixRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        clubSuitButton.setText("Club");
        clubSuitButton.setPreferredSize(new java.awt.Dimension(79, 28));

        aceRankButton.setText("Ace");
        aceRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        aceRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        aceRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        twoRankButton.setText("2");
        twoRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        twoRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        twoRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        tenRankButton.setText("10");
        tenRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        tenRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        tenRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        jackRankButton.setText("Jack");
        jackRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        jackRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        jackRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        queenRankButton.setText("Queen");

        threeRankButton.setText("3");
        threeRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        threeRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        threeRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        kingRankButton.setText("King");
        kingRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        kingRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        kingRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        heartSuitButton.setText("Heart");
        heartSuitButton.setPreferredSize(new java.awt.Dimension(79, 28));

        eightRankButton.setText("8");
        eightRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        eightRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        eightRankButton.setPreferredSize(new java.awt.Dimension(65, 28));
        eightRankButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                eightRankButtonActionPerformed(evt);
            }
        });

        spadeSuitButton.setText("Spade");
        spadeSuitButton.setPreferredSize(new java.awt.Dimension(79, 28));

        nineRankButton.setText("9");
        nineRankButton.setMaximumSize(new java.awt.Dimension(65, 28));
        nineRankButton.setMinimumSize(new java.awt.Dimension(65, 28));
        nineRankButton.setPreferredSize(new java.awt.Dimension(65, 28));

        javax.swing.GroupLayout suitRankButtonsPanelLayout = new javax.swing.GroupLayout(suitRankButtonsPanel);
        suitRankButtonsPanel.setLayout(suitRankButtonsPanelLayout);
        suitRankButtonsPanelLayout.setHorizontalGroup(
            suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suitRankButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fiveRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jackRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nineRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queenRankButton)
                    .addComponent(aceRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sevenRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kingRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(clubSuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diamondSuitButton)
                    .addComponent(heartSuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spadeSuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        suitRankButtonsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clubSuitButton, diamondSuitButton, heartSuitButton, spadeSuitButton});

        suitRankButtonsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {aceRankButton, eightRankButton, fiveRankButton, fourRankButton, jackRankButton, kingRankButton, nineRankButton, queenRankButton, sevenRankButton, sixRankButton, tenRankButton, threeRankButton, twoRankButton});

        suitRankButtonsPanelLayout.setVerticalGroup(
            suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suitRankButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(suitRankButtonsPanelLayout.createSequentialGroup()
                        .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(suitRankButtonsPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(diamondSuitButton))
                            .addComponent(clubSuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heartSuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spadeSuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(suitRankButtonsPanelLayout.createSequentialGroup()
                        .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twoRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threeRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevenRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eightRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(suitRankButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jackRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queenRankButton)
                            .addComponent(kingRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aceRankButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        suitRankButtonsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {aceRankButton, eightRankButton, fiveRankButton, fourRankButton, jackRankButton, kingRankButton, nineRankButton, queenRankButton, sevenRankButton, sixRankButton, tenRankButton, threeRankButton, twoRankButton});

        CorrectButton.setText("Correct");

        RestartButton.setText("Restart");

        LevelLabel.setText("Level");

        LevelMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red/Black", "Over/Under", "Inside/Outside", "Suit" }));

        WrongButton.setText("Wrong");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CorrectButton)
                        .addGap(18, 18, 18)
                        .addComponent(WrongButton)
                        .addGap(18, 18, 18)
                        .addComponent(RestartButton)
                        .addGap(18, 18, 18)
                        .addComponent(LevelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(LevelLabel)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LevelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RestartButton)
                    .addComponent(WrongButton)
                    .addComponent(CorrectButton)
                    .addComponent(LevelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ResultLabel.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        ResultLabel.setText("Answer");

        CalculateButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        CalculateButton.setText("Calculate");
        CalculateButton.setToolTipText("Click to calculate");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalculateButton)
                    .addComponent(ResultLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(suitRankButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(RankMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SuitMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(suitRankButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SuitMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RankMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AnswerLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setBounds(0, 0, 760, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void RankMenuActionPerformed(java.awt.event.ActionEvent evt)
    {// GEN-FIRST:event_RankMenuActionPerformed
	// TODO add your handling code here:
    }// GEN-LAST:event_RankMenuActionPerformed

    private void eightRankButtonActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_eightRankButtonActionPerformed
    {// GEN-HEADEREND:event_eightRankButtonActionPerformed
	// TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerLabel;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JButton CorrectButton;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JComboBox<String> LevelMenu;
    private javax.swing.JComboBox<String> RankMenu;
    private javax.swing.JButton RestartButton;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JComboBox<String> SuitMenu;
    private javax.swing.JButton WrongButton;
    private javax.swing.JButton aceRankButton;
    private javax.swing.JButton clubSuitButton;
    private DataPanel dataPanel;
    private javax.swing.JButton diamondSuitButton;
    private javax.swing.JButton eightRankButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton fiveRankButton;
    private javax.swing.JButton fourRankButton;
    private javax.swing.JButton heartSuitButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jackRankButton;
    private javax.swing.JButton kingRankButton;
    private javax.swing.JButton nineRankButton;
    private javax.swing.JButton queenRankButton;
    private javax.swing.JButton sevenRankButton;
    private javax.swing.JButton sixRankButton;
    private javax.swing.JButton spadeSuitButton;
    private javax.swing.JPanel suitRankButtonsPanel;
    private javax.swing.JButton tenRankButton;
    private javax.swing.JButton threeRankButton;
    private javax.swing.JButton twoRankButton;
    // End of variables declaration//GEN-END:variables

   
    /* PERSONAL CODE BEGINS HERE    */
    
    
    // returns Answer JLabel
    public JLabel getAnswerLabel()
    {
	return AnswerLabel;
    }

    // returns CalculateButton JButton
    public JButton getCalculateButton()
    {
	return CalculateButton;
    }

    // returns CorrectButton JButton
    public JButton getCorrectButton()
    {
	return CorrectButton;
    }

    // returns LevelLabel JLabel
    public JLabel getLevelLabel()
    {
	return LevelLabel;
    }

    // returns LevelMenu JComboBox
    public JComboBox getLevelMenu()
    {
	return LevelMenu;
    }

    // returns RankMenu JComboBox
    public JComboBox getRankMenu()
    {
	return RankMenu;
    }

    // returns RestartButton JButton
    public JButton getRestartButton()
    {
	return RestartButton;
    }

    // returns ResultLabel JLabel
    public JLabel getResultLabel()
    {
	return ResultLabel;
    }

    // returns SuitMenu JComboBox
    public JComboBox getSuitMenu()
    {
	return SuitMenu;
    }

    // returns WrongButton JButton
    public JButton getWrongButton()
    {
	return WrongButton;
    }

    public JButton getClubSuitButton()
    {
	return clubSuitButton;
    }

    public JButton getDiamondSuitButton()
    {
	return diamondSuitButton;
    }

    public JButton getHeartSuitButton()
    {
	return heartSuitButton;
    }

    public JButton getSpadeSuitButton()
    {
	return spadeSuitButton;
    }

    public JButton getTwoRankButton()
    {
	return twoRankButton;
    }

    public JButton getThreeRankButton()
    {
	return threeRankButton;
    }

    public JButton getFourRankButton()
    {
	return fourRankButton;
    }

    public JButton getFiveRankButton()
    {
	return fiveRankButton;
    }

    public JButton getSixRankButton()
    {
	return sixRankButton;
    }

    public JButton getSevenRankButton()
    {
	return sevenRankButton;
    }

    public JButton getEightRankButton()
    {
	return eightRankButton;
    }

    public JButton getNineRankButton()
    {
	return nineRankButton;
    }

    public JButton getTenRankButton()
    {
	return tenRankButton;
    }

    public JButton getJackRankButton()
    {
	return jackRankButton;
    }

    public JButton getQueenRankButton()
    {
	return queenRankButton;
    }

    public JButton getKingRankButton()
    {
	return kingRankButton;
    }

    public JButton getAceRankButton()
    {
	return aceRankButton;
    }
    
    public JPanel getDataPanel()
    {
	return dataPanel;
    }
    
    public JTable getTable()
    {
	return dataPanel.getDataJTabel();
    }
    
} // end of class
