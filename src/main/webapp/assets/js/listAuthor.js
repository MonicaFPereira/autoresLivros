var buttonListAuthors = document.querySelector("#list-author");

buttonListAuthors.addEventListener("click", function(event){

		 var xhr = new XMLHttpRequest();
		
		 xhr.open("GET", "https://bibliapp.herokuapp.com/api/authors");
		
		 xhr.addEventListener("load", function() {
		
		 var resposta = xhr.responseText;
		 var authors = JSON.parse(resposta);
		
		 authors.forEach(function(author) {
				        	
			 addAuthorTable(author);
	
		});
	});

	   xhr.send();
});
 	 




