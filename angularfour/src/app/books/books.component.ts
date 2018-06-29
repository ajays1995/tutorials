import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  books=["book1","book2","book3"];
  Title="List of Books";
  constructor() { }

  ngOnInit() {
  }

}
