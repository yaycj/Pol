<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/echarts.common.min.js"></script>
</head>

<body>
	<div id="li" style="width: 800px; height: 500px;"></div>
	<div id="li1" style="width: 800px; height: 500px;"></div>
	<div id="li2" style="width: 800px; height: 500px;"></div>

	<script type="text/javascript">
		var chart = echarts.init(document.getElementById('li'));
	
		var option = {
			title : {
				text : '2017-8-28日房屋销量图'
			},
			
			legend : {
				data : [ '销售套数' ]
			},
			xAxis : {
				data : [ "北京", "上海", "深圳", "成都", "苏州", "杭州", "南京", "东莞" ]
			},
			yAxis : {
			},
			series : [ {
				name : '销售套数',
				type : 'bar',
				data : [ 202, 475, 33, 114, 152, 382, 109, 219 ],
				itemStyle:{ 
			normal: {
			 color: function (params){
                        var colorList = ['rgb(164,205,238)','rgb(42,170,227)','rgb(25,46,94)','rgb(195,229,235)','rgb(164,205,38)','rgb(42,10,227)','rgb(25,0,94)','rgb(0,229,235)'];
                        return colorList[params.dataIndex];
                    },
			label : {
			show: true, position: 'top'
			}
			}
			}
			} ]
		};
		chart.setOption(option);
	
		var chart2 = echarts.init(document.getElementById('li1'));
		var option1 = {
			title : {
				text : '2017年7月豪车销量'
			},
			series : [ {
				name : '销量',
				type : 'pie',
				radius : '60%',
				data : [
					{
						value : 500,
						name : '法拉利'
					},
					{
						value : 200,
						name : '宝马'
					},
					{
						value : 360,
						name : '凯迪拉克'
					},
					{
						value : 100,
						name : '奥迪'
					}
				]
			} ]
		};
		chart2.setOption(option1);
		
		
		var chart3= echarts.init(document.getElementById('li2'));

              var option3 = {
         title:{
              text:'8月柴鸡蛋销量'
                },
             legend:{
              data:['平均价格销量','最高价格销量','最低价格销量']
                  },
                  
                xAxis:{
                  data:["2017-8-1","2017-8-2","2017-8-3","2017-8-4"]
                           },
                  yAxis:{
                 },
                  series:[{
             name:'平均价格销量',
             type:'line',
                  data:[7.1,7.0,7.1,7.1]
                    },
                    {
             name:'最高价格销量',
             type:'line',
                  data:[10,9,9,10]
                    },{
             name:'最低价格销量',
             type:'line',
                  data:[4.2,4.1,4.3,4.2]
                    }]
                    
             };

chart3.setOption(option3);
	</script>
</body>
</html>
