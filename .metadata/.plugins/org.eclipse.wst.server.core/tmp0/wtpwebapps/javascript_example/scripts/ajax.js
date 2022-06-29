var xhr = new XMLHttpRequest();
function callServlet() {
	
	var userNameFld = document.getElementById("userName");
	userNameFld.addEventListener("blur", function() {
		
		var userName = userNameFld.value;
		var url = "validate?userName=" + userName;
		xhr.onreadystatechange = processRequest;
		xhr.open("GET", url, true);
		xhr.send(null);

	});

}

function processRequest() {
	if (xhr.status == 200 && xhr.readyState == 4) {
		var msgFld = document.getElementById("msg");
		var text = xhr.responseText;
		if(text.trim()=='valid'){
			msgFld.style.color='green';
			msgFld.innerHTML=text;
		}
		else{
			msgFld.style.color='red';
			msgFld.innerHTML=text;
		}
	}

}
