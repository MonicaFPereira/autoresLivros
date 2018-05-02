var campoFiltro = document.querySelector("#filtrar-tabela");

campoFiltro.addEventListener("input", function() {
	
    var authors = document.querySelectorAll(".author");
    
    if (this.value.length > 0) {
        for (var i = 1; i < authors.length; i++) {
            var author = authors[i];
            var tdFirstName = author.querySelector(".info-firstName");
            var firstName = tdFirstName.textContent;
            var expressao = new RegExp(this.value, "i"); 

            if (!expressao.test(firstName)) {
            	author.classList.add("invisivel");
            } else {
            	author.classList.remove("invisivel");
            }
        }
    } else {
        for (var i = 0; i < authors.length; i++) {
            var author = authors[i];
            author.classList.remove("invisivel");
        }
    }
});

function montaTr(author) {
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
