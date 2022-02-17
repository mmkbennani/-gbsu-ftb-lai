import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  constructor(private http: HttpClient) { }

  getConversion(nbr: Number) {
    return this.http.get<Result>("http://localhost:8080/gbsu-ftb-lai/"+nbr);
  }

}
