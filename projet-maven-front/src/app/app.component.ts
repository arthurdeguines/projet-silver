import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  restItemsUrl = 'http://localhost:8080/projet-silver-back/rest/allFruits';
  title = 'projet-maven-front';

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http.get(this.restItemsUrl).subscribe(data => {
      console.log(data);
    });
  }
}



