/**
 * 
 */


function usingWindowObj(){
	
	window.location="http://www.google.com";
	
}

function windowObjOpen(){
	
	window.open("index.html","indecmessage");
	
}

function invoke(){
	
	var goToGoogleButton = document.getElementById('googleBtn');
	goToGoogleButton.addEventListener('click',usingWindowObj);
	
	
	
	var openWindowButton=document.getElementById('openBtn');
	openWindowButton.addEventListener('click',windowObjOpen);
	
	var printButton = document.getElementById('printBtn');
	printButton.addEventListener('click',function(){
		
		window.print();
	});
	
}
function usingArrays(){
	//arrays using shortct
	var linkTexts=['home','client','career','aboutus','downloads'];
	writeToFile(linkTexts);
	
	var cities=new Array('chennai','mumbai','hydarabad');
	writeToFile(cities);
	
	var countries=new Array();
	
	countries[0]='nepal';
	countries[1]='pootan';
	countries[2]='kazhmir';
	writeToFile(countries);
}

function usingDate(){
	var birthDate=new Date();
	
	var option=confirm("is this your birthDate"+birthDate);
	
	if(!option){
		
		birthDate.setFullYear(1999,5,12);
	
	document.write("My BirthDate:");
	document.write("Year :"+birthDate.getFullYear());
	document.write("Month :"+birthDate.getmogetMonth());
	document.write("Date :"+birthDate.getDay());
	}else{
		
	document.write("Year :"+birthDate.getFullYear());
	document.write("Month :"+birthDate.getMonth());
	document.write("Date :"+birthDate.getDay());
	}
}



function writeToFile(items){
		document.write('<ul>');
	for(indexPos in items){
		document.write('<li>'+items[indexPos]+'</li>')
	}
	document.write('</ul>');
}
(function(){
	invoke();
    usingArrays();
	usingDate();
})();


