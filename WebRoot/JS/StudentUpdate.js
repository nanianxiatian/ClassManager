window.onload = function(){
	//Ajax��ȡ���еİ༶
	$.getJSON("loadtclasses", function(data) {
		$.each(data.tclasses1, function(i, item) {
			$("#tclasses").append(
					"<option value="+(item.classId)+">"+item.className+"</option>");
		});
	});
}