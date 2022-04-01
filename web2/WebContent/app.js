function save(){
	const fnameElement = document.getElementById("firstname");
	console.log(fnameElement.value);
	
	const ageElement = document.getElementById("ageinp");
	console.log(ageElement.value);
	
	const inputElements = document.getElementsByTagName("input");
	console.info(inputElements);
	
	for(let i=0; i< inputElements.length; i++){
		let element = inputElements[i];
		if(element.type === "radio" && element.checked===true){
			console.info(`Checked Radio = ${element.value}`);
		}
	}
}