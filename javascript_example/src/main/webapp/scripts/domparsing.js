/**
 * 
 */

var size=1.2;

function incFontSize(){
	
	var para=document.getElementById("firstPara");
	
	//para.setAttribute("class","fontSizeUp");
	
	size=size+0.2;
	
	if(size<3.4)
	{
	
	para.setAttribute("style","font-size:"+size+'em');
   // size++;
	}
	
}
function decFontSize(){
	
	var para=document.getElementById("firstPara");
	size=size-0.2;
	//para.setAttribute("class","fontSizeDw");
	if(size>=0.4)
	{
	para.setAttribute("style","font-size:"+size+'em');
	}
	
}

function addClickEvent(){
	
	var imgRef =document.getElementById("increment");
	
	imgRef.addEventListener('click',incFontSize);
	
	var imgRef =document.getElementById("decrement");
	
	imgRef.addEventListener('click',decFontSize);
}

(function(){
	addClickEvent();

})();