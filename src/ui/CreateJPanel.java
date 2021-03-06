/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarHistory;

/**
 *
 * @author Dell
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
        CarHistory history;
    public CreateJPanel(CarHistory history) {
        initComponents();
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblCreateTitle = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModelNo = new javax.swing.JLabel();
        lblMfgYear = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblMaintCertiDate = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblAvailibility = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtModelNo = new javax.swing.JTextField();
        txtMfgYear = new javax.swing.JTextField();
        txtSeatNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jDateChooserMaintCerti = new com.toedter.calendar.JDateChooser();
        jAvailableBox = new javax.swing.JComboBox<>();
        lblUnique = new javax.swing.JLabel();

        lblCreateTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCreateTitle.setText("Add New Car");

        lblSerialNo.setText("Serial No:");

        lblBrand.setText("Brand Name:");

        lblModelNo.setText("Model No:");

        lblMfgYear.setText("Manufacturing Year:");

        lblSeats.setText("No. of Seats:");

        lblMaintCertiDate.setText("Maintenance Certificate Date:");

        lblCity.setText("City:");

        lblAvailibility.setText("Availability:");

        txtSerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerialNoKeyReleased(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jAvailableBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(lblCreateTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblMfgYear)
                                            .addComponent(lblSeats)
                                            .addComponent(lblModelNo)
                                            .addComponent(lblBrand)
                                            .addComponent(lblSerialNo))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblMaintCertiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addComponent(lblAvailibility))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtSeatNo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtMfgYear, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtModelNo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtSerialNo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnSave))
                            .addComponent(jDateChooserMaintCerti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAvailableBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(lblUnique)))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnique))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMfgYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMfgYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaintCertiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserMaintCerti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailibility)
                    .addComponent(jAvailableBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btnSave)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int serialNo = Integer.parseInt(txtSerialNo.getText());
        List<Car> list = history.getCarList().stream().filter(a -> a.getSerialNo()== serialNo).collect(Collectors.toList());
        if(!list.isEmpty()){
            JOptionPane.showMessageDialog(this, "Serial No. already exists. Please enter unique Serial No.");
        }
        else if(txtSerialNo.getText().isEmpty())
                 {
           JOptionPane.showMessageDialog(this, "Serial No. is mandatory.");
       }
         else if(txtBrand.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Brand No. is mandatory.");
         }
         else if(txtModelNo.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Model No. is mandatory.");
                 }
         else if(txtSeatNo.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Seat No. is mandatory.");
                 }
         
         else{
        
        String brand = txtBrand.getText();
        String modelNo = txtModelNo.getText();
        String manufacturing_date = txtMfgYear.getText();
        int noOfSeats = Integer.parseInt(txtSeatNo.getText());
        String city = txtCity.getText();
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
        String maintCertiExiryDate = date.format(jDateChooserMaintCerti.getDate());
        String selectedValue = jAvailableBox.getSelectedItem().toString();
        Car c = new Car();
       
       c.setSerialNo(serialNo);
       c.setBrand(brand);
       c.setModelNo(modelNo);
       c.setManufacturing_date(LocalDate.parse(manufacturing_date));
       c.setNumOfSeats(noOfSeats);
       c.setCity(city); 
       c.setMaintCertiExpiryDate(LocalDate.parse(maintCertiExiryDate));
       c.setAvailability(selectedValue);
       history.addNewCars(c);
        
        JOptionPane.showMessageDialog(this, "New Car Details Successfully Added.");
        
        //Reset text fields to empty when Save button is clicked
        txtSerialNo.setText("");
        txtBrand.setText("");
        txtModelNo.setText("");
        jDateChooserMaintCerti.setDate(null);
        txtMfgYear.setText("");
        txtSeatNo.setText("");
        txtCity.setText("");
  // }
         }
    }                                       

    private void txtSerialNoKeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        
    }                                       
/**/

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jAvailableBox;
    private com.toedter.calendar.JDateChooser jDateChooserMaintCerti;
    private javax.swing.JLabel lblAvailibility;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCreateTitle;
    private javax.swing.JLabel lblMaintCertiDate;
    private javax.swing.JLabel lblMfgYear;
    private javax.swing.JLabel lblModelNo;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblUnique;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMfgYear;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtSeatNo;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration                   
}
