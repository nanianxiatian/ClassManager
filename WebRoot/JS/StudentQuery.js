
function StudentInfoQuery()
{
	var StudentId = $("#StudentId").val();
	
	if(StudentId==null||StudentId =="")
	{
		//alert("¿Õ");
	}else{
		/*alert(StudentId);*/
		$.ajax({
		    type:"post",
		    dataType:"text",
		    url:"getStudentInfo",
		    data:{
		     'studentId':StudentId,
		    },
		    success:function(data)
		    {
		    	//alert(data);
		    	 var data1 = eval("("+data+")");
		    	 $("#courseInfo tbody").html("");
		    	 $.each(data1.grades, function(i, item)
		 		{
		    		 var info = "";
		    		 if(item.gradeNumber==null){
		    			 info =  '<td>ÔÝÎÞ³É¼¨</td></tr>';
		    		 }else if(item.gradeNumber<60)
		    		{
		    			  info ='<td style="color:red;">'+item.gradeNumber+'</td></tr>';
		    		}else
		    		{
		    			info = '<td>'+item.gradeNumber+'</td></tr>';
		    		}
		    		
		    		 $("#courseInfo tbody").append('<tr><td>'+item.course.courseId+'</td>'
		    				 +'<td>'+item.course.courseName+'</td>'
		    				 +'<td>'+item.course.courseScore+'</td>'
		    				 +info
		    				 );
		 		});
		    }
		  });
	}
}