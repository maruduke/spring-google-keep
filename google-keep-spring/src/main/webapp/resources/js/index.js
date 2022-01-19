
const newNoteBar = document.getElementById("newNoteBar");


//modal 객체 선택 및 함수
class Modal{
	constructor() {
	this.elements = {
		modalLayout: document.getElementById("modalLayout"),
		modalWrapper: document.getElementById("modalWrapper"),
		modalFooterCloseButton: document.querySelector(
        "#modalWrapper > div > div.note-footer > button.close"
      ),
		modalPinButton: document.querySelector(
		"#modalWrapper > div > div.note-footer > div > button.pin"
		),
		modalPinButtonSpan: document.querySelector(
		"#modalWrapper > div> div.note-footer > div > button.pin > span"
			),
		modalPinButtonInput: document.querySelector(
		"#modalWrapper > div > div.note-footer > div > input.pin"
		)
		};	
	};
	
	open() {
		modal.elements.modalLayout.className ="";
		modal.elements.modalWrapper.className="";
	}
	
	close() {
		modal.elements.modalLayout.className ="hide";
		modal.elements.modalWrapper.className="hide";
	}
	
	pinned() {
		const pinbutton = modal.elements.modalPinButtonSpan;
		const pinValue = modal.elements.modalPinButtonInput;
		
		if(pinbutton.className == "material-icons-outlined md-18 gray")
		{
			pinbutton.className = "material-icons md-18 gray"
			pinValue.value = "true";
		}
		else
		{
			pinbutton.className = "material-icons-outlined md-18 gray"
			pinValue.value = "false";
		}
	}
};


const modal = new Modal();
//modal open
newNoteBar.addEventListener("click",modal.open);

//modal close event
modal.elements.modalFooterCloseButton.addEventListener("click",modal.close);

//modal pin event
modal.elements.modalPinButton.addEventListener("click",modal.pinned);



	
