package views;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainView extends JFrame {

    JFrame frame = new JFrame();
    JTable table;
    JScrollPane scrollPane;
    JButton newButton = new JButton("Új felvétele");
    JButton saveButton = new JButton("Mentés");
    JButton deleteButton = new JButton("Törlés");
    JButton exitButton = new JButton("Kilépés");

    MainView(String userID) {

        String[] title = { "id", "Név", "Márka", "Ár" };
        Object[][] details = {
                { 1, "Nagy Peter", "Szolnok", 67 },
                { 2, "Nagy Lajos", "Szolnok", 27 }
        };

        table = new JTable(details, title);
        table.setFont(new Font("Serif", Font.BOLD, 16));
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 50, 600, 400);

        newButton.setBounds(650, 100, 100, 30);
        this.newButton.addActionListener(event -> newButtonAction());

        saveButton.setBounds(650, 150, 100, 30);
        this.saveButton.addActionListener(event -> saveButtonAction());

        deleteButton.setBounds(650, 200, 100, 30);
        this.deleteButton.addActionListener(event -> deleteButtonAction());

        exitButton.setBounds(650, 250, 100, 30);
        this.exitButton.addActionListener(event -> exitButtonAction());

        add(scrollPane);
        add(newButton);
        add(saveButton);
        add(deleteButton);
        add(exitButton);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

    }

    // private void deleteButtonAction(java.awt.event.MouseEvent evt) {
    // // int column = table.getColumnModel().getColumnIndex(evt.getX());
    // // int row = evt.getY() / table.getRowHeight();

    // // if (row < table.getRowCount() && row >= 0 && column <
    // table.getColumnCount()
    // // && column >= 0) {
    // // Object rowValue = table.getValueAt(row, column);
    // // DefaultTableModel tableModel = (DefaultTableModel) this.table.getModel();
    // // int[] selectedRows = table.getSelectedRows();
    // // for (int i = 0; i < selectedRows.length; i++)
    // // tableModel.removeRow(selectedRows[i]);
    // // }
    // }

    private Object deleteButtonAction() {
        return null;
    }

    private void newButtonAction() {

    }

    private Object saveButtonAction() {
        return null;
    }

    public void exitButtonAction() {
        System.exit(0);
    }
}
