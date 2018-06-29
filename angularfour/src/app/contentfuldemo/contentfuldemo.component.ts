import { Component, OnInit } from '@angular/core';
import { ContentfulserviceService } from '../contentfulservice.service';
import { Entry } from 'contentful';

@Component({
  selector: 'app-contentfuldemo',
  templateUrl: './contentfuldemo.component.html',
  styleUrls: ['./contentfuldemo.component.css']
})
export class ContentfuldemoComponent implements OnInit {

  private products:Entry<any>[] = [];

  constructor(private contentfulservice:ContentfulserviceService) { }

  ngOnInit() {

    this.contentfulservice.getProducts()
    .then(products => this.products = products);
    console.log("Products are  "+this.products);
  }

}
