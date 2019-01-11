
import javax.swing.JTable;


public class DataPanel extends javax.swing.JPanel
{

    /** Creates new form DataPanel */
    public DataPanel()
    {
	initComponents();
	
	
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataJTabel = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Game Data"));

        dataJTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"Total", "_Total"},
                {"Reds", "_Reds"},
                {"Blacks", "_Blacks"},
                {"Clubs", "_Clubs"},
                {"Diamonds", "_Diamonds"},
                {"Hearts", "_Hearts"},
                {"Spades", "_Spades"},
                {"Current Rank", "_CurrentRank"},
                {"Chance (%)", "_chance"},
                {"extra1", "_extra1"}
            },
            new String []
            {
                "Name", "Remaining"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dataJTabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataJTabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    
    
   
    // returns access to the data table
    public JTable getDataJTabel()
    {
	return dataJTabel;
    }
    
    // Used to save time and typing to set the text of the desired row in the data tabel
    public void setData(String newData, int row)
    {
	dataJTabel.setValueAt("newData", row, 1);
    }


}
