
const newNoteBar = document.getElementById("newNoteBar");


//modal 객체 선택 및 함수
class Modal{
	constructor() {
	this.elements = {
		modalLayout: document.getElementById("modalLayout"),
		modalWrapper: document.getElementById("modalWrapper"),
		modalFooterCloseButton: document.querySelector(
        "#modalWrapper > div > div.note-footer > button.close"
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
};


const modal = new Modal();

//modal open
newNoteBar.addEventListener("click", function () {
      	modal.open()
});

//modal event
modal.elements.modalFooterCloseButton.addEventListener("click", function() {
	modal.close();
});



	
