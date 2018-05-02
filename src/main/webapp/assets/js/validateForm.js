function displayErrorMessage(erros) {
	
	    var ul = document.querySelector("#message-err");
	    ul.innerHTML = "";

	    erros.forEach(function(erro) {
	        var li = document.createElement("li");
	        li.textContent = erro;
	        ul.appendChild(li);
	    });
	}

function authorValidate(author){
	
	var errors = [];
	
	 if (author.id.length == 0){
		 errors.push("The ID cannot be blank");
	    }

	    if (author.firstName.length==0){
	    	errors.push("The FIRST name cannot be blank");
	    }

	    if (author.lastName.length==0){
	    	errors.push("The LAST name cannot be blank");
	    }
	    return errors;

}
