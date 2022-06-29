/**
 * 
 */
function display()
{
	alert('welcome to javaScript')
}
var app={}

app.display=function()
{
	alert("I am annonymous function")
}
app.readFile=function()
{
	var messageOne=document.getElementById("msg")
	
	alert(messageOne.innerHTML)
	var messageTwo=document.getElementsByTagName("div")[0];
	
	alert(messageTwo.innerHTML);
}
app.attachEvent=function()
{
	var cityBtn=document.getElementById("city");
	cityBtn.addEventListener("click",function(){
		
		var messageOne=document.getElementById("msg");
		messageOne.innerHTML="Best City is Tenkasi";
		
	});
	var cityBtn=document.getElementById("link");
	cityBtn.addEventListener("click",function(event){
		
		event.preventDefault();
		
	})
	
	
}