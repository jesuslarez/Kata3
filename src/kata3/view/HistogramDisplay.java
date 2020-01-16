/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3.view;


import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Usuario
 */
public class HistogramDisplay extends ApplicationFrame{
    public HistogramDisplay() {
        super("Histogram");
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel() {
       ChartPanel chart = new ChartPanel(createChart(CreateDataSet()));
       chart.setPreferredSize(new Dimension(500,400));
       return chart;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma", 
                "Dominios email", "Numero de emails", dataSet, 
                PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset CreateDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(85, "", "dis.ulpgc.es");
        dataSet.addValue(200, "", "hotmail.com");
        dataSet.addValue(300, "", "gmail.com");
        dataSet.addValue(50, "", "outlook.es");
        dataSet.addValue(25, "", "nescol.co.uk");
        
        return dataSet;
    }
}
