package Client;

import Server.Frame;
import Server.LogisticData;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Server.UserSession;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Logistics extends javax.swing.JPanel {
    
    Server.Queries qry = new Server.Queries();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    UserSession session = UserSession.getInstance();
    int userID = session.getUserID();
    String userType = session.getUserType();
    
    public void getLogistic(int id) {
    Server.Queries qry = new Server.Queries();
    List<LogisticData> data = qry.getLogisticData(id,"user");


    DefaultTableModel model = (DefaultTableModel) logisticsTable.getModel();
    model.setRowCount(0);
    for (LogisticData item : data) {
        model.addRow(new Object[] {
           item.getProductId(),
           item.getName(),
           item.getType(),
           item.getPrice(),
           item.getDateReceived(),
           item.getDateRelease(),
           item.getEuPoNumber(),
           item.getPoRefNumber(),
           item.getBrand(),
           item.getPDesc(),
           item.getModel(),
           item.getSupplier(),
           item.getQuantity(),
           item.getCustomer(),
           item.getWarranty(),
           item.getWarrantyCustomer()
        });
    }
}
    
    public void clear(){
    addButoon.setEnabled(true);
    brand.setText("");
    clearButton.setEnabled(true);
    customer.setText("");
    dateReceived.setDate(null);
    dateRelease.setDate(null);
    deleteButton.setEnabled(false);
    eu_po.setText("");
    model.setText("");
    po_ref.setText("");
    productDescription.setText("");
    productName.setText("");
    productPrice.setText("");
    productType.setText("");
    quantity.setText("");
    supplier.setText("");
    updateButton.setEnabled(false);
    warranty.setText("");
    warrantyCustomer.setText("");
    }

    public Logistics() {
        initComponents();
        
         if(!session.getUserType().equals("Admin")){
            homeIcon.setVisible(false);
        }
         
         updateButton.setEnabled(false);
         deleteButton.setEnabled(false);
         
         getLogistic(userID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        navigationBarTitle = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        logisticsForm = new javax.swing.JPanel();
        productName = new javax.swing.JTextField();
        productType = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        dateReceived = new com.toedter.calendar.JDateChooser();
        eu_po = new javax.swing.JTextField();
        dateRelease = new com.toedter.calendar.JDateChooser();
        productDescription = new javax.swing.JTextField();
        po_ref = new javax.swing.JTextField();
        supplier = new javax.swing.JTextField();
        warranty = new javax.swing.JTextField();
        customer = new javax.swing.JTextField();
        warrantyCustomer = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        addButoon = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        logisticsTableScrollPanel = new javax.swing.JScrollPane();
        logisticsTable = new javax.swing.JTable();
        logisticUser = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(1365, 696));
        setMinimumSize(new java.awt.Dimension(1365, 696));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/inventory-system-logo.png"))); // NOI18N

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/logout.png"))); // NOI18N
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("Logistics");

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/home.png"))); // NOI18N
        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navigationBarLayout = new javax.swing.GroupLayout(navigationBar);
        navigationBar.setLayout(navigationBarLayout);
        navigationBarLayout.setHorizontalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationBarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(navigationBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeIcon)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(28, 28, 28))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navigationBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        logisticsForm.setBackground(new java.awt.Color(255, 255, 255));
        logisticsForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), null));

        productName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        productType.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        model.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Model", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        brand.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Brand", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        productPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        dateReceived.setBackground(new java.awt.Color(255, 255, 255));
        dateReceived.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Date Received", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        eu_po.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "EU_PO#", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        dateRelease.setBackground(new java.awt.Color(255, 255, 255));
        dateRelease.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Date Release", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        productDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        po_ref.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "PO_REF#", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        supplier.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        warranty.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Warranty", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        customer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        warrantyCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Warranty Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        quantity.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout logisticsFormLayout = new javax.swing.GroupLayout(logisticsForm);
        logisticsForm.setLayout(logisticsFormLayout);
        logisticsFormLayout.setHorizontalGroup(
            logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(eu_po)
                    .addComponent(supplier))
                .addGap(27, 27, 27)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productType, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(po_ref)
                    .addComponent(quantity))
                .addGap(27, 27, 27)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customer)
                    .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(brand))
                .addGap(27, 27, 27)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warranty)
                    .addComponent(dateReceived, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(productDescription))
                .addGap(27, 27, 27)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateRelease, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(model, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(warrantyCustomer))
                .addGap(30, 30, 30))
        );
        logisticsFormLayout.setVerticalGroup(
            logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateRelease, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eu_po, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(po_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warranty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warrantyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        addButoon.setBackground(new java.awt.Color(51, 102, 153));
        addButoon.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        addButoon.setForeground(new java.awt.Color(255, 255, 255));
        addButoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/add.png"))); // NOI18N
        addButoon.setText("ADD");
        addButoon.setBorder(null);
        addButoon.setFocusable(false);
        addButoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButoonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(51, 102, 153));
        deleteButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/delete.png"))); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(null);
        deleteButton.setFocusable(false);

        updateButton.setBackground(new java.awt.Color(51, 102, 153));
        updateButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/edit.png"))); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(null);
        updateButton.setFocusable(false);

        clearButton.setBackground(new java.awt.Color(51, 102, 153));
        clearButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/clear.png"))); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.setFocusable(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        logisticsTable.setBackground(new java.awt.Color(238, 238, 238));
        logisticsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        logisticsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Logistics ID", "Name", "Type", "Price", "Received", "Release", "EU_PO", "PO_REF", "Brand", "Description", "Model", "Supplier", "Quantity", "Customer", "Warranty", "Wnty Customer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logisticsTable.getTableHeader().setReorderingAllowed(false);
        logisticsTableScrollPanel.setViewportView(logisticsTable);
        if (logisticsTable.getColumnModel().getColumnCount() > 0) {
            logisticsTable.getColumnModel().getColumn(0).setResizable(false);
            logisticsTable.getColumnModel().getColumn(1).setResizable(false);
            logisticsTable.getColumnModel().getColumn(2).setResizable(false);
            logisticsTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            logisticsTable.getColumnModel().getColumn(3).setResizable(false);
            logisticsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            logisticsTable.getColumnModel().getColumn(4).setResizable(false);
            logisticsTable.getColumnModel().getColumn(5).setResizable(false);
            logisticsTable.getColumnModel().getColumn(6).setResizable(false);
            logisticsTable.getColumnModel().getColumn(6).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(7).setResizable(false);
            logisticsTable.getColumnModel().getColumn(7).setPreferredWidth(70);
            logisticsTable.getColumnModel().getColumn(8).setResizable(false);
            logisticsTable.getColumnModel().getColumn(8).setPreferredWidth(55);
            logisticsTable.getColumnModel().getColumn(9).setResizable(false);
            logisticsTable.getColumnModel().getColumn(9).setPreferredWidth(90);
            logisticsTable.getColumnModel().getColumn(10).setResizable(false);
            logisticsTable.getColumnModel().getColumn(10).setPreferredWidth(55);
            logisticsTable.getColumnModel().getColumn(11).setResizable(false);
            logisticsTable.getColumnModel().getColumn(11).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(12).setResizable(false);
            logisticsTable.getColumnModel().getColumn(12).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(13).setResizable(false);
            logisticsTable.getColumnModel().getColumn(14).setResizable(false);
            logisticsTable.getColumnModel().getColumn(14).setPreferredWidth(70);
            logisticsTable.getColumnModel().getColumn(15).setResizable(false);
            logisticsTable.getColumnModel().getColumn(15).setPreferredWidth(90);
        }

        logisticUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Logistic User", "Logistics 1" }));
        logisticUser.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logisticsTableScrollPanel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logisticsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButoon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logisticUser, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(logisticUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(logisticsTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logisticsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Dashboard", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_homeIconMouseClicked

<<<<<<< HEAD
    private void addButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButoonActionPerformed
        if(session.getUserType().equals("Admin")){
            JOptionPane.showMessageDialog(null, "You can't add Logistics", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(dateReceived.getDate()==null || dateRelease.getDate()==null||
                brand.getText().equals("")||customer.getText().equals("")||
                eu_po.getText().equals("")||
                model.getText().equals("")||po_ref.getText().equals("")||
                supplier.getText().equals("")||productDescription.getText().equals("")||
                productName.getText().equals("")|| productPrice.getText().equals("") ||
                productType.getText().equals("") ||  quantity.getText().equals("") ||
                warranty.getText().equals("")||  warrantyCustomer.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill out all field.", "Error", JOptionPane.ERROR_MESSAGE);
            }else{

                try{
                    int quantityValue = Integer.parseInt(quantity.getText());
                    try{
                        double price= Double.parseDouble(productPrice.getText());

                        String receive = sdf.format(dateReceived.getDate());
                        String release = sdf.format(dateRelease.getDate());

                        qry.addLogistic(
                        productName.getText(),
                        productType.getText(),
                        price,
                        receive,
                        release,
                        eu_po.getText(),
                        po_ref.getText(),
                        brand.getText(),
                        productDescription.getText(),
                        model.getText(),
                        supplier.getText(),
                        quantityValue,
                        customer.getText(),
                        warranty.getText(),
                        warrantyCustomer.getText(),
                        userID
                        );

                        JOptionPane.showMessageDialog(new JFrame(), "Logistic Added", "Success", JOptionPane.INFORMATION_MESSAGE);
                        getLogistic(userID);
                        clear();

                    }catch(Exception error){
                        JOptionPane.showMessageDialog(null, "Prices must be a decimal or integer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, "Quantity must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_addButoonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed
=======
    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.LoginPage", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked
>>>>>>> dd0d4bf8a57a879ef419d60ead1000b382f927d8

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButoon;
    private javax.swing.JTextField brand;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField customer;
    private com.toedter.calendar.JDateChooser dateReceived;
    private com.toedter.calendar.JDateChooser dateRelease;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField eu_po;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JComboBox<String> logisticUser;
    private javax.swing.JPanel logisticsForm;
    private javax.swing.JTable logisticsTable;
    private javax.swing.JScrollPane logisticsTableScrollPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JTextField model;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JTextField po_ref;
    private javax.swing.JTextField productDescription;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productType;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField supplier;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField warranty;
    private javax.swing.JTextField warrantyCustomer;
    // End of variables declaration//GEN-END:variables
}
