import { Component, OnInit } from '@angular/core';
import { TestCase } from '../model/test-case';

@Component({
  selector: 'app-back-end-instruction',
  templateUrl: './back-end-instruction.component.html'
})
export class BackEndInstructionComponent implements OnInit {

  testCases: TestCase[] = [
    { input: 1, output: '1' },
    { input: 3, output: 'GbsuGbsu' },
    { input: 5, output: 'FtbFtb' },
    { input: 7, output: 'Lai' },
    { input: 9, output: 'Gbsu' },
    { input: 51, output: 'GbsuFtb' },
    { input: 53, output: 'FtbGbsu' },
    { input: 33, output: 'GbsuGbsuGbsu' },
    { input: 27, output: 'GbsuLai' },
    { input: 15, output: 'GbsuFtbFtb' }];

  constructor() { }

  ngOnInit(): void {
  }

}
