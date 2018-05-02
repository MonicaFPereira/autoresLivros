var botaoAddAuthor = document.querySelector("#add-author");

botaoAddAuthor.addEventListener("click", function(event) {
    event.preventDefault();
    
    var form = document.querySelector("#form-add");
    var author = getAuthorForm(form); 
    
    var errors = authorValidate(author);

    if (errors.length > 0){
    	displayErrorMessage(errors);
        return;
    }
    addAuthorTable(author);    
    
    form.reset();
    
    var mensagensErro = document.querySelector("#message-err");
    mensagensErro.innerHTML = "";
    
});

function addAuthorTable(author){
	
    var authorTr = montaTr(author);
    var tabela = document.querySelector("#table-authors");

    tabela.appendChild(authorTr);
}

function getAuthorForm(form) {

    var author = {
        id: form.id.value,
        firstName: form.firstName.value,
        lastName: form.lastName.value,
    }
    return author;
}


function montaTr(author){	
	
	   var authorTr = document.createElement("tr");
	   authorTr.classList.add("author");

	   var idTd = montaTd(author.id, "info-id");
	   var firstNameTd = montaTd(author.firstName, "info-firstName");
	   var lastNameTd = montaTd(author.lastName, "info-lastName");

	   authorTr.appendChild(idTd);
	   authorTr.appendChild(firstNameTd);
	   authorTr.appendChild(lastNameTd);
	   
	   return authorTr;
	}

function montaTd(dado,classe){
		
	    var td = document.createElement("td");
	    td.textContent = dado;
	    td.classList.add(classe);
	    
	    return td;
	}
	
	
