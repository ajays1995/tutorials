import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CountrycodesComponent } from './countrycodes.component';

describe('CountrycodesComponent', () => {
  let component: CountrycodesComponent;
  let fixture: ComponentFixture<CountrycodesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CountrycodesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CountrycodesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
