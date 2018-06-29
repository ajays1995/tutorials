import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContentfuldemoComponent } from './contentfuldemo.component';

describe('ContentfuldemoComponent', () => {
  let component: ContentfuldemoComponent;
  let fixture: ComponentFixture<ContentfuldemoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContentfuldemoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContentfuldemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
