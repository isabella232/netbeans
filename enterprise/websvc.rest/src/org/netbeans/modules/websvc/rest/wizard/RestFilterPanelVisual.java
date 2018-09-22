/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.websvc.rest.wizard;

import java.util.ArrayList;
import java.util.List;

import org.netbeans.modules.websvc.rest.wizard.HttpMethodsPanel.HttpMethods;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.WizardDescriptor;
import org.openide.util.NbBundle;

/**
 *
 * @author ads
 */
public class RestFilterPanelVisual extends javax.swing.JPanel {
    
    public RestFilterPanelVisual(WizardDescriptor descriptor) {
        initComponents();
        
        httpMethods = new ArrayList<HttpMethodsPanel.HttpMethods>(HttpMethods.values().length);
        httpMethods.add(HttpMethods.OPTIONS);
        httpMethods.add(HttpMethods.GET);
        httpMethods.add(HttpMethods.POST);
        httpMethods.add(HttpMethods.PUT);
        httpMethods.add(HttpMethods.DELETE);
        setMethods();
        
    }
    
    void store( WizardDescriptor descriptor ) {
        descriptor.putProperty(RestFilterPanel.HTTP_METHODS, httpMethods);
        descriptor.putProperty(RestFilterPanel.ORIGIN ,origin.getText().trim());
        descriptor.putProperty(RestFilterPanel.HEADERS ,headers.getText().trim());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLbl = new javax.swing.JLabel();
        originLbl = new javax.swing.JLabel();
        origin = new javax.swing.JTextField();
        methodsLbl = new javax.swing.JLabel();
        methods = new javax.swing.JTextField();
        selectMethodsBtn = new javax.swing.JButton();
        headersLbl = new javax.swing.JLabel();
        headers = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(headerLbl, org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "LBL_Headers")); // NOI18N

        originLbl.setLabelFor(origin);
        org.openide.awt.Mnemonics.setLocalizedText(originLbl, org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "LBL_Origin")); // NOI18N

        origin.setText("*"); // NOI18N

        methodsLbl.setLabelFor(methods);
        org.openide.awt.Mnemonics.setLocalizedText(methodsLbl, org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "LBL_Methods")); // NOI18N

        methods.setEditable(false);

        org.openide.awt.Mnemonics.setLocalizedText(selectMethodsBtn, org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "BTN_Methods")); // NOI18N
        selectMethodsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMethods(evt);
            }
        });

        headersLbl.setLabelFor(headers);
        org.openide.awt.Mnemonics.setLocalizedText(headersLbl, org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "LBL_AllowHeaders")); // NOI18N

        headers.setText("Content-Type"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLbl)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(originLbl)
                        .addGap(18, 18, 18)
                        .addComponent(origin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(methodsLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(methods, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectMethodsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headersLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headers))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originLbl)
                    .addComponent(origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(methodsLbl)
                    .addComponent(methods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectMethodsBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headersLbl)
                    .addComponent(headers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        originLbl.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "ACSN_Origin")); // NOI18N
        originLbl.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "ACSD_Origin")); // NOI18N
        origin.getAccessibleContext().setAccessibleName(originLbl.getAccessibleContext().getAccessibleName());
        origin.getAccessibleContext().setAccessibleDescription(methodsLbl.getAccessibleContext().getAccessibleDescription());
        methodsLbl.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "LBL_AllowMethods")); // NOI18N
        methodsLbl.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "ACSD_AllowMethods")); // NOI18N
        methods.getAccessibleContext().setAccessibleName(methodsLbl.getAccessibleContext().getAccessibleName());
        methods.getAccessibleContext().setAccessibleDescription(methodsLbl.getAccessibleContext().getAccessibleDescription());
        selectMethodsBtn.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "ACSN_SelectMethods")); // NOI18N
        selectMethodsBtn.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "ACSD_SelectMethods")); // NOI18N
        headersLbl.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "ACSN_AllowHeaders")); // NOI18N
        headersLbl.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(RestFilterPanelVisual.class, "ACSD_AllowHeaders")); // NOI18N
        headers.getAccessibleContext().setAccessibleName(headerLbl.getAccessibleContext().getAccessibleName());
        headers.getAccessibleContext().setAccessibleDescription(headerLbl.getAccessibleContext().getAccessibleDescription());
    }// </editor-fold>//GEN-END:initComponents

    private void selectMethods(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMethods
        HttpMethodsPanel panel = new HttpMethodsPanel( httpMethods );
        DialogDescriptor dialogDescriptor = new DialogDescriptor(panel, 
                NbBundle.getMessage(HttpMethodsPanel.class, "TTL_HttpMethods"));    // NOI18N
        DialogDisplayer.getDefault().notify(dialogDescriptor);
        if (NotifyDescriptor.OK_OPTION.equals(dialogDescriptor.getValue())) {
            httpMethods = panel.getSelectedMethods();
            setMethods();
        }
        
    }//GEN-LAST:event_selectMethods

    private void setMethods( ) {
        StringBuilder builder = new StringBuilder();
        for (HttpMethods method : httpMethods) {
            builder.append( method.toString().toUpperCase());
            builder.append(", ");           // NOI18N
        }
        if ( builder.length() >0 ){
            methods.setText(builder.substring( 0, builder.length() -2 ));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLbl;
    private javax.swing.JTextField headers;
    private javax.swing.JLabel headersLbl;
    private javax.swing.JTextField methods;
    private javax.swing.JLabel methodsLbl;
    private javax.swing.JTextField origin;
    private javax.swing.JLabel originLbl;
    private javax.swing.JButton selectMethodsBtn;
    // End of variables declaration//GEN-END:variables
    
    private List<HttpMethods> httpMethods;

}