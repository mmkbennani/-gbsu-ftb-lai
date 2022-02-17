import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html',
  styles: ["gbsu-ftb-lai-form.component.css"]
})
export class GbsuFtbLaiFormComponent implements OnInit {

  @Output() submitNumberOutput = new EventEmitter<Number>();
  
  
  numberToSubmit: Number;

  constructor() {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.numberToSubmit);
  }

}
