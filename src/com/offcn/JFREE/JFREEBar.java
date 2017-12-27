package com.offcn.JFREE;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.TextAnchor;

public class JFREEBar {
	

public static void main(String[] args) {
	String chengshi[]={"北京","上海","深圳","成都","苏州","杭州","南京","东莞"};
	String biaoti[]={"成交套数(套)"};
	double chengjiaoliang[][]={{202},{475},{33},{114},{152},{382},{109},{219}};
	
	CategoryDataset dateset =DatasetUtilities.createCategoryDataset(chengshi, biaoti, chengjiaoliang);
	
	JFreeChart chart = ChartFactory.createBarChart3D("统计时间", "城市", "数量", dateset, PlotOrientation.VERTICAL, true, true, false);

	CategoryPlot plot =chart.getCategoryPlot();
	
	BarRenderer3D br=new BarRenderer3D();
	br.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
	
	br.setBaseItemLabelsVisible(true);
	
	br.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
	br.setItemLabelAnchorOffset(14D);
	plot.setRenderer(br);
	
	
	try {
		ChartUtilities.saveChartAsJPEG(new File("D:\\jfree\\chengshi.jpg"), chart, 700, 500);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public String getString(HttpSession session){
	
	String chengshi[]={"北京","上海","深圳","成都","苏州","杭州","南京","东莞"};
	String biaoti[]={"成交套数(套)"};
	double chengjiaoliang[][]={{202},{475},{33},{114},{152},{382},{109},{219}};
	
	CategoryDataset dateset =DatasetUtilities.createCategoryDataset(chengshi, biaoti, chengjiaoliang);
	
	JFreeChart chart = ChartFactory.createBarChart3D("统计时间", "城市", "数量", dateset, PlotOrientation.VERTICAL, true, true, false);
      String name="";
    try {
    	name=ServletUtilities.saveChartAsJPEG(chart, 700, 500, session);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return name;
}


}

