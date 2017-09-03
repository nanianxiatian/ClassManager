window.onload = function(){
	//Ajax获取所有的班级
	$.getJSON("loadtclasses", function(data) {
		$.each(data.tclasses1, function(i, item) {
			$("#tclasses").append(
					"<option value="+(item.classId)+">"+item.className+"</option>");
		});
	});
}