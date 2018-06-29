import { Component, OnInit } from '@angular/core';
import {Http, Response} from '@angular/http';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-greetings',
  templateUrl: './greetings.component.html',
  styleUrls: ['./greetings.component.css']
})
export class GreetingsComponent implements OnInit {

  private apiUrl = "http://localhost:8080/greeting?param=";
  data:any={};
  constructor(private http:Http) { }

  ngOnInit() {
  }
 
  getGreetings(value:string) {

    return this.http.get(this.apiUrl+value)
    .map((res: Response) => res.json())
     .subscribe(data => {
            this.data = data;
            console.log(this.data);
    });
    
  }

}