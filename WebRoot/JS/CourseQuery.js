function CourseInfoQuery()
{
	var CourseId = $("#CourseId").val();
	/*alert(CourseId);*/
	if(CourseId==null||CourseId =="")
	{
		//alert("空");
	}else{
		$.ajax({
		    type:"post",
		    dataType:"text",
		    url:"getCourseInfo",
		    data:{
		     'courseId':CourseId,
		    },
		    success:function(data)
		    {
		    	 var data1 = eval("("+data+")");
		    	 $("#gradeInfo tbody").html("");
		    	 var max=data1.gradeCourseInfo.maxNumber;
		    	 if(max=-1){max="暂无最大值"};
		    	 var min=data1.gradeCourseInfo.minNumber;
		    	 if(min=-1){max="暂无最小值"};
		    	 var ave=data1.gradeCourseInfo.aveNumber;
		    	 if(ave=0){max="暂无平均值"};
		    	 $("#gradeInfo tbody").append('<tr><td>'+data1.gradeCourseInfo.courseId+'</td>'
	    				 +'<td>'+data1.gradeCourseInfo.courseName+'</td>'
	    				 +'<td>'+data1.gradeCourseInfo.maxNumber+'</td>'
	    				 +'<td>'+data1.gradeCourseInfo.minNumber+'</td>'
	    				 +'<td>'+data1.gradeCourseInfo.aveNumber+'</td></tr>'
	    		 );
		    }
		  });
	}
}