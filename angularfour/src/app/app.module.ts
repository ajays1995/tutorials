import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpModule} from '@angular/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { BooksComponent } from './books/books.component';
import { GenresComponent } from './genres/genres.component';
import { CountrycodesComponent } from './countrycodes/countrycodes.component';
import { GreetingsComponent } from './greetings/greetings.component';
import { ContentfuldemoComponent } from './contentfuldemo/contentfuldemo.component';

import {ContentfulserviceService} from './contentfulservice.service';


@NgModule({
  declarations: [
    AppComponent,
    BooksComponent,
    GenresComponent,
    CountrycodesComponent,
    GreetingsComponent,
    ContentfuldemoComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule
  ],
  providers: [
    ContentfulserviceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
