/**
 * 
 */

//using empty object literals anddynamically adding methods , properties 
var book={};
function usingObjectLiterals()
{
	
	
	book.bookName='vedikai parpavan';
	
	book.discount=function(){
		
		return 0.10;
	}
	
	document.write('<p>'+'Book name :'+book.bookName+'<p>');
	document.write('discount :'+book.discount())
	
}
//using empty object literals anddynamically adding methods , properties at the creation time
function usingBojectLiteralSecondWay(){
	
	var book={
		
		bookName:'javaScript', discount:function(){
			
			return 0.52;
		}
	};
	document.write('<p>'+'Book name :'+book.bookName+'<p>');
	document.write('discount :'+book.discount())
}
//Using Function constructor -Note the 'this' in the function body can create object using "new"
function usingFunctionConstructor(){
	
	var myBook=function(bookName){
		
		this.bookName=bookName;
		this.discount=function(){
			return 0.68;
		}
	};
	var book=new myBook('html');
		document.write('<p>'+'Book name :'+book.bookName+'<p>');
	document.write('discount :'+book.discount())
	
}

//using Blank javaScript object litrals and dynamically adding methods , properties 
function usingBlankObjects()
{
	var book = new Object();
	
	book.bookName='bala kandam';
	
	book.discount=function(){
		
		return 0.28;
	}
	
	document.write('<p>'+'Book name :'+book.bookName+'<p>');
	document.write('discount :'+book.discount())
	
}
(function(){
	
	usingObjectLiterals();
		usingBlankObjects();
		usingBojectLiteralSecondWay();
		usingFunctionConstructor();
})();