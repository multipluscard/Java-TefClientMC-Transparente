package View;

import Class.RetCupom;
import Class.Util;
import com.sun.jna.Library;
import com.sun.jna.Native;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;
import javax.swing.UIManager;
import javax.xml.datatype.DatatypeConstants;
import Class.Util;
import com.sun.source.util.TaskEvent;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JList;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author luana.souza
 */
public class FormularioPrincipal extends javax.swing.JFrame {

    public FormularioPrincipal() {
        initComponents();

        AtribuirDados();
                
        if (!checkBoxMultiplosCartoes.isSelected()) {
            panelTransacoes.setVisible(false);
        } else {
            panelTransacoes.setVisible(true);
        }
        String myLibraryPath = "../ExeDLLJavaComTela";
        System.setProperty("java.library.path", myLibraryPath);
        System.loadLibrary("TefClientmc");
    }

    
    /*Dados que viram do Formulario Atributos*/
    public int comunicacao;
    public String cnpj;
    public String data;
    public String pdv;
    public String codloja;

    /*Dados FormPrincipal*/
    String valor;
    int parcelas;
    String Cupom;
    String nsu;

    String aplicacao = System.getProperty("user.dir");
    DefaultListModel model = new DefaultListModel();
    DefaultListModel modelTransacoes = new DefaultListModel();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    boolean confirmar = true;
    boolean InsereNovoCartao;
    boolean NovaVenda = true;
    int flagretorno;
    int flagoperacao;

    List<RetCupom> lstCupons;
    List<Object> lstExibicao = new ArrayList<Object>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelAtributos = new javax.swing.JPanel();
        lbValor = new javax.swing.JLabel();
        lbParcela = new javax.swing.JLabel();
        lbCupom = new javax.swing.JLabel();
        lbNsu = new javax.swing.JLabel();
        txbValor = new javax.swing.JTextField();
        txbCupom = new javax.swing.JTextField();
        txbNsu = new javax.swing.JTextField();
        txbParcela = new javax.swing.JTextField();
        tabTipo = new javax.swing.JTabbedPane();
        tabCartao = new javax.swing.JTabbedPane();
        PanelCredito = new javax.swing.JPanel();
        SubPanelCredito = new javax.swing.JPanel();
        btnCreditoAVista = new javax.swing.JButton();
        btnCreditoParceladoLoja = new javax.swing.JButton();
        btnCreditoParceladoAdm = new javax.swing.JButton();
        btnCredito = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnPreAutorizacao = new javax.swing.JButton();
        btnConfPreAutorizacao = new javax.swing.JButton();
        btnCancelarCredito = new javax.swing.JButton();
        btnCancPreAutorizacao = new javax.swing.JButton();
        PanelDebito = new javax.swing.JPanel();
        subPanelDebito = new javax.swing.JPanel();
        btnDebitoAVista = new javax.swing.JButton();
        btnDebito = new javax.swing.JButton();
        btnConsultaDebito = new javax.swing.JButton();
        btnCancelarDebito = new javax.swing.JButton();
        PanelFrota = new javax.swing.JPanel();
        SubPanelFrota = new javax.swing.JPanel();
        btnFrota = new javax.swing.JButton();
        btnCancelarFrota = new javax.swing.JButton();
        PanelVoucher = new javax.swing.JPanel();
        SubPanelVoucher = new javax.swing.JPanel();
        btnVendaVoucher = new javax.swing.JButton();
        btnCancelarVoucher = new javax.swing.JButton();
        tabAdm = new javax.swing.JTabbedPane();
        Adm = new javax.swing.JPanel();
        btnExcluirBins = new javax.swing.JButton();
        btnReimpressao = new javax.swing.JButton();
        btnColetaCPF = new javax.swing.JButton();
        tabQRMultiplos = new javax.swing.JTabbedPane();
        QRMultiplos = new javax.swing.JPanel();
        btnMenuPSP = new javax.swing.JButton();
        btnPSPCliente = new javax.swing.JButton();
        btnMercadoPago = new javax.swing.JButton();
        btnPicPay = new javax.swing.JButton();
        btnCancelarEstorno = new javax.swing.JButton();
        btnStatusTransacao = new javax.swing.JButton();
        lbObs = new javax.swing.JLabel();
        checkBoxMultiplosCartoes = new javax.swing.JCheckBox();
        panelTransacoes = new javax.swing.JPanel();
        ScrollPaneTransacao = new javax.swing.JScrollPane();
        transacoespendentes = new javax.swing.JList<>();
        lbTransacoes = new javax.swing.JLabel();
        btnConfirma = new javax.swing.JButton();
        btnDesfaz = new javax.swing.JButton();
        CheckBoxTodas = new javax.swing.JCheckBox();
        btnLimpaLog = new javax.swing.JButton();
        btnAtributos = new javax.swing.JButton();
        ScrollPaneLog = new javax.swing.JScrollPane();
        lbLog = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo TefClientMC - Java");

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(893, 633));

        PanelAtributos.setBackground(new java.awt.Color(243, 243, 243));
        PanelAtributos.setPreferredSize(new java.awt.Dimension(535, 97));

        lbValor.setText("VALOR");

        lbParcela.setText("PARCELA");

        lbCupom.setText("CUPOM");

        lbNsu.setText("NSU");

        txbValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txbCupom.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txbNsu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txbParcela.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelAtributosLayout = new javax.swing.GroupLayout(PanelAtributos);
        PanelAtributos.setLayout(PanelAtributosLayout);
        PanelAtributosLayout.setHorizontalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValor)
                    .addComponent(txbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbParcela)
                    .addComponent(txbParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbCupom, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(lbCupom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbNsu, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(lbNsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAtributosLayout.setVerticalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(lbParcela)
                    .addComponent(lbCupom)
                    .addComponent(lbNsu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbCupom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbNsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnCreditoAVista.setLabel("CRÉDITO A VISTA");
        btnCreditoAVista.setPreferredSize(new java.awt.Dimension(170, 46));
        btnCreditoAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoAVistaActionPerformed(evt);
            }
        });

        btnCreditoParceladoLoja.setLabel("CRÉDITO PARCELADO LOJA");
        btnCreditoParceladoLoja.setPreferredSize(new java.awt.Dimension(170, 46));
        btnCreditoParceladoLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoParceladoLojaActionPerformed(evt);
            }
        });

        btnCreditoParceladoAdm.setLabel("CRÉDITO PARCELADO ADM");
        btnCreditoParceladoAdm.setPreferredSize(new java.awt.Dimension(170, 46));
        btnCreditoParceladoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoParceladoAdmActionPerformed(evt);
            }
        });

        btnCredito.setText("CRÉDITO");
        btnCredito.setPreferredSize(new java.awt.Dimension(170, 46));
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });

        btnConsulta.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        btnConsulta.setText("CONSULTA");
        btnConsulta.setPreferredSize(new java.awt.Dimension(75, 32));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnPreAutorizacao.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        btnPreAutorizacao.setText("PRÉ-AUTORIZAÇÃO");
        btnPreAutorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreAutorizacaoActionPerformed(evt);
            }
        });

        btnConfPreAutorizacao.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        btnConfPreAutorizacao.setText("CONF. PRÉ-AUTORIZAÇÃO");
        btnConfPreAutorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfPreAutorizacaoActionPerformed(evt);
            }
        });

        btnCancelarCredito.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelarCredito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCredito.setText("CANCELAR");
        btnCancelarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCreditoActionPerformed(evt);
            }
        });

        btnCancPreAutorizacao.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        btnCancPreAutorizacao.setText("CANC. PRÉ-AUTORIZAÇÃO");
        btnCancPreAutorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancPreAutorizacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubPanelCreditoLayout = new javax.swing.GroupLayout(SubPanelCredito);
        SubPanelCredito.setLayout(SubPanelCreditoLayout);
        SubPanelCreditoLayout.setHorizontalGroup(
            SubPanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPanelCreditoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(SubPanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubPanelCreditoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPreAutorizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfPreAutorizacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancPreAutorizacao)
                        .addGap(152, 152, 152))
                    .addGroup(SubPanelCreditoLayout.createSequentialGroup()
                        .addGroup(SubPanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SubPanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCreditoParceladoLoja, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(btnCreditoAVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreditoParceladoAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnCancelarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        SubPanelCreditoLayout.setVerticalGroup(
            SubPanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPanelCreditoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreditoAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreditoParceladoLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreditoParceladoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(SubPanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SubPanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPreAutorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConfPreAutorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancPreAutorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelCreditoLayout = new javax.swing.GroupLayout(PanelCredito);
        PanelCredito.setLayout(PanelCreditoLayout);
        PanelCreditoLayout.setHorizontalGroup(
            PanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreditoLayout.createSequentialGroup()
                .addComponent(SubPanelCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        PanelCreditoLayout.setVerticalGroup(
            PanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPanelCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabCartao.addTab("CREDITO", PanelCredito);

        btnDebitoAVista.setText("DÉBITO A VISTA");
        btnDebitoAVista.setPreferredSize(new java.awt.Dimension(170, 46));
        btnDebitoAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebitoAVistaActionPerformed(evt);
            }
        });

        btnDebito.setText("DÉBITO");
        btnDebito.setPreferredSize(new java.awt.Dimension(170, 46));
        btnDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebitoActionPerformed(evt);
            }
        });

        btnConsultaDebito.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        btnConsultaDebito.setText("CONSULTA");
        btnConsultaDebito.setPreferredSize(new java.awt.Dimension(75, 32));
        btnConsultaDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDebitoActionPerformed(evt);
            }
        });

        btnCancelarDebito.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelarDebito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarDebito.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarDebito.setText("CANCELAR");
        btnCancelarDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDebitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelDebitoLayout = new javax.swing.GroupLayout(subPanelDebito);
        subPanelDebito.setLayout(subPanelDebitoLayout);
        subPanelDebitoLayout.setHorizontalGroup(
            subPanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelDebitoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(subPanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnDebitoAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConsultaDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        subPanelDebitoLayout.setVerticalGroup(
            subPanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelDebitoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDebitoAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(btnConsultaDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelDebitoLayout = new javax.swing.GroupLayout(PanelDebito);
        PanelDebito.setLayout(PanelDebitoLayout);
        PanelDebitoLayout.setHorizontalGroup(
            PanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subPanelDebito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelDebitoLayout.setVerticalGroup(
            PanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subPanelDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabCartao.addTab("DEBITO", PanelDebito);

        SubPanelFrota.setPreferredSize(new java.awt.Dimension(608, 339));

        btnFrota.setText("VENDA FROTA");
        btnFrota.setPreferredSize(new java.awt.Dimension(170, 46));
        btnFrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrotaActionPerformed(evt);
            }
        });

        btnCancelarFrota.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelarFrota.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarFrota.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarFrota.setText("CANCELAR");
        btnCancelarFrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFrotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubPanelFrotaLayout = new javax.swing.GroupLayout(SubPanelFrota);
        SubPanelFrota.setLayout(SubPanelFrotaLayout);
        SubPanelFrotaLayout.setHorizontalGroup(
            SubPanelFrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPanelFrotaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(SubPanelFrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarFrota, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(430, Short.MAX_VALUE))
        );
        SubPanelFrotaLayout.setVerticalGroup(
            SubPanelFrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPanelFrotaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(btnCancelarFrota, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelFrotaLayout = new javax.swing.GroupLayout(PanelFrota);
        PanelFrota.setLayout(PanelFrotaLayout);
        PanelFrotaLayout.setHorizontalGroup(
            PanelFrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFrotaLayout.createSequentialGroup()
                .addComponent(SubPanelFrota, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelFrotaLayout.setVerticalGroup(
            PanelFrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPanelFrota, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        tabCartao.addTab("FROTA", PanelFrota);

        btnVendaVoucher.setText("VENDA VOUCHER");
        btnVendaVoucher.setPreferredSize(new java.awt.Dimension(170, 46));
        btnVendaVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaVoucherActionPerformed(evt);
            }
        });

        btnCancelarVoucher.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelarVoucher.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelarVoucher.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVoucher.setText("CANCELAR");
        btnCancelarVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVoucherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubPanelVoucherLayout = new javax.swing.GroupLayout(SubPanelVoucher);
        SubPanelVoucher.setLayout(SubPanelVoucherLayout);
        SubPanelVoucherLayout.setHorizontalGroup(
            SubPanelVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPanelVoucherLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(SubPanelVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVendaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        SubPanelVoucherLayout.setVerticalGroup(
            SubPanelVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubPanelVoucherLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnVendaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(btnCancelarVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelVoucherLayout = new javax.swing.GroupLayout(PanelVoucher);
        PanelVoucher.setLayout(PanelVoucherLayout);
        PanelVoucherLayout.setHorizontalGroup(
            PanelVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPanelVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelVoucherLayout.setVerticalGroup(
            PanelVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubPanelVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabCartao.addTab("VOUCHER", PanelVoucher);

        tabTipo.addTab("CARTÃO", tabCartao);

        btnExcluirBins.setText("EXCLUIR BINS");
        btnExcluirBins.setPreferredSize(new java.awt.Dimension(170, 46));
        btnExcluirBins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirBinsActionPerformed(evt);
            }
        });

        btnReimpressao.setText("REIMPRESSAO");
        btnReimpressao.setPreferredSize(new java.awt.Dimension(170, 46));
        btnReimpressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReimpressaoActionPerformed(evt);
            }
        });

        btnColetaCPF.setText("COLETA DE CPF");
        btnColetaCPF.setPreferredSize(new java.awt.Dimension(170, 46));
        btnColetaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColetaCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdmLayout = new javax.swing.GroupLayout(Adm);
        Adm.setLayout(AdmLayout);
        AdmLayout.setHorizontalGroup(
            AdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdmLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(AdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnColetaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnReimpressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirBins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        AdmLayout.setVerticalGroup(
            AdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdmLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnExcluirBins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReimpressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColetaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        tabAdm.addTab("ADM", Adm);

        tabTipo.addTab("ADMINISTRAÇÃO", tabAdm);

        btnMenuPSP.setText("MENU OPÇÕES PSP");
        btnMenuPSP.setPreferredSize(new java.awt.Dimension(170, 46));
        btnMenuPSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPSPActionPerformed(evt);
            }
        });

        btnPSPCliente.setText("PSP CLIENTE");
        btnPSPCliente.setPreferredSize(new java.awt.Dimension(170, 46));
        btnPSPCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPSPClienteActionPerformed(evt);
            }
        });

        btnMercadoPago.setText("MERCADO PAGO");
        btnMercadoPago.setPreferredSize(new java.awt.Dimension(170, 46));
        btnMercadoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMercadoPagoActionPerformed(evt);
            }
        });

        btnPicPay.setText("PICPAY");
        btnPicPay.setPreferredSize(new java.awt.Dimension(170, 46));
        btnPicPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPicPayActionPerformed(evt);
            }
        });

        btnCancelarEstorno.setText("CANCELAR/ESTORNO");
        btnCancelarEstorno.setPreferredSize(new java.awt.Dimension(75, 32));
        btnCancelarEstorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEstornoActionPerformed(evt);
            }
        });

        btnStatusTransacao.setText("STATUS TRANSAÇÃO");
        btnStatusTransacao.setPreferredSize(new java.awt.Dimension(75, 32));
        btnStatusTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusTransacaoActionPerformed(evt);
            }
        });

        lbObs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbObs.setText("Obs: Para visualizar o QR Code utilizar o parâmetro ExibirQrCode=2 no CliMC.ini");

        javax.swing.GroupLayout QRMultiplosLayout = new javax.swing.GroupLayout(QRMultiplos);
        QRMultiplos.setLayout(QRMultiplosLayout);
        QRMultiplosLayout.setHorizontalGroup(
            QRMultiplosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QRMultiplosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(QRMultiplosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QRMultiplosLayout.createSequentialGroup()
                        .addComponent(lbObs)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(QRMultiplosLayout.createSequentialGroup()
                        .addGroup(QRMultiplosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPSPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenuPSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMercadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(QRMultiplosLayout.createSequentialGroup()
                                .addComponent(btnCancelarEstorno, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStatusTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPicPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        QRMultiplosLayout.setVerticalGroup(
            QRMultiplosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QRMultiplosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnMenuPSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPSPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMercadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPicPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(QRMultiplosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEstorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatusTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbObs)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tabQRMultiplos.addTab("QRMULTIPLUS", QRMultiplos);

        tabTipo.addTab("QRMULTIPLUS", tabQRMultiplos);

        checkBoxMultiplosCartoes.setText("MULTIPLOS CARTÕES");
        checkBoxMultiplosCartoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMultiplosCartoesActionPerformed(evt);
            }
        });

        panelTransacoes.setBackground(new java.awt.Color(243, 243, 243));

        ScrollPaneTransacao.setViewportView(transacoespendentes);

        lbTransacoes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTransacoes.setText("Transações");

        btnConfirma.setText("CONFIRMA");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        btnDesfaz.setText("DESFAZ");
        btnDesfaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazActionPerformed(evt);
            }
        });

        CheckBoxTodas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CheckBoxTodas.setText("Todas");

        javax.swing.GroupLayout panelTransacoesLayout = new javax.swing.GroupLayout(panelTransacoes);
        panelTransacoes.setLayout(panelTransacoesLayout);
        panelTransacoesLayout.setHorizontalGroup(
            panelTransacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPaneTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelTransacoesLayout.createSequentialGroup()
                        .addGroup(panelTransacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTransacoes)
                            .addGroup(panelTransacoesLayout.createSequentialGroup()
                                .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesfaz, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBoxTodas)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTransacoesLayout.setVerticalGroup(
            panelTransacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTransacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTransacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDesfaz, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckBoxTodas))
                    .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnLimpaLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bins.png"))); // NOI18N
        btnLimpaLog.setToolTipText("");
        btnLimpaLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaLogActionPerformed(evt);
            }
        });

        btnAtributos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atributos.png"))); // NOI18N
        btnAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtributosActionPerformed(evt);
            }
        });

        lbLog.setBackground(new java.awt.Color(243, 243, 243));
        ScrollPaneLog.setViewportView(lbLog);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAtributos, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addComponent(checkBoxMultiplosCartoes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 608, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTransacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPaneLog))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpaLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtributos)
                .addGap(15, 15, 15))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpaLog)
                    .addComponent(btnAtributos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBoxMultiplosCartoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(tabTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(ScrollPaneLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTransacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public interface DLLInterface extends Library {

        DLLInterface INSTANCE = (DLLInterface) Native.loadLibrary("TefClientmc", DLLInterface.class);

        int IniciaFuncaoMCInterativo(int iComando, String sCnpjCliente, int iParcela, String sCupom, String sValor,
                String sNsu, String sData, String sNumeroPDV, String sCodigoLoja, int sTipoComunicacao, String sParametro);

        String AguardaFuncaoMCInterativo();

        int ContinuaFuncaoMCInterativo(String sInformacao);

        int FinalizaFuncaoMCInterativo(int iComando, String sCnpjCliente, int iParcela, String sCupom, String sValor,
                String sNsu, String sData, String sNumeroPDV, String sCodigoLoja, int sTipoComunicacao, String sParametro);

        int CancelarFluxoMCInterativo();
    }

    private boolean GetParametros(boolean ExcluirBins) {
        ExcluirBins = false;

        if (cnpj.isEmpty() || txbCupom.getText().isEmpty()
                || data.isEmpty() || txbNsu.getText().isEmpty() || txbParcela.getText().isEmpty()
                || pdv.isEmpty() || txbValor.getText().isEmpty() || codloja.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Informe todos os parâmetros", "WARNING", JOptionPane.WARNING_MESSAGE, null);
            return false;
        } else {
            //iCupom = Integer.parseInt(txbCupom.getText());
            parcelas = Integer.parseInt(txbParcela.getText());
            Cupom = txbCupom.getText();
            nsu = txbNsu.getText();
            valor = txbValor.getText();
            return true;
        }
    }

    private void AtribuirDados() {
        try {
            String aplicacao = System.getProperty("user.dir");
            String FileSrc = aplicacao + "\\ArqCarregaDados.txt";
            BufferedReader br = new BufferedReader(new FileReader(FileSrc));
            String line;
            while ((line = br.readLine()) != null) {

                String x = line.toString().toUpperCase();
                var arr = line.split("=");
                if (arr.length < 2) {
                    continue;
                }
                switch (arr[0]) {
                    case "CNPJ":
                        cnpj = arr[1];
                        break;
                    case "PDV":
                        pdv = arr[1];
                        break;
                    case "CODIGO_LOJA":
                        codloja = arr[1];
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            Date date = new Date();
            data = dateFormat.format(date);
            comunicacao = 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "WARNING", WARNING_MESSAGE);
        }

    }
    
    private void ExecutarFuncao(Integer operacao) {
        if(GetParametros(true))
        {
            int retorno = DLLInterface.INSTANCE.IniciaFuncaoMCInterativo(operacao,
                    cnpj, parcelas, Cupom, valor,
                    nsu, data, pdv, codloja, comunicacao, "");

            flagretorno = retorno;
            flagoperacao = operacao;

            model.addElement(dateFormat.format(date) + " - IniciaFuncaoMCInterativo()");
            lbLog.setModel(model);
            ScrollPaneLog.setViewportView(lbLog);

            Util.AdicionaLog("IniciaFuncaoMCInterativo()", null);

            if (retorno == 0) {
                String Recebe;
                String retMsg = "";
                int retFim;
                String[] arrMsg = null;

                while (!"[ERROABORTAR]".equals(retMsg) && !"[RETORNO]".equals(retMsg) && !"[ERRODISPLAY]".equals(retMsg)) {
                    String strRetAguardaFMCInt = DLLInterface.INSTANCE.AguardaFuncaoMCInterativo();
                    Util.AdicionaLog(strRetAguardaFMCInt, null);

                    if (!strRetAguardaFMCInt.isEmpty()) {
                        model.addElement(dateFormat.format(date) + " - " + strRetAguardaFMCInt);
                        lbLog.setModel(model);
                        ScrollPaneLog.setViewportView(lbLog);
                    }

                    arrMsg = strRetAguardaFMCInt.split("#");
                    retMsg = arrMsg[0];

                    if ("[MENU]".equals(retMsg)) {
                        Recebe = arrMsg.length > 2 ? JOptionPane.showInputDialog(null, arrMsg[2].replace("|", "\n"), arrMsg[1], JOptionPane.QUESTION_MESSAGE)
                                : JOptionPane.showInputDialog(null, arrMsg[1].replace("|", "\n"), arrMsg[0], JOptionPane.QUESTION_MESSAGE);

                        System.out.print(Recebe);
                        if ((Recebe != null) && (Recebe.length() > 0)) { //OK 
                            DLLInterface.INSTANCE.ContinuaFuncaoMCInterativo(Recebe);
                        } else {
                            DLLInterface.INSTANCE.CancelarFluxoMCInterativo();
                            Util.AdicionaLog("CancelarFluxoMCInterativo()", null);
                            JOptionPane.showMessageDialog(null, "Fluxo Cancelado", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                            retMsg = "[ERROABORTAR]";
                            model.addElement(dateFormat.format(date) + " - Fluxo Cancelado");
                            lbLog.setModel(model);
                            ScrollPaneLog.setViewportView(lbLog);
                            Util.AdicionaLog("Fluxo Cancelado", null);
                        }
                    }
                    if ("[PERGUNTA]".equals(retMsg)) {
                        Recebe = JOptionPane.showInputDialog(null, arrMsg[2].replace("|", "\n"), arrMsg[1], JOptionPane.QUESTION_MESSAGE);
                        System.out.print(Recebe);
                        if ((Recebe != null) && (Recebe.length() > 0)) { //OK 
                            DLLInterface.INSTANCE.ContinuaFuncaoMCInterativo(Recebe);
                        } else { //CANCELAR
                            DLLInterface.INSTANCE.CancelarFluxoMCInterativo();
                            Util.AdicionaLog("CancelarFluxoMCInterativo()", null);
                            JOptionPane.showMessageDialog(null, "Fluxo Cancelado", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                            retMsg = "[ERROABORTAR]";
                            model.addElement(dateFormat.format(date) + " - Fluxo Cancelado");
                            lbLog.setModel(model);
                            ScrollPaneLog.setViewportView(lbLog);
                            Util.AdicionaLog("Fluxo Cancelado", null);
                        }
                    }
                    if ("[MSG]".equals(retMsg)) {
                        if (arrMsg.length > 2) {
                            if (arrMsg[1].contains("SALDO") && !arrMsg[1].contains("RETIRE")) {
                                JOptionPane.showInputDialog(null, arrMsg[2].replace("|", "\n"), arrMsg[0], JOptionPane.QUESTION_MESSAGE);
                            }
                        }
                        if (arrMsg[1].contains("QRCODE")) {
                            var arrAux = arrMsg[1].split("|");
                            var nsu = arrAux[0].split("=");
                            var origem = arrAux[1].split("=");
                            var valor = arrAux[2].split("=");
                            var qrcode = arrAux[3].split("=");

                            Runnable r = new Runnable() {
                                @Override
                                public void run() {
                                    ExibirTelaQrCode(qrcode[1], origem[1], valor[1]);
                                }
                            };
                            new Thread(r).start();

                        }
                    }
                    if ("[ERRODISPLAY]".equals(retMsg)) {
                        int RecebeDisplay;
                        RecebeDisplay = JOptionPane.showConfirmDialog(null, arrMsg[1].replace("|", "\n"), arrMsg[0], JOptionPane.OK_CANCEL_OPTION);
//                  System.out.print(Recebe);
                        if (RecebeDisplay == JOptionPane.YES_OPTION) {
                            String sInformacao = Integer.toString(RecebeDisplay);
                            DLLInterface.INSTANCE.ContinuaFuncaoMCInterativo(sInformacao);
                        } else { //CANCELAR
                            DLLInterface.INSTANCE.CancelarFluxoMCInterativo();
                            Util.AdicionaLog("CancelarFluxoMCInterativo()", null);
                            JOptionPane.showMessageDialog(null, "Fluxo Cancelado", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                            retMsg = "[ERROABORTAR]";
                            model.addElement(dateFormat.format(date) + " - Fluxo Cancelado");
                            lbLog.setModel(model);
                            ScrollPaneLog.setViewportView(lbLog);
                            Util.AdicionaLog("Fluxo Cancelado", null);
                        }
                    }
                }
                if ("[ERROABORTAR]".equals(retMsg)) {
                    JOptionPane.showMessageDialog(null, retMsg, "ERRO ABORTAR", JOptionPane.INFORMATION_MESSAGE);
                }
                if ("[RETORNO]".equals(retMsg)) {
                    String strCupom = "";
                    String nsuRet = "";

                    if (arrMsg.length > 2) {
                        if (operacao > 50 && operacao < 60) {
                            try {
                                File.createTempFile("concluiupix", ".txt", new File(aplicacao));
                            } catch (Exception e) {
                                Util.AdicionaLog("Erro - " + e.getMessage(), strCupom);
                            }

                        }

                        strCupom = arrMsg[15].replace("CAMPO122=", "").replace("|", "\n").replace("CORTAR", "\n-------------------------------\n");
                        var auxCupom = strCupom + "-------------------------------\n\n";
                        nsuRet = arrMsg[5].replace("CAMPO0133=", "");
                    }
                    if (arrMsg.length == 2) {
                        var aux = arrMsg[1].split("=");
                        strCupom = "CPF Coletado: " + aux[1];
                    }

                    JOptionPane.showMessageDialog(null,
                            strCupom, "",
                            JOptionPane.PLAIN_MESSAGE);

                    arrMsg[15] = arrMsg[15].replace("|", "\n");
                    JOptionPane.showMessageDialog(null,
                            String.join("\n", arrMsg), "",
                            JOptionPane.PLAIN_MESSAGE);

                    retFim = 0;

                    //multiplus cartoes//
                    if (operacao != 98 && operacao != 99) {
                        if (confirmar) {
                            retFim = DLLInterface.INSTANCE.FinalizaFuncaoMCInterativo(98,
                                    cnpj, parcelas, Cupom, valor,
                                    nsuRet, data, pdv, codloja, 0, "");
                        } else {
                            retFim = DLLInterface.INSTANCE.FinalizaFuncaoMCInterativo(99,
                                    cnpj, parcelas, Cupom, valor,
                                    nsuRet, data, pdv, codloja, 0, "");
                        }
                        Util.AdicionaLog("FinalizaFuncaoMCInterativo()", null);
                    } else {
                        retFim = 0;
                    }

                    if (retFim == 0) {
                        model.addElement(dateFormat.format(date) + " - FIM DA TRANSAÇÃO");
                        lbLog.setModel(model);
                        ScrollPaneLog.setViewportView(lbLog);

                    } else {
                        model.addElement(dateFormat.format(date) + " - ERRO " + retFim);
                        lbLog.setModel(model);
                        ScrollPaneLog.setViewportView(lbLog);
                    }
                }
            } else {
                retornaErro();
                Util.AdicionaLog("Erro - IniciaFuncaoMCInterativo", null);
            }
        }

            
       
    }

    private void retornaErro() {
        switch (flagretorno) {
            case 1:
                JOptionPane.showMessageDialog(null, "Erro genérico na execução", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 30:
                JOptionPane.showMessageDialog(null, "Não foi encontrado o caminho do ClientD.exe", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 31:
                JOptionPane.showMessageDialog(null, "ConfigMC.ini está vazio", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 32:
                JOptionPane.showMessageDialog(null, "ClientD.exe não encontrado", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 33:
                JOptionPane.showMessageDialog(null, "ClientD.exe não está em execução", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 34:
                JOptionPane.showMessageDialog(null, "Erro ao iniciar ClientD.exe", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 35:
                JOptionPane.showMessageDialog(null, "Não foi possível criar o arquivo de resposta", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 36:
                JOptionPane.showMessageDialog(null, "Erro na manipulação do arquivo de resposta", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 37:
                JOptionPane.showMessageDialog(null, "Erro na leitura do arquivo ConfigMC.ini", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 38:
                JOptionPane.showMessageDialog(null, "Valor da transação com formato incorreto", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 39:
                JOptionPane.showMessageDialog(null, "Executável de envio de transações não encontrado", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 40:
                JOptionPane.showMessageDialog(null, "CNPJ Inválido ou no formato incorreto", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 41:
                JOptionPane.showMessageDialog(null, "ClientD.exe está em processo de atualização", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            case 42:
                JOptionPane.showMessageDialog(null, "A automação não está sendo executada no modo administrador", "WARNING", JOptionPane.ERROR_MESSAGE);
                break;
            default:
                break;
        }
    }

    private void ExibirTelaQrCode(String QrCode, String Origem, String Valor) {
        DLLInterface.INSTANCE.ContinuaFuncaoMCInterativo("1");
    }
    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed
        //executar função esta rodando em uma outra Thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(1);
            }
        }).start();

    }//GEN-LAST:event_btnCreditoActionPerformed

    private void checkBoxMultiplosCartoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMultiplosCartoesActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (GetParametros(true) && checkBoxMultiplosCartoes.isSelected()) {
            NovaVenda = true;
            while (NovaVenda) {
                panelTransacoes.setVisible(true);

                if (!InsereNovoCartao) {
                    lstCupons = new ArrayList<RetCupom>();
                    lstExibicao = new ArrayList<Object>();
                }

            String flagnsu = nsu+"*";
            int retorno = DLLInterface.INSTANCE.IniciaFuncaoMCInterativo(0,
                cnpj, parcelas, Cupom, valor,
                flagnsu, data, pdv, codloja, comunicacao, "");
                
                model.addElement(dateFormat.format(date) + " - IniciaFuncaoMCInterativo()");
                lbLog.setModel(model);
                ScrollPaneLog.setViewportView(lbLog);
                Util.AdicionaLog("IniciaFuncaoMCInterativo()", null);

                if (retorno == 0) {
                    String Recebe;
                    String retMsg = "";
                    String[] arrMsg = null;

                    while (!"[ERROABORTAR]".equals(retMsg) && !"[RETORNO]".equals(retMsg) && !"[ERRODISPLAY]".equals(retMsg)) {
                        String strRetAguardaFMCInt = DLLInterface.INSTANCE.AguardaFuncaoMCInterativo();
                        Util.AdicionaLog(strRetAguardaFMCInt, null);

                        if (!strRetAguardaFMCInt.isEmpty()) {
                            model.addElement(dateFormat.format(date) + " - " + strRetAguardaFMCInt);
                            lbLog.setModel(model);
                            ScrollPaneLog.setViewportView(lbLog);
                        }

                        arrMsg = strRetAguardaFMCInt.split("#");
                        retMsg = arrMsg[0];

                        if ("[MENU]".equals(retMsg)) {
                            Recebe = arrMsg.length > 2 ? JOptionPane.showInputDialog(null, arrMsg[2].replace("|", "\n"), arrMsg[1], JOptionPane.QUESTION_MESSAGE)
                                    : JOptionPane.showInputDialog(null, arrMsg[1].replace("|", "\n"), arrMsg[0], JOptionPane.QUESTION_MESSAGE);

                            if ((Recebe != null) && (Recebe.length() > 0)) { //OK 
                                System.out.println(Recebe);
                                DLLInterface.INSTANCE.ContinuaFuncaoMCInterativo(Recebe);
                            } else {
                                DLLInterface.INSTANCE.CancelarFluxoMCInterativo();
                                Util.AdicionaLog("CancelarFluxoMCInterativo()", null);
                                JOptionPane.showMessageDialog(null, "Fluxo Cancelado", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                                retMsg = "[ERROABORTAR]";
                                model.addElement(dateFormat.format(date) + " - Fluxo Cancelado");
                                lbLog.setModel(model);
                                ScrollPaneLog.setViewportView(lbLog);
                                Util.AdicionaLog("Fluxo Cancelado", null);
                            }
                        }
                        if ("[PERGUNTA]".equals(retMsg)) {
                            Recebe = JOptionPane.showInputDialog(null, arrMsg[2].replace("|", "\n"), arrMsg[1], JOptionPane.QUESTION_MESSAGE);
                            System.out.print(Recebe);
                            if ((Recebe != null) && (Recebe.length() > 0)) { //OK 
                                DLLInterface.INSTANCE.ContinuaFuncaoMCInterativo(Recebe);
                            } else { //CANCELAR
                                DLLInterface.INSTANCE.CancelarFluxoMCInterativo();
                                Util.AdicionaLog("CancelarFluxoMCInterativo()", null);
                                JOptionPane.showMessageDialog(null, "Fluxo Cancelado", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                                retMsg = "[ERROABORTAR]";
                                model.addElement(dateFormat.format(date) + " - Fluxo Cancelado");
                                lbLog.setModel(model);
                                ScrollPaneLog.setViewportView(lbLog);
                                Util.AdicionaLog("Fluxo Cancelado", null);
                            }
                        }
                        if ("[MSG]".equals(retMsg)) {
                            if (arrMsg.length > 2) {
                                if (arrMsg[1].contains("SALDO") && !arrMsg[1].contains("RETIRE")) {
                                    JOptionPane.showInputDialog(null, arrMsg[2].replace("|", "\n"), arrMsg[0], JOptionPane.QUESTION_MESSAGE);
                                }
                            }
                            if (arrMsg[1].contains("QRCODE")) {
                                var arrAux = arrMsg[1].split("|");
                                var nsu = arrAux[0].split("=");
                                var origem = arrAux[1].split("=");
                                var valor = arrAux[2].split("=");
                                var qrcode = arrAux[3].split("=");

                                Runnable r = new Runnable() {
                                    @Override
                                    public void run() {
                                        ExibirTelaQrCode(qrcode[1], origem[1], valor[1]);
                                    }
                                };
                                new Thread(r).start();
                            }
                        }
                        if ("[ERRODISPLAY]".equals(retMsg)) {
                            NovaVenda = false;
                            int RecebeDisplay;
                            RecebeDisplay = JOptionPane.showConfirmDialog(null, arrMsg[1].replace("|", "\n"), arrMsg[0], JOptionPane.OK_CANCEL_OPTION);
                            if (RecebeDisplay == JOptionPane.YES_OPTION) {
                                String sInformacao = Integer.toString(RecebeDisplay);
                                DLLInterface.INSTANCE.ContinuaFuncaoMCInterativo(sInformacao);
                            } else { //CANCELAR
                                DLLInterface.INSTANCE.CancelarFluxoMCInterativo();
                                Util.AdicionaLog("CancelarFluxoMCInterativo()", null);
                                JOptionPane.showMessageDialog(null, "Fluxo Cancelado", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                                retMsg = "[ERROABORTAR]";
                                model.addElement(dateFormat.format(date) + " - Fluxo Cancelado");
                                lbLog.setModel(model);
                                ScrollPaneLog.setViewportView(lbLog);
                                Util.AdicionaLog("Fluxo Cancelado", null);
                            }
                        }
                    }//while
                    if ("[ERROABORTAR]".equals(retMsg)) {
                        JOptionPane.showMessageDialog(null, retMsg, "ERRO ABORTAR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if ("[RETORNO]".equals(retMsg)) {
                        String strCupom = arrMsg[15].replace("CAMPO122=", "").replace("|", "\n").replace("CORTAR", "\n\n");
                        var auxCupom = strCupom + "--------------------------------------\n\n" + strCupom;
                        RetCupom dadosCupom = new RetCupom();
                        dadosCupom.Comprovante = arrMsg[15].replace("CAMPO122=", "").replace("|", "\n").replace("CORTAR", "\n-------------------------------\n");
                        dadosCupom.VenctoCartao = arrMsg[14].replace("CAMPO0513=", "");
                        dadosCupom.NsuRede = arrMsg[13].replace("CAMPO0134=", "");
                        dadosCupom.Cliente = arrMsg[12].replace("CAMPO1003=", "");
                        dadosCupom.Cnpj = arrMsg[11].replace("CAMPO0950=", "");
                        dadosCupom.UltimosDigitos = arrMsg[10].replace("CAMPO1190=", "");
                        dadosCupom.BinCartao = arrMsg[9].replace("CAMPO0136=", "");
                        dadosCupom.TxServico = arrMsg[8].replace("CAMPO0504=", "");
                        dadosCupom.Parcelas = arrMsg[7].replace("CAMPO0505=", "");
                        dadosCupom.Nsu = arrMsg[6].replace("CAMPO0133=", "");
                        dadosCupom.CodAutorizacao = arrMsg[5].replace("CAMPO0135=", "");
                        dadosCupom.CodRede = arrMsg[4].replace("CAMPO0131=", "");
                        dadosCupom.CodBandeira = arrMsg[3].replace("CAMPO0132=", "");
                        dadosCupom.Valor = arrMsg[2].replace("CAMPO0002=", "");
                        dadosCupom.Cupom = arrMsg[1].replace("CAMPO0160=", "");

                        lstCupons.add(dadosCupom);
                        String valor;
                        String exibir;
                        var obj1 = List.of(
                                valor = dadosCupom.Valor,
                                exibir = dadosCupom.Comprovante.replace("\n", "|")
                        );
                        modelTransacoes.addElement(dadosCupom.Comprovante.replace("\n", "|"));
                        transacoespendentes.setModel(modelTransacoes);
                        lstExibicao.add(obj1);
                    }
                }//retorno 0
                else {
                    JOptionPane.showMessageDialog(null, "Erro - IniciaFuncaoMCInterativo", "Erro", JOptionPane.ERROR);
                    Util.AdicionaLog("Erro - IniciaFuncaoMCInterativo", null);
                }
                if (NovaVenda) {
                    int RecebeNovaVenda;
                    String novoValor;
                    RecebeNovaVenda = JOptionPane.showConfirmDialog(null, "Deseja Pagar com mais de um cartão?", "Pagar com Multiplos Cartões", JOptionPane.OK_CANCEL_OPTION);
                    if (RecebeNovaVenda == JOptionPane.YES_OPTION) {
                        InsereNovoCartao = true;
                        novoValor = JOptionPane.showInputDialog(null, "Digite o valor da transação:","Nova Transação", JOptionPane.QUESTION_MESSAGE);
                        valor = novoValor;
                    } else {
                        InsereNovoCartao = false;
                        NovaVenda = false;
                    }
                } else {
                    checkBoxMultiplosCartoes.setSelected(false);
                    panelTransacoes.setVisible(false);
                }
            }
        } else {
            NovaVenda = false;
            checkBoxMultiplosCartoes.setSelected(false);
            panelTransacoes.setVisible(false);
        }
            }
        }).start();
    }//GEN-LAST:event_checkBoxMultiplosCartoesActionPerformed

    private void btnLimpaLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaLogActionPerformed
        model.removeAllElements();
    }//GEN-LAST:event_btnLimpaLogActionPerformed

    private void btnAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtributosActionPerformed
        this.setEnabled(false);
        
        FormularioAtributos FormAtributos = new FormularioAtributos(
                comunicacao, cnpj, codloja, data, pdv);
        FormAtributos.setVisible(true);
        FormAtributos.setLocationRelativeTo(null);
        
        FormAtributos.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                setEnabled(true);
                
                cnpj = FormAtributos.getCnpj();
                pdv = FormAtributos.getpdv();
                codloja = FormAtributos.getCodLoja();
            }
        });
    }//GEN-LAST:event_btnAtributosActionPerformed

    private void btnCreditoAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoAVistaActionPerformed
        new Thread(new Runnable() {
          @Override
          public void run() {
              ExecutarFuncao(0);
          }
      }).start();  
    }//GEN-LAST:event_btnCreditoAVistaActionPerformed

    private void btnCreditoParceladoLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoParceladoLojaActionPerformed
         new Thread(new Runnable() {
          @Override
          public void run() {
            ExecutarFuncao(2);
          }
      }).start();    
    }//GEN-LAST:event_btnCreditoParceladoLojaActionPerformed

    private void btnCreditoParceladoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoParceladoAdmActionPerformed
        new Thread(new Runnable() {
          @Override
          public void run() {
            ExecutarFuncao(3);
          }
      }).start();     
    }//GEN-LAST:event_btnCreditoParceladoAdmActionPerformed

    private void btnDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebitoActionPerformed
        new Thread(new Runnable() {
        @Override
        public void run() {
          ExecutarFuncao(4);
        }
    }).start();    
    }//GEN-LAST:event_btnDebitoActionPerformed

    private void btnDebitoAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebitoAVistaActionPerformed
        new Thread(new Runnable() {
        @Override
        public void run() {
          ExecutarFuncao(20);
        }
     }).start();    
    }//GEN-LAST:event_btnDebitoAVistaActionPerformed

    private void btnConsultaDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDebitoActionPerformed
        new Thread(new Runnable() {
        @Override
        public void run() {
          ExecutarFuncao(10);
        }
     }).start();   
    }//GEN-LAST:event_btnConsultaDebitoActionPerformed

    private void btnCancelarDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDebitoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(5);
            }
        }).start();   
    }//GEN-LAST:event_btnCancelarDebitoActionPerformed

    private void btnCancelarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCreditoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(5);
            }
        }).start();
    }//GEN-LAST:event_btnCancelarCreditoActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(9);
            }
        }).start();  
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnPreAutorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreAutorizacaoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(15);
            }
        }).start(); 
    }//GEN-LAST:event_btnPreAutorizacaoActionPerformed

    private void btnConfPreAutorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfPreAutorizacaoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(16);
            }
        }).start();    
    }//GEN-LAST:event_btnConfPreAutorizacaoActionPerformed

    private void btnCancPreAutorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancPreAutorizacaoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(17);
            }
        }).start();  
    }//GEN-LAST:event_btnCancPreAutorizacaoActionPerformed

    private void btnFrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrotaActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
               ExecutarFuncao(11);
            }
        }).start();  
    }//GEN-LAST:event_btnFrotaActionPerformed

    private void btnCancelarFrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFrotaActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
               ExecutarFuncao(5);
            }
        }).start();   
    }//GEN-LAST:event_btnCancelarFrotaActionPerformed

    private void btnVendaVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaVoucherActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
               ExecutarFuncao(18);
            }
        }).start();    
    }//GEN-LAST:event_btnVendaVoucherActionPerformed

    private void btnCancelarVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVoucherActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
               ExecutarFuncao(5);
            }
        }).start(); 
    }//GEN-LAST:event_btnCancelarVoucherActionPerformed

    private void btnExcluirBinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirBinsActionPerformed
        try {
            
            if (cnpj.isEmpty() || codloja.isEmpty() || pdv.isEmpty() || data.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Informe todos os parâmetros", "WARNING", JOptionPane.WARNING_MESSAGE, null);
            }
            else
            {
                var ret = DLLInterface.INSTANCE.IniciaFuncaoMCInterativo(110,
                    cnpj, 1, "1", "1,00",
                    "1", data, pdv, codloja, 0, "");

            }
            
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirBinsActionPerformed

    private void btnReimpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReimpressaoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(6);
            }
        }).start();     
    }//GEN-LAST:event_btnReimpressaoActionPerformed

    private void btnColetaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColetaCPFActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(200);
            }
        }).start(); 
    }//GEN-LAST:event_btnColetaCPFActionPerformed

    private void btnMenuPSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPSPActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(50);
            }
        }).start();
    }//GEN-LAST:event_btnMenuPSPActionPerformed

    private void btnPSPClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPSPClienteActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(51);
            }
        }).start();    
    }//GEN-LAST:event_btnPSPClienteActionPerformed

    private void btnMercadoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMercadoPagoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(52);
            }
        }).start();    
    }//GEN-LAST:event_btnMercadoPagoActionPerformed

    private void btnPicPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPicPayActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(53);
            }
        }).start();    
    }//GEN-LAST:event_btnPicPayActionPerformed

    private void btnCancelarEstornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEstornoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ExecutarFuncao(54);
            }
        }).start();  
    }//GEN-LAST:event_btnCancelarEstornoActionPerformed

    private void btnStatusTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusTransacaoActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                 ExecutarFuncao(56);
            }
        }).start(); 
    }//GEN-LAST:event_btnStatusTransacaoActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
         new Thread(new Runnable() {
            @Override
            public void run() {
            transacoespendentes.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));    

                int paramConfConfi = 98;
                String nsuConf = "";

        if (CheckBoxTodas.isSelected() && !lstCupons.isEmpty()) {
            var lastElement = lstCupons.get(lstCupons.size() - 1);
            for (var item : lstCupons) {
                var auxParc = Integer.parseInt(item.Parcelas);
                var parc = auxParc == 0 ? 1 : auxParc;
                var sNsu = item.Nsu;

                if (item != lastElement) //se for o ultimo item
                {
                    sNsu += "*";
                }

                var retFim = DLLInterface.INSTANCE.FinalizaFuncaoMCInterativo(paramConfConfi, cnpj, parc, 
                        item.Cupom,item.Valor, sNsu, data, pdv, codloja, 
                        comunicacao, "");
                        
                Util.AdicionaLog(paramConfConfi + cnpj + Integer.parseInt(item.Parcelas) + item.Cupom + item.Valor + sNsu + data + pdv + codloja + comunicacao, null);
                Util.AdicionaLog("Retorno Confirmação/Desfazimento - " + paramConfConfi + ":" + retFim, null);

                model.addElement(dateFormat.format(date) + " - Retorno Confirmação/Desfazimento - " + paramConfConfi + ":" + retFim);
                lbLog.setModel(model);
                ScrollPaneLog.setViewportView(lbLog);

                model.addElement(dateFormat.format(date) + " - " + paramConfConfi + cnpj + parc + item.Cupom + item.Valor + sNsu + data + pdv + codloja + comunicacao);
                lbLog.setModel(model);
                ScrollPaneLog.setViewportView(lbLog);

                nsuConf = item.Nsu;
            }
            for (var item : lstCupons) {
                var auxCupom = item.Comprovante + "-------------------------------\\n\\n" + item.Comprovante;
                JOptionPane.showMessageDialog(null, item.Comprovante, "", JOptionPane.INFORMATION_MESSAGE);
                transacoespendentes.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));    
            }

            modelTransacoes.clear();

            model.addElement(dateFormat.format(date) + " - FIM DA TRANSAÇÃO");
            lbLog.setModel(model);
            ScrollPaneLog.setViewportView(lbLog);
            checkBoxMultiplosCartoes.isSelected();
        } else {
            transacoespendentes.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));    

            int iTrans = transacoespendentes.getSelectedIndex() == -1 ? 0 : transacoespendentes.getSelectedIndex();

            var transacao = lstCupons.get(iTrans);

            JOptionPane.showMessageDialog(null, transacao.Comprovante, "", JOptionPane.INFORMATION_MESSAGE);
                    

            var auxParc = Integer.parseInt(transacao.Parcelas);

            var parc = auxParc == 0 ? 1 : auxParc;

            var sNsu = transacao.Nsu;

            if (lstCupons.size() > 1) {
                sNsu += "*";
            }

            var retFim = DLLInterface.INSTANCE.FinalizaFuncaoMCInterativo(paramConfConfi,  cnpj, parc, 
                        transacao.Cupom,transacao.Valor, sNsu, data, pdv, codloja, 
                        comunicacao, "");
            
            Util.AdicionaLog(paramConfConfi + cnpj + Integer.parseInt(transacao.Parcelas) + transacao.Cupom + transacao.Valor + transacao.Nsu + data + pdv + codloja + comunicacao, null);
            Util.AdicionaLog("Retorno Confirmação/Desfazimento - " + paramConfConfi + ":" + retFim, data);

            model.addElement(dateFormat.format(date) + " - Retorno Confirmação/Desfazimento - " + paramConfConfi + ":" + retFim);
            lbLog.setModel(model);
            ScrollPaneLog.setViewportView(lbLog);
            model.addElement(dateFormat.format(date) + " - " + paramConfConfi + cnpj + parc + transacao.Cupom + transacao.Valor + transacao.Nsu + data + pdv + codloja + comunicacao);
            lbLog.setModel(model);
            ScrollPaneLog.setViewportView(lbLog);

            lstCupons.remove(iTrans);
            lstExibicao.remove(iTrans);

            modelTransacoes.remove(iTrans);
            transacoespendentes.setModel(modelTransacoes);
            ScrollPaneTransacao.setViewportView(transacoespendentes);

            if (lstCupons.isEmpty()) {
                model.addElement(dateFormat.format(date) + " - FIM DA TRANSAÇÃO");
                lbLog.setModel(model);
                ScrollPaneLog.setViewportView(lbLog);

                checkBoxMultiplosCartoes.setSelected(false);
                transacoespendentes.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));    

            }
        } 
            }
        }).start(); 
    }//GEN-LAST:event_btnConfirmaActionPerformed

    
    private void btnDesfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesfazActionPerformed
         new Thread(new Runnable() {
            @Override
            public void run() {
            transacoespendentes.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));    

             int paramConfConfi = 99;
        String nsuConf = "";

        if (CheckBoxTodas.isSelected() && !lstCupons.isEmpty()) {
            var lastElement = lstCupons.get(lstCupons.size() - 1);
            for (var item : lstCupons) {
                var auxParc = Integer.parseInt(item.Parcelas);
                var parc = auxParc == 0 ? 1 : auxParc;
                var sNsu = item.Nsu;

                if (item != lastElement) //se for o ultimo item
                {
                    sNsu += "*";
                }

                var retFim = DLLInterface.INSTANCE.FinalizaFuncaoMCInterativo(paramConfConfi, cnpj, parc, 
                        item.Cupom,item.Valor, sNsu, data, pdv, codloja, 
                        comunicacao, "");
                
                Util.AdicionaLog(paramConfConfi + cnpj + Integer.parseInt(item.Parcelas) + item.Cupom + item.Valor + sNsu + data + pdv + codloja + comunicacao, null);
                Util.AdicionaLog("Retorno Confirmação/Desfazimento - " + paramConfConfi + ":" + retFim, null);

                model.addElement(dateFormat.format(date) + " - Retorno Confirmação/Desfazimento - " + paramConfConfi + ":" + retFim);
                lbLog.setModel(model);

                model.addElement(dateFormat.format(date) + " - " + paramConfConfi + cnpj + parc + item.Cupom + item.Valor + sNsu + data + pdv + codloja + comunicacao);
                lbLog.setModel(model);

                nsuConf = item.Nsu;
            }
            for (var item : lstCupons) {
                var auxCupom = item.Comprovante + "-------------------------------\\n\\n" + item.Comprovante;
                JOptionPane.showMessageDialog(null, item.Comprovante, "", JOptionPane.INFORMATION_MESSAGE);
                transacoespendentes.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));    

            }

            modelTransacoes.clear();

            model.addElement(dateFormat.format(date) + " - FIM DA TRANSAÇÃO");
            lbLog.setModel(model);
            checkBoxMultiplosCartoes.isSelected();
        } else {
            transacoespendentes.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));    

            int iTrans = transacoespendentes.getSelectedIndex() == -1 ? 0 : transacoespendentes.getSelectedIndex();

            var transacao = lstCupons.get(iTrans);

            JOptionPane.showMessageDialog(null, transacao.Comprovante, "", JOptionPane.INFORMATION_MESSAGE);

            var auxParc = Integer.parseInt(transacao.Parcelas);

            var parc = auxParc == 0 ? 1 : auxParc;

            var sNsu = transacao.Nsu;

            if (lstCupons.size() > 1) {
                sNsu += "*";
            }

            var retFim = DLLInterface.INSTANCE.FinalizaFuncaoMCInterativo(paramConfConfi, cnpj, parc, 
                        transacao.Cupom,transacao.Valor, sNsu, data, pdv, codloja, 
                        comunicacao, "");
            
            Util.AdicionaLog(paramConfConfi + cnpj + Integer.parseInt(transacao.Parcelas) + transacao.Cupom + transacao.Valor + transacao.Nsu + data + pdv + codloja + comunicacao, null);
            Util.AdicionaLog("Retorno Confirmação/Desfazimento - " + paramConfConfi + ":" + retFim, data);

            model.addElement(dateFormat.format(date) + " - Retorno Confirmação/Desfazimento - " + paramConfConfi + ":" + retFim);
            lbLog.setModel(model);

            model.addElement(dateFormat.format(date) + " - " + paramConfConfi + cnpj + parc + transacao.Cupom + transacao.Valor + transacao.Nsu + data + pdv + codloja + comunicacao);
            lbLog.setModel(model);

            lstCupons.remove(iTrans);
            lstExibicao.remove(iTrans);

            modelTransacoes.remove(iTrans);
            transacoespendentes.setModel(modelTransacoes);
            ScrollPaneTransacao.setViewportView(transacoespendentes);
            
            
            if (lstCupons.isEmpty()) {
                model.addElement(dateFormat.format(date) + " - FIM DA TRANSAÇÃO");
                lbLog.setModel(model);

                checkBoxMultiplosCartoes.setSelected(false);
                transacoespendentes.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));    

            }
        }   
            }
        }).start();
    }//GEN-LAST:event_btnDesfazActionPerformed
   
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");

            FormularioPrincipal field = new FormularioPrincipal();
            field.setVisible(true);
            field.setLocationRelativeTo(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adm;
    private javax.swing.JCheckBox CheckBoxTodas;
    private javax.swing.JPanel PanelAtributos;
    private javax.swing.JPanel PanelCredito;
    private javax.swing.JPanel PanelDebito;
    private javax.swing.JPanel PanelFrota;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelVoucher;
    private javax.swing.JPanel QRMultiplos;
    private javax.swing.JScrollPane ScrollPaneLog;
    private javax.swing.JScrollPane ScrollPaneTransacao;
    private javax.swing.JPanel SubPanelCredito;
    private javax.swing.JPanel SubPanelFrota;
    private javax.swing.JPanel SubPanelVoucher;
    private javax.swing.JButton btnAtributos;
    private javax.swing.JButton btnCancPreAutorizacao;
    private javax.swing.JButton btnCancelarCredito;
    private javax.swing.JButton btnCancelarDebito;
    private javax.swing.JButton btnCancelarEstorno;
    private javax.swing.JButton btnCancelarFrota;
    private javax.swing.JButton btnCancelarVoucher;
    private javax.swing.JButton btnColetaCPF;
    private javax.swing.JButton btnConfPreAutorizacao;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnConsultaDebito;
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnCreditoAVista;
    private javax.swing.JButton btnCreditoParceladoAdm;
    private javax.swing.JButton btnCreditoParceladoLoja;
    private javax.swing.JButton btnDebito;
    private javax.swing.JButton btnDebitoAVista;
    private javax.swing.JButton btnDesfaz;
    private javax.swing.JButton btnExcluirBins;
    private javax.swing.JButton btnFrota;
    private javax.swing.JButton btnLimpaLog;
    private javax.swing.JButton btnMenuPSP;
    private javax.swing.JButton btnMercadoPago;
    private javax.swing.JButton btnPSPCliente;
    private javax.swing.JButton btnPicPay;
    private javax.swing.JButton btnPreAutorizacao;
    private javax.swing.JButton btnReimpressao;
    private javax.swing.JButton btnStatusTransacao;
    private javax.swing.JButton btnVendaVoucher;
    private javax.swing.JCheckBox checkBoxMultiplosCartoes;
    private javax.swing.JLabel lbCupom;
    private javax.swing.JList<String> lbLog;
    private javax.swing.JLabel lbNsu;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbParcela;
    private javax.swing.JLabel lbTransacoes;
    private javax.swing.JLabel lbValor;
    private javax.swing.JPanel panelTransacoes;
    private javax.swing.JPanel subPanelDebito;
    private javax.swing.JTabbedPane tabAdm;
    private javax.swing.JTabbedPane tabCartao;
    private javax.swing.JTabbedPane tabQRMultiplos;
    private javax.swing.JTabbedPane tabTipo;
    private javax.swing.JList<String> transacoespendentes;
    private javax.swing.JTextField txbCupom;
    private javax.swing.JTextField txbNsu;
    private javax.swing.JTextField txbParcela;
    private javax.swing.JTextField txbValor;
    // End of variables declaration//GEN-END:variables
}
