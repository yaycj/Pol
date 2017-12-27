package com.offcn.JFREE;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class JFreeLine {
	public static void main(String[] args) {
		
		DefaultCategoryDataset dcd =new DefaultCategoryDataset();
		dcd.addValue(4.32, "柴鸡蛋最低价格", "2017-8-1");
		dcd.addValue(4.2, "柴鸡蛋最低价格", "2017-8-2");
		dcd.addValue(4.2, "柴鸡蛋最低价格", "2017-8-3");
		dcd.addValue(4.32, "柴鸡蛋最低价格", "2017-8-4");		
		dcd.addValue(4.43, "柴鸡蛋最低价格", "2017-8-5");
		dcd.addValue(4.43, "柴鸡蛋最低价格", "2017-8-6");
		dcd.addValue(4.43, "柴鸡蛋最低价格", "2017-8-7");
		dcd.addValue(4.43, "柴鸡蛋最低价格", "2017-8-8");
		dcd.addValue(4.43, "柴鸡蛋最低价格", "2017-8-9");
		dcd.addValue(4.43, "柴鸡蛋最低价格", "2017-8-10");
		dcd.addValue(4.43, "柴鸡蛋最低价格", "2017-8-11");
		
		dcd.addValue(7.1, "柴鸡蛋平均价格", "2017-8-1");
		dcd.addValue(7.2, "柴鸡蛋平均价格", "2017-8-2");
		dcd.addValue(7.0, "柴鸡蛋平均价格", "2017-8-3");
		dcd.addValue(7.3, "柴鸡蛋平均价格", "2017-8-4");		
		dcd.addValue(7.1, "柴鸡蛋平均价格", "2017-8-5");
		dcd.addValue(7.1, "柴鸡蛋平均价格", "2017-8-6");
		dcd.addValue(7.1, "柴鸡蛋平均价格", "2017-8-7");
		dcd.addValue(7.2, "柴鸡蛋平均价格", "2017-8-8");
		dcd.addValue(7.0, "柴鸡蛋平均价格", "2017-8-9");
		dcd.addValue(7.1, "柴鸡蛋平均价格", "2017-8-10");
		dcd.addValue(7.1, "柴鸡蛋平均价格", "2017-8-11");
		
		
		dcd.addValue(10, "柴鸡蛋最高价格", "2017-8-1");
		dcd.addValue(10, "柴鸡蛋最高价格", "2017-8-2");
		dcd.addValue(10, "柴鸡蛋最高价格", "2017-8-3");
		dcd.addValue(10, "柴鸡蛋最高价格", "2017-8-4");		
		dcd.addValue(10, "柴鸡蛋最高价格", "2017-8-5");
		dcd.addValue(10, "柴鸡蛋最高价格", "2017-8-6");
		dcd.addValue(10, "柴鸡蛋最高价格", "2017-8-7");
		dcd.addValue(9, "柴鸡蛋最高价格", "2017-8-8");
		dcd.addValue(9, "柴鸡蛋最高价格", "2017-8-9");
		dcd.addValue(9, "柴鸡蛋最高价格", "2017-8-10");
		dcd.addValue(9, "柴鸡蛋最高价格", "2017-8-11");
		
		JFreeChart chart = ChartFactory.createLineChart("8月柴鸡蛋销售", "日期", "销量", dcd, PlotOrientation.VERTICAL, true, true, false);
		
		CategoryPlot flot = chart.getCategoryPlot();
		LineAndShapeRenderer lasr=(LineAndShapeRenderer) flot.getRenderer();
		lasr.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		lasr.setBaseItemLabelsVisible(true);
		
		try {
			ChartUtilities.saveChartAsJPEG(new File("D:\\jfree\\jidan.jpeg"), chart, 700, 500);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
