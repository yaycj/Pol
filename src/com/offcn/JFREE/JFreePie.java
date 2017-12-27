package com.offcn.JFREE;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class JFreePie {
	public static void main(String[] args) {
		
		DefaultPieDataset dpd =new DefaultPieDataset();
		dpd.setValue("奥迪Q5", 8000);
		dpd.setValue("奔驰",4000);
		dpd.setValue("奥迪Q3", 3200);
		dpd.setValue("宝马x1", 3543);
		dpd.setValue("奔驰GLA", 6798);
		dpd.setValue("凯迪拉克", 3456);
		dpd.setValue("特斯拉", 6875);
		dpd.setValue("路虎极光", 2345);
		System.out.println("nice");
	JFreeChart chart = ChartFactory.createPieChart3D("2017年7月豪车销量", dpd, true, true, false);
		
		PiePlot plot = (PiePlot) chart.getPlot();
		
		plot.setLabelFont(new Font("仿宋", 1, 11));
		
		plot.setNoDataMessage("未找到数据");
		
		StandardPieSectionLabelGenerator spslg=
				
	new StandardPieSectionLabelGenerator("{0}:({1},{2}",NumberFormat.getNumberInstance(),NumberFormat.getPercentInstance());
		
		plot.setLabelGenerator(spslg);
		
		PiePlot3D plot3d = (PiePlot3D) chart.getPlot();
		
		plot3d.setDirection(Rotation.CLOCKWISE);
		plot3d.setForegroundAlpha(0.5f);
		
		try {
			ChartUtilities.saveChartAsJPEG(new File("D:\\jfree\\cheliang.jpeg"), chart, 700, 500);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	
	

	
	
}
