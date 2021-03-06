package conversoradn.graphics;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import conversoradn.logic.mainlogic.*;
import conversoradn.logic.jframelogic.*;
import java.io.Serializable;

/**
 * Clase principal de la ventana
 * @author SGS-J
 */
public class Window extends javax.swing.JFrame implements Serializable{

    private static final long serialVersionUID = 101L;

    /**
     * Verifica si la tecla retroceso esta siendo presionada, en ese caso
     * evita que el metodo <code>verifyCodon</code> se ejecute.
     */
    private boolean isDeleting = false;
    /**
     * Verifica si una tecla invalida no fue presionada siempre y cuando el
     * metodo <code>verifyCodon</code> no haya puesto un espacio.
     */
    private boolean invalidKeyTyped = false;
    /**
     * Verifica si el texto inicial del <code>copyTextField</code> fue borrado
     */
    private boolean textFieldTextErased = false;
   
    private String empty_message = "";
    private final String errorMessageTextArea = "Por favor escribe una cadena de ADN en el area de texto.";
    private final String errorMessageTextField = "Por favor copia una cadena de ADN en el campo de texto.";
    private final String defaultMessageTextField = "Copia la cadena de ADN aqui...";
    private final String copyFailedLabelMessage = "Texto copiado invalido!";

    // ----- JComponent variables -----
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton btnCopyString;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReplicate;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnTranscribe;
    private javax.swing.JButton btnTranslate;
    private javax.swing.JButton btnTyperString;
    private javax.swing.JPanel canvas;
    private javax.swing.JLabel copyFailedLabel;
    private javax.swing.JTextField copyTextField;
    private javax.swing.JPanel copyTextFieldPanel;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JScrollPane displayAreaScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel rightBtnsPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextArea typerArea;
    private javax.swing.JScrollPane typerAreaScroll;
    private javax.swing.JPanel typerPanel;
    // End of variables declaration//GEN-END:variables

    public Window() {
        initComponents();
        initWindow();
    }

    // ***** CODIGO GENERADOO POR NETBEANS *****
    //    Por favor por el momento NO TOCAR!!!  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        typerPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        btnReplicate = new javax.swing.JButton();
        btnTranscribe = new javax.swing.JButton();
        btnTranslate = new javax.swing.JButton();
        displayAreaScroll = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        copyTextFieldPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        copyTextField = new javax.swing.JTextField();
        copyFailedLabel = new javax.swing.JLabel();
        typerAreaScroll = new javax.swing.JScrollPane();
        typerArea = new javax.swing.JTextArea();
        canvas = new javax.swing.JPanel();
        defaultPanel = new javax.swing.JPanel();
        btnCopyString = new javax.swing.JButton();
        btnTyperString = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rightBtnsPanel = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        typerPanel.setLayout(new java.awt.GridLayout(3, 1));

        topPanel.setLayout(new javax.swing.OverlayLayout(topPanel));
        typerPanel.add(topPanel);

        ButtonPanel.setLayout(new java.awt.GridBagLayout());

        btnReplicate.setBackground(new java.awt.Color(51, 255, 51));
        btnReplicate.setText("Replicar");
        btnReplicate.setMaximumSize(new java.awt.Dimension(120, 50));
        btnReplicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplicateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 15.0;
        ButtonPanel.add(btnReplicate, gridBagConstraints);

        btnTranscribe.setBackground(new java.awt.Color(51, 255, 51));
        btnTranscribe.setText("Transcribir");
        btnTranscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscribeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 15.0;
        ButtonPanel.add(btnTranscribe, gridBagConstraints);

        btnTranslate.setBackground(new java.awt.Color(51, 255, 51));
        btnTranslate.setText("Traducir");
        btnTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranslateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 15.0;
        ButtonPanel.add(btnTranslate, gridBagConstraints);

        typerPanel.add(ButtonPanel);

        displayArea.setEditable(false);
        displayArea.setColumns(20);
        displayArea.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        displayArea.setRows(5);
        displayAreaScroll.setViewportView(displayArea);

        typerPanel.add(displayAreaScroll);

        copyTextFieldPanel.setLayout(new java.awt.GridLayout(3, 1));
        copyTextFieldPanel.add(jLabel5);

        copyTextField.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        copyTextField.setPreferredSize(new java.awt.Dimension(160, 25));
        copyTextField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                copyTextFieldAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        copyTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                copyTextFieldFocusLost(evt);
            }
        });
        copyTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                copyTextFieldMousePressed(evt);
            }
        });
        copyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                copyTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                copyTextFieldKeyTyped(evt);
            }
        });
        copyTextFieldPanel.add(copyTextField);

        copyFailedLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        copyFailedLabel.setForeground(new java.awt.Color(153, 0, 0));
        copyFailedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyTextFieldPanel.add(copyFailedLabel);

        typerArea.setColumns(20);
        typerArea.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        typerArea.setRows(5);
        typerArea.setToolTipText("");
        typerArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                typerAreaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        typerArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typerAreaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                typerAreaKeyTyped(evt);
            }
        });
        typerAreaScroll.setViewportView(typerArea);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADN-Conversor");
        setMinimumSize(new java.awt.Dimension(700, 420));

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setLayout(new javax.swing.BoxLayout(canvas, javax.swing.BoxLayout.LINE_AXIS));

        defaultPanel.setLayout(new java.awt.GridBagLayout());

        btnCopyString.setBackground(new java.awt.Color(255, 255, 255));
        btnCopyString.setForeground(new java.awt.Color(0, 0, 0));
        btnCopyString.setText("Copiar una cadena de ADN");
        btnCopyString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyStringActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        defaultPanel.add(btnCopyString, gridBagConstraints);

        btnTyperString.setBackground(new java.awt.Color(255, 255, 255));
        btnTyperString.setForeground(new java.awt.Color(0, 0, 0));
        btnTyperString.setText("Crear mi propia cadena de ADN");
        btnTyperString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTyperStringActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        defaultPanel.add(btnTyperString, gridBagConstraints);

        jLabel2.setText("¿Que quieres hacer?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        defaultPanel.add(jLabel2, gridBagConstraints);

        canvas.add(defaultPanel);

        getContentPane().add(canvas, java.awt.BorderLayout.CENTER);

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setPreferredSize(new java.awt.Dimension(20, 20));
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setPreferredSize(new java.awt.Dimension(20, 20));
        getContentPane().add(jLabel3, java.awt.BorderLayout.LINE_START);

        jLabel4.setPreferredSize(new java.awt.Dimension(20, 20));
        getContentPane().add(jLabel4, java.awt.BorderLayout.PAGE_END);

        rightBtnsPanel.setPreferredSize(new java.awt.Dimension(60, 80));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\Santiago\\ADN Conversor\\resources\\images\\garbage_icon.png")); // NOI18N
        btnDelete.setPreferredSize(new java.awt.Dimension(50, 50));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        rightBtnsPanel.add(btnDelete);

        btnReturn.setBackground(new java.awt.Color(255, 255, 255));
        btnReturn.setForeground(new java.awt.Color(0, 0, 0));
        btnReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\Santiago\\ADN Conversor\\resources\\images\\return_icon.png")); // NOI18N
        btnReturn.setPreferredSize(new java.awt.Dimension(50, 50));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        rightBtnsPanel.add(btnReturn);

        getContentPane().add(rightBtnsPanel, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initWindow() {
        configureComps();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void configureComps() {
        configureTextsArea();
        initPanels();
        adjustButtonsIcons();
    }

    private void configureTextsArea() {
        typerArea.setLineWrap(true);
        unableTextAreaCopy();
        displayArea.setLineWrap(true);
    }

    private void unableTextAreaCopy() {
        InputMap keyMap = typerArea.getInputMap(JComponent.WHEN_FOCUSED);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }

    private void initPanels() {
        rightBtnsPanel.setVisible(false);
        canvas.add(typerPanel);
        // Añadimos componentes al Top Panel 
        topPanel.add(typerAreaScroll);
        topPanel.add(copyTextFieldPanel);
        typerAreaScroll.setVisible(false);
        copyTextFieldPanel.setVisible(false);
        typerPanel.setVisible(false);
    }

    private void adjustButtonsIcons() {
        adjustDeleteButtonIcon();
        adjustReturnButtonIcon();
    }

    private void adjustDeleteButtonIcon() {
        Image converter = getButtonDeleteBaseIconImage()
                .getScaledInstance(
                        btnDelete.getWidth() - 10,
                        btnDelete.getHeight() - 10,
                        Image.SCALE_SMOOTH);
        ImageIcon iconConverted = new ImageIcon(converter);
        btnDelete.setIcon(iconConverted);
    }

    private void adjustReturnButtonIcon() {
        Image converter = getButtonReturnBaseIconImage()
                .getScaledInstance(
                        btnReturn.getWidth() - 10,
                        btnReturn.getHeight() - 10,
                        Image.SCALE_SMOOTH);
        ImageIcon iconConverted = new ImageIcon(converter);
        btnReturn.setIcon(iconConverted);
    }

    private Image getButtonDeleteBaseIconImage() {
        ImageIcon baseIcon = (ImageIcon) btnDelete.getIcon();
        return baseIcon.getImage();
    }

    private Image getButtonReturnBaseIconImage() {
        ImageIcon baseIcon = (ImageIcon) btnReturn.getIcon();
        return baseIcon.getImage();
    }

    /**
     * Retorna <code>true</code> si el texto del textArea o del textField  
     * no contiene una cadena de texto "<code>Codon</code>" y muestra un JOptionPane
     * para reportar el error.
     *
     * @return true si los componentes no tienen texto
     */
    private boolean textEmpty() {
        boolean isEmpty = typerArea.getText().isEmpty() && copyTextField.getText().isEmpty();
        if (isEmpty) {
            JOptionPane.showMessageDialog(null, empty_message, "", JOptionPane.WARNING_MESSAGE);
        }
        return isEmpty;
    }

    private void btnReplicateActionPerformed(java.awt.event.ActionEvent evt) {
        if (!textEmpty()) {
            displayArea.setText(parseReplication().toString());
        }
    }

    private void btnTranscribeActionPerformed(java.awt.event.ActionEvent evt) {
        if (!textEmpty()) {
            displayArea.setText(parseTransciption().toString());
        }
    }

    private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {
        if (!textEmpty()) {
            displayArea.setText(parseTranslation().toString());
        }
    }
    
    private DNA parseReplication() {
        NucleicAcid dnaReplicated = DNA.parse(getTextOfAvaliableFields());
        return (DNA) dnaReplicated.replicate();
    }

    private RNA parseTransciption() {
        DNA dnaTranscribed = DNA.parse(getTextOfAvaliableFields());
        return (RNA) dnaTranscribed.transcribe();
    }

    private GeneticCode parseTranslation() {
        return new GeneticCode(parseTransciption());
    }

    private String getTextOfAvaliableFields (){
        String textOfComponents = "";
        if(typerAreaScroll.isVisible()){
            textOfComponents = typerArea.getText().replace(" ", "");
        }
        else if(copyTextFieldPanel.isVisible()){
            textOfComponents = copyTextField.getText().replace(" ", "");
        }
        return textOfComponents;
    }

    private void typerAreaKeyTyped(java.awt.event.KeyEvent evt) {
        CodonTyper.verifyLetters(evt.getKeyChar(), evt);
        CodonTyper.verifyLowerCase(evt);
        if (!isDeleting && !invalidKeyTyped) {
            CodonTyper.verifyCodon(typerArea.getText(), typerArea);
        }
    }

    // Previene la escritura de teclas invalidas y verifica si se presiona la tecla retroceso
    private void typerAreaKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
            invalidKeyTyped = true;
        } else {
            invalidKeyTyped = !CodonTyper.charsValid() && isDeleting;
        }
        isDeleting = evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE;
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        typerArea.setText("");
        copyTextField.setText("");
        displayArea.setText("");
    }

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {
        if (typerAreaScroll.isVisible()) {
            typerAreaScroll.setVisible(false);
            typerArea.setText("");
        } else {
            copyTextFieldPanel.setVisible(false);
            copyTextField.setText("");
        }
        typerPanel.setVisible(false);
        rightBtnsPanel.setVisible(false);
        displayArea.setText("");
        defaultPanel.setVisible(true);
    }

    
    private void btnTyperStringActionPerformed(java.awt.event.ActionEvent evt) {
        defaultPanel.setVisible(false);
        typerAreaScroll.setVisible(true);
        typerPanel.setVisible(true);
        rightBtnsPanel.setVisible(true);
        empty_message = errorMessageTextArea;
    }

    private void btnCopyStringActionPerformed(java.awt.event.ActionEvent evt) {
        defaultPanel.setVisible(false);
        copyTextField.setText(defaultMessageTextField);
        copyTextFieldPanel.setVisible(true);
        typerPanel.setVisible(true);
        rightBtnsPanel.setVisible(true);
        empty_message = errorMessageTextField;
    }

    private void typerAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {
        typerArea.requestFocus();
    }

    private void copyTextFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {
        copyTextField.requestFocus();
        enablePrincipalButtons(false);
        textFieldTextErased = false;
    }

    private void copyTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        if (evt.getExtendedKeyCode() != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            deleteTextFieldDefaultText();
        }
        if (evt.isControlDown()) {
            verifyCopyTextField();
        }
    }

    private void verifyCopyTextField() {
        CodonCopy.verifyCodonCharacters(copyTextField.getText());
        if (!CodonCopy.isValidChars() && textFieldTextErased) {
            setWorkAreaUnabled();
            enablePrincipalButtons(false);
        } else {
            copyTextField.setText(CodonCopy.getTextVerified());
        }
    }

    private void setWorkAreaUnabled() {
        copyTextField.setForeground(Color.LIGHT_GRAY);
        copyFailedLabel.setText(copyFailedLabelMessage);
    }

    private void enablePrincipalButtons(boolean enabled) {
        btnReplicate.setEnabled(enabled);
        btnTranscribe.setEnabled(enabled);
        btnTranslate.setEnabled(enabled);
    }

    private void copyTextFieldMousePressed(java.awt.event.MouseEvent evt) {
        deleteTextFieldDefaultText();
    }

    private void deleteTextFieldDefaultText() {
        if (!textFieldTextErased) {
            copyTextField.setText("");
            textFieldTextErased = true;
            enablePrincipalButtons(true);
        }
    }

    private void copyTextFieldFocusLost(java.awt.event.FocusEvent evt) {
        if (!copyFailedLabel.getText().trim().isEmpty()) {
            copyFailedLabel.setText("");
        }
    }

    private void copyTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
            if (copyTextField.getText().trim().length() <= 1) {
                enablePrincipalButtons(true);
                copyFailedLabel.setText("");
            }
        }
    }

    
}
