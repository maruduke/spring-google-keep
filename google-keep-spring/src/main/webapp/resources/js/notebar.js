/**
 * 
 */

class noteBar
{
	constructor() {
		this.elements = {
			notePinForm: document.querySelectorAll(".note > .note-footer > .pinned"),
			notePinButton: document.querySelectorAll(".note > .note-footer > form > pinned"),
			noteForm: document.querySelectorAll(".note > .note-footer > form" ),
			noteDeleteButton: document.querySelectorAll(".note > .note-footer > .delete"),
			noteDeleteForm: document.querySelectorAll(".note > .note-footer > form > .deleted")
		}
	}
}

const note = new noteBar();

const deleteButton = note.elements.noteDeleteButton;
const deleteForm = note.elements.noteDeleteForm;
const noteForm = note.elements.noteForm;

for(let i=0; i<deleteButton.length; i++)
{
	deleteButton[i].addEventListener("click",function() {
		deleteForm[i].value = 1;
		console.log(deleteForm[i].value);
		noteForm[i].submit();
	});
}

const pinButton = note.elements.notePinButton;

for(let i=0; i<pinButton.length; i++)
{
	pinButton[i].addEventListener("click",function() {
		deleteForm[i].value = 1;
		console.log(deleteForm[i].value);
		noteForm[i].submit();	
	});
}
