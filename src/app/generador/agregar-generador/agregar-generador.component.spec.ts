import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AgregarGeneradorComponent } from './agregar-generador.component';

describe('AgregarGeneradorComponent', () => {
  let component: AgregarGeneradorComponent;
  let fixture: ComponentFixture<AgregarGeneradorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AgregarGeneradorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AgregarGeneradorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
