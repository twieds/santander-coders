import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class AgendaService {

  apiURL = "http://localhost:3000/agenda";

  constructor(private httpClient: HttpClient) { }

  listar(){
    return this.httpClient.get(this.apiURL);
  }
  adicionar(agenda: any) {
    return this.httpClient.post(this.apiURL, agenda);
  }
  excluir(id: number) {
    return this.httpClient.delete(this.apiURL + '/' + id);
  }
  atualizar(agenda: any) {
    return this.httpClient.put(this.apiURL+ '/' + agenda.id, agenda);
  }
}
