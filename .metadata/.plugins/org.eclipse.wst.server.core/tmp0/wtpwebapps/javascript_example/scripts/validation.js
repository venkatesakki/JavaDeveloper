/**
 * 
 */

function validate(){
	
	var result=true;
	console.log('validate function');
	//event.preventDefault();
	var textfields=document.getElementsByTagName("input");
	//console.log(textfields.length);
	
	for(var i=0;i<textfields.length;i++){
		
		console.log(textfields[i].value);
		
	if(textfields[i].value=='')
	{
		
		document.getElementById('msg').innerHTML="required should not be blank";
		result=false;
	}
	}
	return result;
	
}
function init(){
	
	var formElement=document.getElementById('regForm');
	
	formElement.addEventListener('submit',validate);
}

(function(){
	
	
	init();
})()
	
