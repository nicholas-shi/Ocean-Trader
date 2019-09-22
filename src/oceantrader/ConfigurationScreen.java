package oceantrader;

import javax.swing.*;
import java.awt.*;

public class ConfigurationScreen {

    protected static JPanel panel;
    protected static GridBagLayout gbPanel;
    private static GridBagConstraints constraints;
    protected static JButton startButton;
    protected static JTextField nameField;
    protected static JComboBox difficultyComboBox;
    protected static JTextField pointsRemaining;
    protected static int points = 16;

    protected static JSpinner pilotSpinner;
    protected static JSpinner fighterSpinner;
    protected static JSpinner traderSpinner;
    protected static JSpinner engineerSpinner;

    public ConfigurationScreen() {
        panel = new JPanel();
        gbPanel = new GridBagLayout();
        constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 10, 5, 10);
        panel.setLayout(gbPanel);
        panel.setSize(800, 600);
        screenSetup();
    }

    private static void screenSetup() {
        explorerName();
        difficultyChoice();
        skillPoints();
    }

    private static void explorerName() {
        JLabel nameLabel = new JLabel("Explorer Name:");
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 9;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(nameLabel, constraints );
        panel.add(nameLabel);

        nameField = new JTextField();
        constraints.gridx = 10;
        constraints.gridy = 1;
        constraints.gridwidth = 9;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(nameField, constraints );
        panel.add(nameField);
    }

    private static void difficultyChoice() {
        JLabel difficultyLabel = new JLabel("Difficulty:");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 7;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(difficultyLabel, constraints );
        panel.add(difficultyLabel);

        String[] difficultyComboData = { "Easy", "Medium", "Hard" };
        difficultyComboBox = new JComboBox(difficultyComboData);
        constraints.gridx = 8;
        constraints.gridy = 2;
        constraints.gridwidth = 11;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(difficultyComboBox, constraints );
        panel.add(difficultyComboBox);
    }

    private static void skillPoints() {
        //updateSpinner();
        skillPointsLabel();
        SpinnerGroup group = new SpinnerGroup(16);

        pilotPointsSection(group);
        fighterPointsSection(group);
        traderPointsSection(group);
        engineerPointsSection(group);

        startButton();
    }

    private static void skillPointsLabel() {
        JLabel skillPointLabel = new JLabel("Skill Points:");
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 7;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(skillPointLabel, constraints );
        panel.add(skillPointLabel);

        pointsRemaining = new JTextField(points + " points remaining.");
        pointsRemaining.setBorder(BorderFactory.createEmptyBorder());
        //pointsRemaining.setEditable(false);
        constraints.gridx = 7;
        constraints.gridy = 4;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(pointsRemaining, constraints);
        panel.add(pointsRemaining);
    }

    private static void pilotPointsSection(SpinnerGroup group) {
        JLabel pilotLabel = new JLabel("Seamanship:");
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(pilotLabel, constraints );
        panel.add(pilotLabel);

        pilotSpinner = new JSpinner(group.createGroupModel(0, 0, 10, 1));
        //pilotSpinner.setModel(spinModel0);
        constraints.gridx = 7;
        constraints.gridy = 6;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(pilotSpinner, constraints );
        panel.add(pilotSpinner);
    }

    private static void fighterPointsSection(SpinnerGroup group) {
        JLabel fighterLabel = new JLabel( "Battle Ability:"  );
        constraints.gridx = 1;
        constraints.gridy = 8;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints( fighterLabel, constraints );
        panel.add(fighterLabel);

        fighterSpinner = new JSpinner(group.createGroupModel(0, 0, 10, 1));
        //fighterSpinner.setModel(spinModel1);
        constraints.gridx = 7;
        constraints.gridy = 8;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(fighterSpinner, constraints);
        panel.add(fighterSpinner);
    }

    private static void traderPointsSection(SpinnerGroup group) {
        JLabel traderLabel = new JLabel( "Tradesmanship:"  );
        constraints.gridx = 1;
        constraints.gridy = 10;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints( traderLabel, constraints );
        panel.add(traderLabel);

        traderSpinner = new JSpinner(group.createGroupModel(0, 0, 10, 1));
        //traderSpinner.setModel(spinModel2);
        constraints.gridx = 7;
        constraints.gridy = 10;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(traderSpinner, constraints);
        panel.add(traderSpinner);
    }

    private static void engineerPointsSection(SpinnerGroup group) {
        JLabel engineerLabel = new JLabel( "Workmanship:"  );
        constraints.gridx = 1;
        constraints.gridy = 12;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(engineerLabel, constraints );
        panel.add(engineerLabel);

        engineerSpinner = new JSpinner(group.createGroupModel(0, 0, 10, 1));
        //engineerSpinner.setModel(spinModel3);
        constraints.gridx = 7;
        constraints.gridy = 12;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.NORTH;
        gbPanel.setConstraints(engineerSpinner, constraints);
        panel.add(engineerSpinner);
    }

    private static void startButton() {
        startButton = new JButton( "Embark"  );
        constraints.gridx = 7;
        constraints.gridy = 15;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.SOUTH;
        gbPanel.setConstraints(startButton, constraints);
        panel.add(startButton);
    }
}