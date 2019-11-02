package oceantrader;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;
import java.awt.CardLayout;

public class EncounterFrame extends JFrame {

    private JLabel oppHPLbl;
    private JProgressBar oppHealthBar;
    private JLabel oppLabel;
    private JPanel oppPanel;
    private JLabel oppSaysLbl;
    private JLabel youHPLbl;
    private JProgressBar youHealthBar;
    private JLabel youLabel;
    private JPanel youImage;
    private JPanel oppImage;

    private JPanel banditPanel;
    private JPanel policePanel;
    private JPanel traderPanel;

    private CardLayout card;

    public EncounterFrame() {
        initGUI();
    }

    private void initGUI() {
        youLabel = new JLabel();
        oppLabel = new JLabel();
        youHPLbl = new JLabel();
        oppHPLbl = new JLabel();
        youHealthBar = new JProgressBar();
        oppHealthBar = new JProgressBar();
        oppSaysLbl = new JLabel();
        oppPanel = new JPanel(); // this is set to encounter
        youImage = new JPanel();
        oppImage = new JPanel();

        banditPanel = new BanditEncounter();
        policePanel = new JPanel();
        traderPanel = new JPanel();

        card = new CardLayout();
        oppPanel.setLayout(card);

        oppPanel.add(banditPanel, "bandit");
        oppPanel.add(policePanel, "police");
        oppPanel.add(traderPanel, "trader");

        doNotTouchlol();
    }

    private void doNotTouchlol() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encounter!");
        setName("Encounter"); // NOI18N

        youLabel.setText("You:");

        oppLabel.setText("Opponent:");

        youHPLbl.setText("Health:");

        oppHPLbl.setText("Health:");

        oppSaysLbl.setText("Opponent says . . .");

        oppPanel.setLayout(new java.awt.CardLayout());

        youImage.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout youImageLayout = new javax.swing.GroupLayout(youImage);
        youImage.setLayout(youImageLayout);
        youImageLayout.setHorizontalGroup(
                youImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 75, Short.MAX_VALUE)
        );
        youImageLayout.setVerticalGroup(
                youImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 75, Short.MAX_VALUE)
        );

        oppImage.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout oppImageLayout = new javax.swing.GroupLayout(oppImage);
        oppImage.setLayout(oppImageLayout);
        oppImageLayout.setHorizontalGroup(
                oppImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 75, Short.MAX_VALUE)
        );
        oppImageLayout.setVerticalGroup(
                oppImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(oppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(youHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(youHPLbl)
                                                .addGap(93, 93, 93)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(oppHPLbl)
                                        .addComponent(oppHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(154, 154, 154)
                                                .addComponent(oppSaysLbl))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(youImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(youLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(oppImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oppLabel))
                                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(oppLabel)
                                        .addComponent(youLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(youImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oppImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(youHPLbl)
                                        .addComponent(oppHPLbl))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(youHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oppHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(oppSaysLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oppPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    protected void setOppPanel(int selection) {
        if (selection == 2) {
            CardLayout temp = (CardLayout) oppPanel.getLayout();
            temp.show(oppPanel, "bandit");
        }
    }
}