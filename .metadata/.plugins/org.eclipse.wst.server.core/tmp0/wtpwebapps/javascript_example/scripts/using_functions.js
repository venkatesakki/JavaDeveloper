/**
 * Example on Different ways of writing javaScript function
 */


//simple named function

function simple()
{
	console.log("Hello World");
}



function display(){
	
	return 'I love JavaScript';
}



//simpe named function with argument and handling the acse where argument is not passess
function withArgs(name)
{
	if(name==null)   // checked the presence of argument
	{
		document.write(' welcome Guest ')
		
	}else{
			document.write(' welcome '+name);
	}
}
// Named function expression

var usdToInr=function(usd)
{
	
	return usd*78;
	/*var inr=inr/0.78;*/
};


//function taking another function as argument

function converter(funcRef,name){
	console.log(name);
	console.log(funcRef());
	
}

(function(){
	
	//simple();
	//withArgs();
	//withArgs('venkat');
	//console.log('function itself displayed'+usdToInr);
	//console.log('it returns a value which returns the function'+usdToInr(100));
	//console.log('will be undefined since the method is not have a return statement '+inrToUsd(80))
	
	/*converter(function(){
		
		return 'Good AfterNoon'
	},'Hii');*/
	converter(display,'hii');
	
})();








