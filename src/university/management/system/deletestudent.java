package university.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class deletestudent extends JFrame {
    private JTextField StudentIDField;
    private JTextArea resultArea;

    public deletestudent() {
        setTitle("Delete student by ID");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        StudentIDField = new JTextField();
        StudentIDField.setBounds(20, 20, 300, 30);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(20, 60, 100, 30);
        deleteButton.addActionListener(e -> deleteRecord());

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBounds(20, 100, 360, 150);

        add(StudentIDField);
        add(deleteButton);
        add(scrollPane);
    }

    private void deleteRecord() {
        String jdbcUrl = "jdbc:mysql:///universitymanagementsystem";
        String username = "root";
        String password = "Sidhant@123";

        try (Connection cn = DriverManager.getConnection(jdbcUrl, username, password);
             Statement smt = cn.createStatement()) {

            String rollno = StudentIDField.getText();
            String q = "SELECT * FROM student WHERE rollno='" + rollno + "'";
            ResultSet rs = smt.executeQuery(q);

            if (rs.next()) {
                String recordInfo = String.format("Name: %s\nFather's Name: %s\nroll: %s\nDOB: %s\nAddress: %s\nSure To Delete Above Record Yes/No?",
                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));

                int dialogResult = JOptionPane.showConfirmDialog(this, recordInfo, "Confirm Deletion",
                        JOptionPane.YES_NO_OPTION);

                if (dialogResult == JOptionPane.YES_OPTION) {
                    q = "DELETE FROM student WHERE rollno='" + rollno + "'";
                    smt.executeUpdate(q);
                    resultArea.setText("Record Deleted...");
                } else {
                    resultArea.setText("");
                }
            } else {
                resultArea.setText("Record Not Found...");
            }

        } catch (Exception e) {
            resultArea.setText(e.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new deletestudent().setVisible(true));
    }
}
