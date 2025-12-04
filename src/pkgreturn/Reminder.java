/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgreturn;

import java.awt.Component;
import java.io.Serializable;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author Thitsar Thway
 */
public class Reminder implements Serializable {

    private int reminderThreshold;
    private int milestone;
    private boolean milestoneReached;
    
//Constructor
    
    public Reminder() {
        this.reminderThreshold = 0;
        this.milestone = 0;
        this.milestoneReached = false;
    }
//Getters and setters

    public int getReminderThreshold() {
        return reminderThreshold;
    }

    public void setReminderThreshold(int reminderThreshold) {
        this.reminderThreshold = reminderThreshold;
    }

    public int getMilestone() {
        return milestone;
    }

    public void setMilestone(int milestone) {
        this.milestone = milestone;
    }

//Methods  
    //Method to show reminder notification
    public void checkReminder(int pendingCount, Component parent) {
        //check against total pending count
        if (pendingCount >= this.getReminderThreshold()) {
            //disable if set to zero
            if (this.getReminderThreshold() != 0) {
                JOptionPane.showMessageDialog(parent, "Your pending count has exceeded your threshold of " + this.getReminderThreshold(), "Reminder", WARNING_MESSAGE);
            }
        }
    }

    public void checkMilestone(int lifetimeCount, Component parent) {
        //check against total lifetime count
        if (lifetimeCount >= this.getMilestone()) {
            //disable if set to zero
            if (this.getMilestone() != 0) {
                milestoneReached = true;
            }
        }

        if (milestoneReached) {
            int dialogResult = JOptionPane.showConfirmDialog(parent, "You have successfully returned " + this.getMilestone() + " items! Would you like to set another milestone?", "Congratulations!", OK_CANCEL_OPTION);
            if (dialogResult == 0) { //clicks 'ok'
                //data validation
                try {
                    milestone = Integer.parseInt(JOptionPane.showInputDialog(parent, "Enter new milestone"));
                    this.setMilestone(milestone);
                    milestoneReached = false;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(parent, "Please enter an integer");
                }
            } else { //clicks 'cancel'
                this.setMilestone(0);
                milestoneReached = false;

            }

        }
    }

}
