const maskify = (number) => {
	let leNombre = number;
	let tailleNumber = leNombre.length; 
	
	//console.log(leNombre.slice(tailleNumber - 4));
	let premierChiffre = leNombre.slice(0, -4);
	let taillePremierChiffre = premierChiffre.length;
	console.log("#".repeat(taillePremierChiffre) + leNombre.slice(tailleNumber - 4));
};

maskify('4556364607935616');
maskify('1');
maskify('11111');