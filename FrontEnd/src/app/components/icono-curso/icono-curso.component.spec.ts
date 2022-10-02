import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IconoCursoComponent } from './icono-curso.component';

describe('IconoCursoComponent', () => {
  let component: IconoCursoComponent;
  let fixture: ComponentFixture<IconoCursoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IconoCursoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IconoCursoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
