var buttonListAuthors = document.querySelector("#listAuthors");
console.log(buttonListAuthors);

buttonListAuthors.addEventListener("click", listAuthors);


function listAuthors() {
	
 setTimeout(function() {
	 
 let authors = fetch('https://bibliapp.herokuapp.com/api/authors');

 authors
 .then(data => data.json())
 .then(data => data.map(author => {

	 let ul = document.getElementsByClassName("listAuthors")[0];
	
	 console.log(ul);
	
	 let li = ul.childNodes[1];
	     li = li.cloneNode(true);
	
	let spanNum       = li.getElementsByClassName('number')[0];
	let spanFirstName = li.getElementsByClassName('firstName')[0];
	let spanLastName  = li.getElementsByClassName('lastName')[0];
	
	spanNum.innerHTML       = author.id;
	spanFirstName.innerHTML = author.firstName; 
	spanLastName.innerHTML  = author.lastName;
	
	ul.appendChild(li);

}))

 .catch(err => console.error(err))

 }, 300);
}



