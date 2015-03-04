$(document).ready(function(){
	
	console.log(location.hostname);
	if (location.hostname == 'localhost'){
		$('#sn1').val('5260202');
		$('#sn2').val('01454');
		$('#sn3').val('1820');
		$('#sn4').val('1128');
		$('#sn5').val('48');
	}
	
	$('#submit').click(function(){
		$.ajax({
	        type: 'POST',
	        url: '//'+location.host+'/rest/find',
	        contentType: 'application/json',
	        data: {
	            'sn1': $('#sn1').val(),
	            'sn2': $('#sn2').val(),
	            'sn3': $('#sn3').val(),
	            'sn4': $('#sn4').val(),
	            'sn5': $('#sn5').val()
	        },
	        beforeSend: function (jqXHR, settings) {
	        	$('#spinner').show();
	        	$('#submit').prop('disabled', true);
	        },
	        success: function (data, status, jqXHR) {
	        	$('#code').text(data.code);
	        },
	        error: function (jqXHR, status) {
	        	$('#code').text("Ops, something went wrong :(");
	        },
	        complete: function (jqXHR, textStatus) {
	        	$('#spinner').hide();
	        	$('#submit').prop('disabled', false);
	        }
	   });
		
	});
	
});