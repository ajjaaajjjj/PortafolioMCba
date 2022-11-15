import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-icono-curso',
  templateUrl: './icono-curso.component.html',
  styleUrls: ['./icono-curso.component.css']
})
export class IconoCursoComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  login(){
    this.router.navigate(['/login'])
  }
}
