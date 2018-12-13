import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm} from '@angular/forms';

@Component({
  selector: 'app-commande',
  templateUrl: './commande.component.html',
  styleUrls: ['./commande.component.css']
})
export class CommandeComponent implements OnInit {
  restItemsUrl = 'http://localhost:8080/projet-silver-back/rest/allClients';

  formdata;
  listClient: Array<Client>;
  ngOnInit(): void {
    this.http.get(this.restItemsUrl).subscribe((data: Client[]) => {
      console.log(data);
      this.listClient = data;

    console.log("liste" + this.listClient[0].firstname);
    });
  }

  constructor(private http: HttpClient) {}

  public get clients(): Client[] {
    return this.listClient;
  }
  onSubmit(value: NgForm): void {
    console.log(value.form.controls.client);
  }
}
