import { HttpClient } from '@angular/common/http';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';
import { Result } from '../model/result';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }
  inputNumber: Number 
  listnmbr: NumberConverted[] = []
  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }


  numberConverted: NumberConverted | undefined;

  convertNumber(inputNumber: number): void {

    this.gbsuFtbLaiService.getConversion(inputNumber)
      // clone the data object, using its known Config shape
      .subscribe((data: Result) => {
        var dateobj : NumberConverted = {"numberToConvert":inputNumber,"result":data.result}
        this.listnmbr.push(dateobj);
      });


      console.log(this.listnmbr)
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
