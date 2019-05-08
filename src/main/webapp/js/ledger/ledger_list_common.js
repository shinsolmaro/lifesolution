$(function() {
	$("label").click(function() {});
	
	time();
	
	$("div.srch input").focus(function() {
		$(this).parent("div.srch").addClass("focus");
	}).blur(function() {
		$(this).parent("div.srch").removeClass("focus");
	});
});

// pc용 상단 메뉴
function gnbMenu(_idx) {
	$("#menu"+_idx).addClass("sel");
	
	if (_idx == "" || !_idx) {
		$("div.Personal").remove();
		$("div.menu").remove();
	}
}

// 시간 표시
function time(){
	var now = new Date;
	$("#clock").html(now.getHours()+":" + now.getMinutes());
	setTimeout("time()",10);
}