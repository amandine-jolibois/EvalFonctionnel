const Filter_list = (liste) => {

	//const parse = liste.filter((array) => parseInt(liste));
	const parse = parseInt(liste);
	let liste2 = [];
	if (parse != isNaN){
		liste2.push(parse);
	}

	console.log(liste2);
	

}
Filter_list(['a',1,2, 'a', 'b']);
Filter_list([1, 'a', 'b', 0,15]);
Filter_list([1,2, 'aasf', '3', '124', 123]);