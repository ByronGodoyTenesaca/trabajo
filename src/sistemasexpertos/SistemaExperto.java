package sistemasexpertos;

import javax.swing.JOptionPane;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;



public class SistemaExperto extends javax.swing.JFrame {

  
  private Environment environment; 
  private String pal="";
    
    public SistemaExperto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtE = new javax.swing.JRadioButton();
        rbtnI = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbtnS = new javax.swing.JRadioButton();
        ebtnN = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbtnT = new javax.swing.JRadioButton();
        rbtnF = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbtnJ = new javax.swing.JRadioButton();
        rbtnP = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Test De Personalidad");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("1. Estás completamente agotado, la semana fue larga y no muy exitosa. ¿Cómo pasarás el fin de semana?");

        buttonGroup1.add(rbtE);
        rbtE.setText("Llamo a mis amigos para saber qué planes tienen. He oído que han abierto un nuevo restaurante / ha llegado al cine una comedia increíble / hay descuentos del club de paintball. Tenemos que salir todos juntos");
        rbtE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnI);
        rbtnI.setText("Configuro el teléfono en el modo \"No molestar\" y me quedo en casa. Me pongo a ver un nuevo episodio de mi serie favorita, hago un rompecabezas, me tumbo en la bañera con un libro");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("2. ¿Con cuál de estas dos definiciones te sientes más identificado?");

        buttonGroup2.add(rbtnS);
        rbtnS.setText("Lo más importante para mí es lo que está sucediendo en el aquí y ahora. Me baso en la situación real de las cosas, prestando atención a los detalles");

        buttonGroup2.add(ebtnN);
        ebtnN.setText("Los datos son algo aburrido. Me gusta soñar e inventar guiones de acontecimientos futuros. Confío más en mi intuición más que en algunos datos.");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("3. Una empresa competidora de aquella en la que trabajas intenta ficharte. Tienes dudas: allí pagan mucho más, pero aquí cuentas con un excelente equipo y, además, el jefe del departamento dio a entender que te ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("recomendaría a la dirección antes de jubilarse. ¿Cómo tomarías la decisión?");

        buttonGroup3.add(rbtnT);
        rbtnT.setText("Estudiaré toda la información disponible de la empresa competidora, consultaré con un amigo especialista en Recursos Humanos, pintaré una tabla con \"pros y contras\". En estos casos, es muy importante evaluarlo todo y ponderarlo con seriedad");

        buttonGroup3.add(rbtnF);
        rbtnF.setText("Escucharé mis propios sentimientos y sensaciones. Siempre trato de seguir lo que me dicta el corazón");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("4. Para la boda de unos amigos muy cercanos quedan 2 semanas. ¿Cómo va la preparación?");

        buttonGroup4.add(rbtnJ);
        rbtnJ.setText("Hace un mes elegí al saxofonista que interpretará un popurrí de canciones de nuestra etapa escolar / preparé una presentación con fotos de la pareja, desde que se conocieron / compuse un poema / planché el traje ");

        buttonGroup4.add(rbtnP);
        rbtnP.setText("¿Para qué prepararse? Voy a divertirme y disfrutar de la fiesta e improvisaré un brindis hablando desde el corazón. Todo lo mejor ocurre espontáneamente");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Evaluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Apellido:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento");

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtApellidos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtDia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Dia:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("# Mes");

        txtMes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Año");

        txtAnio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(663, 663, 663)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ebtnN)
                            .addComponent(rbtE)
                            .addComponent(jLabel2)
                            .addComponent(rbtnI)
                            .addComponent(jLabel3)
                            .addComponent(rbtnS)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addComponent(rbtnF)
                            .addComponent(rbtnT)
                            .addComponent(jLabel6)
                            .addComponent(rbtnP)
                            .addComponent(rbtnJ)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(576, 576, 576)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(rbtE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnS)
                .addGap(8, 8, 8)
                .addComponent(ebtnN)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnT)
                .addGap(8, 8, 8)
                .addComponent(rbtnF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnJ)
                .addGap(8, 8, 8)
                .addComponent(rbtnP)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEActionPerformed
        
    }//GEN-LAST:event_rbtEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(rbtE.isSelected()){
            generarPalabra('e');
        }else{
            generarPalabra('i');
        }
        
        if(rbtnS.isSelected()){
            generarPalabra('s');
        }else{
            generarPalabra('n');
        }
        if(rbtnT.isSelected()){
            generarPalabra('t');
        }else{
            generarPalabra('f');
        }
        
        if(rbtnJ.isSelected()){
            generarPalabra('j');
        }else{
            generarPalabra('p');
        }
    
        crearAssert();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void crearAssert(){
        try {
            System.out.println(pal);
            environment=new Environment();
            environment.load("BaseTemplates.clp");
            environment.reset();
            boolean v=environment.loadFacts("BaseHechos.clp");
           
            
            String asert="(assert (entrada (res \""+pal+"\")))";
            System.out.println(asert);
            String persona="(assert (Persona (nombre \""+txtNombre.getText()+"\") (apellido \""+txtApellidos.getText()+"\") (dia "+Integer.parseInt(txtDia.getText())+") (mes "+Integer.parseInt(txtMes.getText())+") (anio "+Integer.parseInt(txtAnio.getText())+")))";
            
            environment.eval(asert);
            environment.eval(persona);
            environment.run();
            
            String busqueda="(find-all-facts ((?f resultado)) TRUE)";
            MultifieldValue mv= (MultifieldValue) environment.eval(busqueda);
            if(mv.size()>0){
                FactAddressValue fv= (FactAddressValue) mv.get(0);
                String nombre=fv.getSlotValue("nombre").toString();
                String tipo=fv.getSlotValue("tipo").toString();
                int edad=Integer.parseInt(fv.getSlotValue("edad").toString());
                
                String res="los resultados son: " +nombre+" tiene una personalidad de "+tipo+" con edad "+edad;
                System.out.println(res);
                JOptionPane.showMessageDialog(this, res);
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    public void generarPalabra(char l){
        pal=pal+l;
    }

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaExperto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton ebtnN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbtE;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnI;
    private javax.swing.JRadioButton rbtnJ;
    private javax.swing.JRadioButton rbtnP;
    private javax.swing.JRadioButton rbtnS;
    private javax.swing.JRadioButton rbtnT;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
