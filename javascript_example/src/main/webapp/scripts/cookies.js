/**
 * 
 */

function setCookie(){
	
	
	var name='bg_color'
	var value='green';
	document.cookie=name+'='+value;
	
}
function readCookie(){
	alert("hi")
	var cookie1=document.cookie;
	
	
	var cookieList=cookie1.split(";")
	
	var sizeCookie=cookieList[1];
	
	var values=sizeCookie.split('=');
	
		//document.write('i will show your models and brands for size :'+values);
			
	var colorValue=values[1];
			
	document.body.setAttribute('style','background-color:'+colorValue)
	
	
	}
	


(function(){
	
	//readCookie();
	setCookie();
})();
