const CreatePhoneNumber = (tableau) => {
	let chiffre = tableau.join('');
	let trois = chiffre.slice(0, 3);
	let six = chiffre.slice(3, 6);
	let dernier = chiffre.slice(6, 10);
	console.log("("+trois+") "+six+"-"+dernier);

}

CreatePhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]);