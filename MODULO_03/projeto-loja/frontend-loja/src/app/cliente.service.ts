import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  apiURL = "http://localhost:8090/cliente";

  constructor(private httpClient: HttpClient) { }

  listar(){
    return this.httpClient.get(this.apiURL);
  }
  adicionar(cliente: any) {
    return this.httpClient.post(this.apiURL, cliente);
  }
  excluir(id: number) {
    return this.httpClient.delete(this.apiURL + '/' + id);
  }
  atualizar(cliente: any) {
    return this.httpClient.put(this.apiURL+ '/' + cliente.id, cliente);
  }
}
